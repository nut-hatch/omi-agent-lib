package ul.biotope.agents.lyon;

import java.util.Timer;
import java.util.TimerTask;

import org.json.JSONObject;

import ul.biotope.agents.library.OmiHelper;
import ul.biotope.agents.library.RESTClient;

/**
 * Agent that pulls data from Lyon open data portal and pushes it into an O-MI node.
 * 
 * @author Niklas Kolbe (niklas.kolbe@uni.lu)
 * @date 7 Apr 2017
 */
public class LyonAgent extends TimerTask {
	
	/**
	 * Username for Lyon API authorization.
	 */
	private static String user;
	
	/**
	 * Password for Lyon API authorization.
	 */
	private static String password;

	/**
	 * The main function initialises the agent which performs it tasks every minute.
	 * 
	 * @param args User credentials for the Lyon API authentication: username password
	 */
	public static void main(String[] args) {
		if (args.length > 1) {
			user = args[0];
			password = args[1];
			Timer timer = new Timer();
			timer.schedule(new LyonAgent(), 0, 60000);
		} else {
			System.out.println("Required parameters: username, password for Lyon API authentication.");
			System.exit(0);
		}
	}

	/**
	 * Timer run function.
	 * 
	 * Gets realtime parking data from Lyon, converts it to O-DF with MobiVoc annotations and pushes the data to the O-MI node.
	 */
	public void run() {
		// Get realtime data
		String parkingLyonRealtimeGeoJsonUrl = "https://download.data.grandlyon.com/wfs/rdata?SERVICE=WFS&VERSION=2.0.0&outputformat=GEOJSON&maxfeatures=30&request=GetFeature&typename=pvo_patrimoine_voirie.pvoparkingtr";

		RESTClient client = new RESTClient(parkingLyonRealtimeGeoJsonUrl);
		client.setUser(user);
		client.setPassword(password);

		String data = client.get();
//		System.out.println(data);

		JSONObject parkingGeoJSON = new JSONObject(data);

//		// Convert to O-DF + Mobivoc 
		LyonInput2Odf d2m = new LyonInput2Odf();

		String response = OmiHelper.createAndSendWriteRequest(d2m.parkingGeoJson2ParkingFacilityObjects(parkingGeoJSON),
				"0", "http://localhost:9001");
		System.out.println(response);
	}

}
