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
 * <p>Java class for ParkingSpacePhysicsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingSpacePhysicsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="driveThrough"/&gt;
 *     &lt;enumeration value="openAir"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingSpacePhysicsEnum")
@XmlEnum
public enum ParkingSpacePhysicsEnum {

    @XmlEnumValue("driveThrough")
    DRIVE_THROUGH("driveThrough"),
    @XmlEnumValue("openAir")
    OPEN_AIR("openAir");
    private final String value;

    ParkingSpacePhysicsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingSpacePhysicsEnum fromValue(String v) {
        for (ParkingSpacePhysicsEnum c: ParkingSpacePhysicsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
