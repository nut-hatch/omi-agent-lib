package ul.biotope.agents.brussels;

import java.util.Iterator;

import javax.xml.namespace.QName;

import ul.biotope.agents.brussels.jaxb.datex.ParkingRecord;
import ul.biotope.agents.brussels.jaxb.datex.ParkingRecordStatus;
import ul.biotope.agents.brussels.jaxb.datex.ParkingSiteStatus;
import ul.biotope.agents.brussels.jaxb.datex.ParkingStatusPublication;
import ul.biotope.agents.brussels.jaxb.datex.ParkingTablePublication;
import ul.biotope.agents.brussels.jaxb.datex.Point;
import ul.biotope.agents.brussels.jaxb.datex.UrbanParkingSite;
import ul.biotope.agents.library.OdfHelper;
import ul.biotope.agents.library.jaxb.odf.InfoItemType;
import ul.biotope.agents.library.jaxb.odf.ObjectFactory;
import ul.biotope.agents.library.jaxb.odf.ObjectType;
import ul.biotope.agents.library.jaxb.odf.ObjectsType;

/**
 * Class that converts incoming data from the Brussels API to semantic annotated O-DF trees.
 * 
 * @author Niklas Kolbe
 * @date 7 Apr 2017
 */
public class BrusselsInput2Odf {

	/**
	 * Maps a Datex II ParkingStatusPublication Object to an MobiVoc annotated O-DF ObjectsType.
	 * This object holds real-time information.
	 * 
	 * @param parkingStatusPublication The JAXB ParkingStatusPublication object from the API.
	 * @return ObjectsType The corresponding O-DF objects tree.
	 */
	public ObjectsType parkingSiteStatus2ParkingFacilityObjects(ParkingStatusPublication parkingStatusPublication) {
		// Create <Objects> element
		ObjectFactory odfFactory = new ObjectFactory();
		ObjectsType objects = odfFactory.createObjectsType();

		// Create Object element that holds the parking data of Brussels
		ObjectType objectParking = OdfHelper.createObject("ParkingFacilitiesBrussels");
		objectParking.getOtherAttributes().put(new QName("prefix"), "schema: http://schema.org/ mv: http://purl.org/net/mobivoc/");
		objects.getObject().add(objectParking);

		// Iterate over the datex II parking objects and create the O-DF + MobiVoc objects
		Iterator<ParkingRecordStatus> parkingRecords = parkingStatusPublication.getParkingRecordStatus().iterator();
		while (parkingRecords.hasNext()) {
			ParkingSiteStatus parkingSiteStatus = (ParkingSiteStatus) parkingRecords.next();
//			parkingSiteStatus.getParkingStatusOriginTime();
			
			// Create Object
			ObjectType objectParkingFacility = OdfHelper.createObject(parkingSiteStatus.getParkingRecordReference().getId(), "ParkingFacility");
			objectParkingFacility.getOtherAttributes().put(new QName("typeof"), "mv:ParkingFacility");

			// Handle parking status
			InfoItemType iiStatus = OdfHelper.createInfoItem("parkingStatus", parkingSiteStatus.getParkingSiteStatus().name(), "mv:statusParkingFacility");
			objectParkingFacility.getInfoItem().add(iiStatus);
			
			// Handle opening status
			InfoItemType iiOpeningStatus = OdfHelper.createInfoItem("openingStatus", parkingSiteStatus.getParkingSiteOpeningStatus().name(), "mv:statusParkingFacility");
			objectParkingFacility.getInfoItem().add(iiOpeningStatus);
			
			//Add to Objects
			objectParking.getObject().add(objectParkingFacility);
		}

		return objects;
	}

	/**
	 * 
	 * @param parkingStatusPublication The JAXB ParkingStatusPublication object from the API.
	 * @return ObjectsType The corresponding O-DF objects tree.
	 */
	/**
	 * Maps a Datex II ParkingTablePublication Object to an MobiVoc annotated O-DF ObjectsType.
	 * This object holds static information about parking sites.
	 * 
	 * @param parkingTablePublication The JAXB parkingTablePublication object returned from the API.
	 * @return ObjectsType The corresponding O-DF objects tree.
	 */
	public ObjectsType parkingTablePublication2ParkingFacilityObjects(ParkingTablePublication parkingTablePublication) {
		// Create <Objects> element
		ObjectFactory odfFactory = new ObjectFactory();
		ObjectsType objects = odfFactory.createObjectsType();

		// Create Object element that holds the parking data of Brussels
		ObjectType objectParking = OdfHelper.createObject("ParkingFacilitiesBrussels");
		objectParking.getOtherAttributes().put(new QName("prefix"), "schema: http://schema.org/ mv: http://purl.org/net/mobivoc/");
		objects.getObject().add(objectParking);

		// Iterate over the datex II parking objects and create the O-DF + MobiVoc objects
		Iterator<ParkingRecord> iteratorGroup = parkingTablePublication.getParkingTable().get(0).getParkingRecord()
				.iterator();
		while (iteratorGroup.hasNext()) {
			ParkingRecord parkingRecord = iteratorGroup.next();
			if (parkingRecord.getClass().equals(UrbanParkingSite.class)) {
				UrbanParkingSite parkingSite = (UrbanParkingSite) parkingRecord;

				// Create Object
				ObjectType objectParkingFacility = OdfHelper.createObject(parkingSite.getId(), "ParkingFacility");
				objectParkingFacility.getOtherAttributes().put(new QName("typeof"), "mv:ParkingFacility");

				// Handle parking name
				InfoItemType iiName = OdfHelper.createInfoItem("name", parkingSite.getParkingName().getValues().getValue().get(0).getValue(), "mv:placeName");
				objectParkingFacility.getInfoItem().add(iiName);
				
				// Handle capacity
				InfoItemType iiTotalCapacity = OdfHelper.createInfoItem("capacity", parkingSite.getParkingNumberOfSpaces().toString(), "mv:totalCapacity");
				objectParkingFacility.getInfoItem().add(iiTotalCapacity);
				
//				String openingTimes = parkingSite.getOpeningTimes().toString();

				// Handle location
				ObjectType objectLocation = OdfHelper.createObject("location", "Location");
				objectLocation.getOtherAttributes().put(new QName("property"), "mv:isLocated");
				objectLocation.getOtherAttributes().put(new QName("typeof"), "mv:ParkingFacilityLocation");
				objectParkingFacility.getObject().add(objectLocation);

				ObjectType objectGeoCoords = OdfHelper.createObject("coords", "Coordinates");
				objectGeoCoords.getOtherAttributes().put(new QName("property"), "schema:geo");
				objectGeoCoords.getOtherAttributes().put(new QName("typeof"), "schema:GeoCoordinates");
				objectLocation.getObject().add(objectGeoCoords);

				if (parkingSite.getParkingLocation().getClass().equals(Point.class)) {
					// Handle Latitude
					String latitude = Float.toString(((Point) parkingSite.getParkingLocation()).getPointByCoordinates().getPointCoordinates().getLatitude());
					InfoItemType iiLatitude = OdfHelper.createInfoItem("latitude", latitude, "schema:latitude");
					objectGeoCoords.getInfoItem().add(iiLatitude);

					//Handle longitude
					String longitude = Float.toString(((Point) parkingSite.getParkingLocation()).getPointByCoordinates().getPointCoordinates().getLongitude());
					InfoItemType iiLongitude = OdfHelper.createInfoItem("longitude", longitude, "schema:longitude");
					objectGeoCoords.getInfoItem().add(iiLongitude);
					
					objectParking.getObject().add(objectParkingFacility);
				}
			}
		}
		
		return objects;
	}
}