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
 * <p>Java class for RequestTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="catalogue"/&gt;
 *     &lt;enumeration value="filter"/&gt;
 *     &lt;enumeration value="requestData"/&gt;
 *     &lt;enumeration value="requestHistoricalData"/&gt;
 *     &lt;enumeration value="subscription"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestTypeEnum")
@XmlEnum
public enum RequestTypeEnum {

    @XmlEnumValue("catalogue")
    CATALOGUE("catalogue"),
    @XmlEnumValue("filter")
    FILTER("filter"),
    @XmlEnumValue("requestData")
    REQUEST_DATA("requestData"),
    @XmlEnumValue("requestHistoricalData")
    REQUEST_HISTORICAL_DATA("requestHistoricalData"),
    @XmlEnumValue("subscription")
    SUBSCRIPTION("subscription");
    private final String value;

    RequestTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestTypeEnum fromValue(String v) {
        for (RequestTypeEnum c: RequestTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
