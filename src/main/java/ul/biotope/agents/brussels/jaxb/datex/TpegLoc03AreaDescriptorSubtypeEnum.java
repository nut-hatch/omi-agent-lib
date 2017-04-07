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
 * <p>Java class for TpegLoc03AreaDescriptorSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc03AreaDescriptorSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="administrativeAreaName"/&gt;
 *     &lt;enumeration value="administrativeReferenceName"/&gt;
 *     &lt;enumeration value="areaName"/&gt;
 *     &lt;enumeration value="countyName"/&gt;
 *     &lt;enumeration value="lakeName"/&gt;
 *     &lt;enumeration value="nationName"/&gt;
 *     &lt;enumeration value="policeForceControlAreaName"/&gt;
 *     &lt;enumeration value="regionName"/&gt;
 *     &lt;enumeration value="seaName"/&gt;
 *     &lt;enumeration value="townName"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc03AreaDescriptorSubtypeEnum")
@XmlEnum
public enum TpegLoc03AreaDescriptorSubtypeEnum {

    @XmlEnumValue("administrativeAreaName")
    ADMINISTRATIVE_AREA_NAME("administrativeAreaName"),
    @XmlEnumValue("administrativeReferenceName")
    ADMINISTRATIVE_REFERENCE_NAME("administrativeReferenceName"),
    @XmlEnumValue("areaName")
    AREA_NAME("areaName"),
    @XmlEnumValue("countyName")
    COUNTY_NAME("countyName"),
    @XmlEnumValue("lakeName")
    LAKE_NAME("lakeName"),
    @XmlEnumValue("nationName")
    NATION_NAME("nationName"),
    @XmlEnumValue("policeForceControlAreaName")
    POLICE_FORCE_CONTROL_AREA_NAME("policeForceControlAreaName"),
    @XmlEnumValue("regionName")
    REGION_NAME("regionName"),
    @XmlEnumValue("seaName")
    SEA_NAME("seaName"),
    @XmlEnumValue("townName")
    TOWN_NAME("townName"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TpegLoc03AreaDescriptorSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc03AreaDescriptorSubtypeEnum fromValue(String v) {
        for (TpegLoc03AreaDescriptorSubtypeEnum c: TpegLoc03AreaDescriptorSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
