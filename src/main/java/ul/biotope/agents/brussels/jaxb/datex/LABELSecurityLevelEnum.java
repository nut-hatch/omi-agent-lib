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
 * <p>Java class for LABELSecurityLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LABELSecurityLevelEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="securityLevel1"/&gt;
 *     &lt;enumeration value="securityLevel2"/&gt;
 *     &lt;enumeration value="securityLevel3"/&gt;
 *     &lt;enumeration value="securityLevel4"/&gt;
 *     &lt;enumeration value="securityLevel5"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LABELSecurityLevelEnum")
@XmlEnum
public enum LABELSecurityLevelEnum {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("securityLevel1")
    SECURITY_LEVEL_1("securityLevel1"),
    @XmlEnumValue("securityLevel2")
    SECURITY_LEVEL_2("securityLevel2"),
    @XmlEnumValue("securityLevel3")
    SECURITY_LEVEL_3("securityLevel3"),
    @XmlEnumValue("securityLevel4")
    SECURITY_LEVEL_4("securityLevel4"),
    @XmlEnumValue("securityLevel5")
    SECURITY_LEVEL_5("securityLevel5"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    LABELSecurityLevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LABELSecurityLevelEnum fromValue(String v) {
        for (LABELSecurityLevelEnum c: LABELSecurityLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
