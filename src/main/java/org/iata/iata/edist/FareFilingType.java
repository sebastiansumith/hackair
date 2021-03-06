
package org.iata.iata.edist;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * FARE FILING definition.
 * 
 * <p>Java class for FareFilingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFilingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType"/>
 *         &lt;element name="NUC_Amount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExchangeRate" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" minOccurs="0"/>
 *         &lt;element name="TicketBulkMask" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FiledFare" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFilingType", propOrder = {
    "baseAmount",
    "nucAmount",
    "exchangeRate",
    "ticketBulkMask",
    "filedFare"
})
public class FareFilingType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "BaseAmount", required = true)
    protected CurrencyAmountOptType baseAmount;
    @XmlElement(name = "NUC_Amount")
    protected FareFilingType.NUCAmount nucAmount;
    @XmlElement(name = "ExchangeRate")
    protected String exchangeRate;
    @XmlElement(name = "TicketBulkMask")
    protected String ticketBulkMask;
    @XmlElement(name = "FiledFare")
    protected FiledFare filedFare;

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
     * Gets the value of the nucAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FareFilingType.NUCAmount }
     *     
     */
    public FareFilingType.NUCAmount getNUCAmount() {
        return nucAmount;
    }

    /**
     * Sets the value of the nucAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareFilingType.NUCAmount }
     *     
     */
    public void setNUCAmount(FareFilingType.NUCAmount value) {
        this.nucAmount = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the ticketBulkMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketBulkMask() {
        return ticketBulkMask;
    }

    /**
     * Sets the value of the ticketBulkMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketBulkMask(String value) {
        this.ticketBulkMask = value;
    }

    /**
     * Filed fare information that may contain specific indicators applicable to the use of filed fares scenarios.
     * 
     * @return
     *     possible object is
     *     {@link FiledFare }
     *     
     */
    public FiledFare getFiledFare() {
        return filedFare;
    }

    /**
     * Sets the value of the filedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiledFare }
     *     
     */
    public void setFiledFare(FiledFare value) {
        this.filedFare = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class NUCAmount {

        @XmlValue
        protected BigInteger value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

    }

}
