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
 * <p>Java class for TpegLoc03IlcPointDescriptorSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpegLoc03IlcPointDescriptorSubtypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="tpegIlcName1"/&gt;
 *     &lt;enumeration value="tpegIlcName2"/&gt;
 *     &lt;enumeration value="tpegIlcName3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpegLoc03IlcPointDescriptorSubtypeEnum")
@XmlEnum
public enum TpegLoc03IlcPointDescriptorSubtypeEnum {

    @XmlEnumValue("tpegIlcName1")
    TPEG_ILC_NAME_1("tpegIlcName1"),
    @XmlEnumValue("tpegIlcName2")
    TPEG_ILC_NAME_2("tpegIlcName2"),
    @XmlEnumValue("tpegIlcName3")
    TPEG_ILC_NAME_3("tpegIlcName3");
    private final String value;

    TpegLoc03IlcPointDescriptorSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc03IlcPointDescriptorSubtypeEnum fromValue(String v) {
        for (TpegLoc03IlcPointDescriptorSubtypeEnum c: TpegLoc03IlcPointDescriptorSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
