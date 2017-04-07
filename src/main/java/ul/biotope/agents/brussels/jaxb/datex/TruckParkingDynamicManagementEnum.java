//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.30 at 03:52:53 PM CEST 
//


package ul.biotope.agents.brussels.jaxb.datex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TruckParkingDynamicManagementEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TruckParkingDynamicManagementEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="compactParking"/&gt;
 *     &lt;enumeration value="queueParking"/&gt;
 *     &lt;enumeration value="noDynamicParkingManagement"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TruckParkingDynamicManagementEnum")
@XmlEnum
public enum TruckParkingDynamicManagementEnum {

    @XmlEnumValue("compactParking")
    COMPACT_PARKING("compactParking"),
    @XmlEnumValue("queueParking")
    QUEUE_PARKING("queueParking"),
    @XmlEnumValue("noDynamicParkingManagement")
    NO_DYNAMIC_PARKING_MANAGEMENT("noDynamicParkingManagement"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TruckParkingDynamicManagementEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TruckParkingDynamicManagementEnum fromValue(String v) {
        for (TruckParkingDynamicManagementEnum c: TruckParkingDynamicManagementEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
