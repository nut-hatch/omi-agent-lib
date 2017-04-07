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
 * <p>Java class for NonOrderedLocationGroupByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonOrderedLocationGroupByReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NonOrderedLocations"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedNonOrderedLocationGroupReference" type="{http://datex2.eu/schema/2/2_0}_PredefinedNonOrderedLocationGroupVersionedReference"/&gt;
 *         &lt;element name="nonOrderedLocationGroupByReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonOrderedLocationGroupByReference", propOrder = {
    "predefinedNonOrderedLocationGroupReference",
    "nonOrderedLocationGroupByReferenceExtension"
})
public class NonOrderedLocationGroupByReference
    extends NonOrderedLocations
{

    @XmlElement(required = true)
    protected PredefinedNonOrderedLocationGroupVersionedReference predefinedNonOrderedLocationGroupReference;
    protected ExtensionType nonOrderedLocationGroupByReferenceExtension;

    /**
     * Gets the value of the predefinedNonOrderedLocationGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedNonOrderedLocationGroupVersionedReference }
     *     
     */
    public PredefinedNonOrderedLocationGroupVersionedReference getPredefinedNonOrderedLocationGroupReference() {
        return predefinedNonOrderedLocationGroupReference;
    }

    /**
     * Sets the value of the predefinedNonOrderedLocationGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedNonOrderedLocationGroupVersionedReference }
     *     
     */
    public void setPredefinedNonOrderedLocationGroupReference(PredefinedNonOrderedLocationGroupVersionedReference value) {
        this.predefinedNonOrderedLocationGroupReference = value;
    }

    /**
     * Gets the value of the nonOrderedLocationGroupByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNonOrderedLocationGroupByReferenceExtension() {
        return nonOrderedLocationGroupByReferenceExtension;
    }

    /**
     * Sets the value of the nonOrderedLocationGroupByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNonOrderedLocationGroupByReferenceExtension(ExtensionType value) {
        this.nonOrderedLocationGroupByReferenceExtension = value;
    }

}
