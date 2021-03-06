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
 * <p>Java class for ParkingOccupancyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingOccupancyEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="expectCarParkToBeFull"/&gt;
 *     &lt;enumeration value="percentage10"/&gt;
 *     &lt;enumeration value="percentage20"/&gt;
 *     &lt;enumeration value="percentage30"/&gt;
 *     &lt;enumeration value="percentage40"/&gt;
 *     &lt;enumeration value="percentage50"/&gt;
 *     &lt;enumeration value="percentage60"/&gt;
 *     &lt;enumeration value="percentage70"/&gt;
 *     &lt;enumeration value="percentage80"/&gt;
 *     &lt;enumeration value="percentage90"/&gt;
 *     &lt;enumeration value="full"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingOccupancyEnum")
@XmlEnum
public enum ParkingOccupancyEnum {

    @XmlEnumValue("expectCarParkToBeFull")
    EXPECT_CAR_PARK_TO_BE_FULL("expectCarParkToBeFull"),
    @XmlEnumValue("percentage10")
    PERCENTAGE_10("percentage10"),
    @XmlEnumValue("percentage20")
    PERCENTAGE_20("percentage20"),
    @XmlEnumValue("percentage30")
    PERCENTAGE_30("percentage30"),
    @XmlEnumValue("percentage40")
    PERCENTAGE_40("percentage40"),
    @XmlEnumValue("percentage50")
    PERCENTAGE_50("percentage50"),
    @XmlEnumValue("percentage60")
    PERCENTAGE_60("percentage60"),
    @XmlEnumValue("percentage70")
    PERCENTAGE_70("percentage70"),
    @XmlEnumValue("percentage80")
    PERCENTAGE_80("percentage80"),
    @XmlEnumValue("percentage90")
    PERCENTAGE_90("percentage90"),
    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ParkingOccupancyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingOccupancyEnum fromValue(String v) {
        for (ParkingOccupancyEnum c: ParkingOccupancyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
