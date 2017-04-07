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
 * <p>Java class for TpegLoc03OtherPointDescriptorSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc03OtherPointDescriptorSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="administrativeAreaName"/&gt;
 *     &lt;enumeration value="administrativeReferenceName"/&gt;
 *     &lt;enumeration value="airportName"/&gt;
 *     &lt;enumeration value="areaName"/&gt;
 *     &lt;enumeration value="buildingName"/&gt;
 *     &lt;enumeration value="busStopIdentifier"/&gt;
 *     &lt;enumeration value="busStopName"/&gt;
 *     &lt;enumeration value="canalName"/&gt;
 *     &lt;enumeration value="countyName"/&gt;
 *     &lt;enumeration value="ferryPortName"/&gt;
 *     &lt;enumeration value="intersectionName"/&gt;
 *     &lt;enumeration value="lakeName"/&gt;
 *     &lt;enumeration value="linkName"/&gt;
 *     &lt;enumeration value="localLinkName"/&gt;
 *     &lt;enumeration value="metroStationName"/&gt;
 *     &lt;enumeration value="nationName"/&gt;
 *     &lt;enumeration value="nonLinkedPointName"/&gt;
 *     &lt;enumeration value="parkingFacilityName"/&gt;
 *     &lt;enumeration value="pointName"/&gt;
 *     &lt;enumeration value="pointOfInterestName"/&gt;
 *     &lt;enumeration value="railwayStation"/&gt;
 *     &lt;enumeration value="regionName"/&gt;
 *     &lt;enumeration value="riverName"/&gt;
 *     &lt;enumeration value="seaName"/&gt;
 *     &lt;enumeration value="serviceAreaName"/&gt;
 *     &lt;enumeration value="tidalRiverName"/&gt;
 *     &lt;enumeration value="townName"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc03OtherPointDescriptorSubtypeEnum")
@XmlEnum
public enum TpegLoc03OtherPointDescriptorSubtypeEnum {

    @XmlEnumValue("administrativeAreaName")
    ADMINISTRATIVE_AREA_NAME("administrativeAreaName"),
    @XmlEnumValue("administrativeReferenceName")
    ADMINISTRATIVE_REFERENCE_NAME("administrativeReferenceName"),
    @XmlEnumValue("airportName")
    AIRPORT_NAME("airportName"),
    @XmlEnumValue("areaName")
    AREA_NAME("areaName"),
    @XmlEnumValue("buildingName")
    BUILDING_NAME("buildingName"),
    @XmlEnumValue("busStopIdentifier")
    BUS_STOP_IDENTIFIER("busStopIdentifier"),
    @XmlEnumValue("busStopName")
    BUS_STOP_NAME("busStopName"),
    @XmlEnumValue("canalName")
    CANAL_NAME("canalName"),
    @XmlEnumValue("countyName")
    COUNTY_NAME("countyName"),
    @XmlEnumValue("ferryPortName")
    FERRY_PORT_NAME("ferryPortName"),
    @XmlEnumValue("intersectionName")
    INTERSECTION_NAME("intersectionName"),
    @XmlEnumValue("lakeName")
    LAKE_NAME("lakeName"),
    @XmlEnumValue("linkName")
    LINK_NAME("linkName"),
    @XmlEnumValue("localLinkName")
    LOCAL_LINK_NAME("localLinkName"),
    @XmlEnumValue("metroStationName")
    METRO_STATION_NAME("metroStationName"),
    @XmlEnumValue("nationName")
    NATION_NAME("nationName"),
    @XmlEnumValue("nonLinkedPointName")
    NON_LINKED_POINT_NAME("nonLinkedPointName"),
    @XmlEnumValue("parkingFacilityName")
    PARKING_FACILITY_NAME("parkingFacilityName"),
    @XmlEnumValue("pointName")
    POINT_NAME("pointName"),
    @XmlEnumValue("pointOfInterestName")
    POINT_OF_INTEREST_NAME("pointOfInterestName"),
    @XmlEnumValue("railwayStation")
    RAILWAY_STATION("railwayStation"),
    @XmlEnumValue("regionName")
    REGION_NAME("regionName"),
    @XmlEnumValue("riverName")
    RIVER_NAME("riverName"),
    @XmlEnumValue("seaName")
    SEA_NAME("seaName"),
    @XmlEnumValue("serviceAreaName")
    SERVICE_AREA_NAME("serviceAreaName"),
    @XmlEnumValue("tidalRiverName")
    TIDAL_RIVER_NAME("tidalRiverName"),
    @XmlEnumValue("townName")
    TOWN_NAME("townName"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TpegLoc03OtherPointDescriptorSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc03OtherPointDescriptorSubtypeEnum fromValue(String v) {
        for (TpegLoc03OtherPointDescriptorSubtypeEnum c: TpegLoc03OtherPointDescriptorSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
