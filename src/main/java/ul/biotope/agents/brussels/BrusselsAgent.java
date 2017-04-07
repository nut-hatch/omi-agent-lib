package ul.biotope.agents.brussels;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ul.biotope.agents.brussels.jaxb.datex.GroupOfParkingSites;
import ul.biotope.agents.brussels.jaxb.datex.ParkingRecord;
import ul.biotope.agents.brussels.jaxb.datex.ParkingRecordStatus;
import ul.biotope.agents.brussels.jaxb.datex.ParkingSite;
import ul.biotope.agents.brussels.jaxb.datex.ParkingSiteStatus;
import ul.biotope.agents.brussels.jaxb.datex.ParkingStatusPublication;
import ul.biotope.agents.brussels.jaxb.datex.ParkingTable;
import ul.biotope.agents.brussels.jaxb.datex.ParkingTablePublication;
import ul.biotope.agents.library.JaxbHelper;
import ul.biotope.agents.library.OmiHelper;
import ul.biotope.agents.library.RESTClient;
import ul.biotope.agents.library.jaxb.odf.ObjectsType;
import ul.biotope.agents.library.jaxb.omi.OmiEnvelopeType;

/**
 * Agent that pulls data from Brussel open data portal and pushes it into an O-MI node.
 * 
 * @author Niklas Kolbe
 * @date 6 Apr 2017
 *
 */
public class BrusselsAgent extends TimerTask {

	/**
	 * Singleton for JAXB context initialised with DatexII classes.
	 */
	private static JAXBContext jaxbDatexContext;

	/**
	 * Singleton for the corresponding unmarshaller of the JAXBContext.
	 */
	private static Unmarshaller jaxbDatexUnmarshaller;

