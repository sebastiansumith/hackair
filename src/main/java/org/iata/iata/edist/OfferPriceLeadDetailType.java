
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Lead Pricing Price Detail definition.
 * 
 * <p>Java class for OfferPriceLeadDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferPriceLeadDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceDetail">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TotalAmount" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AwardPricing"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CombinationPricing"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}DetailCurrencyPrice"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}EncodedCurrencyPrice"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPrice"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FareFiledIn" minOccurs="0"/>
 *                   &lt;element name="Discount" type="{http://www.iata.org/IATA/EDIST}DiscountType" minOccurs="0"/>
 *                   &lt;element name="Surcharges" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST}FeeSurchargeType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TaxExemption" minOccurs="0"/>
 *                   &lt;choice>
 *                     &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST}AwardPriceUnitType" minOccurs="0"/>
 *                     &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST}CombinationPriceType" minOccurs="0"/>
 *                   &lt;/choice>
 *                   &lt;choice maxOccurs="2" minOccurs="0">
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestinationReference"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferPriceLeadDetailType", propOrder = {
    "priceDetail"
})
@XmlSeeAlso({
    org.iata.iata.edist.OfferPriceLeadType.RequestedDate.class
})
public class OfferPriceLeadDetailType {

    @XmlElement(name = "PriceDetail", required = true)
    protected OfferPriceLeadDetailType.PriceDetail priceDetail;

    /**
     * Gets the value of the priceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OfferPriceLeadDetailType.PriceDetail }
     *     
     */
    public OfferPriceLeadDetailType.PriceDetail getPriceDetail() {
        return priceDetail;
    }

