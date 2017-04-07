package ul.biotope.agents.lyon;

import javax.xml.namespace.QName;

import org.json.JSONArray;
import org.json.JSONObject;

import ul.biotope.agents.library.OdfHelper;
import ul.biotope.agents.library.jaxb.odf.InfoItemType;
import ul.biotope.agents.library.jaxb.odf.ObjectFactory;
import ul.biotope.agents.library.jaxb.odf.ObjectType;
import ul.biotope.agents.library.jaxb.odf.ObjectsType;
import ul.biotope.agents.library.jaxb.odf.QlmIDType;
import ul.biotope.agents.library.jaxb.odf.ValueType;

/**
 * Class that converts incoming data from the Lyon API to semantic annotated O-DF trees.
 * 
 * @author Niklas Kolbe (niklas.kolbe@uni.lu)
 * @date 7 Apr 2017
 */
public class LyonInput2Odf {

	/**
	 * Maps a GeoJson Parking Object from Lyon API to an MobiVoc annotated O-DF ObjectsType.
	 * This object holds static and real-time information.
	 * 
	 * @param parkingGeoJSON The GeoJson object from the API
	 * @return ObjectsType The corresponding O-DF objects tree.
	 */
	public ObjectsType parkingGeoJson2ParkingFacilityObjects(JSONObject parkingGeoJSON) {
		// Create <Objects> element
		ObjectFactory odfFactory = new ObjectFactory();
		ObjectsType objects = odfFactory.createObjectsType();

		// Create Object element that holds the parking data of Lyon
		ObjectType objectParking = OdfHelper.createObject("ParkingFacilitiesLyon");
		objectParking.getOtherAttributes().put(new QName("prefix"),
				"schema: http://schema.org/ mv: http://purl.org/net/mobivoc/");
		objects.getObject().add(objectParking);

		// Iterate over the GeoJSON parking objects and create the O-DF + MobiVoc objects
		JSONArray parkingDataArray = parkingGeoJSON.getJSONArray("features");
		for (int i = 0; i < parkingDataArray.length(); i++) {
			JSONObject parkingObject = parkingDataArray.getJSONObject(i).getJSONObject("properties");

			// Create Object
			ObjectType objectParkingFacility = OdfHelper.createObject(parkingObject.getString("pkgid"),
					"ParkingFacility");
			objectParkingFacility.getOtherAttributes().put(new QName("typeof"), "mv:ParkingFacility");

			// Handle parking name
			InfoItemType iiName = OdfHelper.createInfoItem("name", parkingObject.getString("nom"), "mv:placeName");
			objectParkingFacility.getInfoItem().add(iiName);

			// Handle capacity
			InfoItemType iiTotalCapacity = OdfHelper.createInfoItem("capacity",
					parkingObject.getString("capacitevoiture"), "mv:totalCapacity");
			objectParkingFacility.getInfoItem().add(iiTotalCapacity);

			// Handle location
			ObjectType objectLocation = OdfHelper.createObject("location", "Location");
			objectLocation.getOtherAttributes().put(new QName("property"), "mv:isLocated");
			objectLocation.getOtherAttributes().put(new QName("typeof"), "mv:ParkingFacilityLocation");
			objectParkingFacility.getObject().add(objectLocation);

			ObjectType objectGeoCoords = OdfHelper.createObject("coords", "Coordinates");
			objectGeoCoords.getOtherAttributes().put(new QName("property"), "schema:geo");
			objectGeoCoords.getOtherAttributes().put(new QName("typeof"), "schema:GeoCoordinates");
			objectLocation.getObject().add(objectGeoCoords);

			JSONArray coordinates = parkingDataArray.getJSONObject(i).getJSONObject("geometry")
					.getJSONArray("coordinates");

			// Handle Latitude
			InfoItemType iiLatitude = OdfHelper.createInfoItem("latitude", Double.toString(coordinates.getDouble(0)),
					"schema:latitude");
			objectGeoCoords.getInfoItem().add(iiLatitude);

			//Handle longitude
			InfoItemType iiLongitude = OdfHelper.createInfoItem("longitude", Double.toString(coordinates.getDouble(1)),
					"schema:longitude");
			objectGeoCoords.getInfoItem().add(iiLongitude);

			// Handle free spaces and parking status
			String freeSpaces = "";
			String parkingStatus = "";
//			System.out.println(parkingObject.getString("etat"));
			if (parkingObject.getString("etat").equals("DONNEES INDISPONIBLES")) {
//				freeSpaces = parkingObject.getString("etat");
				parkingStatus = "mv:StatusUnknown";
			} else if (parkingObject.getString("etat").equals("Parking complet")) {
				parkingStatus = "mv:Full";
				freeSpaces = "0";
			} else if (parkingObject.getString("etat").equals("Parking libre")) {
				parkingStatus = "mv:EnoughParkingSpacesAvailable";
				freeSpaces = "0"; //TODO
			} else if (parkingObject.getString("etat").isEmpty()) {
				parkingStatus = "mv:StatusUnknown";
			} else {
				freeSpaces = parkingObject.getString("etat").split("\\s+")[0];
				parkingStatus = "mv:StatusUnknown";
			}

			if (!freeSpaces.isEmpty()) {
				objectGeoCoords.getInfoItem()
						.add(OdfHelper.createInfoItem("freeSpaces", freeSpaces, "mv:numberOfVacantParkingSpaces"));
			}

			if (!parkingStatus.isEmpty()) {
				// Handle parking status
				objectParkingFacility.getInfoItem()
						.add(OdfHelper.createInfoItem("parkingStatus", parkingStatus, "mv:statusParkingFacility"));
			}

//			String openingStatus = "";
//			switch (parkingObject.getString("situation")) {
//			case "En surface":
////				configuration = "mv:SingleLevel";
//				break;
//			case "En ouvrage (sous-sol)":
//				openingStatus = "mv:Closed";
////				configuration = "mv:Underground";
//				break;
//			case "En ouvrage (en élévation)":
//				openingStatus = "mv:Closed";
////				configuration = "mv:MultiStorey";
//				break;
//			case "None":
//				break;
//			}			
//			if (!openingStatus.isEmpty()) {
//				// Handle opening status
//				InfoItemType iiOpeningStatus = OdfHelper.createInfoItem("openingStatus", openingStatus, "mv:statusParkingFacility");
//				objectParkingFacility.getInfoItem().add(iiOpeningStatus);
//			}

			//Add to Objects
			objectParking.getObject().add(objectParkingFacility);
		}

		return objects;
	}
}