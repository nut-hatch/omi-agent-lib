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
 * <p>Java class for ParkingSupervisionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingSupervisionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="remote"/&gt;
 *     &lt;enumeration value="onSite"/&gt;
 *     &lt;enumeration value="controlCentreOnSite"/&gt;
 *     &lt;enumeration value="controlCentreOffSite"/&gt;
 *     &lt;enumeration value="patrol"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingSupervisionEnum")
@XmlEnum
public enum ParkingSupervisionEnum {

    @XmlEnumValue("remote")
    REMOTE("remote"),
    @XmlEnumValue("onSite")
    ON_SITE("onSite"),
    @XmlEnumValue("controlCentreOnSite")
    CONTROL_CENTRE_ON_SITE("controlCentreOnSite"),
    @XmlEnumValue("controlCentreOffSite")
    CONTROL_CENTRE_OFF_SITE("controlCentreOffSite"),
    @XmlEnumValue("patrol")
    PATROL("patrol"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingSupervisionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingSupervisionEnum fromValue(String v) {
        for (ParkingSupervisionEnum c: ParkingSupervisionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
