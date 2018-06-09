
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="PaymentForm" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BankAccount" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Cash" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DirectBill" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}LoyaltyRedemption" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}MiscChargeOrder" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Other" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCard" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Voucher" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "", propOrder = {
    "paymentForm"
})
@XmlRootElement(name = "PaymentForms")
public class PaymentForms {

    @XmlElement(name = "PaymentForm", required = true)
    protected List<PaymentForms.PaymentForm> paymentForm;

    /**
     * Gets the value of the paymentForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentForms.PaymentForm }
     * 
     * 
     */
    public List<PaymentForms.PaymentForm> getPaymentForm() {
        if (paymentForm == null) {
            paymentForm = new ArrayList<PaymentForms.PaymentForm>();
        }
        return this.paymentForm;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BankAccount" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Cash" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DirectBill" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}LoyaltyRedemption" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MiscChargeOrder" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Other" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCard" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Voucher" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bankAccount",
        "cash",
        "directBill",
        "loyaltyRedemption",
        "miscChargeOrder",
        "other",
        "paymentCard",
        "voucher"
    })
    public static class PaymentForm
        extends KeyWithMetaObjectBaseType
    {

        @XmlElement(name = "BankAccount")
        protected BankAccountType bankAccount;
        @XmlElement(name = "Cash")
        protected Cash cash;
        @XmlElement(name = "DirectBill")
        protected DirectBillType directBill;
        @XmlElement(name = "LoyaltyRedemption")
        protected LoyaltyRedemption loyaltyRedemption;
        @XmlElement(name = "MiscChargeOrder")
        protected MiscChargeOrder miscChargeOrder;
        @XmlElement(name = "Other")
        protected Other other;
        @XmlElement(name = "PaymentCard")
        protected PaymentCardType paymentCard;
        @XmlElement(name = "Voucher")
        protected Voucher voucher;

        /**
         * Gets the value of the bankAccount property.
         * 
         * @return
         *     possible object is
         *     {@link BankAccountType }
         *     
         */
        public BankAccountType getBankAccount() {
            return bankAccount;
        }

        /**
         * Sets the value of the bankAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BankAccountType }
         *     
         */
        public void setBankAccount(BankAccountType value) {
            this.bankAccount = value;
        }

        /**
         * Gets the value of the cash property.
         * 
         * @return
         *     possible object is
         *     {@link Cash }
         *     
         */
        public Cash getCash() {
            return cash;
        }

        /**
         * Sets the value of the cash property.
         * 
         * @param value
         *     allowed object is
         *     {@link Cash }
         *     
         */
        public void setCash(Cash value) {
            this.cash = value;
        }

        /**
         * Gets the value of the directBill property.
         * 
         * @return
         *     possible object is
         *     {@link DirectBillType }
         *     
         */
        public DirectBillType getDirectBill() {
            return directBill;
        }

        /**
         * Sets the value of the directBill property.
         * 
         * @param value
         *     allowed object is
         *     {@link DirectBillType }
         *     
         */
        public void setDirectBill(DirectBillType value) {
            this.directBill = value;
        }

        /**
         * Gets the value of the loyaltyRedemption property.
         * 
         * @return
         *     possible object is
         *     {@link LoyaltyRedemption }
         *     
         */
        public LoyaltyRedemption getLoyaltyRedemption() {
            return loyaltyRedemption;
        }

        /**
         * Sets the value of the loyaltyRedemption property.
         * 
         * @param value
         *     allowed object is
         *     {@link LoyaltyRedemption }
         *     
         */
        public void setLoyaltyRedemption(LoyaltyRedemption value) {
            this.loyaltyRedemption = value;
        }

        /**
         * Gets the value of the miscChargeOrder property.
         * 
         * @return
         *     possible object is
         *     {@link MiscChargeOrder }
         *     
         */
        public MiscChargeOrder getMiscChargeOrder() {
            return miscChargeOrder;
        }

        /**
         * Sets the value of the miscChargeOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link MiscChargeOrder }
         *     
         */
        public void setMiscChargeOrder(MiscChargeOrder value) {
            this.miscChargeOrder = value;
        }

        /**
         * Gets the value of the other property.
         * 
         * @return
         *     possible object is
         *     {@link Other }
         *     
         */
        public Other getOther() {
            return other;
        }

        /**
         * Sets the value of the other property.
         * 
         * @param value
         *     allowed object is
         *     {@link Other }
         *     
         */
        public void setOther(Other value) {
            this.other = value;
        }

        /**
         * Gets the value of the paymentCard property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentCardType }
         *     
         */
        public PaymentCardType getPaymentCard() {
            return paymentCard;
        }

        /**
         * Sets the value of the paymentCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentCardType }
         *     
         */
        public void setPaymentCard(PaymentCardType value) {
            this.paymentCard = value;
        }

        /**
         * Gets the value of the voucher property.
         * 
         * @return
         *     possible object is
         *     {@link Voucher }
         *     
         */
        public Voucher getVoucher() {
            return voucher;
        }

        /**
         * Sets the value of the voucher property.
         * 
         * @param value
         *     allowed object is
         *     {@link Voucher }
         *     
         */
        public void setVoucher(Voucher value) {
            this.voucher = value;
        }

    }

}
