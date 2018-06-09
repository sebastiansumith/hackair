
package org.iata.iata.edist;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Document"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="Success" type="{http://www.iata.org/IATA/EDIST}SuccessType"/>
 *             &lt;element name="Warnings" type="{http://www.iata.org/IATA/EDIST}WarningsType" minOccurs="0"/>
 *             &lt;element name="Response">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element ref="{http://www.iata.org/IATA/EDIST}InvGuaranteeProcessing" minOccurs="0"/>
 *                       &lt;element name="Guarantees" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="Guarantee" maxOccurs="unbounded">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/>
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}InvGuaranteeTimeLimits"/>
 *                                           &lt;element name="Associations" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;sequence>
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" minOccurs="0"/>
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" minOccurs="0"/>
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/>
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" minOccurs="0"/>
 *                                                     &lt;element name="OtherAssociation" minOccurs="0">
 *                                                       &lt;complexType>
 *                                                         &lt;complexContent>
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                             &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
 *                                                             &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                                                           &lt;/restriction>
 *                                                         &lt;/complexContent>
 *                                                       &lt;/complexType>
 *                                                     &lt;/element>
 *                                                   &lt;/sequence>
 *                                                 &lt;/restriction>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                           &lt;element name="Price" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;extension base="{http://www.iata.org/IATA/EDIST}PriceCoreType">
 *                                                   &lt;sequence>
 *                                                     &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType" minOccurs="0"/>
 *                                                   &lt;/sequence>
 *                                                 &lt;/extension>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseIDs"/>
 *                                         &lt;/sequence>
 *                                         &lt;attribute name="WaitlistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                     &lt;attribute name="NoGuaranteeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}Errors"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}IATA_PayloadStdAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "document",
    "success",
    "warnings",
    "response",
    "errors"
})
@XmlRootElement(name = "InvGuaranteeRS")
public class InvGuaranteeRS {

    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "Response")
    protected InvGuaranteeRS.Response response;
    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Target")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String target;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transactionStatusCode;
    @XmlAttribute(name = "RetransmissionIndicator")
    protected Boolean retransmissionIndicator;
    @XmlAttribute(name = "CorrelationID")
    protected String correlationID;
    @XmlAttribute(name = "AsynchronousAllowedInd")
    protected Boolean asynchronousAllowedInd;
    @XmlAttribute(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String altLangID;
    @XmlAttribute(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String primaryLangID;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link MsgDocumentType }
     *     
     */
    public MsgDocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgDocumentType }
     *     
     */
    public void setDocument(MsgDocumentType value) {
        this.document = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessType }
     *     
     */
    public SuccessType getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessType }
     *     
     */
    public void setSuccess(SuccessType value) {
        this.success = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link WarningsType }
     *     
     */
    public WarningsType getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningsType }
     *     
     */
    public void setWarnings(WarningsType value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link InvGuaranteeRS.Response }
     *     
     */
    public InvGuaranteeRS.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvGuaranteeRS.Response }
     *     
     */
    public void setResponse(InvGuaranteeRS.Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the echoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Sets the value of the echoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        if (target == null) {
            return "Production";
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the sequenceNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Sets the value of the sequenceNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNmbr(BigInteger value) {
        this.sequenceNmbr = value;
    }

    /**
     * Gets the value of the transactionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    /**
     * Gets the value of the retransmissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetransmissionIndicator() {
        return retransmissionIndicator;
    }

    /**
     * Sets the value of the retransmissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetransmissionIndicator(Boolean value) {
        this.retransmissionIndicator = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the asynchronousAllowedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsynchronousAllowedInd() {
        return asynchronousAllowedInd;
    }

    /**
     * Sets the value of the asynchronousAllowedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsynchronousAllowedInd(Boolean value) {
        this.asynchronousAllowedInd = value;
    }

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}InvGuaranteeProcessing" minOccurs="0"/>
     *         &lt;element name="Guarantees" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Guarantee" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}InvGuaranteeTimeLimits"/>
     *                             &lt;element name="Associations" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" minOccurs="0"/>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" minOccurs="0"/>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" minOccurs="0"/>
     *                                       &lt;element name="OtherAssociation" minOccurs="0">
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
     *                             &lt;element name="Price" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}PriceCoreType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseIDs"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="WaitlistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
     *       &lt;attribute name="NoGuaranteeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "invGuaranteeProcessing",
        "guarantees"
    })
    public static class Response {

        @XmlElement(name = "InvGuaranteeProcessing")
        protected InvGuarResProcessType invGuaranteeProcessing;
        @XmlElement(name = "Guarantees")
        protected InvGuaranteeRS.Response.Guarantees guarantees;
        @XmlAttribute(name = "NoGuaranteeInd")
        protected Boolean noGuaranteeInd;

        /**
         * Transaction Processing Results, including processing status, business warnings, supplemental marketing messages and/ or additional information required to complete a transaction.
         * 
         * @return
         *     possible object is
         *     {@link InvGuarResProcessType }
         *     
         */
        public InvGuarResProcessType getInvGuaranteeProcessing() {
            return invGuaranteeProcessing;
        }

        /**
         * Sets the value of the invGuaranteeProcessing property.
         * 
         * @param value
         *     allowed object is
         *     {@link InvGuarResProcessType }
         *     
         */
        public void setInvGuaranteeProcessing(InvGuarResProcessType value) {
            this.invGuaranteeProcessing = value;
        }

        /**
         * Gets the value of the guarantees property.
         * 
         * @return
         *     possible object is
         *     {@link InvGuaranteeRS.Response.Guarantees }
         *     
         */
        public InvGuaranteeRS.Response.Guarantees getGuarantees() {
            return guarantees;
        }

        /**
         * Sets the value of the guarantees property.
         * 
         * @param value
         *     allowed object is
         *     {@link InvGuaranteeRS.Response.Guarantees }
         *     
         */
        public void setGuarantees(InvGuaranteeRS.Response.Guarantees value) {
            this.guarantees = value;
        }

        /**
         * Gets the value of the noGuaranteeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoGuaranteeInd() {
            return noGuaranteeInd;
        }

        /**
         * Sets the value of the noGuaranteeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoGuaranteeInd(Boolean value) {
            this.noGuaranteeInd = value;
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
         *         &lt;element name="Guarantee" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}InvGuaranteeTimeLimits"/>
         *                   &lt;element name="Associations" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" minOccurs="0"/>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" minOccurs="0"/>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" minOccurs="0"/>
         *                             &lt;element name="OtherAssociation" minOccurs="0">
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
         *                   &lt;element name="Price" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}PriceCoreType">
         *                           &lt;sequence>
         *                             &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseIDs"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="WaitlistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
            "guarantee"
        })
        public static class Guarantees {

            @XmlElement(name = "Guarantee", required = true)
            protected List<InvGuaranteeRS.Response.Guarantees.Guarantee> guarantee;

            /**
             * Gets the value of the guarantee property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the guarantee property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGuarantee().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link InvGuaranteeRS.Response.Guarantees.Guarantee }
             * 
             * 
             */
            public List<InvGuaranteeRS.Response.Guarantees.Guarantee> getGuarantee() {
                if (guarantee == null) {
                    guarantee = new ArrayList<InvGuaranteeRS.Response.Guarantees.Guarantee>();
                }
                return this.guarantee;
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
             *         &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}InvGuaranteeTimeLimits"/>
             *         &lt;element name="Associations" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" minOccurs="0"/>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" minOccurs="0"/>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" minOccurs="0"/>
             *                   &lt;element name="OtherAssociation" minOccurs="0">
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
             *         &lt;element name="Price" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.iata.org/IATA/EDIST}PriceCoreType">
             *                 &lt;sequence>
             *                   &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseIDs"/>
             *       &lt;/sequence>
             *       &lt;attribute name="WaitlistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "invGuaranteeID",
                "invGuaranteeTimeLimits",
                "associations",
                "price",
                "shoppingResponseIDs"
            })
            public static class Guarantee {

                @XmlElement(name = "InvGuaranteeID", required = true)
                protected String invGuaranteeID;
                @XmlElement(name = "InvGuaranteeTimeLimits", required = true)
                protected InvGuaranteeTimeLimits invGuaranteeTimeLimits;
                @XmlElement(name = "Associations")
                protected InvGuaranteeRS.Response.Guarantees.Guarantee.Associations associations;
                @XmlElement(name = "Price")
                protected InvGuaranteeRS.Response.Guarantees.Guarantee.Price price;
                @XmlElement(name = "ShoppingResponseIDs", required = true)
                protected ShoppingResponseIDType shoppingResponseIDs;
                @XmlAttribute(name = "WaitlistInd")
                protected Boolean waitlistInd;

                /**
                 * Gets the value of the invGuaranteeID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInvGuaranteeID() {
                    return invGuaranteeID;
                }

                /**
                 * Sets the value of the invGuaranteeID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInvGuaranteeID(String value) {
                    this.invGuaranteeID = value;
                }

                /**
                 * Gets the value of the invGuaranteeTimeLimits property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InvGuaranteeTimeLimits }
                 *     
                 */
                public InvGuaranteeTimeLimits getInvGuaranteeTimeLimits() {
                    return invGuaranteeTimeLimits;
                }

                /**
                 * Sets the value of the invGuaranteeTimeLimits property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InvGuaranteeTimeLimits }
                 *     
                 */
                public void setInvGuaranteeTimeLimits(InvGuaranteeTimeLimits value) {
                    this.invGuaranteeTimeLimits = value;
                }

                /**
                 * Gets the value of the associations property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InvGuaranteeRS.Response.Guarantees.Guarantee.Associations }
                 *     
                 */
                public InvGuaranteeRS.Response.Guarantees.Guarantee.Associations getAssociations() {
                    return associations;
                }

                /**
                 * Sets the value of the associations property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InvGuaranteeRS.Response.Guarantees.Guarantee.Associations }
                 *     
                 */
                public void setAssociations(InvGuaranteeRS.Response.Guarantees.Guarantee.Associations value) {
                    this.associations = value;
                }

                /**
                 * Gets the value of the price property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InvGuaranteeRS.Response.Guarantees.Guarantee.Price }
                 *     
                 */
                public InvGuaranteeRS.Response.Guarantees.Guarantee.Price getPrice() {
                    return price;
                }

                /**
                 * Sets the value of the price property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InvGuaranteeRS.Response.Guarantees.Guarantee.Price }
                 *     
                 */
                public void setPrice(InvGuaranteeRS.Response.Guarantees.Guarantee.Price value) {
                    this.price = value;
                }

                /**
                 * Gets the value of the shoppingResponseIDs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ShoppingResponseIDType }
                 *     
                 */
                public ShoppingResponseIDType getShoppingResponseIDs() {
                    return shoppingResponseIDs;
                }

                /**
                 * Sets the value of the shoppingResponseIDs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ShoppingResponseIDType }
                 *     
                 */
                public void setShoppingResponseIDs(ShoppingResponseIDType value) {
                    this.shoppingResponseIDs = value;
                }

                /**
                 * Gets the value of the waitlistInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isWaitlistInd() {
                    return waitlistInd;
                }

                /**
                 * Sets the value of the waitlistInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setWaitlistInd(Boolean value) {
                    this.waitlistInd = value;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" minOccurs="0"/>
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" minOccurs="0"/>
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/>
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" minOccurs="0"/>
                 *         &lt;element name="OtherAssociation" minOccurs="0">
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
                    "serviceID",
                    "offerItemID",
                    "orderID",
                    "orderItemID",
                    "otherAssociation"
                })
                public static class Associations {

                    @XmlElement(name = "ServiceID")
                    protected ServiceIDType serviceID;
                    @XmlElement(name = "OfferItemID")
                    protected ItemIDType offerItemID;
                    @XmlElement(name = "OrderID")
                    protected OrderIDType orderID;
                    @XmlElement(name = "OrderItemID")
                    protected ItemIDType orderItemID;
                    @XmlElement(name = "OtherAssociation")
                    protected InvGuaranteeRS.Response.Guarantees.Guarantee.Associations.OtherAssociation otherAssociation;

                    /**
                     * Associated Service ID(s). Example: SRVC0001
                     * 
                     * @return
                     *     possible object is
                     *     {@link ServiceIDType }
                     *     
                     */
                    public ServiceIDType getServiceID() {
                        return serviceID;
                    }

                    /**
                     * Sets the value of the serviceID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ServiceIDType }
                     *     
                     */
                    public void setServiceID(ServiceIDType value) {
                        this.serviceID = value;
                    }

                    /**
                     * Associated Offer Item ID(s).
                     * Example: OFFER1226
                     * 
                     * @return
                     *     possible object is
                     *     {@link ItemIDType }
                     *     
                     */
                    public ItemIDType getOfferItemID() {
                        return offerItemID;
                    }

                    /**
                     * Sets the value of the offerItemID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ItemIDType }
                     *     
                     */
                    public void setOfferItemID(ItemIDType value) {
                        this.offerItemID = value;
                    }

                    /**
                     * Associated Order ID
                     * Example: ORDER7333
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderIDType }
                     *     
                     */
                    public OrderIDType getOrderID() {
                        return orderID;
                    }

                    /**
                     * Sets the value of the orderID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderIDType }
                     *     
                     */
                    public void setOrderID(OrderIDType value) {
                        this.orderID = value;
                    }

                    /**
                     * Associated Order Item ID(s).
                     * Example: ORD7333-001
                     * 
                     * @return
                     *     possible object is
                     *     {@link ItemIDType }
                     *     
                     */
                    public ItemIDType getOrderItemID() {
                        return orderItemID;
                    }

                    /**
                     * Sets the value of the orderItemID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ItemIDType }
                     *     
                     */
                    public void setOrderItemID(ItemIDType value) {
                        this.orderItemID = value;
                    }

                    /**
                     * Gets the value of the otherAssociation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link InvGuaranteeRS.Response.Guarantees.Guarantee.Associations.OtherAssociation }
                     *     
                     */
                    public InvGuaranteeRS.Response.Guarantees.Guarantee.Associations.OtherAssociation getOtherAssociation() {
                        return otherAssociation;
                    }

                    /**
                     * Sets the value of the otherAssociation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link InvGuaranteeRS.Response.Guarantees.Guarantee.Associations.OtherAssociation }
                     *     
                     */
                    public void setOtherAssociation(InvGuaranteeRS.Response.Guarantees.Guarantee.Associations.OtherAssociation value) {
                        this.otherAssociation = value;
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

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PriceCoreType">
                 *       &lt;sequence>
                 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType" minOccurs="0"/>
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
                    "amount"
                })
                public static class Price
                    extends PriceCoreType
                {

                    @XmlElement(name = "Amount")
                    protected CurrencyAmountOptType amount;

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

                }

            }

        }

    }

}
