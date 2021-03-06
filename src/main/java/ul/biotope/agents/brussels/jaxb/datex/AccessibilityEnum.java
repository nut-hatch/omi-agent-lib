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
 * <p>Java class for AccessibilityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessibilityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="barrierFreeAccessible"/&gt;
 *     &lt;enumeration value="handicappedAccessible"/&gt;
 *     &lt;enumeration value="wheelChairAccessible"/&gt;
 *     &lt;enumeration value="handicappedEasements"/&gt;
 *     &lt;enumeration value="orientationSystemForBlindPeople"/&gt;
 *     &lt;enumeration value="handicappedMarked"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessibilityEnum")
@XmlEnum
public enum AccessibilityEnum {

    @XmlEnumValue("barrierFreeAccessible")
    BARRIER_FREE_ACCESSIBLE("barrierFreeAccessible"),
    @XmlEnumValue("handicappedAccessible")
    HANDICAPPED_ACCESSIBLE("handicappedAccessible"),
    @XmlEnumValue("wheelChairAccessible")
    WHEEL_CHAIR_ACCESSIBLE("wheelChairAccessible"),
    @XmlEnumValue("handicappedEasements")
    HANDICAPPED_EASEMENTS("handicappedEasements"),
    @XmlEnumValue("orientationSystemForBlindPeople")
    ORIENTATION_SYSTEM_FOR_BLIND_PEOPLE("orientationSystemForBlindPeople"),
    @XmlEnumValue("handicappedMarked")
    HANDICAPPED_MARKED("handicappedMarked"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AccessibilityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessibilityEnum fromValue(String v) {
        for (AccessibilityEnum c: AccessibilityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
