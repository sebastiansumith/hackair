
package org.iata.iata.edist;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Notice definition.
 * 
 * <p>Java class for ItinReshopNoticesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItinReshopNoticesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}NoticeBaseType">
 *       &lt;sequence>
 *         &lt;element name="AppliedTaxExemption" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TaxExemption" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RuleID" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>ProperNameSimpleType">
 *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Associations" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="OfferSetReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="Passengers" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
 *                                               &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ExemptionAppliedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AppliedPriceVariance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PriceVariance" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RuleID" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>ProperNameSimpleType">
 *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Amount">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmountValue"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PercentageValue"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Associations" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="OfferSetReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="Passengers" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
 *                                               &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="VarianceAppliedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ItinReshopNoticesType", propOrder = {
    "appliedTaxExemption",
    "appliedPriceVariance"
})
public class ItinReshopNoticesType
    extends NoticeBaseType
{

    @XmlElement(name = "AppliedTaxExemption")
    protected ItinReshopNoticesType.AppliedTaxExemption appliedTaxExemption;
    @XmlElement(name = "AppliedPriceVariance")
    protected ItinReshopNoticesType.AppliedPriceVariance appliedPriceVariance;

    /**
     * Gets the value of the appliedTaxExemption property.
     * 
     * @return
     *     possible object is
     *     {@link ItinReshopNoticesType.AppliedTaxExemption }
     *     
     */
    public ItinReshopNoticesType.AppliedTaxExemption getAppliedTaxExemption() {
        return appliedTaxExemption;
    }

    /**
     * Sets the value of the appliedTaxExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinReshopNoticesType.AppliedTaxExemption }
     *     
     */
    public void setAppliedTaxExemption(ItinReshopNoticesType.AppliedTaxExemption value) {
        this.appliedTaxExemption = value;
    }

    /**
     * Gets the value of the appliedPriceVariance property.
     * 
     * @return
     *     possible object is
     *     {@link ItinReshopNoticesType.AppliedPriceVariance }
     *     
     */
    public ItinReshopNoticesType.AppliedPriceVariance getAppliedPriceVariance() {
        return appliedPriceVariance;
    }

    /**
     * Sets the value of the appliedPriceVariance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinReshopNoticesType.AppliedPriceVariance }
     *     
     */
    public void setAppliedPriceVariance(ItinReshopNoticesType.AppliedPriceVariance value) {
        this.appliedPriceVariance = value;
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
     *         &lt;element name="PriceVariance" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RuleID" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>ProperNameSimpleType">
     *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Amount">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmountValue"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PercentageValue"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Associations" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="OfferSetReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="Passengers" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
     *                                     &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="VarianceAppliedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "priceVariance"
    })
    public static class AppliedPriceVariance {

        @XmlElement(name = "PriceVariance")
        protected List<ItinReshopNoticesType.AppliedPriceVariance.PriceVariance> priceVariance;
        @XmlAttribute(name = "VarianceAppliedInd")
        protected Boolean varianceAppliedInd;

        /**
         * Gets the value of the priceVariance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceVariance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceVariance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance }
         * 
         * 
         */
        public List<ItinReshopNoticesType.AppliedPriceVariance.PriceVariance> getPriceVariance() {
            if (priceVariance == null) {
                priceVariance = new ArrayList<ItinReshopNoticesType.AppliedPriceVariance.PriceVariance>();
            }
            return this.priceVariance;
        }

        /**
         * Gets the value of the varianceAppliedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVarianceAppliedInd() {
            return varianceAppliedInd;
        }

        /**
         * Sets the value of the varianceAppliedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVarianceAppliedInd(Boolean value) {
            this.varianceAppliedInd = value;
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
         *         &lt;element name="RuleID" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>ProperNameSimpleType">
         *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Amount">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmountValue"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PercentageValue"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Associations" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="OfferSetReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="Passengers" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
         *                           &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ruleID",
            "amount",
            "associations"
        })
        public static class PriceVariance {

            @XmlElement(name = "RuleID")
            protected ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.RuleID ruleID;
            @XmlElement(name = "Amount", required = true)
            protected ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Amount amount;
            @XmlElement(name = "Associations")
            protected ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations associations;
            @XmlAttribute(name = "trxItemKey")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String trxItemKey;

            /**
             * Gets the value of the ruleID property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.RuleID }
             *     
             */
            public ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.RuleID getRuleID() {
                return ruleID;
            }

            /**
             * Sets the value of the ruleID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.RuleID }
             *     
             */
            public void setRuleID(ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.RuleID value) {
                this.ruleID = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Amount }
             *     
             */
            public ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Amount getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Amount }
             *     
             */
            public void setAmount(ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Amount value) {
                this.amount = value;
            }

            /**
             * Gets the value of the associations property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations }
             *     
             */
            public ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations }
             *     
             */
            public void setAssociations(ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations value) {
                this.associations = value;
            }

            /**
             * Gets the value of the trxItemKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrxItemKey() {
                return trxItemKey;
            }

            /**
             * Sets the value of the trxItemKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrxItemKey(String value) {
                this.trxItemKey = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyAmountValue"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PercentageValue"/>
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
                "currencyAmountValue",
                "percentageValue"
            })
            public static class Amount {

                @XmlElement(name = "CurrencyAmountValue", required = true)
                protected CurrencyAmountOptType currencyAmountValue;
                @XmlElement(name = "PercentageValue", required = true)
                protected BigDecimal percentageValue;

                /**
                 * Gets the value of the currencyAmountValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CurrencyAmountOptType }
                 *     
                 */
                public CurrencyAmountOptType getCurrencyAmountValue() {
                    return currencyAmountValue;
                }

                /**
                 * Sets the value of the currencyAmountValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CurrencyAmountOptType }
                 *     
                 */
                public void setCurrencyAmountValue(CurrencyAmountOptType value) {
                    this.currencyAmountValue = value;
                }

                /**
                 * Gets the value of the percentageValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPercentageValue() {
                    return percentageValue;
                }

                /**
                 * Sets the value of the percentageValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPercentageValue(BigDecimal value) {
                    this.percentageValue = value;
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
             *         &lt;element name="OfferSetReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="Passengers" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
             *                 &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
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
            @XmlType(name = "", propOrder = {
                "offerSetReferences",
                "offerItemID",
                "passengers",
                "otherAssociation"
            })
            public static class Associations {

                @XmlList
                @XmlElement(name = "OfferSetReferences")
                @XmlIDREF
                @XmlSchemaType(name = "IDREFS")
                protected List<Object> offerSetReferences;
                @XmlElement(name = "OfferItemID")
                protected List<ItemIDType> offerItemID;
                @XmlElement(name = "Passengers")
                protected ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.Passengers passengers;
                @XmlElement(name = "OtherAssociation")
                protected List<ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.OtherAssociation> otherAssociation;

                /**
                 * Gets the value of the offerSetReferences property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the offerSetReferences property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOfferSetReferences().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getOfferSetReferences() {
                    if (offerSetReferences == null) {
                        offerSetReferences = new ArrayList<Object>();
                    }
                    return this.offerSetReferences;
                }

                /**
                 * Associated Offer Item ID(s).
                 * Example: OFFER1226 Gets the value of the offerItemID property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the offerItemID property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOfferItemID().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ItemIDType }
                 * 
                 * 
                 */
                public List<ItemIDType> getOfferItemID() {
                    if (offerItemID == null) {
                        offerItemID = new ArrayList<ItemIDType>();
                    }
                    return this.offerItemID;
                }

                /**
                 * Gets the value of the passengers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.Passengers }
                 *     
                 */
                public ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.Passengers getPassengers() {
                    return passengers;
                }

                /**
                 * Sets the value of the passengers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.Passengers }
                 *     
                 */
                public void setPassengers(ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.Passengers value) {
                    this.passengers = value;
                }

                /**
                 * Gets the value of the otherAssociation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the otherAssociation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOtherAssociation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.OtherAssociation }
                 * 
                 * 
                 */
                public List<ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.OtherAssociation> getOtherAssociation() {
                    if (otherAssociation == null) {
                        otherAssociation = new ArrayList<ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.OtherAssociation>();
                    }
                    return this.otherAssociation;
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
                 *       &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
                 *       &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class OtherAssociation {

                    @XmlAttribute(name = "Type", required = true)
                    protected String type;
                    @XmlAttribute(name = "ReferenceValue", required = true)
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object referenceValue;

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Gets the value of the referenceValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getReferenceValue() {
                        return referenceValue;
                    }

                    /**
                     * Sets the value of the referenceValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setReferenceValue(Object value) {
                        this.referenceValue = value;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
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
                    "passengerReferences",
                    "groupReference"
                })
                public static class Passengers {

                    @XmlList
                    @XmlElement(name = "PassengerReferences", required = true)
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREFS")
                    protected List<Object> passengerReferences;
                    @XmlElement(name = "GroupReference", required = true)
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object groupReference;

                    /**
                     * Association to multiple Passenger instance(s). Example: pax1 pax2 Gets the value of the passengerReferences property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the passengerReferences property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPassengerReferences().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getPassengerReferences() {
                        if (passengerReferences == null) {
                            passengerReferences = new ArrayList<Object>();
                        }
                        return this.passengerReferences;
                    }

                    /**
                     * Gets the value of the groupReference property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getGroupReference() {
                        return groupReference;
                    }

                    /**
                     * Sets the value of the groupReference property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setGroupReference(Object value) {
                        this.groupReference = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>ProperNameSimpleType">
             *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            public static class RuleID {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Context")
                protected String context;
                @XmlAttribute(name = "Name")
                @XmlSchemaType(name = "anySimpleType")
                protected String name;

                /**
                 * A data type for Proper Name size constraint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the context property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContext() {
                    return context;
                }

                /**
                 * Sets the value of the context property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContext(String value) {
                    this.context = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }

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
     *         &lt;element name="TaxExemption" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RuleID" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>ProperNameSimpleType">
     *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Associations" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="OfferSetReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="Passengers" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
     *                                     &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ExemptionAppliedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxExemption"
    })
    public static class AppliedTaxExemption {

        @XmlElement(name = "TaxExemption")
        protected List<ItinReshopNoticesType.AppliedTaxExemption.TaxExemption> taxExemption;
        @XmlAttribute(name = "ExemptionAppliedInd")
        protected Boolean exemptionAppliedInd;

        /**
         * Gets the value of the taxExemption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxExemption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxExemption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItinReshopNoticesType.AppliedTaxExemption.TaxExemption }
         * 
         * 
         */
        public List<ItinReshopNoticesType.AppliedTaxExemption.TaxExemption> getTaxExemption() {
            if (taxExemption == null) {
                taxExemption = new ArrayList<ItinReshopNoticesType.AppliedTaxExemption.TaxExemption>();
            }
            return this.taxExemption;
        }

        /**
         * Gets the value of the exemptionAppliedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExemptionAppliedInd() {
            return exemptionAppliedInd;
        }

        /**
         * Sets the value of the exemptionAppliedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExemptionAppliedInd(Boolean value) {
            this.exemptionAppliedInd = value;
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
         *         &lt;element name="RuleID" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>ProperNameSimpleType">
         *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Associations" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="OfferSetReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="Passengers" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
         *                           &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="trxItemKey" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ruleID",
            "associations"
        })
        public static class TaxExemption {

            @XmlElement(name = "RuleID")
            protected ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.RuleID ruleID;
            @XmlElement(name = "Associations")
            protected ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations associations;
            @XmlAttribute(name = "trxItemKey")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String trxItemKey;

            /**
             * Gets the value of the ruleID property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.RuleID }
             *     
             */
            public ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.RuleID getRuleID() {
                return ruleID;
            }

            /**
             * Sets the value of the ruleID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.RuleID }
             *     
             */
            public void setRuleID(ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.RuleID value) {
                this.ruleID = value;
            }

            /**
             * Gets the value of the associations property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations }
             *     
             */
            public ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations }
             *     
             */
            public void setAssociations(ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations value) {
                this.associations = value;
            }

            /**
             * Gets the value of the trxItemKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrxItemKey() {
                return trxItemKey;
            }

            /**
             * Sets the value of the trxItemKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrxItemKey(String value) {
                this.trxItemKey = value;
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
             *         &lt;element name="OfferSetReferences" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="Passengers" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
             *                 &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
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
            @XmlType(name = "", propOrder = {
                "offerSetReferences",
                "offerItemID",
                "passengers",
                "otherAssociation"
            })
            public static class Associations {

                @XmlList
                @XmlElement(name = "OfferSetReferences")
                @XmlIDREF
                @XmlSchemaType(name = "IDREFS")
                protected List<Object> offerSetReferences;
                @XmlElement(name = "OfferItemID")
                protected List<ItemIDType> offerItemID;
                @XmlElement(name = "Passengers")
                protected ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.Passengers passengers;
                @XmlElement(name = "OtherAssociation")
                protected List<ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.OtherAssociation> otherAssociation;

                /**
                 * Gets the value of the offerSetReferences property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the offerSetReferences property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOfferSetReferences().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getOfferSetReferences() {
                    if (offerSetReferences == null) {
                        offerSetReferences = new ArrayList<Object>();
                    }
                    return this.offerSetReferences;
                }

                /**
                 * Associated Offer Item ID(s).
                 * Example: OFFER1226 Gets the value of the offerItemID property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the offerItemID property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOfferItemID().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ItemIDType }
                 * 
                 * 
                 */
                public List<ItemIDType> getOfferItemID() {
                    if (offerItemID == null) {
                        offerItemID = new ArrayList<ItemIDType>();
                    }
                    return this.offerItemID;
                }

                /**
                 * Gets the value of the passengers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.Passengers }
                 *     
                 */
                public ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.Passengers getPassengers() {
                    return passengers;
                }

                /**
                 * Sets the value of the passengers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.Passengers }
                 *     
                 */
                public void setPassengers(ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.Passengers value) {
                    this.passengers = value;
                }

                /**
                 * Gets the value of the otherAssociation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the otherAssociation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOtherAssociation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.OtherAssociation }
                 * 
                 * 
                 */
                public List<ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.OtherAssociation> getOtherAssociation() {
                    if (otherAssociation == null) {
                        otherAssociation = new ArrayList<ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.OtherAssociation>();
                    }
                    return this.otherAssociation;
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
                 *       &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
                 *       &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class OtherAssociation {

                    @XmlAttribute(name = "Type", required = true)
                    protected String type;
                    @XmlAttribute(name = "ReferenceValue", required = true)
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object referenceValue;

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Gets the value of the referenceValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getReferenceValue() {
                        return referenceValue;
                    }

                    /**
                     * Sets the value of the referenceValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setReferenceValue(Object value) {
                        this.referenceValue = value;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
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
                    "passengerReferences",
                    "groupReference"
                })
                public static class Passengers {

                    @XmlList
                    @XmlElement(name = "PassengerReferences", required = true)
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREFS")
                    protected List<Object> passengerReferences;
                    @XmlElement(name = "GroupReference", required = true)
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object groupReference;

                    /**
                     * Association to multiple Passenger instance(s). Example: pax1 pax2 Gets the value of the passengerReferences property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the passengerReferences property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPassengerReferences().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Object }
                     * 
                     * 
                     */
                    public List<Object> getPassengerReferences() {
                        if (passengerReferences == null) {
                            passengerReferences = new ArrayList<Object>();
                        }
                        return this.passengerReferences;
                    }

                    /**
                     * Gets the value of the groupReference property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getGroupReference() {
                        return groupReference;
                    }

                    /**
                     * Sets the value of the groupReference property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setGroupReference(Object value) {
                        this.groupReference = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>ProperNameSimpleType">
             *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            public static class RuleID {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Context")
                protected String context;
                @XmlAttribute(name = "Name")
                @XmlSchemaType(name = "anySimpleType")
                protected String name;

                /**
                 * A data type for Proper Name size constraint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the context property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContext() {
                    return context;
                }

                /**
                 * Sets the value of the context property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContext(String value) {
                    this.context = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }

        }

    }

}
