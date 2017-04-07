package ul.biotope.agents.library;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import ul.biotope.agents.library.jaxb.odf.ObjectsType;
import ul.biotope.agents.library.jaxb.omi.OmiEnvelopeType;


/**
 * Helper class for JAXB elements. Helps to parse and create XML documents.
 * 
 * @author Niklas Kolbe (niklas.kolbe@uni.lu)
 * @date 7 Apr 2017
 */
public class JaxbHelper {
	
	/**
	 * jaxbContext. Treat as singleton!
	 */
	private static JAXBContext jaxbContext;
	
	/**
	 * Unmarshaller to parse XML. Treat as singleton!
	 */
	private static Unmarshaller jaxbUnmarshaller;
	
	/**
	 * Marshaller to write XML. Treat as singleton!
	 */
	private static Marshaller jaxbMarshaller;
	

	public static <T> JAXBElement<T> parseXML(String data, String context, Class<T> returnClass, String jumpToThisTag) {
		return parseXML(data, context, returnClass, jumpToThisTag, getUnmarshaller());
	}
	
	/**
	 * Little helper to parse a string input to Jaxb elements.
	 * 
	 * @param data String input
	 * @param instanceType Context for corresponding JAXBElements 
	 * @param returnClass Root class intended for parsing
	 * @param jumpToThisTag Corresponding tag name of the root class, to jump to the right part in the XML
	 * @return The JAXBElement of the specified returnClass type
	 */
	public static <T> JAXBElement<T> parseXML(String data, String context, Class<T> returnClass, String jumpToThisTag, Unmarshaller unmarshaller) {
		JAXBElement<T> elements = null;
		try {
			// prepare input
			InputStream stream = new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
			Source source = new StreamSource(stream);

			// move to relevant part of XML message
			XMLInputFactory xif = XMLInputFactory.newInstance();
			XMLStreamReader xsr = xif.createXMLStreamReader(source);
			while (xsr.hasNext()) {
				if (xsr.isStartElement() && xsr.getLocalName().equals(jumpToThisTag)) {
					break;
				}
				xsr.next();
			}

			// unmarshall XML message
			elements = unmarshaller.unmarshal(xsr, returnClass);

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return elements;
	}
	
	/**
	 * Little helper to print XML on std.out.
	 * 
	 * @param root The root element of the XML dom.
	 */
	public static <T> void printXml(JAXBElement<T> root) {
		try {
			getMarshaller().setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			getMarshaller().marshal(root, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	/**
	 * Creates the XML string based on the JAXB objects.
	 * 
	 * @param root The root element of the XML dom.
	 * @return String The xml as string.
	 */
	public static <T> String getXmlString(JAXBElement<T> root) {
		StringWriter writer = new StringWriter();
		try {
			getMarshaller().setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			getMarshaller().marshal(root, writer);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return writer.toString();
	}
	
	/**
	 * Returns JAXBContext singleton object.
	 * 
	 * @return JAXBContext
	 */
	public static JAXBContext getContext() {
		if (jaxbContext == null) {
			try {
				jaxbContext = JAXBContext.newInstance(OmiEnvelopeType.class, ObjectsType.class);
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return jaxbContext;
	}
	
	/**
	 * Returns JAXBMarshaller.
	 * 
	 * @return JAXBMarshaller
	 */
	public static Marshaller getMarshaller() {
		if (jaxbMarshaller == null) {
			try {
				jaxbMarshaller = getContext().createMarshaller();
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return jaxbMarshaller;
	}

	/**
	 * Returns JAXBUnmarshaller.
	 * 
	 * @return JAXBUnmarshaller
	 */
	public static Unmarshaller getUnmarshaller() {
		if (jaxbUnmarshaller == null) {
			try {
				jaxbUnmarshaller = getContext().createUnmarshaller();
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return jaxbUnmarshaller;
	}
	
//	public Node marshal(Object obj) throws JAXBException {
//		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//		dbf.setNamespaceAware(true);
//		Document doc = null;
//		try {
//			DocumentBuilder db = dbf.newDocumentBuilder();
//			doc = db.newDocument();
//		} catch (ParserConfigurationException ex) {
//			throw new JAXBException(ex);
//		}
//
//		// init JAXB
//		JaxbHelper.getMarshaller().setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//		JaxbHelper.getMarshaller().marshal(obj, doc);
//		return doc.getDocumentElement();
//	}
	
}
