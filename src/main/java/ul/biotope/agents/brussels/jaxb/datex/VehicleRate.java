//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.30 at 03:52:53 PM CEST 
//


package ul.biotope.agents.brussels.jaxb.datex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VehicleRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementOrCalculationTime" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="fillRate" type="{http://datex2.eu/schema/2/2_0}VehicleFlowValue" minOccurs="0"/&gt;
 *         &lt;element name="exitRate" type="{http://datex2.eu/schema/2/2_0}VehicleFlowValue" minOccurs="0"/&gt;
 *         &lt;element name="vehicleFlowRate" type="{http://datex2.eu/schema/2/2_0}VehicleFlowValue" minOccurs="0"/&gt;
 *         &lt;element name="measuredVehicles" type="{http://datex2.eu/schema/2/2_0}VehicleCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="vehicleRateExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRate", propOrder = {
    "measurementOrCalculationTime",
    "fillRate",
    "exitRate",
    "vehicleFlowRate",
    "measuredVehicles",
    "vehicleRateExtension"
})
public class VehicleRate {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measurementOrCalculationTime;
    protected VehicleFlowValue fillRate;
    protected VehicleFlowValue exitRate;
    protected VehicleFlowValue vehicleFlowRate;
    protected VehicleCharacteristics measuredVehicles;
    protected ExtensionType vehicleRateExtension;

    /**
     * Gets the value of the measurementOrCalculationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementOrCalculationTime() {
        return measurementOrCalculationTime;
    }

    /**
     * Sets the value of the measurementOrCalculationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementOrCalculationTime(XMLGregorianCalendar value) {
        this.measurementOrCalculationTime = value;
    }

    /**
     * Gets the value of the fillRate property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleFlowValue }
     *     
     */
    public VehicleFlowValue getFillRate() {
        return fillRate;
    }

    /**
     * Sets the value of the fillRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleFlowValue }
     *     
     */
    public void setFillRate(VehicleFlowValue value) {
        this.fillRate = value;
    }

    /**
     * Gets the value of the exitRate property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleFlowValue }
     *     
     */
    public VehicleFlowValue getExitRate() {
        return exitRate;
    }

    /**
     * Sets the value of the exitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleFlowValue }
     *     
     */
    public void setExitRate(VehicleFlowValue value) {
        this.exitRate = value;
    }

    /**
     * Gets the value of the vehicleFlowRate property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleFlowValue }
     *     
     */
    public VehicleFlowValue getVehicleFlowRate() {
        return vehicleFlowRate;
    }

    /**
     * Sets the value of the vehicleFlowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleFlowValue }
     *     
     */
    public void setVehicleFlowRate(VehicleFlowValue value) {
        this.vehicleFlowRate = value;
    }

    /**
     * Gets the value of the measuredVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getMeasuredVehicles() {
        return measuredVehicles;
    }

    /**
     * Sets the value of the measuredVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setMeasuredVehicles(VehicleCharacteristics value) {
        this.measuredVehicles = value;
    }

    /**
     * Gets the value of the vehicleRateExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleRateExtension() {
        return vehicleRateExtension;
    }

    /**
     * Sets the value of the vehicleRateExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleRateExtension(ExtensionType value) {
        this.vehicleRateExtension = value;
    }

}