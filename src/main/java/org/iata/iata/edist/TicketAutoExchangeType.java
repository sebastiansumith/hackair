
package org.iata.iata.edist;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * AUTO EXCHANGE TICKET object.
 * 
 * <p>Java class for TicketAutoExchangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketAutoExchangeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Penalty" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType"/>
 *                     &lt;element name="percentage" type="{http://www.iata.org/IATA/EDIST}WholePercentageSimpleType"/>
 *                   &lt;/choice>
 *                   &lt;element name="Commission" type="{http://www.iata.org/IATA/EDIST}CommissionType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OriginalAmount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrCode" minOccurs="0"/>
 *         &lt;element name="TicketNumbers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TicketNumber" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="PTC" type="{http://www.iata.org/IATA/EDIST}PaxSimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketAutoExchangeType", propOrder = {
    "penalty",
    "originalAmount",
    "currCode",
    "ticketNumbers"
})
public class TicketAutoExchangeType
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "Penalty")
    protected TicketAutoExchangeType.Penalty penalty;
    @XmlElement(name = "OriginalAmount")
    protected CurrencyAmountOptType originalAmount;
    @XmlElement(name = "CurrCode")
    protected CurrCode currCode;
    @XmlElement(name = "TicketNumbers")
    protected TicketAutoExchangeType.TicketNumbers ticketNumbers;

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link TicketAutoExchangeType.Penalty }
     *     
     */
    public TicketAutoExchangeType.Penalty getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketAutoExchangeType.Penalty }
     *     
     */
    public void setPenalty(TicketAutoExchangeType.Penalty value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the originalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public CurrencyAmountOptType getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Sets the value of the originalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public void setOriginalAmount(CurrencyAmountOptType value) {
        this.originalAmount = value;
    }

    /**
     * Gets the value of the currCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrCode }
     *     
     */
    public CurrCode getCurrCode() {
        return currCode;
    }

    /**
     * Sets the value of the currCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrCode }
     *     
     */
    public void setCurrCode(CurrCode value) {
        this.currCode = value;
    }

    /**
     * Gets the value of the ticketNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link TicketAutoExchangeType.TicketNumbers }
     *     
     */
    public TicketAutoExchangeType.TicketNumbers getTicketNumbers() {
        return ticketNumbers;
    }

    /**
     * Sets the value of the ticketNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketAutoExchangeType.TicketNumbers }
     *     
     */
    public void setTicketNumbers(TicketAutoExchangeType.TicketNumbers value) {
        this.ticketNumbers = value;
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
     *         &lt;choice>
     *           &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType"/>
     *           &lt;element name="percentage" type="{http://www.iata.org/IATA/EDIST}WholePercentageSimpleType"/>
     *         &lt;/choice>
     *         &lt;element name="Commission" type="{http://www.iata.org/IATA/EDIST}CommissionType" minOccurs="0"/>
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
        "amount",
        "percentage",
        "commission"
    })
    public static class Penalty {

        @XmlElement(name = "Amount")
        protected CurrencyAmountOptType amount;
        protected BigDecimal percentage;
        @XmlElement(name = "Commission")
        protected CommissionType commission;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public CurrencyAmountOptType getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public void setAmount(CurrencyAmountOptType value) {
            this.amount = value;
        }

        /**
         * Gets the value of the percentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercentage() {
            return percentage;
        }

        /**
         * Sets the value of the percentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercentage(BigDecimal value) {
            this.percentage = value;
        }

        /**
         * Gets the value of the commission property.
         * 
         * @return
         *     possible object is
         *     {@link CommissionType }
         *     
         */
        public CommissionType getCommission() {
            return commission;
        }

        /**
         * Sets the value of the commission property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommissionType }
         *     
         */
        public void setCommission(CommissionType value) {
            this.commission = value;
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
     *       &lt;sequence>
     *         &lt;element name="TicketNumber" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *                 &lt;attribute name="PTC" type="{http://www.iata.org/IATA/EDIST}PaxSimpleType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
    @XmlType(name = "", propOrder = {
        "ticketNumber"
    })
    public static class TicketNumbers {

        @XmlElement(name = "TicketNumber", required = true)
        protected List<TicketAutoExchangeType.TicketNumbers.TicketNumber> ticketNumber;

        /**
         * Gets the value of the ticketNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketAutoExchangeType.TicketNumbers.TicketNumber }
         * 
         * 
         */
        public List<TicketAutoExchangeType.TicketNumbers.TicketNumber> getTicketNumber() {
            if (ticketNumber == null) {
                ticketNumber = new ArrayList<TicketAutoExchangeType.TicketNumbers.TicketNumber>();
            }
            return this.ticketNumber;
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
         *       &lt;attribute name="PTC" type="{http://www.iata.org/IATA/EDIST}PaxSimpleType" />
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
        public static class TicketNumber {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "PTC")
            protected String ptc;

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

            /**
             * Gets the value of the ptc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPTC() {
                return ptc;
            }

            /**
             * Sets the value of the ptc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPTC(String value) {
                this.ptc = value;
            }

        }

    }

}
