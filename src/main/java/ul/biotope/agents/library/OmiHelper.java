package ul.biotope.agents.library;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;

import ul.biotope.agents.library.jaxb.odf.ObjectsType;
import ul.biotope.agents.library.jaxb.omi.MsgType;
import ul.biotope.agents.library.jaxb.omi.ObjectFactory;
import ul.biotope.agents.library.jaxb.omi.OmiEnvelopeType;
import ul.biotope.agents.library.jaxb.omi.WriteRequestType;

/**
 * Class the provides helper to handle O-MI related issues, like creating and sending requests.
 * 
 * @author Niklas Kolbe (niklas.kolbe@uni.lu)
 * @date 7 Apr 2017
 */
public class OmiHelper {

	/**
	 * Factory for JAXB O-MI objects.
	 */
	private static ObjectFactory omiFactory = new ObjectFactory();
	
	/**
	 * Combines the creation of the O-MI write request and sending it to the O-MI node
	 * @see createWriteRequest() and sendRequest()
	 * 
	 * @param objects Objects payload for the request
	 * @param ttl ttl field of the write request
	 * @param omiNodeUrl url of the O-MI node
	 * @return The response of the O-MI node as String
	 */
	public static String createAndSendWriteRequest(ObjectsType objects, String ttl, String omiNodeUrl) {
		return sendRequest(omiNodeUrl, createWriteRequest(objects, ttl));
	}
	
	/**
	 * Creates an O-MI write request.
	 * 
	 * @param objects Objects payload for the request
	 * @param ttl ttl field of the write request
	 * @return Return a JAXBElement enclosed OmiEnvelopeType, all set to generate the XML from
	 */
	public static JAXBElement<OmiEnvelopeType> createWriteRequest(ObjectsType objects, String ttl) {
		OmiEnvelopeType envelope = omiFactory.createOmiEnvelopeType();
		envelope.setTtl(ttl);
		envelope.setVersion("1.0");

		WriteRequestType writeRequest = omiFactory.createWriteRequestType();
		writeRequest.setMsgformat("odf");

		MsgType msg = omiFactory.createMsgType();
		msg.setObjects(objects);

		writeRequest.setMsg(msg);

		envelope.setWrite(writeRequest);
		
		return omiFactory.createOmiEnvelope(envelope);
	}
	
	/**
	 * Sends a XML string generated from an OmiEnvelope to an O-MI node by a specified URL.
	 * 
	 * @param omiNodeUrl URL of the O-MI node
	 * @param omiEnvelope The OmiEnvelope to generate the message string from
	 * @return The response of the O-MI node as String
	 */
	public static String sendRequest(String omiNodeUrl, JAXBElement<OmiEnvelopeType> omiEnvelope) {
		RESTClient client = new RESTClient(omiNodeUrl);
		client.setMediatype(MediaType.TEXT_XML);
		String message = JaxbHelper.getXmlString(omiEnvelope);
//		String add = " xmlns:rdfa=\"http://www.w3.org/1999/xhtml\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.w3.org/1999/xhtml https://www.w3.org/MarkUp/SCHEMA/xhtml-rdfa-2.xsd\"";
//		message = message.replaceFirst("xmlns=\"odf.xsd\"", "xmlns=\"odf.xsd\"" + add);
//		System.out.println("####################################");
//		System.out.println(message);
//		System.out.println("####################################");
//		System.out.println(message);
		String output = client.post(message);
		return output;
	}
}
