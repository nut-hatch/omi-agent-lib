//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.30 at 03:52:53 PM CEST 
//


package ul.biotope.agents.brussels.jaxb.datex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationRateValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationRateValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationRate" type="{http://datex2.eu/schema/2/2_0}IntensityKilogramsPerSquareMetre"/&gt;
 *         &lt;element name="applicationRateValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationRateValue", propOrder = {
    "applicationRate",
    "applicationRateValueExtension"
})
public class ApplicationRateValue
    extends DataValue
{

    protected float applicationRate;
    protected ExtensionType applicationRateValueExtension;

    /**
     * Gets the value of the applicationRate property.
     * 
     */
    public float getApplicationRate() {
        return applicationRate;
    }

    /**
     * Sets the value of the applicationRate property.
     * 
     */
    public void setApplicationRate(float value) {
        this.applicationRate = value;
    }

    /**
     * Gets the value of the applicationRateValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getApplicationRateValueExtension() {
        return applicationRateValueExtension;
    }

    /**
     * Sets the value of the applicationRateValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setApplicationRateValueExtension(ExtensionType value) {
        this.applicationRateValueExtension = value;
    }

}
