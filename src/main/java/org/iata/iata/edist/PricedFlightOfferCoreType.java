
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Core Priced Flight Offer definition.
 * 
 * <p>Java class for PricedFlightOfferCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedFlightOfferCoreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="OfferPrice">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferPriceLeadType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LeadPricedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="LeadPricingIncInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedFlightOfferCoreType", propOrder = {
    "offerPrice",
    "fareDetail"
})
@XmlSeeAlso({
    AltPricedFlightOfferType.class
})
public class PricedFlightOfferCoreType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "OfferPrice", required = true)
    protected PricedFlightOfferCoreType.OfferPrice offerPrice;
    @XmlElement(name = "FareDetail")
    protected FareDetailType fareDetail;
    @XmlAttribute(name = "LeadPricedInd")
    protected Boolean leadPricedInd;
    @XmlAttribute(name = "LeadPricingIncInd")
    protected Boolean leadPricingIncInd;

    /**
     * Gets the value of the offerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PricedFlightOfferCoreType.OfferPrice }
     *     
     */
    public PricedFlightOfferCoreType.OfferPrice getOfferPrice() {
        return offerPrice;
    }

    /**
     * Sets the value of the offerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedFlightOfferCoreType.OfferPrice }
     *     
     */
    public void setOfferPrice(PricedFlightOfferCoreType.OfferPrice value) {
        this.offerPrice = value;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType }
     *     
     */
    public FareDetailType getFareDetail() {
        return fareDetail;
    }

    /**
     * Sets the value of the fareDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType }
     *     
     */
    public void setFareDetail(FareDetailType value) {
        this.fareDetail = value;
    }

    /**
     * Gets the value of the leadPricedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeadPricedInd() {
        return leadPricedInd;
    }

    /**
     * Sets the value of the leadPricedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadPricedInd(Boolean value) {
        this.leadPricedInd = value;
    }

    /**
     * Gets the value of the leadPricingIncInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeadPricingIncInd() {
        return leadPricingIncInd;
    }

    /**
     * Sets the value of the leadPricingIncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadPricingIncInd(Boolean value) {
        this.leadPricingIncInd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferPriceLeadType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OfferPrice
        extends OfferPriceLeadType
    {


    }

}
