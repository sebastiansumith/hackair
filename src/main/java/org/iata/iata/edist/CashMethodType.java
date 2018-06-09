
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * CASH Payment Method definition.
 * 
 * <p>Java class for CashMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TerminalID" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" minOccurs="0"/>
 *         &lt;element name="ReceiptID" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentUserID" minOccurs="0"/>
 *         &lt;element name="Address" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleAddress"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}StructuredAddress"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentAddress"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashMethodType", propOrder = {
    "amounts",
    "terminalID",
    "receiptID",
    "agentUserID",
    "address"
})
public class CashMethodType {

    @XmlElement(name = "Amounts")
    protected CashMethodType.Amounts amounts;
    @XmlElement(name = "TerminalID")
    protected String terminalID;
    @XmlElement(name = "ReceiptID")
    protected String receiptID;
    @XmlElement(name = "AgentUserID")
    protected AgentUserIDType agentUserID;
    @XmlElement(name = "Address")
    protected CashMethodType.Address address;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the amounts property.
     * 
     * @return
     *     possible object is
     *     {@link CashMethodType.Amounts }
     *     
     */
    public CashMethodType.Amounts getAmounts() {
        return amounts;
    }

    /**
     * Sets the value of the amounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashMethodType.Amounts }
     *     
     */
    public void setAmounts(CashMethodType.Amounts value) {
        this.amounts = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the receiptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptID() {
        return receiptID;
    }

    /**
     * Sets the value of the receiptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptID(String value) {
        this.receiptID = value;
    }

    /**
     * Agent ID that collected the cash. Example: TOM123
     * 
     * @return
     *     possible object is
     *     {@link AgentUserIDType }
     *     
     */
    public AgentUserIDType getAgentUserID() {
        return agentUserID;
    }

    /**
     * Sets the value of the agentUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentUserIDType }
     *     
     */
    public void setAgentUserID(AgentUserIDType value) {
        this.agentUserID = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link CashMethodType.Address }
     *     
     */
    public CashMethodType.Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashMethodType.Address }
     *     
     */
    public void setAddress(CashMethodType.Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SimpleAddress"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}StructuredAddress"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentAddress"/>
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
        "simpleAddress",
        "structuredAddress",
        "paymentAddress"
    })
    public static class Address {

        @XmlElement(name = "SimpleAddress")
        protected SimpleAddrType simpleAddress;
        @XmlElement(name = "StructuredAddress")
        protected StructuredAddrType structuredAddress;
        @XmlElement(name = "PaymentAddress")
        protected PaymentAddrType paymentAddress;

        /**
         * Gets the value of the simpleAddress property.
         * 
         * @return
         *     possible object is
         *     {@link SimpleAddrType }
         *     
         */
        public SimpleAddrType getSimpleAddress() {
            return simpleAddress;
        }

        /**
         * Sets the value of the simpleAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimpleAddrType }
         *     
         */
        public void setSimpleAddress(SimpleAddrType value) {
            this.simpleAddress = value;
        }

        /**
         * Gets the value of the structuredAddress property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredAddrType }
         *     
         */
        public StructuredAddrType getStructuredAddress() {
            return structuredAddress;
        }

        /**
         * Sets the value of the structuredAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredAddrType }
         *     
         */
        public void setStructuredAddress(StructuredAddrType value) {
            this.structuredAddress = value;
        }

        /**
         * Gets the value of the paymentAddress property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentAddrType }
         *     
         */
        public PaymentAddrType getPaymentAddress() {
            return paymentAddress;
        }

        /**
         * Sets the value of the paymentAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentAddrType }
         *     
         */
        public void setPaymentAddress(PaymentAddrType value) {
            this.paymentAddress = value;
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
     *         &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType" maxOccurs="unbounded"/>
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
        "amount"
    })
    public static class Amounts {

        @XmlElement(name = "Amount", required = true)
        protected List<CurrencyAmountOptType> amount;

        /**
         * Gets the value of the amount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CurrencyAmountOptType }
         * 
         * 
         */
        public List<CurrencyAmountOptType> getAmount() {
            if (amount == null) {
                amount = new ArrayList<CurrencyAmountOptType>();
            }
            return this.amount;
        }

    }

}
