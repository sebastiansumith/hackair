
package com.ibsplc.iflyres.simpletypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Guest Amount Details.
 * 
 * <p>Java class for GuestAmountDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestAmountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceAmount" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="FeeAmount" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="AmountToBePaid" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="AmountPaid" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="AmountToBeReturned" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestAmountDetailsType", propOrder = {
    "priceAmount",
    "feeAmount",
    "totalAmount",
    "amountToBePaid",
    "amountPaid",
    "amountToBeReturned"
})
public class GuestAmountDetailsType {

    @XmlElement(name = "PriceAmount")
    protected CurrencyAmountType priceAmount;
    @XmlElement(name = "FeeAmount")
    protected CurrencyAmountType feeAmount;
    @XmlElement(name = "TotalAmount")
    protected CurrencyAmountType totalAmount;
    @XmlElement(name = "AmountToBePaid")
    protected CurrencyAmountType amountToBePaid;
    @XmlElement(name = "AmountPaid")
    protected CurrencyAmountType amountPaid;
    @XmlElement(name = "AmountToBeReturned")
    protected CurrencyAmountType amountToBeReturned;

    /**
     * Gets the value of the priceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getPriceAmount() {
        return priceAmount;
    }

    /**
     * Sets the value of the priceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setPriceAmount(CurrencyAmountType value) {
        this.priceAmount = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setFeeAmount(CurrencyAmountType value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTotalAmount(CurrencyAmountType value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the amountToBePaid property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getAmountToBePaid() {
        return amountToBePaid;
    }

    /**
     * Sets the value of the amountToBePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setAmountToBePaid(CurrencyAmountType value) {
        this.amountToBePaid = value;
    }

    /**
     * Gets the value of the amountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getAmountPaid() {
        return amountPaid;
    }

    /**
     * Sets the value of the amountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setAmountPaid(CurrencyAmountType value) {
        this.amountPaid = value;
    }

    /**
     * Gets the value of the amountToBeReturned property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getAmountToBeReturned() {
        return amountToBeReturned;
    }

    /**
     * Sets the value of the amountToBeReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setAmountToBeReturned(CurrencyAmountType value) {
        this.amountToBeReturned = value;
    }

}
