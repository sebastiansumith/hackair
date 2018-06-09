
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
import javax.xml.bind.annotation.XmlValue;
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
 *                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderListProcessing"/>
 *                       &lt;element name="Orders" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="Order" maxOccurs="unbounded">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="Agency" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;sequence>
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}AgencyID" minOccurs="0"/>
 *                                                     &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
 *                                                     &lt;element name="IATA_Number" type="{http://www.iata.org/IATA/EDIST}IATA_NbrSimpleType" minOccurs="0"/>
 *                                                   &lt;/sequence>
 *                                                 &lt;/restriction>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                           &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                           &lt;element name="Departure" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;sequence>
 *                                                     &lt;element name="AirportCode">
 *                                                       &lt;complexType>
 *                                                         &lt;simpleContent>
 *                                                           &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>AirportCitySimpleType">
 *                                                             &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/>
 *                                                           &lt;/extension>
 *                                                         &lt;/simpleContent>
 *                                                       &lt;/complexType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                   &lt;/sequence>
 *                                                 &lt;/restriction>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                           &lt;element name="NbrInParty" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;simpleContent>
 *                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
 *                                                   &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
 *                                                 &lt;/extension>
 *                                               &lt;/simpleContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                           &lt;element name="Passengers" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;choice>
 *                                                     &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType"/>
 *                                                     &lt;element name="FullName" maxOccurs="unbounded">
 *                                                       &lt;complexType>
 *                                                         &lt;simpleContent>
 *                                                           &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>ProperNameSimpleType">
 *                                                             &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
 *                                                           &lt;/extension>
 *                                                         &lt;/simpleContent>
 *                                                       &lt;/complexType>
 *                                                     &lt;/element>
 *                                                   &lt;/choice>
 *                                                 &lt;/restriction>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                           &lt;element name="TicketingStatus" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;simpleContent>
 *                                                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>TicketDesigAppListType">
 *                                                   &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
 *                                                 &lt;/extension>
 *                                               &lt;/simpleContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                           &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                         &lt;/sequence>
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
@XmlRootElement(name = "OrderListRS")
public class OrderListRS {

    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "Response")
    protected OrderListRS.Response response;
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
     *     {@link OrderListRS.Response }
     *     
     */
    public OrderListRS.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderListRS.Response }
     *     
     */
    public void setResponse(OrderListRS.Response value) {
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderListProcessing"/>
     *         &lt;element name="Orders" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Order" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Agency" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AgencyID" minOccurs="0"/>
     *                                       &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
     *                                       &lt;element name="IATA_Number" type="{http://www.iata.org/IATA/EDIST}IATA_NbrSimpleType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="Departure" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="AirportCode">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>AirportCitySimpleType">
     *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/>
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="NbrInParty" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
     *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Passengers" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType"/>
     *                                       &lt;element name="FullName" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>ProperNameSimpleType">
     *                                               &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/choice>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TicketingStatus" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>TicketDesigAppListType">
     *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                           &lt;/sequence>
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orderListProcessing",
        "orders"
    })
    public static class Response {

        @XmlElement(name = "OrderListProcessing", required = true)
        protected OrderListProcessType orderListProcessing;
        @XmlElement(name = "Orders")
        protected OrderListRS.Response.Orders orders;

        /**
         * Transaction Processing Results, including processing status, alerts, notices, business warnings, supplemental marketing messages and policy.
         * 
         * @return
         *     possible object is
         *     {@link OrderListProcessType }
         *     
         */
        public OrderListProcessType getOrderListProcessing() {
            return orderListProcessing;
        }

        /**
         * Sets the value of the orderListProcessing property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderListProcessType }
         *     
         */
        public void setOrderListProcessing(OrderListProcessType value) {
            this.orderListProcessing = value;
        }

        /**
         * Gets the value of the orders property.
         * 
         * @return
         *     possible object is
         *     {@link OrderListRS.Response.Orders }
         *     
         */
        public OrderListRS.Response.Orders getOrders() {
            return orders;
        }

        /**
         * Sets the value of the orders property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderListRS.Response.Orders }
         *     
         */
        public void setOrders(OrderListRS.Response.Orders value) {
            this.orders = value;
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
         *         &lt;element name="Order" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Agency" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AgencyID" minOccurs="0"/>
         *                             &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
         *                             &lt;element name="IATA_Number" type="{http://www.iata.org/IATA/EDIST}IATA_NbrSimpleType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="Departure" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="AirportCode">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>AirportCitySimpleType">
         *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/>
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="NbrInParty" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
         *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Passengers" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType"/>
         *                             &lt;element name="FullName" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>ProperNameSimpleType">
         *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/choice>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TicketingStatus" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>TicketDesigAppListType">
         *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                 &lt;/sequence>
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
            "order"
        })
        public static class Orders {

            @XmlElement(name = "Order", required = true)
            protected List<OrderListRS.Response.Orders.Order> order;

            /**
             * Gets the value of the order property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the order property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOrder().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OrderListRS.Response.Orders.Order }
             * 
             * 
             */
            public List<OrderListRS.Response.Orders.Order> getOrder() {
                if (order == null) {
                    order = new ArrayList<OrderListRS.Response.Orders.Order>();
                }
                return this.order;
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
             *         &lt;element name="Agency" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AgencyID" minOccurs="0"/>
             *                   &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
             *                   &lt;element name="IATA_Number" type="{http://www.iata.org/IATA/EDIST}IATA_NbrSimpleType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="Departure" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="AirportCode">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>AirportCitySimpleType">
             *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/>
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="NbrInParty" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
             *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Passengers" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType"/>
             *                   &lt;element name="FullName" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>ProperNameSimpleType">
             *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/choice>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TicketingStatus" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>TicketDesigAppListType">
             *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
                "agency",
                "creationDate",
                "departure",
                "nbrInParty",
                "passengers",
                "ticketingStatus",
                "orderID"
            })
            public static class Order {

                @XmlElement(name = "Agency")
                protected OrderListRS.Response.Orders.Order.Agency agency;
                @XmlElement(name = "CreationDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar creationDate;
                @XmlElement(name = "Departure")
                protected OrderListRS.Response.Orders.Order.Departure departure;
                @XmlElement(name = "NbrInParty")
                protected OrderListRS.Response.Orders.Order.NbrInParty nbrInParty;
                @XmlElement(name = "Passengers")
                protected OrderListRS.Response.Orders.Order.Passengers passengers;
                @XmlElement(name = "TicketingStatus")
                protected OrderListRS.Response.Orders.Order.TicketingStatus ticketingStatus;
                @XmlElement(name = "OrderID", required = true)
                protected Object orderID;

                /**
                 * Gets the value of the agency property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRS.Response.Orders.Order.Agency }
                 *     
                 */
                public OrderListRS.Response.Orders.Order.Agency getAgency() {
                    return agency;
                }

                /**
                 * Sets the value of the agency property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRS.Response.Orders.Order.Agency }
                 *     
                 */
                public void setAgency(OrderListRS.Response.Orders.Order.Agency value) {
                    this.agency = value;
                }

                /**
                 * Gets the value of the creationDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCreationDate() {
                    return creationDate;
                }

                /**
                 * Sets the value of the creationDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCreationDate(XMLGregorianCalendar value) {
                    this.creationDate = value;
                }

                /**
                 * Gets the value of the departure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRS.Response.Orders.Order.Departure }
                 *     
                 */
                public OrderListRS.Response.Orders.Order.Departure getDeparture() {
                    return departure;
                }

                /**
                 * Sets the value of the departure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRS.Response.Orders.Order.Departure }
                 *     
                 */
                public void setDeparture(OrderListRS.Response.Orders.Order.Departure value) {
                    this.departure = value;
                }

                /**
                 * Gets the value of the nbrInParty property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRS.Response.Orders.Order.NbrInParty }
                 *     
                 */
                public OrderListRS.Response.Orders.Order.NbrInParty getNbrInParty() {
                    return nbrInParty;
                }

                /**
                 * Sets the value of the nbrInParty property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRS.Response.Orders.Order.NbrInParty }
                 *     
                 */
                public void setNbrInParty(OrderListRS.Response.Orders.Order.NbrInParty value) {
                    this.nbrInParty = value;
                }

                /**
                 * Gets the value of the passengers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRS.Response.Orders.Order.Passengers }
                 *     
                 */
                public OrderListRS.Response.Orders.Order.Passengers getPassengers() {
                    return passengers;
                }

                /**
                 * Sets the value of the passengers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRS.Response.Orders.Order.Passengers }
                 *     
                 */
                public void setPassengers(OrderListRS.Response.Orders.Order.Passengers value) {
                    this.passengers = value;
                }

                /**
                 * Gets the value of the ticketingStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListRS.Response.Orders.Order.TicketingStatus }
                 *     
                 */
                public OrderListRS.Response.Orders.Order.TicketingStatus getTicketingStatus() {
                    return ticketingStatus;
                }

                /**
                 * Sets the value of the ticketingStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListRS.Response.Orders.Order.TicketingStatus }
                 *     
                 */
                public void setTicketingStatus(OrderListRS.Response.Orders.Order.TicketingStatus value) {
                    this.ticketingStatus = value;
                }

                /**
                 * Gets the value of the orderID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getOrderID() {
                    return orderID;
                }

                /**
                 * Sets the value of the orderID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setOrderID(Object value) {
                    this.orderID = value;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AgencyID" minOccurs="0"/>
                 *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
                 *         &lt;element name="IATA_Number" type="{http://www.iata.org/IATA/EDIST}IATA_NbrSimpleType" minOccurs="0"/>
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
                    "agencyID",
                    "name",
                    "iataNumber"
                })
                public static class Agency {

                    @XmlElement(name = "AgencyID")
                    protected AgencyIDType agencyID;
                    @XmlElement(name = "Name")
                    protected String name;
                    @XmlElement(name = "IATA_Number")
                    protected String iataNumber;

                    /**
                     * Gets the value of the agencyID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AgencyIDType }
                     *     
                     */
                    public AgencyIDType getAgencyID() {
                        return agencyID;
                    }

                    /**
                     * Sets the value of the agencyID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AgencyIDType }
                     *     
                     */
                    public void setAgencyID(AgencyIDType value) {
                        this.agencyID = value;
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

                    /**
                     * Gets the value of the iataNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIATANumber() {
                        return iataNumber;
                    }

                    /**
                     * Sets the value of the iataNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIATANumber(String value) {
                        this.iataNumber = value;
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
                 *         &lt;element name="AirportCode">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>AirportCitySimpleType">
                 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/>
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                    "airportCode",
                    "date"
                })
                public static class Departure {

                    @XmlElement(name = "AirportCode", required = true)
                    protected OrderListRS.Response.Orders.Order.Departure.AirportCode airportCode;
                    @XmlElement(name = "Date", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar date;

                    /**
                     * Gets the value of the airportCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderListRS.Response.Orders.Order.Departure.AirportCode }
                     *     
                     */
                    public OrderListRS.Response.Orders.Order.Departure.AirportCode getAirportCode() {
                        return airportCode;
                    }

                    /**
                     * Sets the value of the airportCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderListRS.Response.Orders.Order.Departure.AirportCode }
                     *     
                     */
                    public void setAirportCode(OrderListRS.Response.Orders.Order.Departure.AirportCode value) {
                        this.airportCode = value;
                    }

                    /**
                     * Gets the value of the date property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDate() {
                        return date;
                    }

                    /**
                     * Sets the value of the date property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDate(XMLGregorianCalendar value) {
                        this.date = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>AirportCitySimpleType">
                     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/>
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
                    public static class AirportCode {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "Application")
                        protected String application;
                        @XmlAttribute(name = "Area")
                        @XmlSchemaType(name = "positiveInteger")
                        protected BigInteger area;
                        @XmlAttribute(name = "UOM")
                        protected DistanceUnitListType uom;

                        /**
                         * Examples: JFK, NYC
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
                         * Gets the value of the application property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getApplication() {
                            return application;
                        }

                        /**
                         * Sets the value of the application property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setApplication(String value) {
                            this.application = value;
                        }

                        /**
                         * Gets the value of the area property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getArea() {
                            return area;
                        }

                        /**
                         * Sets the value of the area property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setArea(BigInteger value) {
                            this.area = value;
                        }

                        /**
                         * Gets the value of the uom property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link DistanceUnitListType }
                         *     
                         */
                        public DistanceUnitListType getUOM() {
                            return uom;
                        }

                        /**
                         * Sets the value of the uom property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DistanceUnitListType }
                         *     
                         */
                        public void setUOM(DistanceUnitListType value) {
                            this.uom = value;
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
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
                 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
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
                public static class NbrInParty {

                    @XmlValue
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger value;
                    @XmlAttribute(name = "refs")
                    @XmlIDREF
                    protected List<Object> refs;

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
                 *         &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType"/>
                 *         &lt;element name="FullName" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>ProperNameSimpleType">
                 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
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
                    "group",
                    "fullName"
                })
                public static class Passengers {

                    @XmlElement(name = "Group")
                    protected GroupType group;
                    @XmlElement(name = "FullName")
                    protected List<OrderListRS.Response.Orders.Order.Passengers.FullName> fullName;

                    /**
                     * Gets the value of the group property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GroupType }
                     *     
                     */
                    public GroupType getGroup() {
                        return group;
                    }

                    /**
                     * Sets the value of the group property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GroupType }
                     *     
                     */
                    public void setGroup(GroupType value) {
                        this.group = value;
                    }

                    /**
                     * Gets the value of the fullName property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the fullName property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFullName().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OrderListRS.Response.Orders.Order.Passengers.FullName }
                     * 
                     * 
                     */
                    public List<OrderListRS.Response.Orders.Order.Passengers.FullName> getFullName() {
                        if (fullName == null) {
                            fullName = new ArrayList<OrderListRS.Response.Orders.Order.Passengers.FullName>();
                        }
                        return this.fullName;
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
                     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
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
                    public static class FullName {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "refs")
                        @XmlIDREF
                        protected List<Object> refs;

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
                 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>TicketDesigAppListType">
                 *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
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
                public static class TicketingStatus {

                    @XmlValue
                    protected TicketDesigAppListType value;
                    @XmlAttribute(name = "Context")
                    protected String context;

                    /**
                     * A data type for Ticket Designator Application list constraint.
                     * 
                     * Examples: Requested, Ticketed, Other
                     * 
                     * @return
                     *     possible object is
                     *     {@link TicketDesigAppListType }
                     *     
                     */
                    public TicketDesigAppListType getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TicketDesigAppListType }
                     *     
                     */
                    public void setValue(TicketDesigAppListType value) {
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

                }

            }

        }

    }

}
