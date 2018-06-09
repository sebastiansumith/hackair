
package org.iata.iata.edist;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PointOfSale" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Document"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Party"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderCreateParameters" minOccurs="0"/>
 *         &lt;element name="Query">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Passengers">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}Passenger" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OrderItems">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/EDIST}ShoppingResponseOrderType"/>
 *                             &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="OfferItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Payments" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST}OrderPaymentFormType" maxOccurs="unbounded"/>
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
 *                             &lt;element name="Promotion" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}PromotionType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Passengers" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
 *                                               &lt;/choice>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
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
 *                   &lt;element name="Commission" type="{http://www.iata.org/IATA/EDIST}CommissionType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/>
 *                   &lt;element name="DataLists" type="{http://www.iata.org/IATA/EDIST}DataListType" minOccurs="0"/>
 *                   &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST}OrdCreateMetadataType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
    "pointOfSale",
    "document",
    "party",
    "orderCreateParameters",
    "query"
})
@XmlRootElement(name = "OrderCreateRQ")
public class OrderCreateRQ {

    @XmlElement(name = "PointOfSale")
    protected PointOfSaleType pointOfSale;
    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Party", required = true)
    protected MsgPartiesType party;
    @XmlElement(name = "OrderCreateParameters")
    protected OrdCreateParamsType orderCreateParameters;
    @XmlElement(name = "Query", required = true)
    protected OrderCreateRQ.Query query;
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
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSaleType }
     *     
     */
    public PointOfSaleType getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSaleType }
     *     
     */
    public void setPointOfSale(PointOfSaleType value) {
        this.pointOfSale = value;
    }

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
     * Gets the value of the orderCreateParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OrdCreateParamsType }
     *     
     */
    public OrdCreateParamsType getOrderCreateParameters() {
        return orderCreateParameters;
    }

    /**
     * Sets the value of the orderCreateParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdCreateParamsType }
     *     
     */
    public void setOrderCreateParameters(OrdCreateParamsType value) {
        this.orderCreateParameters = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCreateRQ.Query }
     *     
     */
    public OrderCreateRQ.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCreateRQ.Query }
     *     
     */
    public void setQuery(OrderCreateRQ.Query value) {
        this.query = value;
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
     *         &lt;element name="Passengers">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Passenger" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OrderItems">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/EDIST}ShoppingResponseOrderType"/>
     *                   &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="OfferItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Payments" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Payment" type="{http://www.iata.org/IATA/EDIST}OrderPaymentFormType" maxOccurs="unbounded"/>
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
     *                   &lt;element name="Promotion" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}PromotionType">
     *                           &lt;sequence>
     *                             &lt;element name="Passengers" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
     *                                     &lt;/choice>
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
     *         &lt;element name="Commission" type="{http://www.iata.org/IATA/EDIST}CommissionType" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/>
     *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/EDIST}DataListType" minOccurs="0"/>
     *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/EDIST}OrdCreateMetadataType" minOccurs="0"/>
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
        "passengers",
        "orderItems",
        "payments",
        "promotions",
        "commission",
        "bookingReferences",
        "dataLists",
        "metadata"
    })
    public static class Query {

        @XmlElement(name = "Passengers", required = true)
        protected OrderCreateRQ.Query.Passengers passengers;
        @XmlElement(name = "OrderItems", required = true)
        protected OrderCreateRQ.Query.OrderItems orderItems;
        @XmlElement(name = "Payments")
        protected OrderCreateRQ.Query.Payments payments;
        @XmlElement(name = "Promotions")
        protected OrderCreateRQ.Query.Promotions promotions;
        @XmlElement(name = "Commission")
        protected CommissionType commission;
        @XmlElement(name = "BookingReferences")
        protected BookingReferences bookingReferences;
        @XmlElement(name = "DataLists")
        protected DataListType dataLists;
        @XmlElement(name = "Metadata")
        protected OrdCreateMetadataType metadata;

        /**
         * Gets the value of the passengers property.
         * 
         * @return
         *     possible object is
         *     {@link OrderCreateRQ.Query.Passengers }
         *     
         */
        public OrderCreateRQ.Query.Passengers getPassengers() {
            return passengers;
        }

        /**
         * Sets the value of the passengers property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCreateRQ.Query.Passengers }
         *     
         */
        public void setPassengers(OrderCreateRQ.Query.Passengers value) {
            this.passengers = value;
        }

        /**
         * Gets the value of the orderItems property.
         * 
         * @return
         *     possible object is
         *     {@link OrderCreateRQ.Query.OrderItems }
         *     
         */
        public OrderCreateRQ.Query.OrderItems getOrderItems() {
            return orderItems;
        }

        /**
         * Sets the value of the orderItems property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCreateRQ.Query.OrderItems }
         *     
         */
        public void setOrderItems(OrderCreateRQ.Query.OrderItems value) {
            this.orderItems = value;
        }

        /**
         * Gets the value of the payments property.
         * 
         * @return
         *     possible object is
         *     {@link OrderCreateRQ.Query.Payments }
         *     
         */
        public OrderCreateRQ.Query.Payments getPayments() {
            return payments;
        }

        /**
         * Sets the value of the payments property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCreateRQ.Query.Payments }
         *     
         */
        public void setPayments(OrderCreateRQ.Query.Payments value) {
            this.payments = value;
        }

        /**
         * Gets the value of the promotions property.
         * 
         * @return
         *     possible object is
         *     {@link OrderCreateRQ.Query.Promotions }
         *     
         */
        public OrderCreateRQ.Query.Promotions getPromotions() {
            return promotions;
        }

        /**
         * Sets the value of the promotions property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCreateRQ.Query.Promotions }
         *     
         */
        public void setPromotions(OrderCreateRQ.Query.Promotions value) {
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
         * Gets the value of the dataLists property.
         * 
         * @return
         *     possible object is
         *     {@link DataListType }
         *     
         */
        public DataListType getDataLists() {
            return dataLists;
        }

        /**
         * Sets the value of the dataLists property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataListType }
         *     
         */
        public void setDataLists(DataListType value) {
            this.dataLists = value;
        }

        /**
         * Gets the value of the metadata property.
         * 
         * @return
         *     possible object is
         *     {@link OrdCreateMetadataType }
         *     
         */
        public OrdCreateMetadataType getMetadata() {
            return metadata;
        }

        /**
         * Sets the value of the metadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrdCreateMetadataType }
         *     
         */
        public void setMetadata(OrdCreateMetadataType value) {
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/EDIST}ShoppingResponseOrderType"/>
         *         &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="OfferItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "shoppingResponse",
            "offerItem"
        })
        public static class OrderItems {

            @XmlElement(name = "ShoppingResponse", required = true)
            protected ShoppingResponseOrderType shoppingResponse;
            @XmlElement(name = "OfferItem")
            protected List<OrderOfferItemType> offerItem;
            @XmlAttribute(name = "OfferItemQuantity")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger offerItemQuantity;

            /**
             * Gets the value of the shoppingResponse property.
             * 
             * @return
             *     possible object is
             *     {@link ShoppingResponseOrderType }
             *     
             */
            public ShoppingResponseOrderType getShoppingResponse() {
                return shoppingResponse;
            }

            /**
             * Sets the value of the shoppingResponse property.
             * 
             * @param value
             *     allowed object is
             *     {@link ShoppingResponseOrderType }
             *     
             */
            public void setShoppingResponse(ShoppingResponseOrderType value) {
                this.shoppingResponse = value;
            }

            /**
             * Gets the value of the offerItem property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the offerItem property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOfferItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OrderOfferItemType }
             * 
             * 
             */
            public List<OrderOfferItemType> getOfferItem() {
                if (offerItem == null) {
                    offerItem = new ArrayList<OrderOfferItemType>();
                }
                return this.offerItem;
            }

            /**
             * Gets the value of the offerItemQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getOfferItemQuantity() {
                return offerItemQuantity;
            }

            /**
             * Sets the value of the offerItemQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setOfferItemQuantity(BigInteger value) {
                this.offerItemQuantity = value;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Passenger" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType" minOccurs="0"/>
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
            protected List<Passenger> passenger;
            @XmlElement(name = "Group")
            protected GroupType group;

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
             * {@link Passenger }
             * 
             * 
             */
            public List<Passenger> getPassenger() {
                if (passenger == null) {
                    passenger = new ArrayList<Passenger>();
                }
                return this.passenger;
            }

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
         *         &lt;element name="Promotion" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}PromotionType">
         *                 &lt;sequence>
         *                   &lt;element name="Passengers" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
         *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
         *                           &lt;/choice>
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
            "promotion"
        })
        public static class Promotions {

            @XmlElement(name = "Promotion", required = true)
            protected List<OrderCreateRQ.Query.Promotions.Promotion> promotion;

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
             * {@link OrderCreateRQ.Query.Promotions.Promotion }
             * 
             * 
             */
            public List<OrderCreateRQ.Query.Promotions.Promotion> getPromotion() {
                if (promotion == null) {
                    promotion = new ArrayList<OrderCreateRQ.Query.Promotions.Promotion>();
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
             *         &lt;element name="Passengers" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
             *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
             *                 &lt;/choice>
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
                "passengers"
            })
            public static class Promotion
                extends PromotionType
            {

                @XmlElement(name = "Passengers")
                protected OrderCreateRQ.Query.Promotions.Promotion.Passengers passengers;

                /**
                 * Gets the value of the passengers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderCreateRQ.Query.Promotions.Promotion.Passengers }
                 *     
                 */
                public OrderCreateRQ.Query.Promotions.Promotion.Passengers getPassengers() {
                    return passengers;
                }

                /**
                 * Sets the value of the passengers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderCreateRQ.Query.Promotions.Promotion.Passengers }
                 *     
                 */
                public void setPassengers(OrderCreateRQ.Query.Promotions.Promotion.Passengers value) {
                    this.passengers = value;
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
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
                 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
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
                    "passengerReferences",
                    "groupReference"
                })
                public static class Passengers {

                    @XmlList
                    @XmlElement(name = "PassengerReferences")
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREFS")
                    protected List<Object> passengerReferences;
                    @XmlElement(name = "GroupReference")
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

        }

    }

}
