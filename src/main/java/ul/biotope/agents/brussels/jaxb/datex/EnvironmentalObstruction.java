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
 * <p>Java class for EnvironmentalObstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentalObstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Obstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depth" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="environmentalObstructionType" type="{http://datex2.eu/schema/2/2_0}EnvironmentalObstructionTypeEnum"/&gt;
 *         &lt;element name="environmentalObstructionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentalObstruction", propOrder = {
    "depth",
    "environmentalObstructionType",
    "environmentalObstructionExtension"
})
public class EnvironmentalObstruction
    extends Obstruction
{

    protected Float depth;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnvironmentalObstructionTypeEnum environmentalObstructionType;
    protected ExtensionType environmentalObstructionExtension;

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepth(Float value) {
        this.depth = value;
    }

    /**
     * Gets the value of the environmentalObstructionType property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalObstructionTypeEnum }
     *     
     */
    public EnvironmentalObstructionTypeEnum getEnvironmentalObstructionType() {
        return environmentalObstructionType;
    }

    /**
     * Sets the value of the environmentalObstructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalObstructionTypeEnum }
     *     
     */
    public void setEnvironmentalObstructionType(EnvironmentalObstructionTypeEnum value) {
        this.environmentalObstructionType = value;
    }

    /**
     * Gets the value of the environmentalObstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEnvironmentalObstructionExtension() {
        return environmentalObstructionExtension;
    }

    /**
     * Sets the value of the environmentalObstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEnvironmentalObstructionExtension(ExtensionType value) {
        this.environmentalObstructionExtension = value;
    }

}