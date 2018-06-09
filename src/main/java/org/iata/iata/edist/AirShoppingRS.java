
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
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}Document"/>
 *           &lt;element name="Success" type="{http://www.iata.org/IATA/EDIST}SuccessType"/>
 *           &lt;element name="Warnings" type="{http://www.iata.org/IATA/EDIST}WarningsType" minOccurs="0"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}AirShoppingProcessing"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseIDs" minOccurs="0"/>
 *           &lt;element name="OffersGroup">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}AllOffersSnapshot" minOccurs="0"/>
 *                     &lt;element name="AirlineOffers" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                               &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineOfferSnapshot" minOccurs="0"/>
 *                               &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type" minOccurs="0"/>
 *                               &lt;element name="AirlineOffer" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType">
 *                                       &lt;sequence>
 *                                         &lt;element ref="{http://www.iata.org/IATA/EDIST}PricedOffer" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="PriceCalendar" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="PriceCalendarDate" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;simpleContent>
 *                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                                                 &lt;attribute name="OriginDestinationReference" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                                               &lt;/extension>
 *                                             &lt;/simpleContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/EDIST}EncodedPriceType"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="LeadPriceInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Payments" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST}OrderPaymentFormType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Promotions" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Promotion" type="{http://www.iata.org/IATA/EDIST}PromotionType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}Commission" minOccurs="0"/>
 *           &lt;element name="DataLists" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.iata.org/IATA/EDIST}DataListType">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST}AirShopResMetadataType" minOccurs="0"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}Policies" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}Errors"/>
 *         &lt;/sequence>
 *       &lt;/choice>
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
    "airShoppingProcessing",
    "shoppingResponseIDs",
    "offersGroup",
    "payments",
    "promotions",
    "commission",
    "dataLists",
    "metadata",
    "policies",
    "errors"
})
@XmlRootElement(name = "AirShoppingRS")
public class AirShoppingRS {

