package ul.biotope.agents.library;

import javax.xml.namespace.QName;

import ul.biotope.agents.library.jaxb.odf.InfoItemType;
import ul.biotope.agents.library.jaxb.odf.ObjectFactory;
import ul.biotope.agents.library.jaxb.odf.ObjectType;
import ul.biotope.agents.library.jaxb.odf.QlmIDType;
import ul.biotope.agents.library.jaxb.odf.ValueType;

/**
 * Class the provides helper to handle O-MI related issues, like creating and sending requests.
 * 
 * @author Niklas Kolbe
 * @date 7 Apr 2017
 */
public class OdfHelper {

	/**
	 * Factory for JAXB O-MI objects.
	 */
	private static ObjectFactory odfFactory = new ObjectFactory();
	

	/**
	 * Creates an O-DF object with a given ID.
	 * 
	 * @param id The ID of the object
	 * @return ObjectType The JAXB Object element
	 */
	public static ObjectType createObject(String id) {
		return createObject(id, "");
	}
	
	/**
	 * Creates an O-DF object with a given ID and a type attribute.
	 * 
	 * @param id The ID of the object
	 * @param type The type attribute of the object
	 * @return ObjectType The JAXB Object element
	 */
	public static ObjectType createObject(String id, String type) {
		ObjectType object = odfFactory.createObjectType();
		if (!type.isEmpty()) {
			object.setType(type);
		}
		QlmIDType idElem = new QlmIDType();
		idElem.setValue(id);
		object.getId().add(idElem);
		return object;
	}

	/**
	 * Creates an O-DF InfoItem element with a given name an value.
	 * 
	 * @param name Name of the InfoItem
	 * @param value Value of the InfoItem
	 * @return InfoItemType The JAXB infoitem element
	 */
	public static InfoItemType createInfoItem(String name, String value) {
		return createInfoItem(name, value, "");
	}

	/**
	 * Creates an O-DF InfoItem element with a given name, value and a (RDFa) property attribute.
	 * 
	 * @param name Name of the InfoItem
	 * @param value Value of the InfoItem
	 * @param property Property attribute of the InfoItem
	 * 
	 * @return InfoItemType The JAXB infoitem element
	 */
	public static InfoItemType createInfoItem(String name, String value, String property) {
		ValueType valueElem = odfFactory.createValueType();
		valueElem.getContent().add(value);

		InfoItemType infoitem = odfFactory.createInfoItemType();
		infoitem.setName(name);
		if (!property.isEmpty()) {
			infoitem.getOtherAttributes().put(new QName("property"), property);
		}
		infoitem.getValue().add(valueElem);
		return infoitem;
	}
}
