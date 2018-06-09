
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * PAYMENT METHOD definition.
 * 
 * <p>Java class for PaymentMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Method" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *                 &lt;sequence>
 *                   &lt;element name="Qualifier" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}VoucherMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}RedemptionMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OtherMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}MiscChargeMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DirectBillMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CashMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BankAccountMethod" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Cheque" minOccurs="0"/>
 *                   &lt;element name="Promotions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Promotion" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}PromotionType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Associations"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "PaymentMethodType", propOrder = {
    "method"
})
@XmlSeeAlso({
    org.iata.iata.edist.ItinReshopRS.Response.Payments.Payment.class
})
public class PaymentMethodType {

    @XmlElement(name = "Method", required = true)
    protected List<PaymentMethodType.Method> method;

    /**
     * Gets the value of the method property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the method property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodType.Method }
     * 
     * 
     */
    public List<PaymentMethodType.Method> getMethod() {
        if (method == null) {
            method = new ArrayList<PaymentMethodType.Method>();
        }
        return this.method;
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
     *         &lt;element name="Qualifier" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}VoucherMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}RedemptionMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OtherMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MiscChargeMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DirectBillMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CashMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BankAccountMethod" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Cheque" minOccurs="0"/>
     *         &lt;element name="Promotions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Promotion" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}PromotionType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Associations"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
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
    @XmlType(name = "", propOrder = {
        "qualifier",
        "voucherMethod",
        "redemptionMethod",
        "paymentCardMethod",
        "otherMethod",
        "miscChargeMethod",
        "directBillMethod",
        "cashMethod",
        "bankAccountMethod",
        "cheque",
        "promotions"
    })
    public static class Method
        extends KeyWithMetaObjectBaseType
    {

        @XmlElement(name = "Qualifier")
        protected CodesetType qualifier;
        @XmlElement(name = "VoucherMethod")
        protected VoucherMethodType voucherMethod;
        @XmlElement(name = "RedemptionMethod")
        protected RedemptionMethodType redemptionMethod;
        @XmlElement(name = "PaymentCardMethod")
        protected PaymentCardMethodType paymentCardMethod;
        @XmlElement(name = "OtherMethod")
        protected OtherMethodType otherMethod;
        @XmlElement(name = "MiscChargeMethod")
        protected MiscChargeMethodType miscChargeMethod;
        @XmlElement(name = "DirectBillMethod")
        protected DirectBillMethodType directBillMethod;
        @XmlElement(name = "CashMethod")
        protected CashMethodType cashMethod;
        @XmlElement(name = "BankAccountMethod")
        protected BankAccountMethodType bankAccountMethod;
        @XmlElement(name = "Cheque")
        protected Cheque cheque;
        @XmlElement(name = "Promotions")
        protected PaymentMethodType.Method.Promotions promotions;

        /**
         * Gets the value of the qualifier property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetType }
         *     
         */
        public CodesetType getQualifier() {
            return qualifier;
        }

        /**
         * Sets the value of the qualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetType }
         *     
         */
        public void setQualifier(CodesetType value) {
            this.qualifier = value;
        }

        /**
         * Gets the value of the voucherMethod property.
         * 
         * @return
         *     possible object is
         *     {@link VoucherMethodType }
         *     
         */
        public VoucherMethodType getVoucherMethod() {
            return voucherMethod;
        }

        /**
         * Sets the value of the voucherMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link VoucherMethodType }
         *     
         */
        public void setVoucherMethod(VoucherMethodType value) {
            this.voucherMethod = value;
        }

        /**
         * Gets the value of the redemptionMethod property.
         * 
         * @return
         *     possible object is
         *     {@link RedemptionMethodType }
         *     
         */
        public RedemptionMethodType getRedemptionMethod() {
            return redemptionMethod;
        }

        /**
         * Sets the value of the redemptionMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link RedemptionMethodType }
         *     
         */
        public void setRedemptionMethod(RedemptionMethodType value) {
            this.redemptionMethod = value;
        }

        /**
         * Gets the value of the paymentCardMethod property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentCardMethodType }
         *     
         */
        public PaymentCardMethodType getPaymentCardMethod() {
            return paymentCardMethod;
        }

        /**
         * Sets the value of the paymentCardMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentCardMethodType }
         *     
         */
        public void setPaymentCardMethod(PaymentCardMethodType value) {
            this.paymentCardMethod = value;
        }

        /**
         * Gets the value of the otherMethod property.
         * 
         * @return
         *     possible object is
         *     {@link OtherMethodType }
         *     
         */
        public OtherMethodType getOtherMethod() {
            return otherMethod;
        }

        /**
         * Sets the value of the otherMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherMethodType }
         *     
         */
        public void setOtherMethod(OtherMethodType value) {
            this.otherMethod = value;
        }

        /**
         * Gets the value of the miscChargeMethod property.
         * 
         * @return
         *     possible object is
         *     {@link MiscChargeMethodType }
         *     
         */
        public MiscChargeMethodType getMiscChargeMethod() {
            return miscChargeMethod;
        }

        /**
         * Sets the value of the miscChargeMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link MiscChargeMethodType }
         *     
         */
        public void setMiscChargeMethod(MiscChargeMethodType value) {
            this.miscChargeMethod = value;
        }

        /**
         * Gets the value of the directBillMethod property.
         * 
         * @return
         *     possible object is
         *     {@link DirectBillMethodType }
         *     
         */
        public DirectBillMethodType getDirectBillMethod() {
            return directBillMethod;
        }

        /**
         * Sets the value of the directBillMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DirectBillMethodType }
         *     
         */
        public void setDirectBillMethod(DirectBillMethodType value) {
            this.directBillMethod = value;
        }

        /**
         * Gets the value of the cashMethod property.
         * 
         * @return
         *     possible object is
         *     {@link CashMethodType }
         *     
         */
        public CashMethodType getCashMethod() {
            return cashMethod;
        }

        /**
         * Sets the value of the cashMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link CashMethodType }
         *     
         */
        public void setCashMethod(CashMethodType value) {
            this.cashMethod = value;
        }

        /**
         * Gets the value of the bankAccountMethod property.
         * 
         * @return
         *     possible object is
         *     {@link BankAccountMethodType }
         *     
         */
        public BankAccountMethodType getBankAccountMethod() {
            return bankAccountMethod;
        }

        /**
         * Sets the value of the bankAccountMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link BankAccountMethodType }
         *     
         */
        public void setBankAccountMethod(BankAccountMethodType value) {
            this.bankAccountMethod = value;
        }

        /**
         * Gets the value of the cheque property.
         * 
         * @return
         *     possible object is
         *     {@link Cheque }
         *     
         */
        public Cheque getCheque() {
            return cheque;
        }

        /**
         * Sets the value of the cheque property.
         * 
         * @param value
         *     allowed object is
         *     {@link Cheque }
         *     
         */
        public void setCheque(Cheque value) {
            this.cheque = value;
        }

        /**
         * Gets the value of the promotions property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentMethodType.Method.Promotions }
         *     
         */
        public PaymentMethodType.Method.Promotions getPromotions() {
            return promotions;
        }

        /**
         * Sets the value of the promotions property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentMethodType.Method.Promotions }
         *     
         */
        public void setPromotions(PaymentMethodType.Method.Promotions value) {
            this.promotions = value;
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
         *         &lt;element name="Promotion" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}PromotionType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Associations"/>
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
            "promotion"
        })
        public static class Promotions {

            @XmlElement(name = "Promotion", required = true)
            protected List<PaymentMethodType.Method.Promotions.Promotion> promotion;

            /**
             * Gets the value of the promotion property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the promotion property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPromotion().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PaymentMethodType.Method.Promotions.Promotion }
             * 
             * 
             */
            public List<PaymentMethodType.Method.Promotions.Promotion> getPromotion() {
                if (promotion == null) {
                    promotion = new ArrayList<PaymentMethodType.Method.Promotions.Promotion>();
                }
                return this.promotion;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PromotionType">
             *       &lt;sequence>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Associations"/>
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
                "associations"
            })
            public static class Promotion
                extends PromotionType
            {

                @XmlElement(name = "Associations", required = true)
                protected OrderItemAssociationType associations;

                /**
                 * Association(s), including Passenger and Group.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderItemAssociationType }
                 *     
                 */
                public OrderItemAssociationType getAssociations() {
                    return associations;
                }

                /**
                 * Sets the value of the associations property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderItemAssociationType }
                 *     
                 */
                public void setAssociations(OrderItemAssociationType value) {
                    this.associations = value;
                }

            }

        }

    }

}
