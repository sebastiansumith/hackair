
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
 *         &lt;element name="Query">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DisplayCriteria" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ET_OnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="EMD_OnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Flight" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineID"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightNumber"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}DepartureDate"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}DepartureCode"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ArrivalCode"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TicketDocument" type="{http://www.iata.org/IATA/EDIST}TicketDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Passenger" type="{http://www.iata.org/IATA/EDIST}TravelerSummaryType" minOccurs="0"/>
 *                   &lt;element name="OrderID" type="{http://www.iata.org/IATA/EDIST}CouponOrderKeyType" minOccurs="0"/>
 *                   &lt;element name="FQTV" type="{http://www.iata.org/IATA/EDIST}TravelerFQTV_Type" minOccurs="0"/>
 *                   &lt;element name="FOID" type="{http://www.iata.org/IATA/EDIST}TravelerFOID_Type" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/>
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
    "query"
})
@XmlRootElement(name = "AirDocDisplayRQ")
public class AirDocDisplayRQ {

    @XmlElement(name = "PointOfSale")
    protected PointOfSaleType pointOfSale;
    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Party", required = true)
    protected MsgPartiesType party;
    @XmlElement(name = "Query", required = true)
    protected AirDocDisplayRQ.Query query;
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
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link AirDocDisplayRQ.Query }
     *     
     */
    public AirDocDisplayRQ.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirDocDisplayRQ.Query }
     *     
     */
    public void setQuery(AirDocDisplayRQ.Query value) {
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
     *         &lt;element name="DisplayCriteria" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ET_OnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="EMD_OnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Flight" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineID"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightNumber"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DepartureDate"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DepartureCode"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ArrivalCode"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TicketDocument" type="{http://www.iata.org/IATA/EDIST}TicketDocumentType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Passenger" type="{http://www.iata.org/IATA/EDIST}TravelerSummaryType" minOccurs="0"/>
     *         &lt;element name="OrderID" type="{http://www.iata.org/IATA/EDIST}CouponOrderKeyType" minOccurs="0"/>
     *         &lt;element name="FQTV" type="{http://www.iata.org/IATA/EDIST}TravelerFQTV_Type" minOccurs="0"/>
     *         &lt;element name="FOID" type="{http://www.iata.org/IATA/EDIST}TravelerFOID_Type" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/>
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
        "displayCriteria",
        "flight",
        "ticketDocument",
        "passenger",
        "orderID",
        "fqtv",
        "foid",
        "bookingReferences"
    })
    public static class Query {

        @XmlElement(name = "DisplayCriteria")
        protected AirDocDisplayRQ.Query.DisplayCriteria displayCriteria;
        @XmlElement(name = "Flight")
        protected AirDocDisplayRQ.Query.Flight flight;
        @XmlElement(name = "TicketDocument")
        protected List<TicketDocumentType> ticketDocument;
        @XmlElement(name = "Passenger")
        protected TravelerSummaryType passenger;
        @XmlElement(name = "OrderID")
        protected CouponOrderKeyType orderID;
        @XmlElement(name = "FQTV")
        protected TravelerFQTVType fqtv;
        @XmlElement(name = "FOID")
        protected TravelerFOIDType foid;
        @XmlElement(name = "BookingReferences")
        protected BookingReferences bookingReferences;

        /**
         * Gets the value of the displayCriteria property.
         * 
         * @return
         *     possible object is
         *     {@link AirDocDisplayRQ.Query.DisplayCriteria }
         *     
         */
        public AirDocDisplayRQ.Query.DisplayCriteria getDisplayCriteria() {
            return displayCriteria;
        }

        /**
         * Sets the value of the displayCriteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirDocDisplayRQ.Query.DisplayCriteria }
         *     
         */
        public void setDisplayCriteria(AirDocDisplayRQ.Query.DisplayCriteria value) {
            this.displayCriteria = value;
        }

        /**
         * Gets the value of the flight property.
         * 
         * @return
         *     possible object is
         *     {@link AirDocDisplayRQ.Query.Flight }
         *     
         */
        public AirDocDisplayRQ.Query.Flight getFlight() {
            return flight;
        }

        /**
         * Sets the value of the flight property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirDocDisplayRQ.Query.Flight }
         *     
         */
        public void setFlight(AirDocDisplayRQ.Query.Flight value) {
            this.flight = value;
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
         * {@link TicketDocumentType }
         * 
         * 
         */
        public List<TicketDocumentType> getTicketDocument() {
            if (ticketDocument == null) {
                ticketDocument = new ArrayList<TicketDocumentType>();
            }
            return this.ticketDocument;
        }

        /**
         * Gets the value of the passenger property.
         * 
         * @return
         *     possible object is
         *     {@link TravelerSummaryType }
         *     
         */
        public TravelerSummaryType getPassenger() {
            return passenger;
        }

        /**
         * Sets the value of the passenger property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerSummaryType }
         *     
         */
        public void setPassenger(TravelerSummaryType value) {
            this.passenger = value;
        }

        /**
         * Gets the value of the orderID property.
         * 
         * @return
         *     possible object is
         *     {@link CouponOrderKeyType }
         *     
         */
        public CouponOrderKeyType getOrderID() {
            return orderID;
        }

        /**
         * Sets the value of the orderID property.
         * 
         * @param value
         *     allowed object is
         *     {@link CouponOrderKeyType }
         *     
         */
        public void setOrderID(CouponOrderKeyType value) {
            this.orderID = value;
        }

        /**
         * Gets the value of the fqtv property.
         * 
         * @return
         *     possible object is
         *     {@link TravelerFQTVType }
         *     
         */
        public TravelerFQTVType getFQTV() {
            return fqtv;
        }

        /**
         * Sets the value of the fqtv property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerFQTVType }
         *     
         */
        public void setFQTV(TravelerFQTVType value) {
            this.fqtv = value;
        }

        /**
         * Gets the value of the foid property.
         * 
         * @return
         *     possible object is
         *     {@link TravelerFOIDType }
         *     
         */
        public TravelerFOIDType getFOID() {
            return foid;
        }

        /**
         * Sets the value of the foid property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerFOIDType }
         *     
         */
        public void setFOID(TravelerFOIDType value) {
            this.foid = value;
        }

        /**
         * Gets the value of the bookingReferences property.
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ET_OnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="EMD_OnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DisplayCriteria {

            @XmlAttribute(name = "ET_OnlyInd")
            protected Boolean etOnlyInd;
            @XmlAttribute(name = "EMD_OnlyInd")
            protected Boolean emdOnlyInd;

            /**
             * Gets the value of the etOnlyInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isETOnlyInd() {
                return etOnlyInd;
            }

            /**
             * Sets the value of the etOnlyInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setETOnlyInd(Boolean value) {
                this.etOnlyInd = value;
            }

            /**
             * Gets the value of the emdOnlyInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isEMDOnlyInd() {
                return emdOnlyInd;
            }

            /**
             * Sets the value of the emdOnlyInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setEMDOnlyInd(Boolean value) {
                this.emdOnlyInd = value;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineID"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightNumber"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DepartureDate"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DepartureCode"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ArrivalCode"/>
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
            "airlineID",
            "flightNumber",
            "departureDate",
            "departureCode",
            "arrivalCode"
        })
        public static class Flight {

            @XmlElement(name = "AirlineID", required = true)
            protected AirlineID airlineID;
            @XmlElement(name = "FlightNumber", required = true)
            protected FlightNumber flightNumber;
            @XmlElement(name = "DepartureDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar departureDate;
            @XmlElement(name = "DepartureCode", required = true)
            protected DepartureCode departureCode;
            @XmlElement(name = "ArrivalCode", required = true)
            protected ArrivalCode arrivalCode;

            /**
             * Gets the value of the airlineID property.
             * 
             * @return
             *     possible object is
             *     {@link AirlineID }
             *     
             */
            public AirlineID getAirlineID() {
                return airlineID;
            }

            /**
             * Sets the value of the airlineID property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirlineID }
             *     
             */
            public void setAirlineID(AirlineID value) {
                this.airlineID = value;
            }

            /**
             * Gets the value of the flightNumber property.
             * 
             * @return
             *     possible object is
             *     {@link FlightNumber }
             *     
             */
            public FlightNumber getFlightNumber() {
                return flightNumber;
            }

            /**
             * Sets the value of the flightNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link FlightNumber }
             *     
             */
            public void setFlightNumber(FlightNumber value) {
                this.flightNumber = value;
            }

            /**
             * Gets the value of the departureDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDepartureDate() {
                return departureDate;
            }

            /**
             * Sets the value of the departureDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDepartureDate(XMLGregorianCalendar value) {
                this.departureDate = value;
            }

            /**
             * Gets the value of the departureCode property.
             * 
             * @return
             *     possible object is
             *     {@link DepartureCode }
             *     
             */
            public DepartureCode getDepartureCode() {
                return departureCode;
            }

            /**
             * Sets the value of the departureCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link DepartureCode }
             *     
             */
            public void setDepartureCode(DepartureCode value) {
                this.departureCode = value;
            }

            /**
             * Gets the value of the arrivalCode property.
             * 
             * @return
             *     possible object is
             *     {@link ArrivalCode }
             *     
             */
            public ArrivalCode getArrivalCode() {
                return arrivalCode;
            }

            /**
             * Sets the value of the arrivalCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrivalCode }
             *     
             */
            public void setArrivalCode(ArrivalCode value) {
                this.arrivalCode = value;
            }

        }

    }

}
