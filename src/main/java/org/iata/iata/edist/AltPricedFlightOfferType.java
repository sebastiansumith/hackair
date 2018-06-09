
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Alternate Priced Flight Offer with Order Association definition.
 *       
 * 
 * <p>Java class for AltPricedFlightOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltPricedFlightOfferType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PricedFlightOfferCoreType">
 *       &lt;sequence>
 *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}MultiAssociationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltPricedFlightOfferType", propOrder = {
    "associations"
})
public class AltPricedFlightOfferType
    extends PricedFlightOfferCoreType
{

    @XmlElement(name = "Associations")
    protected MultiAssociationType associations;

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link MultiAssociationType }
     *     
     */
    public MultiAssociationType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiAssociationType }
     *     
     */
    public void setAssociations(MultiAssociationType value) {
        this.associations = value;
    }

}
