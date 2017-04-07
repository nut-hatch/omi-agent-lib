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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingRouteStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingRouteStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingRouteReference" type="{http://datex2.eu/schema/2/2_0}_ParkingRouteDetailsVersionedReference"/&gt;
 *         &lt;element name="parkingRouteActive" type="{http://datex2.eu/schema/2/2_0}Boolean"/&gt;
 *         &lt;element name="parkingRouteStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingRouteStatus", propOrder = {
    "parkingRouteReference",
    "parkingRouteActive",
    "parkingRouteStatusExtension"
})
public class ParkingRouteStatus {

    @XmlElement(required = true)
    protected ParkingRouteDetailsVersionedReference parkingRouteReference;
    protected boolean parkingRouteActive;
    protected ExtensionType parkingRouteStatusExtension;

    /**
     * Gets the value of the parkingRouteReference property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingRouteDetailsVersionedReference }
     *     
     */
    public ParkingRouteDetailsVersionedReference getParkingRouteReference() {
        return parkingRouteReference;
    }

    /**
     * Sets the value of the parkingRouteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingRouteDetailsVersionedReference }
     *     
     */
    public void setParkingRouteReference(ParkingRouteDetailsVersionedReference value) {
        this.parkingRouteReference = value;
    }

    /**
     * Gets the value of the parkingRouteActive property.
     * 
     */
    public boolean isParkingRouteActive() {
        return parkingRouteActive;
    }

    /**
     * Sets the value of the parkingRouteActive property.
     * 
     */
    public void setParkingRouteActive(boolean value) {
        this.parkingRouteActive = value;
    }

    /**
     * Gets the value of the parkingRouteStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingRouteStatusExtension() {
        return parkingRouteStatusExtension;
    }

    /**
     * Sets the value of the parkingRouteStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingRouteStatusExtension(ExtensionType value) {
        this.parkingRouteStatusExtension = value;
    }

}
