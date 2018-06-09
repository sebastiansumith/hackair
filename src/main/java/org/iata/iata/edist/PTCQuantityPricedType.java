
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Requested and Priced Passenger Type Code(s) and Quantity.
 * 
 * Passenger type code and Traveler quantity.  Example: ADT
 * 
 * Encoding scheme:  IATA (three character) Passenger Type Code
 * 
 * <p>Java class for PTC_QuantityPricedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTC_QuantityPricedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Requested" type="{http://www.iata.org/IATA/EDIST}PTC_QuantityType" minOccurs="0"/>
 *         &lt;element name="Priced" type="{http://www.iata.org/IATA/EDIST}PTC_QuantityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTC_QuantityPricedType", propOrder = {
    "requested",
    "priced"
})
public class PTCQuantityPricedType
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "Requested")
    protected PTCQuantityType requested;
    @XmlElement(name = "Priced")
    protected PTCQuantityType priced;

    /**
     * Gets the value of the requested property.
     * 
     * @return
     *     possible object is
     *     {@link PTCQuantityType }
     *     
     */
    public PTCQuantityType getRequested() {
        return requested;
    }

    /**
     * Sets the value of the requested property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTCQuantityType }
     *     
     */
    public void setRequested(PTCQuantityType value) {
        this.requested = value;
    }

    /**
     * Gets the value of the priced property.
     * 
     * @return
     *     possible object is
     *     {@link PTCQuantityType }
     *     
     */
    public PTCQuantityType getPriced() {
        return priced;
    }

    /**
     * Sets the value of the priced property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTCQuantityType }
     *     
     */
    public void setPriced(PTCQuantityType value) {
        this.priced = value;
    }

}
