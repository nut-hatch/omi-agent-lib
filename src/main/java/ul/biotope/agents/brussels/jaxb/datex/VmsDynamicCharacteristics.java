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


/**
 * <p>Java class for VmsDynamicCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsDynamicCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfPictogramDisplayAreas" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="vmsTextDisplayCharacteristics" type="{http://datex2.eu/schema/2/2_0}VmsTextDisplayCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="vmsPictogramDisplayCharacteristics" type="{http://datex2.eu/schema/2/2_0}_VmsDynamicCharacteristicsPictogramDisplayAreaIndexVmsPictogramDisplayCharacteristics" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vmsDynamicCharacteristicsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsDynamicCharacteristics", propOrder = {
    "numberOfPictogramDisplayAreas",
    "vmsTextDisplayCharacteristics",
    "vmsPictogramDisplayCharacteristics",
    "vmsDynamicCharacteristicsExtension"
})
public class VmsDynamicCharacteristics {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfPictogramDisplayAreas;
    protected VmsTextDisplayCharacteristics vmsTextDisplayCharacteristics;
    protected List<VmsDynamicCharacteristicsPictogramDisplayAreaIndexVmsPictogramDisplayCharacteristics> vmsPictogramDisplayCharacteristics;
    protected ExtensionType vmsDynamicCharacteristicsExtension;

    /**
     * Gets the value of the numberOfPictogramDisplayAreas property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPictogramDisplayAreas() {
        return numberOfPictogramDisplayAreas;
    }

    /**
     * Sets the value of the numberOfPictogramDisplayAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPictogramDisplayAreas(BigInteger value) {
        this.numberOfPictogramDisplayAreas = value;
    }

    /**
     * Gets the value of the vmsTextDisplayCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link VmsTextDisplayCharacteristics }
     *     
     */
    public VmsTextDisplayCharacteristics getVmsTextDisplayCharacteristics() {
        return vmsTextDisplayCharacteristics;
    }

    /**
     * Sets the value of the vmsTextDisplayCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsTextDisplayCharacteristics }
     *     
     */
    public void setVmsTextDisplayCharacteristics(VmsTextDisplayCharacteristics value) {
        this.vmsTextDisplayCharacteristics = value;
    }

    /**
     * Gets the value of the vmsPictogramDisplayCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmsPictogramDisplayCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsPictogramDisplayCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsDynamicCharacteristicsPictogramDisplayAreaIndexVmsPictogramDisplayCharacteristics }
     * 
     * 
     */
    public List<VmsDynamicCharacteristicsPictogramDisplayAreaIndexVmsPictogramDisplayCharacteristics> getVmsPictogramDisplayCharacteristics() {
        if (vmsPictogramDisplayCharacteristics == null) {
            vmsPictogramDisplayCharacteristics = new ArrayList<VmsDynamicCharacteristicsPictogramDisplayAreaIndexVmsPictogramDisplayCharacteristics>();
        }
        return this.vmsPictogramDisplayCharacteristics;
    }

    /**
     * Gets the value of the vmsDynamicCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsDynamicCharacteristicsExtension() {
        return vmsDynamicCharacteristicsExtension;
    }

    /**
     * Sets the value of the vmsDynamicCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsDynamicCharacteristicsExtension(ExtensionType value) {
        this.vmsDynamicCharacteristicsExtension = value;
    }

}