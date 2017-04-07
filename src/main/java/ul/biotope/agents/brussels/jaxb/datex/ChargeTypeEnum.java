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
 * <p>Java class for ChargeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="minimum"/&gt;
 *     &lt;enumeration value="maximum"/&gt;
 *     &lt;enumeration value="additionalIntervalPrice"/&gt;
 *     &lt;enumeration value="seasonTicket"/&gt;
 *     &lt;enumeration value="temporaryPrice"/&gt;
 *     &lt;enumeration value="firstIntervalPrice"/&gt;
 *     &lt;enumeration value="freeParking"/&gt;
 *     &lt;enumeration value="flat"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeTypeEnum")
@XmlEnum
public enum ChargeTypeEnum {

    @XmlEnumValue("minimum")
    MINIMUM("minimum"),
    @XmlEnumValue("maximum")
    MAXIMUM("maximum"),
    @XmlEnumValue("additionalIntervalPrice")
    ADDITIONAL_INTERVAL_PRICE("additionalIntervalPrice"),
    @XmlEnumValue("seasonTicket")
    SEASON_TICKET("seasonTicket"),
    @XmlEnumValue("temporaryPrice")
    TEMPORARY_PRICE("temporaryPrice"),
    @XmlEnumValue("firstIntervalPrice")
    FIRST_INTERVAL_PRICE("firstIntervalPrice"),
    @XmlEnumValue("freeParking")
    FREE_PARKING("freeParking"),
    @XmlEnumValue("flat")
    FLAT("flat"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ChargeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargeTypeEnum fromValue(String v) {
        for (ChargeTypeEnum c: ChargeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
