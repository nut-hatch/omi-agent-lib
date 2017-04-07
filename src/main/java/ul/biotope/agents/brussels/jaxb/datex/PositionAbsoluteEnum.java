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
 * <p>Java class for PositionAbsoluteEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionAbsoluteEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="onLeft"/&gt;
 *     &lt;enumeration value="onRight"/&gt;
 *     &lt;enumeration value="atTop"/&gt;
 *     &lt;enumeration value="atBottom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PositionAbsoluteEnum")
@XmlEnum
public enum PositionAbsoluteEnum {

    @XmlEnumValue("onLeft")
    ON_LEFT("onLeft"),
    @XmlEnumValue("onRight")
    ON_RIGHT("onRight"),
    @XmlEnumValue("atTop")
    AT_TOP("atTop"),
    @XmlEnumValue("atBottom")
    AT_BOTTOM("atBottom");
    private final String value;

    PositionAbsoluteEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionAbsoluteEnum fromValue(String v) {
        for (PositionAbsoluteEnum c: PositionAbsoluteEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
