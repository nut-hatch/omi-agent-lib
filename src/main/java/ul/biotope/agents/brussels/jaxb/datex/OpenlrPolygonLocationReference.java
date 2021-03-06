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
 * <p>Java class for OpenlrPolygonLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPolygonLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}OpenlrAreaLocationReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrPolygonCorners" type="{http://datex2.eu/schema/2/2_0}OpenlrPolygonCorners"/&gt;
 *         &lt;element name="openlrPolygonLocationReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPolygonLocationReference", propOrder = {
    "openlrPolygonCorners",
    "openlrPolygonLocationReferenceExtension"
})
public class OpenlrPolygonLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(required = true)
    protected OpenlrPolygonCorners openlrPolygonCorners;
    protected ExtensionType openlrPolygonLocationReferenceExtension;

    /**
     * Gets the value of the openlrPolygonCorners property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrPolygonCorners }
     *     
     */
    public OpenlrPolygonCorners getOpenlrPolygonCorners() {
        return openlrPolygonCorners;
    }

    /**
     * Sets the value of the openlrPolygonCorners property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrPolygonCorners }
     *     
     */
    public void setOpenlrPolygonCorners(OpenlrPolygonCorners value) {
        this.openlrPolygonCorners = value;
    }

    /**
     * Gets the value of the openlrPolygonLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrPolygonLocationReferenceExtension() {
        return openlrPolygonLocationReferenceExtension;
    }

    /**
     * Sets the value of the openlrPolygonLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrPolygonLocationReferenceExtension(ExtensionType value) {
        this.openlrPolygonLocationReferenceExtension = value;
    }

}
