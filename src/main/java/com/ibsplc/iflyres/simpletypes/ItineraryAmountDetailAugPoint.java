
package com.ibsplc.iflyres.simpletypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * IBS specific augmentation type to hold the itinerary level amount information.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalPriceAmount" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="TotalFeeAmount" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="TotalAmountToBePaid" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="TotalAmountPaid" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}CurrencyAmountType" minOccurs="0"/>
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
    "totalPriceAmount",
    "totalFeeAmount",
    "totalAmount",
    "totalAmountToBePaid",
    "totalAmountPaid"
})
@XmlRootElement(name = "ItineraryAmountDetailAugPoint")
public class ItineraryAmountDetailAugPoint {

    @XmlElement(name = "TotalPriceAmount")
    protected CurrencyAmountType totalPriceAmount;
    @XmlElement(name = "TotalFeeAmount")
    protected CurrencyAmountType totalFeeAmount;
    @XmlElement(name = "TotalAmount")
    protected CurrencyAmountType totalAmount;
    @XmlElement(name = "TotalAmountToBePaid")
    protected CurrencyAmountType totalAmountToBePaid;
    @XmlElement(name = "TotalAmountPaid")
    protected CurrencyAmountType totalAmountPaid;

    /**
     * Gets the value of the totalPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTotalPriceAmount() {
        return totalPriceAmount;
    }

    /**
     * Sets the value of the totalPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTotalPriceAmount(CurrencyAmountType value) {
        this.totalPriceAmount = value;
    }

    /**
     * Gets the value of the totalFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTotalFeeAmount() {
        return totalFeeAmount;
    }

    /**
     * Sets the value of the totalFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTotalFeeAmount(CurrencyAmountType value) {
        this.totalFeeAmount = value;
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
     * Gets the value of the totalAmountToBePaid property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTotalAmountToBePaid() {
        return totalAmountToBePaid;
    }

    /**
     * Sets the value of the totalAmountToBePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTotalAmountToBePaid(CurrencyAmountType value) {
        this.totalAmountToBePaid = value;
    }

    /**
     * Gets the value of the totalAmountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getTotalAmountPaid() {
        return totalAmountPaid;
    }

    /**
     * Sets the value of the totalAmountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setTotalAmountPaid(CurrencyAmountType value) {
        this.totalAmountPaid = value;
    }

}
