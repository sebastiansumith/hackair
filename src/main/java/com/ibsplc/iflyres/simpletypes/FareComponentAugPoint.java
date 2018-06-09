
package com.ibsplc.iflyres.simpletypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="BaseFare" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="AppliedFare" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="DisplayFare" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
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
    "baseFare",
    "appliedFare",
    "displayFare",
    "discount"
})
@XmlRootElement(name = "FareComponentAugPoint")
public class FareComponentAugPoint {

    @XmlElement(name = "BaseFare")
    protected CurrencyAmountType baseFare;
    @XmlElement(name = "AppliedFare")
    protected CurrencyAmountType appliedFare;
    @XmlElement(name = "DisplayFare")
    protected CurrencyAmountType displayFare;
    @XmlElement(name = "Discount")
    protected CurrencyAmountType discount;

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setBaseFare(CurrencyAmountType value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the appliedFare property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getAppliedFare() {
        return appliedFare;
    }

    /**
     * Sets the value of the appliedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setAppliedFare(CurrencyAmountType value) {
        this.appliedFare = value;
    }

    /**
     * Gets the value of the displayFare property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getDisplayFare() {
        return displayFare;
    }

    /**
     * Sets the value of the displayFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setDisplayFare(CurrencyAmountType value) {
        this.displayFare = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setDiscount(CurrencyAmountType value) {
        this.discount = value;
    }

}
