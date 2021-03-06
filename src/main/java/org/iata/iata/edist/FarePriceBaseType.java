
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * FARE BASE PRICE definition.
 * 
 * <p>Java class for FarePriceBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FarePriceBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareFiledIn" minOccurs="0"/>
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
 *         &lt;choice>
 *           &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST}AwardPriceUnitType" minOccurs="0"/>
 *           &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST}CombinationPriceType" minOccurs="0"/>
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
@XmlType(name = "FarePriceBaseType", propOrder = {
    "baseAmount",
    "fareFiledIn",
    "surcharges",
    "awardPricing",
    "combinationPricing"
})
@XmlSeeAlso({
    FarePriceDetailType.class
})
public class FarePriceBaseType {

    @XmlElement(name = "BaseAmount", required = true)
    protected CurrencyAmountOptType baseAmount;
    @XmlElement(name = "FareFiledIn")
    protected FareFilingType fareFiledIn;
    @XmlElement(name = "Surcharges")
    protected FarePriceBaseType.Surcharges surcharges;
    @XmlElement(name = "AwardPricing")
    protected AwardPriceUnitType awardPricing;
    @XmlElement(name = "CombinationPricing")
    protected CombinationPriceType combinationPricing;

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
     * Gets the value of the surcharges property.
     * 
     * @return
     *     possible object is
     *     {@link FarePriceBaseType.Surcharges }
     *     
     */
    public FarePriceBaseType.Surcharges getSurcharges() {
        return surcharges;
    }

    /**
     * Sets the value of the surcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePriceBaseType.Surcharges }
     *     
     */
    public void setSurcharges(FarePriceBaseType.Surcharges value) {
        this.surcharges = value;
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

}
