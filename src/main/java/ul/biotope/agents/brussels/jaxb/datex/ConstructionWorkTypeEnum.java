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
 * <p>Java class for ConstructionWorkTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstructionWorkTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="blastingWork"/&gt;
 *     &lt;enumeration value="constructionWork"/&gt;
 *     &lt;enumeration value="demolitionWork"/&gt;
 *     &lt;enumeration value="roadImprovementOrUpgrading"/&gt;
 *     &lt;enumeration value="roadWideningWork"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConstructionWorkTypeEnum")
@XmlEnum
public enum ConstructionWorkTypeEnum {

    @XmlEnumValue("blastingWork")
    BLASTING_WORK("blastingWork"),
    @XmlEnumValue("constructionWork")
    CONSTRUCTION_WORK("constructionWork"),
    @XmlEnumValue("demolitionWork")
    DEMOLITION_WORK("demolitionWork"),
    @XmlEnumValue("roadImprovementOrUpgrading")
    ROAD_IMPROVEMENT_OR_UPGRADING("roadImprovementOrUpgrading"),
    @XmlEnumValue("roadWideningWork")
    ROAD_WIDENING_WORK("roadWideningWork");
    private final String value;

    ConstructionWorkTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionWorkTypeEnum fromValue(String v) {
        for (ConstructionWorkTypeEnum c: ConstructionWorkTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