    @XmlElement(name = "Document")
    protected MsgDocumentType document;
    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "AirShoppingProcessing")
    protected OrdViewProcessType airShoppingProcessing;
    @XmlElement(name = "ShoppingResponseIDs")
    protected ShoppingResponseIDType shoppingResponseIDs;
    @XmlElement(name = "OffersGroup")
    protected AirShoppingRS.OffersGroup offersGroup;
    @XmlElement(name = "Payments")
    protected AirShoppingRS.Payments payments;
    @XmlElement(name = "Promotions")
    protected AirShoppingRS.Promotions promotions;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "DataLists")
    protected AirShoppingRS.DataLists dataLists;
    @XmlElement(name = "Metadata")
    protected AirShopResMetadataType metadata;
    @XmlElement(name = "Policies")
    protected Policies policies;
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
     * Gets the value of the airShoppingProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link OrdViewProcessType }
     *     
     */
    public OrdViewProcessType getAirShoppingProcessing() {
        return airShoppingProcessing;
    }

    /**
     * Sets the value of the airShoppingProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdViewProcessType }
     *     
     */
    public void setAirShoppingProcessing(OrdViewProcessType value) {
        this.airShoppingProcessing = value;
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
     * Gets the value of the offersGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRS.OffersGroup }
     *     
     */
    public AirShoppingRS.OffersGroup getOffersGroup() {
        return offersGroup;
    }

    /**
     * Sets the value of the offersGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRS.OffersGroup }
     *     
     */
    public void setOffersGroup(AirShoppingRS.OffersGroup value) {
        this.offersGroup = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRS.Payments }
     *     
     */
    public AirShoppingRS.Payments getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRS.Payments }
     *     
     */
    public void setPayments(AirShoppingRS.Payments value) {
        this.payments = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRS.Promotions }
     *     
     */
    public AirShoppingRS.Promotions getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRS.Promotions }
     *     
     */
    public void setPromotions(AirShoppingRS.Promotions value) {
        this.promotions = value;
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

    /**
     * Gets the value of the dataLists property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRS.DataLists }
     *     
     */
    public AirShoppingRS.DataLists getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRS.DataLists }
     *     
     */
    public void setDataLists(AirShoppingRS.DataLists value) {
        this.dataLists = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link AirShopResMetadataType }
     *     
     */
    public AirShopResMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShopResMetadataType }
     *     
     */
    public void setMetadata(AirShopResMetadataType value) {
        this.metadata = value;
    }

    /**
     * Message Policy information.
     * 
     * @return
     *     possible object is
     *     {@link Policies }
     *     
     */
    public Policies getPolicies() {
        return policies;
    }

    /**
     * Sets the value of the policies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Policies }
     *     
     */
    public void setPolicies(Policies value) {
        this.policies = value;
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
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}DataListType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DataLists
        extends DataListType
    {


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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AllOffersSnapshot" minOccurs="0"/>
     *         &lt;element name="AirlineOffers" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineOfferSnapshot" minOccurs="0"/>
     *                   &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type" minOccurs="0"/>
     *                   &lt;element name="AirlineOffer" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PricedOffer" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PriceCalendar" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PriceCalendarDate" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *                                     &lt;attribute name="OriginDestinationReference" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/EDIST}EncodedPriceType"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="LeadPriceInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "allOffersSnapshot",
        "airlineOffers"
    })
    public static class OffersGroup {

        @XmlElement(name = "AllOffersSnapshot")
        protected AllOffersSnapshotType allOffersSnapshot;
        @XmlElement(name = "AirlineOffers", required = true)
        protected List<AirShoppingRS.OffersGroup.AirlineOffers> airlineOffers;

        /**
         * Gets the value of the allOffersSnapshot property.
         * 
         * @return
         *     possible object is
         *     {@link AllOffersSnapshotType }
         *     
         */
        public AllOffersSnapshotType getAllOffersSnapshot() {
            return allOffersSnapshot;
        }

        /**
         * Sets the value of the allOffersSnapshot property.
         * 
         * @param value
         *     allowed object is
         *     {@link AllOffersSnapshotType }
         *     
         */
        public void setAllOffersSnapshot(AllOffersSnapshotType value) {
            this.allOffersSnapshot = value;
        }

        /**
         * Gets the value of the airlineOffers property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineOffers property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineOffers().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirShoppingRS.OffersGroup.AirlineOffers }
         * 
         * 
         */
        public List<AirShoppingRS.OffersGroup.AirlineOffers> getAirlineOffers() {
            if (airlineOffers == null) {
                airlineOffers = new ArrayList<AirShoppingRS.OffersGroup.AirlineOffers>();
            }
            return this.airlineOffers;
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
         *         &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineOfferSnapshot" minOccurs="0"/>
         *         &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineID_Type" minOccurs="0"/>
         *         &lt;element name="AirlineOffer" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PricedOffer" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PriceCalendar" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PriceCalendarDate" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
         *                           &lt;attribute name="OriginDestinationReference" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/EDIST}EncodedPriceType"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="LeadPriceInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            "totalOfferQuantity",
            "airlineOfferSnapshot",
            "owner",
            "airlineOffer",
            "priceCalendar"
        })
        public static class AirlineOffers {

            @XmlElement(name = "TotalOfferQuantity")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger totalOfferQuantity;
            @XmlElement(name = "AirlineOfferSnapshot")
            protected AirlineOffersSnapshotType airlineOfferSnapshot;
            @XmlElement(name = "Owner")
            protected AirlineIDType owner;
            @XmlElement(name = "AirlineOffer")
            protected List<AirShoppingRS.OffersGroup.AirlineOffers.AirlineOffer> airlineOffer;
            @XmlElement(name = "PriceCalendar")
            protected List<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar> priceCalendar;

            /**
             * Gets the value of the totalOfferQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotalOfferQuantity() {
                return totalOfferQuantity;
            }

            /**
             * Sets the value of the totalOfferQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotalOfferQuantity(BigInteger value) {
                this.totalOfferQuantity = value;
            }

            /**
             * Gets the value of the airlineOfferSnapshot property.
             * 
             * @return
             *     possible object is
             *     {@link AirlineOffersSnapshotType }
             *     
             */
            public AirlineOffersSnapshotType getAirlineOfferSnapshot() {
                return airlineOfferSnapshot;
            }

            /**
             * Sets the value of the airlineOfferSnapshot property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirlineOffersSnapshotType }
             *     
             */
            public void setAirlineOfferSnapshot(AirlineOffersSnapshotType value) {
                this.airlineOfferSnapshot = value;
            }

            /**
             * Gets the value of the owner property.
             * 
             * @return
             *     possible object is
             *     {@link AirlineIDType }
             *     
             */
            public AirlineIDType getOwner() {
                return owner;
            }

            /**
             * Sets the value of the owner property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirlineIDType }
             *     
             */
            public void setOwner(AirlineIDType value) {
                this.owner = value;
            }

            /**
             * Gets the value of the airlineOffer property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the airlineOffer property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAirlineOffer().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirShoppingRS.OffersGroup.AirlineOffers.AirlineOffer }
             * 
             * 
             */
            public List<AirShoppingRS.OffersGroup.AirlineOffers.AirlineOffer> getAirlineOffer() {
                if (airlineOffer == null) {
                    airlineOffer = new ArrayList<AirShoppingRS.OffersGroup.AirlineOffers.AirlineOffer>();
                }
                return this.airlineOffer;
            }

            /**
             * Gets the value of the priceCalendar property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the priceCalendar property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPriceCalendar().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar }
             * 
             * 
             */
            public List<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar> getPriceCalendar() {
                if (priceCalendar == null) {
                    priceCalendar = new ArrayList<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar>();
                }
                return this.priceCalendar;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PricedOffer" minOccurs="0"/>
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
                "pricedOffer"
            })
            public static class AirlineOffer
                extends OfferType
            {

                @XmlElement(name = "PricedOffer")
                protected PricedOffer pricedOffer;

                /**
                 * Gets the value of the pricedOffer property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PricedOffer }
                 *     
                 */
                public PricedOffer getPricedOffer() {
                    return pricedOffer;
                }

                /**
                 * Sets the value of the pricedOffer property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PricedOffer }
                 *     
                 */
                public void setPricedOffer(PricedOffer value) {
                    this.pricedOffer = value;
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
             *         &lt;element name="PriceCalendarDate" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
             *                 &lt;attribute name="OriginDestinationReference" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/EDIST}EncodedPriceType"/>
             *       &lt;/sequence>
             *       &lt;attribute name="LeadPriceInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "priceCalendarDate",
                "totalPrice"
            })
            public static class PriceCalendar {

                @XmlElement(name = "PriceCalendarDate", required = true)
                protected List<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PriceCalendarDate> priceCalendarDate;
                @XmlElement(name = "TotalPrice", required = true)
                protected EncodedPriceType totalPrice;
                @XmlAttribute(name = "LeadPriceInd")
                @XmlSchemaType(name = "anySimpleType")
                protected String leadPriceInd;

                /**
                 * Gets the value of the priceCalendarDate property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the priceCalendarDate property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPriceCalendarDate().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PriceCalendarDate }
                 * 
                 * 
                 */
                public List<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PriceCalendarDate> getPriceCalendarDate() {
                    if (priceCalendarDate == null) {
                        priceCalendarDate = new ArrayList<AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PriceCalendarDate>();
                    }
                    return this.priceCalendarDate;
                }

                /**
                 * Gets the value of the totalPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EncodedPriceType }
                 *     
                 */
                public EncodedPriceType getTotalPrice() {
                    return totalPrice;
                }

                /**
                 * Sets the value of the totalPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EncodedPriceType }
                 *     
                 */
                public void setTotalPrice(EncodedPriceType value) {
                    this.totalPrice = value;
                }

                /**
                 * Gets the value of the leadPriceInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLeadPriceInd() {
                    return leadPriceInd;
                }

                /**
                 * Sets the value of the leadPriceInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLeadPriceInd(String value) {
                    this.leadPriceInd = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
                 *       &lt;attribute name="OriginDestinationReference" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
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
                public static class PriceCalendarDate {

                    @XmlValue
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar value;
                    @XmlAttribute(name = "OriginDestinationReference")
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object originDestinationReference;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setValue(XMLGregorianCalendar value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the originDestinationReference property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getOriginDestinationReference() {
                        return originDestinationReference;
                    }

                    /**
                     * Sets the value of the originDestinationReference property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setOriginDestinationReference(Object value) {
                        this.originDestinationReference = value;
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
     *         &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST}OrderPaymentFormType" maxOccurs="unbounded"/>
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
        protected List<OrderPaymentFormType> payment;

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
         * {@link OrderPaymentFormType }
         * 
         * 
         */
        public List<OrderPaymentFormType> getPayment() {
            if (payment == null) {
                payment = new ArrayList<OrderPaymentFormType>();
            }
            return this.payment;
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
     *         &lt;element name="Promotion" type="{http://www.iata.org/IATA/EDIST}PromotionType" maxOccurs="unbounded"/>
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
        protected List<PromotionType> promotion;

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
         * {@link PromotionType }
         * 
         * 
         */
        public List<PromotionType> getPromotion() {
            if (promotion == null) {
                promotion = new ArrayList<PromotionType>();
            }
            return this.promotion;
        }

    }

}
