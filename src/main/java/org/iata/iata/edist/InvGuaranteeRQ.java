
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Party"/>
 *         &lt;element name="Query">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseIDs" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OfferID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Qualifiers" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PaymentCards" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PaymentCard" type="{http://www.iata.org/IATA/EDIST}CardQualifierType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Programs" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Program" type="{http://www.iata.org/IATA/EDIST}ProgramQualifierType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Promotions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Promotion" type="{http://www.iata.org/IATA/EDIST}PromoQualifierType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Seat" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Assignment" type="{http://www.iata.org/IATA/EDIST}SeatCoreType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SocialMedia" type="{http://www.iata.org/IATA/EDIST}SocialQualiferType" minOccurs="0"/>
 *                             &lt;element name="SpecialNeeds" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SpecialNeed" type="{http://www.iata.org/IATA/EDIST}SpecialQualiferType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TripPurpose" type="{http://www.iata.org/IATA/EDIST}TripPurposeListType" minOccurs="0"/>
 *                             &lt;element name="Locations" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LocationCode" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>AirportCitySimpleType">
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DataLists" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}DataListType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "party",
    "query",
    "dataLists"
})
@XmlRootElement(name = "InvGuaranteeRQ")
public class InvGuaranteeRQ {

    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Party", required = true)
    protected MsgPartiesType party;
    @XmlElement(name = "Query", required = true)
    protected InvGuaranteeRQ.Query query;
    @XmlElement(name = "DataLists")
    protected InvGuaranteeRQ.DataLists dataLists;
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
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link MsgPartiesType }
     *     
     */
    public MsgPartiesType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgPartiesType }
     *     
     */
    public void setParty(MsgPartiesType value) {
        this.party = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link InvGuaranteeRQ.Query }
     *     
     */
    public InvGuaranteeRQ.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvGuaranteeRQ.Query }
     *     
     */
    public void setQuery(InvGuaranteeRQ.Query value) {
        this.query = value;
    }

    /**
     * Gets the value of the dataLists property.
     * 
     * @return
     *     possible object is
     *     {@link InvGuaranteeRQ.DataLists }
     *     
     */
    public InvGuaranteeRQ.DataLists getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvGuaranteeRQ.DataLists }
     *     
     */
    public void setDataLists(InvGuaranteeRQ.DataLists value) {
        this.dataLists = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseIDs" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OfferID" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Qualifiers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PaymentCards" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PaymentCard" type="{http://www.iata.org/IATA/EDIST}CardQualifierType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Programs" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Program" type="{http://www.iata.org/IATA/EDIST}ProgramQualifierType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Promotions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Promotion" type="{http://www.iata.org/IATA/EDIST}PromoQualifierType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Seat" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Assignment" type="{http://www.iata.org/IATA/EDIST}SeatCoreType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SocialMedia" type="{http://www.iata.org/IATA/EDIST}SocialQualiferType" minOccurs="0"/>
     *                   &lt;element name="SpecialNeeds" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SpecialNeed" type="{http://www.iata.org/IATA/EDIST}SpecialQualiferType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TripPurpose" type="{http://www.iata.org/IATA/EDIST}TripPurposeListType" minOccurs="0"/>
     *                   &lt;element name="Locations" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
     *                           &lt;sequence>
     *                             &lt;element name="LocationCode" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>AirportCitySimpleType">
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
        "bookingReferences",
        "shoppingResponseIDs",
        "orderID",
        "orderItemID",
        "offerID",
        "offerItemID",
        "qualifiers"
    })
    public static class Query {

        @XmlElement(name = "BookingReferences")
        protected BookingReferences bookingReferences;
        @XmlElement(name = "ShoppingResponseIDs")
        protected ShoppingResponseIDType shoppingResponseIDs;
        @XmlElement(name = "OrderID")
        protected OrderIDType orderID;
        @XmlElement(name = "OrderItemID")
        protected List<ItemIDType> orderItemID;
        @XmlElement(name = "OfferID")
        protected Object offerID;
        @XmlElement(name = "OfferItemID")
        protected List<ItemIDType> offerItemID;
        @XmlElement(name = "Qualifiers")
        protected InvGuaranteeRQ.Query.Qualifiers qualifiers;

        /**
         * Existing Booking Reference (e.g. PNR Record Locator). Example: R1A3SK
         * 
         * @return
         *     possible object is
         *     {@link BookingReferences }
         *     
         */
        public BookingReferences getBookingReferences() {
            return bookingReferences;
        }

        /**
         * Sets the value of the bookingReferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookingReferences }
         *     
         */
        public void setBookingReferences(BookingReferences value) {
            this.bookingReferences = value;
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
         * Order ID. Example: ORDER7333
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
         * Order Item ID(s). Example: ORD7333-001 Gets the value of the orderItemID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderItemID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrderItemID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemIDType }
         * 
         * 
         */
        public List<ItemIDType> getOrderItemID() {
            if (orderItemID == null) {
                orderItemID = new ArrayList<ItemIDType>();
            }
            return this.orderItemID;
        }

        /**
         * Gets the value of the offerID property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getOfferID() {
            return offerID;
        }

        /**
         * Sets the value of the offerID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setOfferID(Object value) {
            this.offerID = value;
        }

        /**
         * Offer Item ID(s). Example: OFFER1226 Gets the value of the offerItemID property.
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
         * Gets the value of the qualifiers property.
         * 
         * @return
         *     possible object is
         *     {@link InvGuaranteeRQ.Query.Qualifiers }
         *     
         */
        public InvGuaranteeRQ.Query.Qualifiers getQualifiers() {
            return qualifiers;
        }

        /**
         * Sets the value of the qualifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link InvGuaranteeRQ.Query.Qualifiers }
         *     
         */
        public void setQualifiers(InvGuaranteeRQ.Query.Qualifiers value) {
            this.qualifiers = value;
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
         *         &lt;element name="PaymentCards" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PaymentCard" type="{http://www.iata.org/IATA/EDIST}CardQualifierType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Programs" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Program" type="{http://www.iata.org/IATA/EDIST}ProgramQualifierType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Promotions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Promotion" type="{http://www.iata.org/IATA/EDIST}PromoQualifierType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Seat" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Assignment" type="{http://www.iata.org/IATA/EDIST}SeatCoreType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SocialMedia" type="{http://www.iata.org/IATA/EDIST}SocialQualiferType" minOccurs="0"/>
         *         &lt;element name="SpecialNeeds" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SpecialNeed" type="{http://www.iata.org/IATA/EDIST}SpecialQualiferType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TripPurpose" type="{http://www.iata.org/IATA/EDIST}TripPurposeListType" minOccurs="0"/>
         *         &lt;element name="Locations" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
         *                 &lt;sequence>
         *                   &lt;element name="LocationCode" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>AirportCitySimpleType">
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
            "paymentCards",
            "programs",
            "promotions",
            "seat",
            "socialMedia",
            "specialNeeds",
            "tripPurpose",
            "locations"
        })
        public static class Qualifiers {

            @XmlElement(name = "PaymentCards")
            protected InvGuaranteeRQ.Query.Qualifiers.PaymentCards paymentCards;
            @XmlElement(name = "Programs")
            protected InvGuaranteeRQ.Query.Qualifiers.Programs programs;
            @XmlElement(name = "Promotions")
            protected InvGuaranteeRQ.Query.Qualifiers.Promotions promotions;
            @XmlElement(name = "Seat")
            protected InvGuaranteeRQ.Query.Qualifiers.Seat seat;
            @XmlElement(name = "SocialMedia")
            protected SocialQualiferType socialMedia;
            @XmlElement(name = "SpecialNeeds")
            protected InvGuaranteeRQ.Query.Qualifiers.SpecialNeeds specialNeeds;
            @XmlElement(name = "TripPurpose")
            @XmlSchemaType(name = "string")
            protected TripPurposeListType tripPurpose;
            @XmlElement(name = "Locations")
            protected InvGuaranteeRQ.Query.Qualifiers.Locations locations;

            /**
             * Gets the value of the paymentCards property.
             * 
             * @return
             *     possible object is
             *     {@link InvGuaranteeRQ.Query.Qualifiers.PaymentCards }
             *     
             */
            public InvGuaranteeRQ.Query.Qualifiers.PaymentCards getPaymentCards() {
                return paymentCards;
            }

            /**
             * Sets the value of the paymentCards property.
             * 
             * @param value
             *     allowed object is
             *     {@link InvGuaranteeRQ.Query.Qualifiers.PaymentCards }
             *     
             */
            public void setPaymentCards(InvGuaranteeRQ.Query.Qualifiers.PaymentCards value) {
                this.paymentCards = value;
            }

            /**
             * Gets the value of the programs property.
             * 
             * @return
             *     possible object is
             *     {@link InvGuaranteeRQ.Query.Qualifiers.Programs }
             *     
             */
            public InvGuaranteeRQ.Query.Qualifiers.Programs getPrograms() {
                return programs;
            }

            /**
             * Sets the value of the programs property.
             * 
             * @param value
             *     allowed object is
             *     {@link InvGuaranteeRQ.Query.Qualifiers.Programs }
             *     
             */
            public void setPrograms(InvGuaranteeRQ.Query.Qualifiers.Programs value) {
                this.programs = value;
            }

            /**
             * Gets the value of the promotions property.
             * 
             * @return
             *     possible object is
             *     {@link InvGuaranteeRQ.Query.Qualifiers.Promotions }
             *     
             */
            public InvGuaranteeRQ.Query.Qualifiers.Promotions getPromotions() {
                return promotions;
            }

            /**
             * Sets the value of the promotions property.
             * 
             * @param value
             *     allowed object is
             *     {@link InvGuaranteeRQ.Query.Qualifiers.Promotions }
             *     
             */
            public void setPromotions(InvGuaranteeRQ.Query.Qualifiers.Promotions value) {
                this.promotions = value;
            }

            /**
             * Gets the value of the seat property.
             * 
             * @return
             *     possible object is
             *     {@link InvGuaranteeRQ.Query.Qualifiers.Seat }
             *     
             */
            public InvGuaranteeRQ.Query.Qualifiers.Seat getSeat() {
                return seat;
            }

            /**
             * Sets the value of the seat property.
             * 
             * @param value
             *     allowed object is
             *     {@link InvGuaranteeRQ.Query.Qualifiers.Seat }
             *     
             */
            public void setSeat(InvGuaranteeRQ.Query.Qualifiers.Seat value) {
                this.seat = value;
            }

            /**
             * Gets the value of the socialMedia property.
             * 
             * @return
             *     possible object is
             *     {@link SocialQualiferType }
             *     
             */
            public SocialQualiferType getSocialMedia() {
                return socialMedia;
            }

            /**
             * Sets the value of the socialMedia property.
             * 
             * @param value
             *     allowed object is
             *     {@link SocialQualiferType }
             *     
             */
            public void setSocialMedia(SocialQualiferType value) {
                this.socialMedia = value;
            }

            /**
             * Gets the value of the specialNeeds property.
             * 
             * @return
             *     possible object is
             *     {@link InvGuaranteeRQ.Query.Qualifiers.SpecialNeeds }
             *     
             */
            public InvGuaranteeRQ.Query.Qualifiers.SpecialNeeds getSpecialNeeds() {
                return specialNeeds;
            }

            /**
             * Sets the value of the specialNeeds property.
             * 
             * @param value
             *     allowed object is
             *     {@link InvGuaranteeRQ.Query.Qualifiers.SpecialNeeds }
             *     
             */
            public void setSpecialNeeds(InvGuaranteeRQ.Query.Qualifiers.SpecialNeeds value) {
                this.specialNeeds = value;
            }

            /**
             * Gets the value of the tripPurpose property.
             * 
             * @return
             *     possible object is
             *     {@link TripPurposeListType }
             *     
             */
            public TripPurposeListType getTripPurpose() {
                return tripPurpose;
            }

            /**
             * Sets the value of the tripPurpose property.
             * 
             * @param value
             *     allowed object is
             *     {@link TripPurposeListType }
             *     
             */
            public void setTripPurpose(TripPurposeListType value) {
                this.tripPurpose = value;
            }

            /**
             * Gets the value of the locations property.
             * 
             * @return
             *     possible object is
             *     {@link InvGuaranteeRQ.Query.Qualifiers.Locations }
             *     
             */
            public InvGuaranteeRQ.Query.Qualifiers.Locations getLocations() {
                return locations;
            }

            /**
             * Sets the value of the locations property.
             * 
             * @param value
             *     allowed object is
             *     {@link InvGuaranteeRQ.Query.Qualifiers.Locations }
             *     
             */
            public void setLocations(InvGuaranteeRQ.Query.Qualifiers.Locations value) {
                this.locations = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
             *       &lt;sequence>
             *         &lt;element name="LocationCode" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>AirportCitySimpleType">
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
                "locationCode"
            })
            public static class Locations
                extends AssociatedObjectBaseType
            {

                @XmlElement(name = "LocationCode", required = true)
                protected List<InvGuaranteeRQ.Query.Qualifiers.Locations.LocationCode> locationCode;

                /**
                 * Gets the value of the locationCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the locationCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLocationCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InvGuaranteeRQ.Query.Qualifiers.Locations.LocationCode }
                 * 
                 * 
                 */
                public List<InvGuaranteeRQ.Query.Qualifiers.Locations.LocationCode> getLocationCode() {
                    if (locationCode == null) {
                        locationCode = new ArrayList<InvGuaranteeRQ.Query.Qualifiers.Locations.LocationCode>();
                    }
                    return this.locationCode;
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
                public static class LocationCode {

                    @XmlValue
                    protected String value;

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
             *         &lt;element name="PaymentCard" type="{http://www.iata.org/IATA/EDIST}CardQualifierType" maxOccurs="unbounded"/>
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
                "paymentCard"
            })
            public static class PaymentCards {

                @XmlElement(name = "PaymentCard", required = true)
                protected List<CardQualifierType> paymentCard;

                /**
                 * Gets the value of the paymentCard property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the paymentCard property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPaymentCard().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CardQualifierType }
                 * 
                 * 
                 */
                public List<CardQualifierType> getPaymentCard() {
                    if (paymentCard == null) {
                        paymentCard = new ArrayList<CardQualifierType>();
                    }
                    return this.paymentCard;
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
             *         &lt;element name="Program" type="{http://www.iata.org/IATA/EDIST}ProgramQualifierType" maxOccurs="unbounded"/>
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
                "program"
            })
            public static class Programs {

                @XmlElement(name = "Program", required = true)
                protected List<ProgramQualifierType> program;

                /**
                 * Gets the value of the program property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the program property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProgram().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ProgramQualifierType }
                 * 
                 * 
                 */
                public List<ProgramQualifierType> getProgram() {
                    if (program == null) {
                        program = new ArrayList<ProgramQualifierType>();
                    }
                    return this.program;
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
             *         &lt;element name="Promotion" type="{http://www.iata.org/IATA/EDIST}PromoQualifierType" maxOccurs="unbounded"/>
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
                protected List<PromoQualifierType> promotion;

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
                 * {@link PromoQualifierType }
                 * 
                 * 
                 */
                public List<PromoQualifierType> getPromotion() {
                    if (promotion == null) {
                        promotion = new ArrayList<PromoQualifierType>();
                    }
                    return this.promotion;
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
             *         &lt;element name="Assignment" type="{http://www.iata.org/IATA/EDIST}SeatCoreType" maxOccurs="unbounded"/>
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
                "assignment"
            })
            public static class Seat {

                @XmlElement(name = "Assignment", required = true)
                protected List<SeatCoreType> assignment;

                /**
                 * Gets the value of the assignment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the assignment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAssignment().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SeatCoreType }
                 * 
                 * 
                 */
                public List<SeatCoreType> getAssignment() {
                    if (assignment == null) {
                        assignment = new ArrayList<SeatCoreType>();
                    }
                    return this.assignment;
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
             *         &lt;element name="SpecialNeed" type="{http://www.iata.org/IATA/EDIST}SpecialQualiferType" maxOccurs="unbounded"/>
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
                "specialNeed"
            })
            public static class SpecialNeeds {

                @XmlElement(name = "SpecialNeed", required = true)
                protected List<SpecialQualiferType> specialNeed;

                /**
                 * Gets the value of the specialNeed property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the specialNeed property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSpecialNeed().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SpecialQualiferType }
                 * 
                 * 
                 */
                public List<SpecialQualiferType> getSpecialNeed() {
                    if (specialNeed == null) {
                        specialNeed = new ArrayList<SpecialQualiferType>();
                    }
                    return this.specialNeed;
                }

            }

        }

    }

}