    /**
     * Sets the value of the priceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferPriceLeadDetailType.PriceDetail }
     *     
     */
    public void setPriceDetail(OfferPriceLeadDetailType.PriceDetail value) {
        this.priceDetail = value;
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
     *       &lt;sequence>
     *         &lt;element name="TotalAmount" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AwardPricing"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CombinationPricing"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DetailCurrencyPrice"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}EncodedCurrencyPrice"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPrice"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareFiledIn" minOccurs="0"/>
     *         &lt;element name="Discount" type="{http://www.iata.org/IATA/EDIST}DiscountType" minOccurs="0"/>
     *         &lt;element name="Surcharges" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST}FeeSurchargeType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TaxExemption" minOccurs="0"/>
     *         &lt;choice>
     *           &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST}AwardPriceUnitType" minOccurs="0"/>
     *           &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST}CombinationPriceType" minOccurs="0"/>
     *         &lt;/choice>
     *         &lt;choice maxOccurs="2" minOccurs="0">
     *           &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestinationReference"/>
     *           &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totalAmount",
        "baseAmount",
        "fareFiledIn",
        "discount",
        "surcharges",
        "taxes",
        "taxExemption",
        "awardPricing",
        "combinationPricing",
        "originDestinationReferenceOrSegmentReferences"
    })
    public static class PriceDetail {

        @XmlElement(name = "TotalAmount")
        protected OfferPriceLeadDetailType.PriceDetail.TotalAmount totalAmount;
        @XmlElement(name = "BaseAmount", required = true)
        protected CurrencyAmountOptType baseAmount;
        @XmlElement(name = "FareFiledIn")
        protected FareFilingType fareFiledIn;
        @XmlElement(name = "Discount")
        protected DiscountType discount;
        @XmlElement(name = "Surcharges")
        protected OfferPriceLeadDetailType.PriceDetail.Surcharges surcharges;
        @XmlElement(name = "Taxes")
        protected TaxDetailType taxes;
        @XmlElement(name = "TaxExemption")
        protected TaxExemptionType taxExemption;
        @XmlElement(name = "AwardPricing")
        protected AwardPriceUnitType awardPricing;
        @XmlElement(name = "CombinationPricing")
        protected CombinationPriceType combinationPricing;
        @XmlElementRefs({
            @XmlElementRef(name = "SegmentReferences", namespace = "http://www.iata.org/IATA/EDIST", type = SegmentReferences.class, required = false),
            @XmlElementRef(name = "OriginDestinationReference", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false)
        })
        protected List<Object> originDestinationReferenceOrSegmentReferences;

        /**
         * Gets the value of the totalAmount property.
         * 
         * @return
         *     possible object is
         *     {@link OfferPriceLeadDetailType.PriceDetail.TotalAmount }
         *     
         */
        public OfferPriceLeadDetailType.PriceDetail.TotalAmount getTotalAmount() {
            return totalAmount;
        }

        /**
         * Sets the value of the totalAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferPriceLeadDetailType.PriceDetail.TotalAmount }
         *     
         */
        public void setTotalAmount(OfferPriceLeadDetailType.PriceDetail.TotalAmount value) {
            this.totalAmount = value;
        }

        /**
         * Gets the value of the baseAmount property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public CurrencyAmountOptType getBaseAmount() {
            return baseAmount;
        }

        /**
         * Sets the value of the baseAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public void setBaseAmount(CurrencyAmountOptType value) {
            this.baseAmount = value;
        }

        /**
         * Gets the value of the fareFiledIn property.
         * 
         * @return
         *     possible object is
         *     {@link FareFilingType }
         *     
         */
        public FareFilingType getFareFiledIn() {
            return fareFiledIn;
        }

        /**
         * Sets the value of the fareFiledIn property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareFilingType }
         *     
         */
        public void setFareFiledIn(FareFilingType value) {
            this.fareFiledIn = value;
        }

        /**
         * Gets the value of the discount property.
         * 
         * @return
         *     possible object is
         *     {@link DiscountType }
         *     
         */
        public DiscountType getDiscount() {
            return discount;
        }

        /**
         * Sets the value of the discount property.
         * 
         * @param value
         *     allowed object is
         *     {@link DiscountType }
         *     
         */
        public void setDiscount(DiscountType value) {
            this.discount = value;
        }

        /**
         * Gets the value of the surcharges property.
         * 
         * @return
         *     possible object is
         *     {@link OfferPriceLeadDetailType.PriceDetail.Surcharges }
         *     
         */
        public OfferPriceLeadDetailType.PriceDetail.Surcharges getSurcharges() {
            return surcharges;
        }

        /**
         * Sets the value of the surcharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferPriceLeadDetailType.PriceDetail.Surcharges }
         *     
         */
        public void setSurcharges(OfferPriceLeadDetailType.PriceDetail.Surcharges value) {
            this.surcharges = value;
        }

        /**
         * Gets the value of the taxes property.
         * 
         * @return
         *     possible object is
         *     {@link TaxDetailType }
         *     
         */
        public TaxDetailType getTaxes() {
            return taxes;
        }

        /**
         * Sets the value of the taxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxDetailType }
         *     
         */
        public void setTaxes(TaxDetailType value) {
            this.taxes = value;
        }

        /**
         * Gets the value of the taxExemption property.
         * 
         * @return
         *     possible object is
         *     {@link TaxExemptionType }
         *     
         */
        public TaxExemptionType getTaxExemption() {
            return taxExemption;
        }

        /**
         * Sets the value of the taxExemption property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxExemptionType }
         *     
         */
        public void setTaxExemption(TaxExemptionType value) {
            this.taxExemption = value;
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
         * Gets the value of the originDestinationReferenceOrSegmentReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestinationReferenceOrSegmentReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestinationReferenceOrSegmentReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentReferences }
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * 
         * 
         */
        public List<Object> getOriginDestinationReferenceOrSegmentReferences() {
            if (originDestinationReferenceOrSegmentReferences == null) {
                originDestinationReferenceOrSegmentReferences = new ArrayList<Object>();
            }
            return this.originDestinationReferenceOrSegmentReferences;
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
         *       &lt;sequence>
         *         &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST}FeeSurchargeType" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "surcharge"
        })
        public static class Surcharges {

            @XmlElement(name = "Surcharge", required = true)
            protected List<FeeSurchargeType> surcharge;

            /**
             * Gets the value of the surcharge property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the surcharge property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSurcharge().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FeeSurchargeType }
             * 
             * 
             */
            public List<FeeSurchargeType> getSurcharge() {
                if (surcharge == null) {
                    surcharge = new ArrayList<FeeSurchargeType>();
                }
                return this.surcharge;
            }

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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AwardPricing"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CombinationPricing"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DetailCurrencyPrice"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}EncodedCurrencyPrice"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleCurrencyPrice"/>
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
            "awardPricing",
            "combinationPricing",
            "detailCurrencyPrice",
            "encodedCurrencyPrice",
            "simpleCurrencyPrice"
        })
        public static class TotalAmount {

            @XmlElement(name = "AwardPricing")
            protected AwardPriceUnitType awardPricing;
            @XmlElement(name = "CombinationPricing")
            protected CombinationPriceType combinationPricing;
            @XmlElement(name = "DetailCurrencyPrice")
            protected DetailCurrencyPriceType detailCurrencyPrice;
            @XmlElement(name = "EncodedCurrencyPrice")
            protected EncodedPriceType encodedCurrencyPrice;
            @XmlElement(name = "SimpleCurrencyPrice")
            protected SimpleCurrencyPriceType simpleCurrencyPrice;

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

        }

    }

}