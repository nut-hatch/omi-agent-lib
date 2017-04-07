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
 * <p>Java class for RoadTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="motorway"/&gt;
 *     &lt;enumeration value="trunkRoad"/&gt;
 *     &lt;enumeration value="mainRoad"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoadTypeEnum")
@XmlEnum
public enum RoadTypeEnum {

    @XmlEnumValue("motorway")
    MOTORWAY("motorway"),
    @XmlEnumValue("trunkRoad")
    TRUNK_ROAD("trunkRoad"),
    @XmlEnumValue("mainRoad")
    MAIN_ROAD("mainRoad"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RoadTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadTypeEnum fromValue(String v) {
        for (RoadTypeEnum c: RoadTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
