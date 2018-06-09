
package org.iata.iata.edist;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ItinReshopProcessing"/>
 *                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseIDs" minOccurs="0"/>
 *                       &lt;element name="Passengers">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="Passenger" maxOccurs="unbounded" minOccurs="0">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}PassengerDetailType">
 *                                         &lt;sequence>
 *                                           &lt;element name="ActionType" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;simpleContent>
 *                                                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
 *                                                   &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
 *                                                 &lt;/extension>
 *                                               &lt;/simpleContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                         &lt;/sequence>
 *                                       &lt;/extension>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element name="Group" minOccurs="0">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}GroupType">
 *                                         &lt;sequence>
 *                                           &lt;element name="ActionType" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;simpleContent>
 *                                                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
 *                                                   &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
 *                                                 &lt;/extension>
 *                                               &lt;/simpleContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                         &lt;/sequence>
 *                                       &lt;/extension>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="Order" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderCoreType">
 *                               &lt;sequence>
 *                                 &lt;element name="OrderItems" type="{http://www.iata.org/IATA/EDIST}OrderItemRepriceType"/>
 *                               &lt;/sequence>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ReShopOffers">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="ReShopOffer" maxOccurs="unbounded">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType">
 *                                         &lt;sequence>
 *                                           &lt;element name="ReShopPricedOffer" type="{http://www.iata.org/IATA/EDIST}PricedFlightOfferType" minOccurs="0"/>
 *                                           &lt;element name="ReshopDifferential" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;sequence>
 *                                                     &lt;element name="OriginalOrder">
 *                                                       &lt;complexType>
 *                                                         &lt;complexContent>
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                             &lt;sequence>
 *                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
 *                                                               &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
 *                                                             &lt;/sequence>
 *                                                           &lt;/restriction>
 *                                                         &lt;/complexContent>
 *                                                       &lt;/complexType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="NewOffer">
 *                                                       &lt;complexType>
 *                                                         &lt;complexContent>
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                             &lt;sequence>
 *                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
 *                                                               &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
 *                                                             &lt;/sequence>
 *                                                           &lt;/restriction>
 *                                                         &lt;/complexContent>
 *                                                       &lt;/complexType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="PenaltyAmount" minOccurs="0">
 *                                                       &lt;complexType>
 *                                                         &lt;complexContent>
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                             &lt;sequence>
 *                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
 *                                                               &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
 *                                                             &lt;/sequence>
 *                                                           &lt;/restriction>
 *                                                         &lt;/complexContent>
 *                                                       &lt;/complexType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="FeesAmount" minOccurs="0">
 *                                                       &lt;complexType>
 *                                                         &lt;complexContent>
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                             &lt;sequence>
 *                                                               &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
 *                                                               &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
 *                                                             &lt;/sequence>
 *                                                           &lt;/restriction>
 *                                                         &lt;/complexContent>
 *                                                       &lt;/complexType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="ReshopDue">
 *                                                       &lt;complexType>
 *                                                         &lt;complexContent>
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                             &lt;sequence>
 *                                                               &lt;element name="ByPassenger">
 *                                                                 &lt;complexType>
 *                                                                   &lt;complexContent>
 *                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                       &lt;sequence>
 *                                                                         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
 *                                                                       &lt;/sequence>
 *                                                                     &lt;/restriction>
 *                                                                   &lt;/complexContent>
 *                                                                 &lt;/complexType>
 *                                                               &lt;/element>
 *                                                               &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
 *                                                             &lt;/sequence>
 *                                                           &lt;/restriction>
 *                                                         &lt;/complexContent>
 *                                                       &lt;/complexType>
 *                                                     &lt;/element>
 *                                                   &lt;/sequence>
 *                                                 &lt;/restriction>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                         &lt;/sequence>
 *                                       &lt;/extension>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ChangeFees" type="{http://www.iata.org/IATA/EDIST}OrderPenaltyType" minOccurs="0"/>
 *                       &lt;element name="Payments" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="Payment" maxOccurs="unbounded">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}PaymentMethodType">
 *                                         &lt;sequence>
 *                                           &lt;element name="ActionType" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;simpleContent>
 *                                                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
 *                                                   &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
 *                                                 &lt;/extension>
 *                                               &lt;/simpleContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                         &lt;/sequence>
 *                                       &lt;/extension>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="TicketDocInfos" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="TicketDocInfo" maxOccurs="unbounded">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="AgentIDs" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;sequence>
 *                                                     &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/>
 *                                                   &lt;/sequence>
 *                                                 &lt;/restriction>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}IssuingAirlineInfo" minOccurs="0"/>
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/>
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/>
 *                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/>
 *                                           &lt;element name="ActionType" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;simpleContent>
 *                                                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
 *                                                   &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
 *                                                 &lt;/extension>
 *                                               &lt;/simpleContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
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
 *                       &lt;element name="Commission" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;extension base="{http://www.iata.org/IATA/EDIST}CommissionType">
 *                               &lt;sequence>
 *                                 &lt;element name="ActionType" minOccurs="0">
 *                                   &lt;complexType>
 *                                     &lt;simpleContent>
 *                                       &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
 *                                         &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
 *                                       &lt;/extension>
 *                                     &lt;/simpleContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/extension>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="DataList" type="{http://www.iata.org/IATA/EDIST}DataListType" minOccurs="0"/>
 *                       &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST}ItinReshopMetadataType" minOccurs="0"/>
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
@XmlRootElement(name = "ItinReshopRS")
public class ItinReshopRS {

    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "Response")
    protected ItinReshopRS.Response response;
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
     *     {@link ItinReshopRS.Response }
     *     
     */
    public ItinReshopRS.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinReshopRS.Response }
     *     
     */
    public void setResponse(ItinReshopRS.Response value) {
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ItinReshopProcessing"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseIDs" minOccurs="0"/>
     *         &lt;element name="Passengers">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Passenger" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}PassengerDetailType">
     *                           &lt;sequence>
     *                             &lt;element name="ActionType" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
     *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Group" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}GroupType">
     *                           &lt;sequence>
     *                             &lt;element name="ActionType" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
     *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *         &lt;element name="Order" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderCoreType">
     *                 &lt;sequence>
     *                   &lt;element name="OrderItems" type="{http://www.iata.org/IATA/EDIST}OrderItemRepriceType"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ReShopOffers">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ReShopOffer" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType">
     *                           &lt;sequence>
     *                             &lt;element name="ReShopPricedOffer" type="{http://www.iata.org/IATA/EDIST}PricedFlightOfferType" minOccurs="0"/>
     *                             &lt;element name="ReshopDifferential" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="OriginalOrder">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
     *                                                 &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="NewOffer">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
     *                                                 &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="PenaltyAmount" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
     *                                                 &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="FeesAmount" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
     *                                                 &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ReshopDue">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ByPassenger">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
     *                                               &lt;/sequence>
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
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ChangeFees" type="{http://www.iata.org/IATA/EDIST}OrderPenaltyType" minOccurs="0"/>
     *         &lt;element name="Payments" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Payment" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}PaymentMethodType">
     *                           &lt;sequence>
     *                             &lt;element name="ActionType" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
     *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *         &lt;element name="TicketDocInfos" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TicketDocInfo" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AgentIDs" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}IssuingAirlineInfo" minOccurs="0"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/>
     *                             &lt;element name="ActionType" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
     *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *         &lt;element name="Commission" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}CommissionType">
     *                 &lt;sequence>
     *                   &lt;element name="ActionType" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
     *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DataList" type="{http://www.iata.org/IATA/EDIST}DataListType" minOccurs="0"/>
     *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST}ItinReshopMetadataType" minOccurs="0"/>
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
        "itinReshopProcessing",
        "shoppingResponseIDs",
        "passengers",
        "order",
        "reShopOffers",
        "changeFees",
        "payments",
        "ticketDocInfos",
        "commission",
        "dataList",
        "metadata"
    })
    public static class Response {

        @XmlElement(name = "ItinReshopProcessing", required = true)
        protected ItinReshopProcessType itinReshopProcessing;
        @XmlElement(name = "ShoppingResponseIDs")
        protected ShoppingResponseIDType shoppingResponseIDs;
        @XmlElement(name = "Passengers", required = true)
        protected ItinReshopRS.Response.Passengers passengers;
        @XmlElement(name = "Order")
        protected ItinReshopRS.Response.Order order;
        @XmlElement(name = "ReShopOffers", required = true)
        protected ItinReshopRS.Response.ReShopOffers reShopOffers;
        @XmlElement(name = "ChangeFees")
        protected OrderPenaltyType changeFees;
        @XmlElement(name = "Payments")
        protected ItinReshopRS.Response.Payments payments;
        @XmlElement(name = "TicketDocInfos")
        protected ItinReshopRS.Response.TicketDocInfos ticketDocInfos;
        @XmlElement(name = "Commission")
        protected ItinReshopRS.Response.Commission commission;
        @XmlElement(name = "DataList")
        protected DataListType dataList;
        @XmlElement(name = "Metadata")
        protected ItinReshopMetadataType metadata;

        /**
         * Transaction Processing Results, including processing status, alerts, notices, business warnings, supplemental marketing messages and policy.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopProcessType }
         *     
         */
        public ItinReshopProcessType getItinReshopProcessing() {
            return itinReshopProcessing;
        }

        /**
         * Sets the value of the itinReshopProcessing property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopProcessType }
         *     
         */
        public void setItinReshopProcessing(ItinReshopProcessType value) {
            this.itinReshopProcessing = value;
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
         * Gets the value of the passengers property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopRS.Response.Passengers }
         *     
         */
        public ItinReshopRS.Response.Passengers getPassengers() {
            return passengers;
        }

        /**
         * Sets the value of the passengers property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopRS.Response.Passengers }
         *     
         */
        public void setPassengers(ItinReshopRS.Response.Passengers value) {
            this.passengers = value;
        }

        /**
         * Gets the value of the order property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopRS.Response.Order }
         *     
         */
        public ItinReshopRS.Response.Order getOrder() {
            return order;
        }

        /**
         * Sets the value of the order property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopRS.Response.Order }
         *     
         */
        public void setOrder(ItinReshopRS.Response.Order value) {
            this.order = value;
        }

        /**
         * Gets the value of the reShopOffers property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopRS.Response.ReShopOffers }
         *     
         */
        public ItinReshopRS.Response.ReShopOffers getReShopOffers() {
            return reShopOffers;
        }

        /**
         * Sets the value of the reShopOffers property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopRS.Response.ReShopOffers }
         *     
         */
        public void setReShopOffers(ItinReshopRS.Response.ReShopOffers value) {
            this.reShopOffers = value;
        }

        /**
         * Gets the value of the changeFees property.
         * 
         * @return
         *     possible object is
         *     {@link OrderPenaltyType }
         *     
         */
        public OrderPenaltyType getChangeFees() {
            return changeFees;
        }

        /**
         * Sets the value of the changeFees property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderPenaltyType }
         *     
         */
        public void setChangeFees(OrderPenaltyType value) {
            this.changeFees = value;
        }

        /**
         * Gets the value of the payments property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopRS.Response.Payments }
         *     
         */
        public ItinReshopRS.Response.Payments getPayments() {
            return payments;
        }

        /**
         * Sets the value of the payments property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopRS.Response.Payments }
         *     
         */
        public void setPayments(ItinReshopRS.Response.Payments value) {
            this.payments = value;
        }

        /**
         * Gets the value of the ticketDocInfos property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopRS.Response.TicketDocInfos }
         *     
         */
        public ItinReshopRS.Response.TicketDocInfos getTicketDocInfos() {
            return ticketDocInfos;
        }

        /**
         * Sets the value of the ticketDocInfos property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopRS.Response.TicketDocInfos }
         *     
         */
        public void setTicketDocInfos(ItinReshopRS.Response.TicketDocInfos value) {
            this.ticketDocInfos = value;
        }

        /**
         * Gets the value of the commission property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopRS.Response.Commission }
         *     
         */
        public ItinReshopRS.Response.Commission getCommission() {
            return commission;
        }

        /**
         * Sets the value of the commission property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopRS.Response.Commission }
         *     
         */
        public void setCommission(ItinReshopRS.Response.Commission value) {
            this.commission = value;
        }

        /**
         * Gets the value of the dataList property.
         * 
         * @return
         *     possible object is
         *     {@link DataListType }
         *     
         */
        public DataListType getDataList() {
            return dataList;
        }

        /**
         * Sets the value of the dataList property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataListType }
         *     
         */
        public void setDataList(DataListType value) {
            this.dataList = value;
        }

        /**
         * Gets the value of the metadata property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopMetadataType }
         *     
         */
        public ItinReshopMetadataType getMetadata() {
            return metadata;
        }

        /**
         * Sets the value of the metadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopMetadataType }
         *     
         */
        public void setMetadata(ItinReshopMetadataType value) {
            this.metadata = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}CommissionType">
         *       &lt;sequence>
         *         &lt;element name="ActionType" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
         *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
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
            "actionType"
        })
        public static class Commission
            extends CommissionType
        {

            @XmlElement(name = "ActionType")
            protected ItinReshopRS.Response.Commission.ActionType actionType;

            /**
             * Gets the value of the actionType property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopRS.Response.Commission.ActionType }
             *     
             */
            public ItinReshopRS.Response.Commission.ActionType getActionType() {
                return actionType;
            }

            /**
             * Sets the value of the actionType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopRS.Response.Commission.ActionType }
             *     
             */
            public void setActionType(ItinReshopRS.Response.Commission.ActionType value) {
                this.actionType = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
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
            public static class ActionType {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Context")
                protected String context;

                /**
                 * 
                 *         A data type for an Order Action. Examples: Create, Update, Delete, Reissue, Reprice
                 *       
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
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderCoreType">
         *       &lt;sequence>
         *         &lt;element name="OrderItems" type="{http://www.iata.org/IATA/EDIST}OrderItemRepriceType"/>
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
            "orderItems"
        })
        public static class Order
            extends OrderCoreType
        {

            @XmlElement(name = "OrderItems", required = true)
            protected OrderItemRepriceType orderItems;

            /**
             * Gets the value of the orderItems property.
             * 
             * @return
             *     possible object is
             *     {@link OrderItemRepriceType }
             *     
             */
            public OrderItemRepriceType getOrderItems() {
                return orderItems;
            }

            /**
             * Sets the value of the orderItems property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItemRepriceType }
             *     
             */
            public void setOrderItems(OrderItemRepriceType value) {
                this.orderItems = value;
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
         *         &lt;element name="Passenger" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}PassengerDetailType">
         *                 &lt;sequence>
         *                   &lt;element name="ActionType" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
         *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Group" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}GroupType">
         *                 &lt;sequence>
         *                   &lt;element name="ActionType" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
         *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
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
        @XmlType(name = "", propOrder = {
            "passenger",
            "group"
        })
        public static class Passengers {

            @XmlElement(name = "Passenger")
            protected List<ItinReshopRS.Response.Passengers.Passenger> passenger;
            @XmlElement(name = "Group")
            protected ItinReshopRS.Response.Passengers.Group group;

            /**
             * Gets the value of the passenger property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the passenger property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPassenger().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItinReshopRS.Response.Passengers.Passenger }
             * 
             * 
             */
            public List<ItinReshopRS.Response.Passengers.Passenger> getPassenger() {
                if (passenger == null) {
                    passenger = new ArrayList<ItinReshopRS.Response.Passengers.Passenger>();
                }
                return this.passenger;
            }

            /**
             * Gets the value of the group property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopRS.Response.Passengers.Group }
             *     
             */
            public ItinReshopRS.Response.Passengers.Group getGroup() {
                return group;
            }

            /**
             * Sets the value of the group property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopRS.Response.Passengers.Group }
             *     
             */
            public void setGroup(ItinReshopRS.Response.Passengers.Group value) {
                this.group = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}GroupType">
             *       &lt;sequence>
             *         &lt;element name="ActionType" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
             *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "actionType"
            })
            public static class Group
                extends GroupType
            {

                @XmlElement(name = "ActionType")
                protected ItinReshopRS.Response.Passengers.Group.ActionType actionType;

                /**
                 * Gets the value of the actionType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRS.Response.Passengers.Group.ActionType }
                 *     
                 */
                public ItinReshopRS.Response.Passengers.Group.ActionType getActionType() {
                    return actionType;
                }

                /**
                 * Sets the value of the actionType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRS.Response.Passengers.Group.ActionType }
                 *     
                 */
                public void setActionType(ItinReshopRS.Response.Passengers.Group.ActionType value) {
                    this.actionType = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
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
                public static class ActionType {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Context")
                    protected String context;

                    /**
                     * 
                     *         A data type for an Order Action. Examples: Create, Update, Delete, Reissue, Reprice
                     *       
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
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PassengerDetailType">
             *       &lt;sequence>
             *         &lt;element name="ActionType" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
             *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "actionType"
            })
            public static class Passenger
                extends PassengerDetailType
            {

                @XmlElement(name = "ActionType")
                protected ItinReshopRS.Response.Passengers.Passenger.ActionType actionType;

                /**
                 * Gets the value of the actionType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRS.Response.Passengers.Passenger.ActionType }
                 *     
                 */
                public ItinReshopRS.Response.Passengers.Passenger.ActionType getActionType() {
                    return actionType;
                }

                /**
                 * Sets the value of the actionType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRS.Response.Passengers.Passenger.ActionType }
                 *     
                 */
                public void setActionType(ItinReshopRS.Response.Passengers.Passenger.ActionType value) {
                    this.actionType = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
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
                public static class ActionType {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Context")
                    protected String context;

                    /**
                     * 
                     *         A data type for an Order Action. Examples: Create, Update, Delete, Reissue, Reprice
                     *       
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
         *         &lt;element name="Payment" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}PaymentMethodType">
         *                 &lt;sequence>
         *                   &lt;element name="ActionType" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
         *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
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
        @XmlType(name = "", propOrder = {
            "payment"
        })
        public static class Payments {

            @XmlElement(name = "Payment", required = true)
            protected List<ItinReshopRS.Response.Payments.Payment> payment;

            /**
             * Gets the value of the payment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the payment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPayment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItinReshopRS.Response.Payments.Payment }
             * 
             * 
             */
            public List<ItinReshopRS.Response.Payments.Payment> getPayment() {
                if (payment == null) {
                    payment = new ArrayList<ItinReshopRS.Response.Payments.Payment>();
                }
                return this.payment;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PaymentMethodType">
             *       &lt;sequence>
             *         &lt;element name="ActionType" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
             *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "actionType"
            })
            public static class Payment
                extends PaymentMethodType
            {

                @XmlElement(name = "ActionType")
                protected ItinReshopRS.Response.Payments.Payment.ActionType actionType;

                /**
                 * Gets the value of the actionType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRS.Response.Payments.Payment.ActionType }
                 *     
                 */
                public ItinReshopRS.Response.Payments.Payment.ActionType getActionType() {
                    return actionType;
                }

                /**
                 * Sets the value of the actionType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRS.Response.Payments.Payment.ActionType }
                 *     
                 */
                public void setActionType(ItinReshopRS.Response.Payments.Payment.ActionType value) {
                    this.actionType = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
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
                public static class ActionType {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Context")
                    protected String context;

                    /**
                     * 
                     *         A data type for an Order Action. Examples: Create, Update, Delete, Reissue, Reprice
                     *       
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
         *         &lt;element name="ReShopOffer" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType">
         *                 &lt;sequence>
         *                   &lt;element name="ReShopPricedOffer" type="{http://www.iata.org/IATA/EDIST}PricedFlightOfferType" minOccurs="0"/>
         *                   &lt;element name="ReshopDifferential" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="OriginalOrder">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
         *                                       &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="NewOffer">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
         *                                       &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="PenaltyAmount" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
         *                                       &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="FeesAmount" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
         *                                       &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ReshopDue">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ByPassenger">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
         *                                     &lt;/sequence>
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
            "reShopOffer"
        })
        public static class ReShopOffers {

            @XmlElement(name = "ReShopOffer", required = true)
            protected List<ItinReshopRS.Response.ReShopOffers.ReShopOffer> reShopOffer;

            /**
             * Gets the value of the reShopOffer property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reShopOffer property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReShopOffer().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer }
             * 
             * 
             */
            public List<ItinReshopRS.Response.ReShopOffers.ReShopOffer> getReShopOffer() {
                if (reShopOffer == null) {
                    reShopOffer = new ArrayList<ItinReshopRS.Response.ReShopOffers.ReShopOffer>();
                }
                return this.reShopOffer;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType">
             *       &lt;sequence>
             *         &lt;element name="ReShopPricedOffer" type="{http://www.iata.org/IATA/EDIST}PricedFlightOfferType" minOccurs="0"/>
             *         &lt;element name="ReshopDifferential" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="OriginalOrder">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
             *                             &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="NewOffer">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
             *                             &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="PenaltyAmount" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
             *                             &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="FeesAmount" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
             *                             &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ReshopDue">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ByPassenger">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
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
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "reShopPricedOffer",
                "reshopDifferential"
            })
            public static class ReShopOffer
                extends OfferType
            {

                @XmlElement(name = "ReShopPricedOffer")
                protected PricedFlightOfferType reShopPricedOffer;
                @XmlElement(name = "ReshopDifferential")
                protected ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential reshopDifferential;

                /**
                 * Gets the value of the reShopPricedOffer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PricedFlightOfferType }
                 *     
                 */
                public PricedFlightOfferType getReShopPricedOffer() {
                    return reShopPricedOffer;
                }

                /**
                 * Sets the value of the reShopPricedOffer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PricedFlightOfferType }
                 *     
                 */
                public void setReShopPricedOffer(PricedFlightOfferType value) {
                    this.reShopPricedOffer = value;
                }

                /**
                 * Gets the value of the reshopDifferential property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential }
                 *     
                 */
                public ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential getReshopDifferential() {
                    return reshopDifferential;
                }

                /**
                 * Sets the value of the reshopDifferential property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential }
                 *     
                 */
                public void setReshopDifferential(ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential value) {
                    this.reshopDifferential = value;
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
                 *         &lt;element name="OriginalOrder">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
                 *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="NewOffer">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
                 *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="PenaltyAmount" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
                 *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="FeesAmount" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
                 *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ReshopDue">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ByPassenger">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
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
                    "originalOrder",
                    "newOffer",
                    "penaltyAmount",
                    "feesAmount",
                    "reshopDue"
                })
                public static class ReshopDifferential {

                    @XmlElement(name = "OriginalOrder", required = true)
                    protected ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.OriginalOrder originalOrder;
                    @XmlElement(name = "NewOffer", required = true)
                    protected ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.NewOffer newOffer;
                    @XmlElement(name = "PenaltyAmount")
                    protected ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.PenaltyAmount penaltyAmount;
                    @XmlElement(name = "FeesAmount")
                    protected ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.FeesAmount feesAmount;
                    @XmlElement(name = "ReshopDue", required = true)
                    protected ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.ReshopDue reshopDue;

                    /**
                     * Gets the value of the originalOrder property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.OriginalOrder }
                     *     
                     */
                    public ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.OriginalOrder getOriginalOrder() {
                        return originalOrder;
                    }

                    /**
                     * Sets the value of the originalOrder property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.OriginalOrder }
                     *     
                     */
                    public void setOriginalOrder(ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.OriginalOrder value) {
                        this.originalOrder = value;
                    }

                    /**
                     * Gets the value of the newOffer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.NewOffer }
                     *     
                     */
                    public ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.NewOffer getNewOffer() {
                        return newOffer;
                    }

                    /**
                     * Sets the value of the newOffer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.NewOffer }
                     *     
                     */
                    public void setNewOffer(ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.NewOffer value) {
                        this.newOffer = value;
                    }

                    /**
                     * Gets the value of the penaltyAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.PenaltyAmount }
                     *     
                     */
                    public ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.PenaltyAmount getPenaltyAmount() {
                        return penaltyAmount;
                    }

                    /**
                     * Sets the value of the penaltyAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.PenaltyAmount }
                     *     
                     */
                    public void setPenaltyAmount(ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.PenaltyAmount value) {
                        this.penaltyAmount = value;
                    }

                    /**
                     * Gets the value of the feesAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.FeesAmount }
                     *     
                     */
                    public ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.FeesAmount getFeesAmount() {
                        return feesAmount;
                    }

                    /**
                     * Sets the value of the feesAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.FeesAmount }
                     *     
                     */
                    public void setFeesAmount(ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.FeesAmount value) {
                        this.feesAmount = value;
                    }

                    /**
                     * Gets the value of the reshopDue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.ReshopDue }
                     *     
                     */
                    public ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.ReshopDue getReshopDue() {
                        return reshopDue;
                    }

                    /**
                     * Sets the value of the reshopDue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.ReshopDue }
                     *     
                     */
                    public void setReshopDue(ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.ReshopDue value) {
                        this.reshopDue = value;
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
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
                     *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
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
                        "total",
                        "taxes"
                    })
                    public static class FeesAmount {

                        @XmlElement(name = "Total", required = true)
                        protected TotalFareTransactionType total;
                        @XmlElement(name = "Taxes")
                        protected TaxDetailType taxes;

                        /**
                         * Gets the value of the total property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TotalFareTransactionType }
                         *     
                         */
                        public TotalFareTransactionType getTotal() {
                            return total;
                        }

                        /**
                         * Sets the value of the total property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TotalFareTransactionType }
                         *     
                         */
                        public void setTotal(TotalFareTransactionType value) {
                            this.total = value;
                        }

                        /**
                         * Gets the value of the taxes property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TaxDetailType }
                         *     
                         */
                        public TaxDetailType getTaxes() {
                            return taxes;
                        }

                        /**
                         * Sets the value of the taxes property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TaxDetailType }
                         *     
                         */
                        public void setTaxes(TaxDetailType value) {
                            this.taxes = value;
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
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
                     *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
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
                        "total",
                        "taxes"
                    })
                    public static class NewOffer {

                        @XmlElement(name = "Total", required = true)
                        protected TotalFareTransactionType total;
                        @XmlElement(name = "Taxes")
                        protected TaxDetailType taxes;

                        /**
                         * Gets the value of the total property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TotalFareTransactionType }
                         *     
                         */
                        public TotalFareTransactionType getTotal() {
                            return total;
                        }

                        /**
                         * Sets the value of the total property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TotalFareTransactionType }
                         *     
                         */
                        public void setTotal(TotalFareTransactionType value) {
                            this.total = value;
                        }

                        /**
                         * Gets the value of the taxes property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TaxDetailType }
                         *     
                         */
                        public TaxDetailType getTaxes() {
                            return taxes;
                        }

                        /**
                         * Sets the value of the taxes property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TaxDetailType }
                         *     
                         */
                        public void setTaxes(TaxDetailType value) {
                            this.taxes = value;
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
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
                     *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
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
                        "total",
                        "taxes"
                    })
                    public static class OriginalOrder {

                        @XmlElement(name = "Total", required = true)
                        protected TotalFareTransactionType total;
                        @XmlElement(name = "Taxes")
                        protected TaxDetailType taxes;

                        /**
                         * Gets the value of the total property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TotalFareTransactionType }
                         *     
                         */
                        public TotalFareTransactionType getTotal() {
                            return total;
                        }

                        /**
                         * Sets the value of the total property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TotalFareTransactionType }
                         *     
                         */
                        public void setTotal(TotalFareTransactionType value) {
                            this.total = value;
                        }

                        /**
                         * Gets the value of the taxes property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TaxDetailType }
                         *     
                         */
                        public TaxDetailType getTaxes() {
                            return taxes;
                        }

                        /**
                         * Sets the value of the taxes property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TaxDetailType }
                         *     
                         */
                        public void setTaxes(TaxDetailType value) {
                            this.taxes = value;
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
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
                     *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
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
                        "total",
                        "taxes"
                    })
                    public static class PenaltyAmount {

                        @XmlElement(name = "Total", required = true)
                        protected TotalFareTransactionType total;
                        @XmlElement(name = "Taxes")
                        protected TaxDetailType taxes;

                        /**
                         * Gets the value of the total property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TotalFareTransactionType }
                         *     
                         */
                        public TotalFareTransactionType getTotal() {
                            return total;
                        }

                        /**
                         * Sets the value of the total property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TotalFareTransactionType }
                         *     
                         */
                        public void setTotal(TotalFareTransactionType value) {
                            this.total = value;
                        }

                        /**
                         * Gets the value of the taxes property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TaxDetailType }
                         *     
                         */
                        public TaxDetailType getTaxes() {
                            return taxes;
                        }

                        /**
                         * Sets the value of the taxes property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TaxDetailType }
                         *     
                         */
                        public void setTaxes(TaxDetailType value) {
                            this.taxes = value;
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
                     *         &lt;element name="ByPassenger">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST}TaxDetailType" minOccurs="0"/>
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
                        "byPassenger",
                        "taxes"
                    })
                    public static class ReshopDue {

                        @XmlElement(name = "ByPassenger", required = true)
                        protected ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.ReshopDue.ByPassenger byPassenger;
                        @XmlElement(name = "Taxes")
                        protected TaxDetailType taxes;

                        /**
                         * Gets the value of the byPassenger property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.ReshopDue.ByPassenger }
                         *     
                         */
                        public ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.ReshopDue.ByPassenger getByPassenger() {
                            return byPassenger;
                        }

                        /**
                         * Sets the value of the byPassenger property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.ReshopDue.ByPassenger }
                         *     
                         */
                        public void setByPassenger(ItinReshopRS.Response.ReShopOffers.ReShopOffer.ReshopDifferential.ReshopDue.ByPassenger value) {
                            this.byPassenger = value;
                        }

                        /**
                         * Gets the value of the taxes property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TaxDetailType }
                         *     
                         */
                        public TaxDetailType getTaxes() {
                            return taxes;
                        }

                        /**
                         * Sets the value of the taxes property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TaxDetailType }
                         *     
                         */
                        public void setTaxes(TaxDetailType value) {
                            this.taxes = value;
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
                         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Total"/>
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
                            "total"
                        })
                        public static class ByPassenger {

                            @XmlElement(name = "Total", required = true)
                            protected TotalFareTransactionType total;

                            /**
                             * Gets the value of the total property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link TotalFareTransactionType }
                             *     
                             */
                            public TotalFareTransactionType getTotal() {
                                return total;
                            }

                            /**
                             * Sets the value of the total property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link TotalFareTransactionType }
                             *     
                             */
                            public void setTotal(TotalFareTransactionType value) {
                                this.total = value;
                            }

                        }

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
         *         &lt;element name="TicketDocInfo" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AgentIDs" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}IssuingAirlineInfo" minOccurs="0"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/>
         *                   &lt;element name="ActionType" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
         *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ticketDocInfo"
        })
        public static class TicketDocInfos {

            @XmlElement(name = "TicketDocInfo", required = true)
            protected List<ItinReshopRS.Response.TicketDocInfos.TicketDocInfo> ticketDocInfo;

            /**
             * Gets the value of the ticketDocInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ticketDocInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTicketDocInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItinReshopRS.Response.TicketDocInfos.TicketDocInfo }
             * 
             * 
             */
            public List<ItinReshopRS.Response.TicketDocInfos.TicketDocInfo> getTicketDocInfo() {
                if (ticketDocInfo == null) {
                    ticketDocInfo = new ArrayList<ItinReshopRS.Response.TicketDocInfos.TicketDocInfo>();
                }
                return this.ticketDocInfo;
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
             *         &lt;element name="AgentIDs" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}IssuingAirlineInfo" minOccurs="0"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDocument" maxOccurs="4"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CarrierFeeInfo" minOccurs="0"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginalIssueInfo" minOccurs="0"/>
             *         &lt;element name="ActionType" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
             *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
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
                "agentIDs",
                "issuingAirlineInfo",
                "ticketDocument",
                "carrierFeeInfo",
                "originalIssueInfo",
                "actionType"
            })
            public static class TicketDocInfo {

                @XmlElement(name = "AgentIDs")
                protected ItinReshopRS.Response.TicketDocInfos.TicketDocInfo.AgentIDs agentIDs;
                @XmlElement(name = "IssuingAirlineInfo")
                protected IssuingAirlineInfo issuingAirlineInfo;
                @XmlElement(name = "TicketDocument", required = true)
                protected List<TicketDocument> ticketDocument;
                @XmlElement(name = "CarrierFeeInfo")
                protected CarrierFeeInfoType carrierFeeInfo;
                @XmlElement(name = "OriginalIssueInfo")
                protected OriginalIssueInfo originalIssueInfo;
                @XmlElement(name = "ActionType")
                protected ItinReshopRS.Response.TicketDocInfos.TicketDocInfo.ActionType actionType;

                /**
                 * Gets the value of the agentIDs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRS.Response.TicketDocInfos.TicketDocInfo.AgentIDs }
                 *     
                 */
                public ItinReshopRS.Response.TicketDocInfos.TicketDocInfo.AgentIDs getAgentIDs() {
                    return agentIDs;
                }

                /**
                 * Sets the value of the agentIDs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRS.Response.TicketDocInfos.TicketDocInfo.AgentIDs }
                 *     
                 */
                public void setAgentIDs(ItinReshopRS.Response.TicketDocInfos.TicketDocInfo.AgentIDs value) {
                    this.agentIDs = value;
                }

                /**
                 * Gets the value of the issuingAirlineInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link IssuingAirlineInfo }
                 *     
                 */
                public IssuingAirlineInfo getIssuingAirlineInfo() {
                    return issuingAirlineInfo;
                }

                /**
                 * Sets the value of the issuingAirlineInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link IssuingAirlineInfo }
                 *     
                 */
                public void setIssuingAirlineInfo(IssuingAirlineInfo value) {
                    this.issuingAirlineInfo = value;
                }

                /**
                 * Gets the value of the ticketDocument property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ticketDocument property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTicketDocument().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TicketDocument }
                 * 
                 * 
                 */
                public List<TicketDocument> getTicketDocument() {
                    if (ticketDocument == null) {
                        ticketDocument = new ArrayList<TicketDocument>();
                    }
                    return this.ticketDocument;
                }

                /**
                 * Gets the value of the carrierFeeInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CarrierFeeInfoType }
                 *     
                 */
                public CarrierFeeInfoType getCarrierFeeInfo() {
                    return carrierFeeInfo;
                }

                /**
                 * Sets the value of the carrierFeeInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CarrierFeeInfoType }
                 *     
                 */
                public void setCarrierFeeInfo(CarrierFeeInfoType value) {
                    this.carrierFeeInfo = value;
                }

                /**
                 * Gets the value of the originalIssueInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OriginalIssueInfo }
                 *     
                 */
                public OriginalIssueInfo getOriginalIssueInfo() {
                    return originalIssueInfo;
                }

                /**
                 * Sets the value of the originalIssueInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OriginalIssueInfo }
                 *     
                 */
                public void setOriginalIssueInfo(OriginalIssueInfo value) {
                    this.originalIssueInfo = value;
                }

                /**
                 * Gets the value of the actionType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRS.Response.TicketDocInfos.TicketDocInfo.ActionType }
                 *     
                 */
                public ItinReshopRS.Response.TicketDocInfos.TicketDocInfo.ActionType getActionType() {
                    return actionType;
                }

                /**
                 * Sets the value of the actionType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRS.Response.TicketDocInfos.TicketDocInfo.ActionType }
                 *     
                 */
                public void setActionType(ItinReshopRS.Response.TicketDocInfos.TicketDocInfo.ActionType value) {
                    this.actionType = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
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
                public static class ActionType {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Context")
                    protected String context;

                    /**
                     * 
                     *         A data type for an Order Action. Examples: Create, Update, Delete, Reissue, Reprice
                     *       
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AgentID" maxOccurs="2"/>
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
                    "agentID"
                })
                public static class AgentIDs {

                    @XmlElement(name = "AgentID", required = true)
                    protected List<AgentID> agentID;

                    /**
                     * Gets the value of the agentID property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the agentID property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAgentID().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link AgentID }
                     * 
                     * 
                     */
                    public List<AgentID> getAgentID() {
                        if (agentID == null) {
                            agentID = new ArrayList<AgentID>();
                        }
                        return this.agentID;
                    }

                }

            }

        }

    }

}
