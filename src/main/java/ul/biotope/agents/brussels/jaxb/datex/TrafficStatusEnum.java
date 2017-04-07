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
 * <p>Java class for TrafficStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="impossible"/&gt;
 *     &lt;enumeration value="congested"/&gt;
 *     &lt;enumeration value="heavy"/&gt;
 *     &lt;enumeration value="freeFlow"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrafficStatusEnum")
@XmlEnum
public enum TrafficStatusEnum {

    @XmlEnumValue("impossible")
    IMPOSSIBLE("impossible"),
    @XmlEnumValue("congested")
    CONGESTED("congested"),
    @XmlEnumValue("heavy")
    HEAVY("heavy"),
    @XmlEnumValue("freeFlow")
    FREE_FLOW("freeFlow"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TrafficStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficStatusEnum fromValue(String v) {
        for (TrafficStatusEnum c: TrafficStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
