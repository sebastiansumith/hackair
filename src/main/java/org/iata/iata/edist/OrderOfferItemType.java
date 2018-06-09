
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * OFFER ITEM IN ORDER definition.
 * 
 * <p>Java class for OrderOfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderOfferItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemType"/>
 *         &lt;element name="TimeLimits" type="{http://www.iata.org/IATA/EDIST}OfferItemTimeLimitSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderOfferItemType", propOrder = {
    "offerItemID",
    "offerItemType",
    "timeLimits"
})
public class OrderOfferItemType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "OfferItemID", required = true)
    protected ItemIDType offerItemID;
    @XmlElement(name = "OfferItemType", required = true)
    protected OfferItemType offerItemType;
    @XmlElement(name = "TimeLimits")
    protected OfferItemTimeLimitSetType timeLimits;

    /**
     * Gets the value of the offerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIDType }
     *     
     */
    public ItemIDType getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIDType }
     *     
     */
    public void setOfferItemID(ItemIDType value) {
        this.offerItemID = value;
    }

    /**
     * Gets the value of the offerItemType property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemType }
     *     
     */
    public OfferItemType getOfferItemType() {
        return offerItemType;
    }

    /**
     * Sets the value of the offerItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemType }
     *     
     */
    public void setOfferItemType(OfferItemType value) {
        this.offerItemType = value;
    }

    /**
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemTimeLimitSetType }
     *     
     */
    public OfferItemTimeLimitSetType getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemTimeLimitSetType }
     *     
     */
    public void setTimeLimits(OfferItemTimeLimitSetType value) {
        this.timeLimits = value;
    }

}
