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
 * <p>Java class for HeaviestAxleWeightCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaviestAxleWeightCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/2/2_0}ComparisonOperatorEnum"/&gt;
 *         &lt;element name="heaviestAxleWeight" type="{http://datex2.eu/schema/2/2_0}Tonnes"/&gt;
 *         &lt;element name="heaviestAxleWeightCharacteristicExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaviestAxleWeightCharacteristic", propOrder = {
    "comparisonOperator",
    "heaviestAxleWeight",
    "heaviestAxleWeightCharacteristicExtension"
})
public class HeaviestAxleWeightCharacteristic {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ComparisonOperatorEnum comparisonOperator;
    protected float heaviestAxleWeight;
    protected ExtensionType heaviestAxleWeightCharacteristicExtension;

    /**
     * Gets the value of the comparisonOperator property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public ComparisonOperatorEnum getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Sets the value of the comparisonOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public void setComparisonOperator(ComparisonOperatorEnum value) {
        this.comparisonOperator = value;
    }

    /**
     * Gets the value of the heaviestAxleWeight property.
     * 
     */
    public float getHeaviestAxleWeight() {
        return heaviestAxleWeight;
    }

    /**
     * Sets the value of the heaviestAxleWeight property.
     * 
     */
    public void setHeaviestAxleWeight(float value) {
        this.heaviestAxleWeight = value;
    }

    /**
     * Gets the value of the heaviestAxleWeightCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHeaviestAxleWeightCharacteristicExtension() {
        return heaviestAxleWeightCharacteristicExtension;
    }

    /**
     * Sets the value of the heaviestAxleWeightCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHeaviestAxleWeightCharacteristicExtension(ExtensionType value) {
        this.heaviestAxleWeightCharacteristicExtension = value;
    }

}
