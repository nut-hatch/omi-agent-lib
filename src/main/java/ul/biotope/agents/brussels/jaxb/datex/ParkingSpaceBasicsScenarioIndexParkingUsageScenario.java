//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.30 at 03:52:53 PM CEST 
//


package ul.biotope.agents.brussels.jaxb.datex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _ParkingSpaceBasicsScenarioIndexParkingUsageScenario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_ParkingSpaceBasicsScenarioIndexParkingUsageScenario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingUsageScenario" type="{http://datex2.eu/schema/2/2_0}ParkingUsageScenario"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="scenarioIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_ParkingSpaceBasicsScenarioIndexParkingUsageScenario", propOrder = {
    "parkingUsageScenario"
})
public class ParkingSpaceBasicsScenarioIndexParkingUsageScenario {

    @XmlElement(required = true)
    protected ParkingUsageScenario parkingUsageScenario;
    @XmlAttribute(name = "scenarioIndex", required = true)
    protected int scenarioIndex;

    /**
     * Gets the value of the parkingUsageScenario property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingUsageScenario }
     *     
     */
    public ParkingUsageScenario getParkingUsageScenario() {
        return parkingUsageScenario;
    }

    /**
     * Sets the value of the parkingUsageScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingUsageScenario }
     *     
     */
    public void setParkingUsageScenario(ParkingUsageScenario value) {
        this.parkingUsageScenario = value;
    }

    /**
     * Gets the value of the scenarioIndex property.
     * 
     */
    public int getScenarioIndex() {
        return scenarioIndex;
    }

    /**
     * Sets the value of the scenarioIndex property.
     * 
     */
    public void setScenarioIndex(int value) {
        this.scenarioIndex = value;
    }

}