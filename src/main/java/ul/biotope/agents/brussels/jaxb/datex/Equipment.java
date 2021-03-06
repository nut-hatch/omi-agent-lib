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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Equipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Equipment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingEquipmentOrServiceFacility"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="equipmentType" type="{http://datex2.eu/schema/2/2_0}EquipmentTypeEnum"/&gt;
 *         &lt;element name="electricCharging" type="{http://datex2.eu/schema/2/2_0}ElectricCharging" minOccurs="0"/&gt;
 *         &lt;element name="equipmentExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Equipment", propOrder = {
    "equipmentType",
    "electricCharging",
    "equipmentExtension"
})
public class Equipment
    extends ParkingEquipmentOrServiceFacility
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EquipmentTypeEnum equipmentType;
    protected ElectricCharging electricCharging;
    protected ExtensionType equipmentExtension;

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentTypeEnum }
     *     
     */
    public EquipmentTypeEnum getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentTypeEnum }
     *     
     */
    public void setEquipmentType(EquipmentTypeEnum value) {
        this.equipmentType = value;
    }

    /**
     * Gets the value of the electricCharging property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricCharging }
     *     
     */
    public ElectricCharging getElectricCharging() {
        return electricCharging;
    }

    /**
     * Sets the value of the electricCharging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricCharging }
     *     
     */
    public void setElectricCharging(ElectricCharging value) {
        this.electricCharging = value;
    }

    /**
     * Gets the value of the equipmentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEquipmentExtension() {
        return equipmentExtension;
    }

    /**
     * Sets the value of the equipmentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEquipmentExtension(ExtensionType value) {
        this.equipmentExtension = value;
    }

}
