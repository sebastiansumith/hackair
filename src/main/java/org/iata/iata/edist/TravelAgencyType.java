
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for TRAVEL AGENCY Seller Role, Core Representation.
 * 
 * Notes:
 *  1. This is a representation of common (role-agnostic) properties associated with this Actor definition.
 *  2. This type is used as (derived) base type for all Roles associated with this Actor.
 *  3. This type is derived from AgencyCoreRepType.
 * 
 * <p>Java class for TravelAgencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelAgencyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AgencyCoreRepType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AgencyID"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelAgencyType", propOrder = {
    "agencyID"
})
@XmlSeeAlso({
    TrvlAgencyMsgPartyCoreType.class,
    TravelAgency.class
})
public class TravelAgencyType
    extends AgencyCoreRepType
{

    @XmlElement(name = "AgencyID", required = true)
    protected AgencyIDType agencyID;

    /**
     * Gets the value of the agencyID property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyIDType }
     *     
     */
    public AgencyIDType getAgencyID() {
        return agencyID;
    }

    /**
     * Sets the value of the agencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyIDType }
     *     
     */
    public void setAgencyID(AgencyIDType value) {
        this.agencyID = value;
    }

}
