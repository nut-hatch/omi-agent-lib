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
 * <p>Java class for OpenlrSideOfRoadEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpenlrSideOfRoadEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="onRoadOrUnknown"/&gt;
 *     &lt;enumeration value="right"/&gt;
 *     &lt;enumeration value="left"/&gt;
 *     &lt;enumeration value="both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpenlrSideOfRoadEnum")
@XmlEnum
public enum OpenlrSideOfRoadEnum {

    @XmlEnumValue("onRoadOrUnknown")
    ON_ROAD_OR_UNKNOWN("onRoadOrUnknown"),
    @XmlEnumValue("right")
    RIGHT("right"),
    @XmlEnumValue("left")
    LEFT("left"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    OpenlrSideOfRoadEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenlrSideOfRoadEnum fromValue(String v) {
        for (OpenlrSideOfRoadEnum c: OpenlrSideOfRoadEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
