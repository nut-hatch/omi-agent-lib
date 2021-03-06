//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.30 at 03:52:53 PM CEST 
//


package ul.biotope.agents.brussels.jaxb.datex;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VehicleCountAndRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleCountAndRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteReference" type="{http://datex2.eu/schema/2/2_0}_MeasurementSiteRecordVersionedReference" minOccurs="0"/&gt;
 *         &lt;element name="measuredValueIndex" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="dedicatedAccess" type="{http://datex2.eu/schema/2/2_0}_ParkingAccessReference" minOccurs="0"/&gt;
 *         &lt;element name="measurementTimeDefault" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastCalibration" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="coveringPetrolStationArea" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCountWithinInterval" type="{http://datex2.eu/schema/2/2_0}VehicleCountWithinInterval" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vehicleRate" type="{http://datex2.eu/schema/2/2_0}VehicleRate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vehicleCountAndRateExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleCountAndRate", propOrder = {
    "measurementSiteReference",
    "measuredValueIndex",
    "dedicatedAccess",
    "measurementTimeDefault",
    "lastCalibration",
    "coveringPetrolStationArea",
    "vehicleCountWithinInterval",
    "vehicleRate",
    "vehicleCountAndRateExtension"
})
public class VehicleCountAndRate {

    protected MeasurementSiteRecordVersionedReference measurementSiteReference;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger measuredValueIndex;
    protected ParkingAccessReference dedicatedAccess;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar measurementTimeDefault;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCalibration;
    protected Boolean coveringPetrolStationArea;
    protected List<VehicleCountWithinInterval> vehicleCountWithinInterval;
    protected List<VehicleRate> vehicleRate;
    protected ExtensionType vehicleCountAndRateExtension;

    /**
     * Gets the value of the measurementSiteReference property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementSiteRecordVersionedReference }
     *     
     */
    public MeasurementSiteRecordVersionedReference getMeasurementSiteReference() {
        return measurementSiteReference;
    }

    /**
     * Sets the value of the measurementSiteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementSiteRecordVersionedReference }
     *     
     */
    public void setMeasurementSiteReference(MeasurementSiteRecordVersionedReference value) {
        this.measurementSiteReference = value;
    }

    /**
     * Gets the value of the measuredValueIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasuredValueIndex() {
        return measuredValueIndex;
    }

    /**
     * Sets the value of the measuredValueIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasuredValueIndex(BigInteger value) {
        this.measuredValueIndex = value;
    }

    /**
     * Gets the value of the dedicatedAccess property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAccessReference }
     *     
     */
    public ParkingAccessReference getDedicatedAccess() {
        return dedicatedAccess;
    }

    /**
     * Sets the value of the dedicatedAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAccessReference }
     *     
     */
    public void setDedicatedAccess(ParkingAccessReference value) {
        this.dedicatedAccess = value;
    }

    /**
     * Gets the value of the measurementTimeDefault property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementTimeDefault() {
        return measurementTimeDefault;
    }

    /**
     * Sets the value of the measurementTimeDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementTimeDefault(XMLGregorianCalendar value) {
        this.measurementTimeDefault = value;
    }

    /**
     * Gets the value of the lastCalibration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCalibration() {
        return lastCalibration;
    }

    /**
     * Sets the value of the lastCalibration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCalibration(XMLGregorianCalendar value) {
        this.lastCalibration = value;
    }

    /**
     * Gets the value of the coveringPetrolStationArea property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoveringPetrolStationArea() {
        return coveringPetrolStationArea;
    }

    /**
     * Sets the value of the coveringPetrolStationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoveringPetrolStationArea(Boolean value) {
        this.coveringPetrolStationArea = value;
    }

    /**
     * Gets the value of the vehicleCountWithinInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleCountWithinInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleCountWithinInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleCountWithinInterval }
     * 
     * 
     */
    public List<VehicleCountWithinInterval> getVehicleCountWithinInterval() {
        if (vehicleCountWithinInterval == null) {
            vehicleCountWithinInterval = new ArrayList<VehicleCountWithinInterval>();
        }
        return this.vehicleCountWithinInterval;
    }

    /**
     * Gets the value of the vehicleRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRate }
     * 
     * 
     */
    public List<VehicleRate> getVehicleRate() {
        if (vehicleRate == null) {
            vehicleRate = new ArrayList<VehicleRate>();
        }
        return this.vehicleRate;
    }

    /**
     * Gets the value of the vehicleCountAndRateExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleCountAndRateExtension() {
        return vehicleCountAndRateExtension;
    }

    /**
     * Sets the value of the vehicleCountAndRateExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleCountAndRateExtension(ExtensionType value) {
        this.vehicleCountAndRateExtension = value;
    }

}
