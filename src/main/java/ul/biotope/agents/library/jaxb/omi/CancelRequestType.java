//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.31 at 10:59:07 PM CEST 
//


package ul.biotope.agents.library.jaxb.omi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nodeList" type="{http://www.opengroup.org/xsd/omi/1.0/}NodesType" minOccurs="0"/&gt;
 *         &lt;element name="requestID" type="{http://www.opengroup.org/xsd/omi/1.0/}IdType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelRequestType", propOrder = {
    "nodeList",
    "requestID"
})
public class CancelRequestType {

    protected NodesType nodeList;
    @XmlElement(required = true)
    protected List<IdType> requestID;

    /**
     * Gets the value of the nodeList property.
     * 
     * @return
     *     possible object is
     *     {@link NodesType }
     *     
     */
    public NodesType getNodeList() {
        return nodeList;
    }

    /**
     * Sets the value of the nodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodesType }
     *     
     */
    public void setNodeList(NodesType value) {
        this.nodeList = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdType }
     * 
     * 
     */
    public List<IdType> getRequestID() {
        if (requestID == null) {
            requestID = new ArrayList<IdType>();
        }
        return this.requestID;
    }

}