	/**
	 * The main function initialises the agent which performs it tasks every minute.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new BrusselsAgent(), 0, 60000);
	}

	/**
	 * Upon initialisation of the agent, first static data is pushed from the API to the O-MI node.
	 */
	public BrusselsAgent() {
		try {
			jaxbDatexContext = JAXBContext.newInstance(ParkingTablePublication.class, ParkingStatusPublication.class,
					ParkingTablePublication.class);
			jaxbDatexUnmarshaller = jaxbDatexContext.createUnmarshaller();
			this.initialPushOfStaticData();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Timer run function which is executed in intervals.
	 * 
	 * Gets the realtime parking data from Lyon, converts it to O-DF with MobiVoc annotations and pushes the data to the O-MI node.
	 */
	public void run() {
		// Get realtime data
		String brusselRealtimeParkingURL = "http://www.brussels-parking-guidance.com/API/API/Datex/Export?publication=dynamic";
		RESTClient client = new RESTClient(brusselRealtimeParkingURL);
		String data = client.get();

		// Parse xml
		JAXBElement<ParkingStatusPublication> parkingStatusPublicationElement = JaxbHelper.parseXML(data,
				"biotope.brussels.jaxb.datex", ParkingStatusPublication.class, "parkingStatusPublication",
				jaxbDatexUnmarshaller);
		ParkingStatusPublication parkingStatusPublication = parkingStatusPublicationElement.getValue();

//		System.out.println("Amount of realtime datasets: " + parkingStatusPublication.getParkingRecordStatus().size());

		// Convert to O-DF + Mobivoc and send response
		BrusselsInput2Odf d2m = new BrusselsInput2Odf();
		String response = OmiHelper.createAndSendWriteRequest(
				d2m.parkingSiteStatus2ParkingFacilityObjects(parkingStatusPublication), "0", "http://localhost:9001");
		System.out.println(response);
	}

	/**
	 * Initial push of static data to the O-MI node which is executed upon initalisation of the agent.
	 * 
	 * Also reads the available realtime data, in order to filter data sets for which no realtime data is available.
	 */
	private void initialPushOfStaticData() {
		// List storing ids of available realtime parking places
		LinkedList<String> realTimeParkingSitesIds = getAvailableRealtimeParkingIds();

		// Get static data from API
		String brusselStaticParkingURL = "http://www.brussels-parking-guidance.com/API/API/Datex/Export?publication=static";
		RESTClient client = new RESTClient(brusselStaticParkingURL);
		String data = client.get();

		// Parse DatexII
		JAXBElement<ParkingTablePublication> parkingTablePublicationElement = JaxbHelper.parseXML(data,
				"biotope.brussels.jaxb.datex", ParkingTablePublication.class, "parkingTablePublication",
				jaxbDatexUnmarshaller);
		ParkingTablePublication parkingTablePublication = parkingTablePublicationElement.getValue();

		// New object for filtered data - I prefer a hard copy
		ParkingTablePublication filteredParkingTablePublication = new ParkingTablePublication();
		filteredParkingTablePublication.getParkingTable().add(new ParkingTable());

//		System.out.println(parkingTablePublication.getParkingTable().get(0).getParkingRecord().size());

		// Iterate through the static data sets and filter only those for which realtime data is available
		Iterator<ParkingRecord> iteratorGroup = parkingTablePublication.getParkingTable().get(0).getParkingRecord()
				.iterator();
		while (iteratorGroup.hasNext()) {
			ParkingRecord parkingRecord = iteratorGroup.next();
			
			if (parkingRecord.getClass().equals(GroupOfParkingSites.class)) {
				GroupOfParkingSites groupOfParkingSites = (GroupOfParkingSites) parkingRecord;
//				System.out.println("Number of Parkings in Group: " + groupOfParkingSites.getParkingSite().size());
				
				Iterator<ParkingSite> parkingSiteIterator = groupOfParkingSites.getParkingSite().iterator();
				while (parkingSiteIterator.hasNext()) {
					ParkingSite parkingSite = parkingSiteIterator.next();

					if (realTimeParkingSitesIds.contains(parkingSite.getId())) {
						filteredParkingTablePublication.getParkingTable().get(0).getParkingRecord().add(parkingSite);
					}
				}
			}
		}

//		System.out.println("Amount of filtered static Parkings: "
//				+ filteredParkingTablePublication.getParkingTable().get(0).getParkingRecord().size());

		// Convert to O-DF + Mobivoc and send O-MI WRITE request to O-MI node
		BrusselsInput2Odf d2m = new BrusselsInput2Odf();
		String response = OmiHelper.createAndSendWriteRequest(
				d2m.parkingTablePublication2ParkingFacilityObjects(filteredParkingTablePublication), "0",
				"http://localhost:9001");
		System.out.println(response);
	}

	/**
	 * Reads the available realtime parking data set from Brussels and creates a list of their ids.
	 * 
	 * @return LinkedList<String> List containing the ids of parking site with available realtime information.
	 */
	private LinkedList<String> getAvailableRealtimeParkingIds() {
		LinkedList<String> realTimeParkingSitesIds = new LinkedList<String>();

		// Get the realtim data
		String brusselRealtimeParkingURL = "http://www.brussels-parking-guidance.com/API/API/Datex/Export?publication=dynamic";
		RESTClient clientRealtime = new RESTClient(brusselRealtimeParkingURL);
		String dataRealtime = clientRealtime.get();

		// Parse the DatexII response
		JAXBElement<ParkingStatusPublication> parkingStatusPublicationElement = JaxbHelper.parseXML(dataRealtime,
				"biotope.brussels.jaxb.datex", ParkingStatusPublication.class, "parkingStatusPublication",
				jaxbDatexUnmarshaller);
		
		// Iterate through dataset and get the IDs
		ParkingStatusPublication parkingStatusPublication = parkingStatusPublicationElement.getValue();
		Iterator<ParkingRecordStatus> parkingRecords = parkingStatusPublication.getParkingRecordStatus().iterator();
		while (parkingRecords.hasNext()) {
			ParkingSiteStatus parkingSiteStatus = (ParkingSiteStatus) parkingRecords.next();
			realTimeParkingSitesIds.add(parkingSiteStatus.getParkingRecordReference().getId());
		}
//		System.out.println(realTimeParkingSitesIds);
		
		return realTimeParkingSitesIds;
	}
}
