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


/**
 * <p>Java class for GroupOfParkingSitesStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOfParkingSitesStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingRecordStatus"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupOfParkingSitesStatus" type="{http://datex2.eu/schema/2/2_0}GroupOfParkingSitesStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="groupOfParkingSitesStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfParkingSitesStatus", propOrder = {
    "groupOfParkingSitesStatus",
    "groupOfParkingSitesStatusExtension"
})
public class GroupOfParkingSitesStatus
    extends ParkingRecordStatus
{

    @XmlSchemaType(name = "string")
    protected GroupOfParkingSitesStatusEnum groupOfParkingSitesStatus;
    protected ExtensionType groupOfParkingSitesStatusExtension;

    /**
     * Gets the value of the groupOfParkingSitesStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfParkingSitesStatusEnum }
     *     
     */
    public GroupOfParkingSitesStatusEnum getGroupOfParkingSitesStatus() {
        return groupOfParkingSitesStatus;
    }

    /**
     * Sets the value of the groupOfParkingSitesStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfParkingSitesStatusEnum }
     *     
     */
    public void setGroupOfParkingSitesStatus(GroupOfParkingSitesStatusEnum value) {
        this.groupOfParkingSitesStatus = value;
    }

    /**
     * Gets the value of the groupOfParkingSitesStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfParkingSitesStatusExtension() {
        return groupOfParkingSitesStatusExtension;
    }

    /**
     * Sets the value of the groupOfParkingSitesStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfParkingSitesStatusExtension(ExtensionType value) {
        this.groupOfParkingSitesStatusExtension = value;
    }

}