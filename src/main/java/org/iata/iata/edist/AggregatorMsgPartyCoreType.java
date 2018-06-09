
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for AGGREGATOR Message Party Representation.
 * 
 * Notes: Derived from AggregatorType.
 * 
 * <p>Java class for AggregatorMsgPartyCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregatorMsgPartyCoreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AggregatorType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentUserID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregatorMsgPartyCoreType", propOrder = {
    "agentUserID"
})
@XmlSeeAlso({
    AggregatorParticipantType.class,
    AggregatorRecipientType.class,
    AggregatorSenderType.class
})
public class AggregatorMsgPartyCoreType
    extends AggregatorType
{

    @XmlElement(name = "AgentUserID")
    protected AgentUserIDType agentUserID;

    /**
     * Gets the value of the agentUserID property.
     * 
     * @return
     *     possible object is
     *     {@link AgentUserIDType }
     *     
     */
    public AgentUserIDType getAgentUserID() {
        return agentUserID;
    }

    /**
     * Sets the value of the agentUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentUserIDType }
     *     
     */
    public void setAgentUserID(AgentUserIDType value) {
        this.agentUserID = value;
    }

}
