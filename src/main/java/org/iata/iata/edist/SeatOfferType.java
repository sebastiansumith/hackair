
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Seat Offer with Association definition.
 * 
 * <p>Java class for SeatOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatOfferType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}SeatDetailType">
 *       &lt;sequence>
 *         &lt;element name="OfferPrice">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPrice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}EncodedCurrencyPrice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DetailCurrencyPrice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CombinationPricing"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AwardPricing"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Association" type="{http://www.iata.org/IATA/EDIST}SeatOfferAssocType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatOfferType", propOrder = {
    "offerPrice",
    "association"
})
public class SeatOfferType
    extends SeatDetailType
{

    @XmlElement(name = "OfferPrice", required = true)
    protected SeatOfferType.OfferPrice offerPrice;
    @XmlElement(name = "Association", required = true)
    protected SeatOfferAssocType association;

    /**
     * Gets the value of the offerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SeatOfferType.OfferPrice }
     *     
     */
    public SeatOfferType.OfferPrice getOfferPrice() {
        return offerPrice;
    }

    /**
     * Sets the value of the offerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatOfferType.OfferPrice }
     *     
     */
    public void setOfferPrice(SeatOfferType.OfferPrice value) {
        this.offerPrice = value;
    }

    /**
     * Gets the value of the association property.
     * 
     * @return
     *     possible object is
     *     {@link SeatOfferAssocType }
     *     
     */
    public SeatOfferAssocType getAssociation() {
        return association;
    }

    /**
     * Sets the value of the association property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatOfferAssocType }
     *     
     */
    public void setAssociation(SeatOfferAssocType value) {
        this.association = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}EncodedCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DetailCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CombinationPricing"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AwardPricing"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "simpleCurrencyPrice",
        "encodedCurrencyPrice",
        "detailCurrencyPrice",
        "combinationPricing",
        "awardPricing"
    })
    public static class OfferPrice {

        @XmlElement(name = "SimpleCurrencyPrice")
        protected SimpleCurrencyPriceType simpleCurrencyPrice;
        @XmlElement(name = "EncodedCurrencyPrice")
        protected EncodedPriceType encodedCurrencyPrice;
        @XmlElement(name = "DetailCurrencyPrice")
        protected DetailCurrencyPriceType detailCurrencyPrice;
        @XmlElement(name = "CombinationPricing")
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "AwardPricing")
        protected AwardPriceUnitType awardPricing;

        /**
         * Gets the value of the simpleCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public SimpleCurrencyPriceType getSimpleCurrencyPrice() {
            return simpleCurrencyPrice;
        }

        /**
         * Sets the value of the simpleCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public void setSimpleCurrencyPrice(SimpleCurrencyPriceType value) {
            this.simpleCurrencyPrice = value;
        }

        /**
         * Gets the value of the encodedCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link EncodedPriceType }
         *     
         */
        public EncodedPriceType getEncodedCurrencyPrice() {
            return encodedCurrencyPrice;
        }

        /**
         * Sets the value of the encodedCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link EncodedPriceType }
         *     
         */
        public void setEncodedCurrencyPrice(EncodedPriceType value) {
            this.encodedCurrencyPrice = value;
        }

        /**
         * Gets the value of the detailCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link DetailCurrencyPriceType }
         *     
         */
        public DetailCurrencyPriceType getDetailCurrencyPrice() {
            return detailCurrencyPrice;
        }

        /**
         * Sets the value of the detailCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link DetailCurrencyPriceType }
         *     
         */
        public void setDetailCurrencyPrice(DetailCurrencyPriceType value) {
            this.detailCurrencyPrice = value;
        }

        /**
         * Gets the value of the combinationPricing property.
         * 
         * @return
         *     possible object is
         *     {@link CombinationPriceType }
         *     
         */
        public CombinationPriceType getCombinationPricing() {
            return combinationPricing;
        }

        /**
         * Sets the value of the combinationPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link CombinationPriceType }
         *     
         */
        public void setCombinationPricing(CombinationPriceType value) {
            this.combinationPricing = value;
        }

        /**
         * Gets the value of the awardPricing property.
         * 
         * @return
         *     possible object is
         *     {@link AwardPriceUnitType }
         *     
         */
        public AwardPriceUnitType getAwardPricing() {
            return awardPricing;
        }

        /**
         * Sets the value of the awardPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AwardPriceUnitType }
         *     
         */
        public void setAwardPricing(AwardPriceUnitType value) {
            this.awardPricing = value;
        }

    }

}
