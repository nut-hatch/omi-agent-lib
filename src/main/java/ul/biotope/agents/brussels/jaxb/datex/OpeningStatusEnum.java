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
 * <p>Java class for OpeningStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpeningStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="open"/&gt;
 *     &lt;enumeration value="closed"/&gt;
 *     &lt;enumeration value="closedAbnormal"/&gt;
 *     &lt;enumeration value="openingTimesInForce"/&gt;
 *     &lt;enumeration value="statusUnknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpeningStatusEnum")
@XmlEnum
public enum OpeningStatusEnum {

    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("closedAbnormal")
    CLOSED_ABNORMAL("closedAbnormal"),
    @XmlEnumValue("openingTimesInForce")
    OPENING_TIMES_IN_FORCE("openingTimesInForce"),
    @XmlEnumValue("statusUnknown")
    STATUS_UNKNOWN("statusUnknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    OpeningStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpeningStatusEnum fromValue(String v) {
        for (OpeningStatusEnum c: OpeningStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
