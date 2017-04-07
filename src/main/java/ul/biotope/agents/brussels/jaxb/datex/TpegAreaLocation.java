//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.30 at 03:52:53 PM CEST 
//


package ul.biotope.agents.brussels.jaxb.datex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegAreaLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegAreaLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegAreaLocationType" type="{http://datex2.eu/schema/2/2_0}TpegLoc01AreaLocationSubtypeEnum"/&gt;
 *         &lt;element name="tpegHeight" type="{http://datex2.eu/schema/2/2_0}TpegHeight" minOccurs="0"/&gt;
 *         &lt;element name="tpegAreaLocationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegAreaLocation", propOrder = {
    "tpegAreaLocationType",
    "tpegHeight",
    "tpegAreaLocationExtension"
})
@XmlSeeAlso({
    TpegGeometricArea.class,
    TpegNamedOnlyArea.class
})
public abstract class TpegAreaLocation {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc01AreaLocationSubtypeEnum tpegAreaLocationType;
    protected TpegHeight tpegHeight;
    protected ExtensionType tpegAreaLocationExtension;

    /**
     * Gets the value of the tpegAreaLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc01AreaLocationSubtypeEnum }
     *     
     */
    public TpegLoc01AreaLocationSubtypeEnum getTpegAreaLocationType() {
        return tpegAreaLocationType;
    }

    /**
     * Sets the value of the tpegAreaLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc01AreaLocationSubtypeEnum }
     *     
     */
    public void setTpegAreaLocationType(TpegLoc01AreaLocationSubtypeEnum value) {
        this.tpegAreaLocationType = value;
    }

    /**
     * Gets the value of the tpegHeight property.
     * 
     * @return
     *     possible object is
     *     {@link TpegHeight }
     *     
     */
    public TpegHeight getTpegHeight() {
        return tpegHeight;
    }

    /**
     * Sets the value of the tpegHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegHeight }
     *     
     */
    public void setTpegHeight(TpegHeight value) {
        this.tpegHeight = value;
    }

    /**
     * Gets the value of the tpegAreaLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegAreaLocationExtension() {
        return tpegAreaLocationExtension;
    }

    /**
     * Sets the value of the tpegAreaLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegAreaLocationExtension(ExtensionType value) {
        this.tpegAreaLocationExtension = value;
    }

}
