
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PointOfSale" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Document"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Party"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ItinReshopParameters" minOccurs="0"/>
 *         &lt;element name="Query">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="RepriceOnly">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OrderItems" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemCoreType">
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RepriceAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Reshop">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Actions" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ActionType">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
 *                                               &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/>
 *                                       &lt;element name="OfferItemSets" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="OfferItemSet" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="SetItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                                       &lt;/extension>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="OrderItems" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemDetailType">
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TicketDocuments" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TicketDocument" type="{http://www.iata.org/IATA/EDIST}TicketDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Passengers" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}Passenger" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Qualifiers" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Qualifier" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;choice>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}BaggagePricingQualifier"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}ExistingOrderQualifier"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardQualifiers"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}ProgramQualifiers"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}PromotionQualifiers"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatQualifier"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceQualifier"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}SocialMediaQualifiers"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialFareQualifiers"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialNeedQualifiers"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}TripPurposeQualifier"/>
 *                                                         &lt;/choice>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Preferences" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Preference" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;choice>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlinePreferences"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}AlliancePreferences"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightPreferences"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}FarePreferences"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}PricingMethodPreference"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}ServicePricingOnlyPreference"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}TransferPreferences"/>
 *                                                           &lt;element ref="{http://www.iata.org/IATA/EDIST}CabinPreferences"/>
 *                                                         &lt;/choice>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
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
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
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
    "itinReshopParameters",
    "query"
})
@XmlRootElement(name = "ItinReshopRQ")
public class ItinReshopRQ {

    @XmlElement(name = "PointOfSale")
    protected PointOfSaleType pointOfSale;
    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Party", required = true)
    protected MsgPartiesType party;
    @XmlElement(name = "ItinReshopParameters")
    protected ItinReshopParamsType itinReshopParameters;
    @XmlElement(name = "Query", required = true)
    protected ItinReshopRQ.Query query;
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
     * Gets the value of the itinReshopParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ItinReshopParamsType }
     *     
     */
    public ItinReshopParamsType getItinReshopParameters() {
        return itinReshopParameters;
    }

    /**
     * Sets the value of the itinReshopParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinReshopParamsType }
     *     
     */
    public void setItinReshopParameters(ItinReshopParamsType value) {
        this.itinReshopParameters = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link ItinReshopRQ.Query }
     *     
     */
    public ItinReshopRQ.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinReshopRQ.Query }
     *     
     */
    public void setQuery(ItinReshopRQ.Query value) {
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
     *       &lt;choice>
     *         &lt;element name="RepriceOnly">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OrderItems" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemCoreType">
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RepriceAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Reshop">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Actions" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ActionType">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
     *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/>
     *                             &lt;element name="OfferItemSets" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="OfferItemSet" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="SetItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                             &lt;/extension>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="OrderItems" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemDetailType">
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TicketDocuments" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TicketDocument" type="{http://www.iata.org/IATA/EDIST}TicketDocumentType" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Passengers" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}Passenger" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Qualifiers" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Qualifier" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;choice>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}BaggagePricingQualifier"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}ExistingOrderQualifier"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardQualifiers"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}ProgramQualifiers"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PromotionQualifiers"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatQualifier"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceQualifier"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}SocialMediaQualifiers"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialFareQualifiers"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialNeedQualifiers"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}TripPurposeQualifier"/>
     *                                               &lt;/choice>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Preferences" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Preference" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;choice>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlinePreferences"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}AlliancePreferences"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightPreferences"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}FarePreferences"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}PricingMethodPreference"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}ServicePricingOnlyPreference"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}TransferPreferences"/>
     *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST}CabinPreferences"/>
     *                                               &lt;/choice>
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
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
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
        "repriceOnly",
        "reshop"
    })
    public static class Query {

        @XmlElement(name = "RepriceOnly")
        protected ItinReshopRQ.Query.RepriceOnly repriceOnly;
        @XmlElement(name = "Reshop")
        protected ItinReshopRQ.Query.Reshop reshop;

        /**
         * Gets the value of the repriceOnly property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopRQ.Query.RepriceOnly }
         *     
         */
        public ItinReshopRQ.Query.RepriceOnly getRepriceOnly() {
            return repriceOnly;
        }

        /**
         * Sets the value of the repriceOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopRQ.Query.RepriceOnly }
         *     
         */
        public void setRepriceOnly(ItinReshopRQ.Query.RepriceOnly value) {
            this.repriceOnly = value;
        }

        /**
         * Gets the value of the reshop property.
         * 
         * @return
         *     possible object is
         *     {@link ItinReshopRQ.Query.Reshop }
         *     
         */
        public ItinReshopRQ.Query.Reshop getReshop() {
            return reshop;
        }

        /**
         * Sets the value of the reshop property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItinReshopRQ.Query.Reshop }
         *     
         */
        public void setReshop(ItinReshopRQ.Query.Reshop value) {
            this.reshop = value;
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
         *         &lt;element name="OrderItems" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemCoreType">
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="RepriceAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
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
        public static class RepriceOnly {

            @XmlElement(name = "OrderItems")
            protected ItinReshopRQ.Query.RepriceOnly.OrderItems orderItems;
            @XmlAttribute(name = "RepriceAllInd")
            protected Boolean repriceAllInd;

            /**
             * Gets the value of the orderItems property.
             * 
             * @return
             *     possible object is
             *     {@link ItinReshopRQ.Query.RepriceOnly.OrderItems }
             *     
             */
            public ItinReshopRQ.Query.RepriceOnly.OrderItems getOrderItems() {
                return orderItems;
            }

            /**
             * Sets the value of the orderItems property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItinReshopRQ.Query.RepriceOnly.OrderItems }
             *     
             */
            public void setOrderItems(ItinReshopRQ.Query.RepriceOnly.OrderItems value) {
                this.orderItems = value;
            }

            /**
             * Gets the value of the repriceAllInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRepriceAllInd() {
                return repriceAllInd;
            }

            /**
             * Sets the value of the repriceAllInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRepriceAllInd(Boolean value) {
                this.repriceAllInd = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemCoreType">
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class OrderItems
                extends OrderItemCoreType
            {


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
         *         &lt;element name="Actions" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ActionType">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
         *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/>
         *                   &lt;element name="OfferItemSets" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="OfferItemSet" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
         *                                     &lt;sequence>
         *                                       &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="SetItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                   &lt;/extension>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="OrderItems" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemDetailType">
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TicketDocuments" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TicketDocument" type="{http://www.iata.org/IATA/EDIST}TicketDocumentType" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Passengers" minOccurs="0">
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
         *                   &lt;element name="Qualifiers" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Qualifier" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;choice>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}BaggagePricingQualifier"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ExistingOrderQualifier"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardQualifiers"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ProgramQualifiers"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PromotionQualifiers"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatQualifier"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceQualifier"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}SocialMediaQualifiers"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialFareQualifiers"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialNeedQualifiers"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}TripPurposeQualifier"/>
         *                                     &lt;/choice>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Preferences" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Preference" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;choice>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlinePreferences"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}AlliancePreferences"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightPreferences"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}FarePreferences"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PricingMethodPreference"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}ServicePricingOnlyPreference"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}TransferPreferences"/>
         *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}CabinPreferences"/>
         *                                     &lt;/choice>
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
            "actions"
        })
        public static class Reshop {

            @XmlElement(name = "Actions", required = true)
            protected List<ItinReshopRQ.Query.Reshop.Actions> actions;

            /**
             * Gets the value of the actions property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the actions property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getActions().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItinReshopRQ.Query.Reshop.Actions }
             * 
             * 
             */
            public List<ItinReshopRQ.Query.Reshop.Actions> getActions() {
                if (actions == null) {
                    actions = new ArrayList<ItinReshopRQ.Query.Reshop.Actions>();
                }
                return this.actions;
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
             *         &lt;element name="ActionType">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>OrderItemActionListType">
             *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BookingReferences" minOccurs="0"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/>
             *         &lt;element name="OfferItemSets" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="OfferItemSet" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
             *                           &lt;sequence>
             *                             &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="SetItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                         &lt;/extension>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="OrderItems" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemDetailType">
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TicketDocuments" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TicketDocument" type="{http://www.iata.org/IATA/EDIST}TicketDocumentType" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Passengers" minOccurs="0">
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
             *         &lt;element name="Qualifiers" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Qualifier" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;choice>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}BaggagePricingQualifier"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ExistingOrderQualifier"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardQualifiers"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ProgramQualifiers"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PromotionQualifiers"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatQualifier"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceQualifier"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}SocialMediaQualifiers"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialFareQualifiers"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialNeedQualifiers"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}TripPurposeQualifier"/>
             *                           &lt;/choice>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Preferences" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Preference" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;choice>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlinePreferences"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AlliancePreferences"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightPreferences"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}FarePreferences"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PricingMethodPreference"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ServicePricingOnlyPreference"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}TransferPreferences"/>
             *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CabinPreferences"/>
             *                           &lt;/choice>
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
                "actionType",
                "bookingReferences",
                "orderID",
                "offerItemSets",
                "orderItems",
                "ticketDocuments",
                "passengers",
                "qualifiers",
                "preferences"
            })
            public static class Actions {

                @XmlElement(name = "ActionType", required = true)
                protected ItinReshopRQ.Query.Reshop.Actions.ActionType actionType;
                @XmlElement(name = "BookingReferences")
                protected BookingReferences bookingReferences;
                @XmlElement(name = "OrderID")
                protected OrderIDType orderID;
                @XmlElement(name = "OfferItemSets")
                protected ItinReshopRQ.Query.Reshop.Actions.OfferItemSets offerItemSets;
                @XmlElement(name = "OrderItems")
                protected ItinReshopRQ.Query.Reshop.Actions.OrderItems orderItems;
                @XmlElement(name = "TicketDocuments")
                protected ItinReshopRQ.Query.Reshop.Actions.TicketDocuments ticketDocuments;
                @XmlElement(name = "Passengers")
                protected ItinReshopRQ.Query.Reshop.Actions.Passengers passengers;
                @XmlElement(name = "Qualifiers")
                protected ItinReshopRQ.Query.Reshop.Actions.Qualifiers qualifiers;
                @XmlElement(name = "Preferences")
                protected ItinReshopRQ.Query.Reshop.Actions.Preferences preferences;

                /**
                 * Gets the value of the actionType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRQ.Query.Reshop.Actions.ActionType }
                 *     
                 */
                public ItinReshopRQ.Query.Reshop.Actions.ActionType getActionType() {
                    return actionType;
                }

                /**
                 * Sets the value of the actionType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRQ.Query.Reshop.Actions.ActionType }
                 *     
                 */
                public void setActionType(ItinReshopRQ.Query.Reshop.Actions.ActionType value) {
                    this.actionType = value;
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
                 * Gets the value of the orderID property.
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
                 * Gets the value of the offerItemSets property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRQ.Query.Reshop.Actions.OfferItemSets }
                 *     
                 */
                public ItinReshopRQ.Query.Reshop.Actions.OfferItemSets getOfferItemSets() {
                    return offerItemSets;
                }

                /**
                 * Sets the value of the offerItemSets property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRQ.Query.Reshop.Actions.OfferItemSets }
                 *     
                 */
                public void setOfferItemSets(ItinReshopRQ.Query.Reshop.Actions.OfferItemSets value) {
                    this.offerItemSets = value;
                }

                /**
                 * Gets the value of the orderItems property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRQ.Query.Reshop.Actions.OrderItems }
                 *     
                 */
                public ItinReshopRQ.Query.Reshop.Actions.OrderItems getOrderItems() {
                    return orderItems;
                }

                /**
                 * Sets the value of the orderItems property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRQ.Query.Reshop.Actions.OrderItems }
                 *     
                 */
                public void setOrderItems(ItinReshopRQ.Query.Reshop.Actions.OrderItems value) {
                    this.orderItems = value;
                }

                /**
                 * Gets the value of the ticketDocuments property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRQ.Query.Reshop.Actions.TicketDocuments }
                 *     
                 */
                public ItinReshopRQ.Query.Reshop.Actions.TicketDocuments getTicketDocuments() {
                    return ticketDocuments;
                }

                /**
                 * Sets the value of the ticketDocuments property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRQ.Query.Reshop.Actions.TicketDocuments }
                 *     
                 */
                public void setTicketDocuments(ItinReshopRQ.Query.Reshop.Actions.TicketDocuments value) {
                    this.ticketDocuments = value;
                }

                /**
                 * Gets the value of the passengers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRQ.Query.Reshop.Actions.Passengers }
                 *     
                 */
                public ItinReshopRQ.Query.Reshop.Actions.Passengers getPassengers() {
                    return passengers;
                }

                /**
                 * Sets the value of the passengers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRQ.Query.Reshop.Actions.Passengers }
                 *     
                 */
                public void setPassengers(ItinReshopRQ.Query.Reshop.Actions.Passengers value) {
                    this.passengers = value;
                }

                /**
                 * Gets the value of the qualifiers property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRQ.Query.Reshop.Actions.Qualifiers }
                 *     
                 */
                public ItinReshopRQ.Query.Reshop.Actions.Qualifiers getQualifiers() {
                    return qualifiers;
                }

                /**
                 * Sets the value of the qualifiers property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRQ.Query.Reshop.Actions.Qualifiers }
                 *     
                 */
                public void setQualifiers(ItinReshopRQ.Query.Reshop.Actions.Qualifiers value) {
                    this.qualifiers = value;
                }

                /**
                 * Gets the value of the preferences property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinReshopRQ.Query.Reshop.Actions.Preferences }
                 *     
                 */
                public ItinReshopRQ.Query.Reshop.Actions.Preferences getPreferences() {
                    return preferences;
                }

                /**
                 * Sets the value of the preferences property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinReshopRQ.Query.Reshop.Actions.Preferences }
                 *     
                 */
                public void setPreferences(ItinReshopRQ.Query.Reshop.Actions.Preferences value) {
                    this.preferences = value;
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
                 *         &lt;element name="OfferItemSet" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
                 *                 &lt;sequence>
                 *                   &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="SetItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                    "offerItemSet"
                })
                public static class OfferItemSets {

                    @XmlElement(name = "OfferItemSet", required = true)
                    protected List<ItinReshopRQ.Query.Reshop.Actions.OfferItemSets.OfferItemSet> offerItemSet;

                    /**
                     * Gets the value of the offerItemSet property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the offerItemSet property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getOfferItemSet().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ItinReshopRQ.Query.Reshop.Actions.OfferItemSets.OfferItemSet }
                     * 
                     * 
                     */
                    public List<ItinReshopRQ.Query.Reshop.Actions.OfferItemSets.OfferItemSet> getOfferItemSet() {
                        if (offerItemSet == null) {
                            offerItemSet = new ArrayList<ItinReshopRQ.Query.Reshop.Actions.OfferItemSets.OfferItemSet>();
                        }
                        return this.offerItemSet;
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
                     *         &lt;element name="OfferItem" type="{http://www.iata.org/IATA/EDIST}OrderOfferItemType" maxOccurs="unbounded"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="SetItemQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                     *     &lt;/extension>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "offerItem"
                    })
                    public static class OfferItemSet
                        extends KeyWithMetaObjectBaseType
                    {

                        @XmlElement(name = "OfferItem", required = true)
                        protected List<OrderOfferItemType> offerItem;
                        @XmlAttribute(name = "SetItemQuantity")
                        @XmlSchemaType(name = "positiveInteger")
                        protected BigInteger setItemQuantity;

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
                         * Gets the value of the setItemQuantity property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getSetItemQuantity() {
                            return setItemQuantity;
                        }

                        /**
                         * Sets the value of the setItemQuantity property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setSetItemQuantity(BigInteger value) {
                            this.setItemQuantity = value;
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
                 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemDetailType">
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class OrderItems
                    extends OrderItemDetailType
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
                 *         &lt;element name="Preference" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;choice>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlinePreferences"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AlliancePreferences"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightPreferences"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FarePreferences"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PricingMethodPreference"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServicePricingOnlyPreference"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TransferPreferences"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CabinPreferences"/>
                 *                 &lt;/choice>
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
                    "preference"
                })
                public static class Preferences {

                    @XmlElement(name = "Preference", required = true)
                    protected List<ItinReshopRQ.Query.Reshop.Actions.Preferences.Preference> preference;

                    /**
                     * Gets the value of the preference property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the preference property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPreference().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ItinReshopRQ.Query.Reshop.Actions.Preferences.Preference }
                     * 
                     * 
                     */
                    public List<ItinReshopRQ.Query.Reshop.Actions.Preferences.Preference> getPreference() {
                        if (preference == null) {
                            preference = new ArrayList<ItinReshopRQ.Query.Reshop.Actions.Preferences.Preference>();
                        }
                        return this.preference;
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
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlinePreferences"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AlliancePreferences"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightPreferences"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FarePreferences"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PricingMethodPreference"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServicePricingOnlyPreference"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TransferPreferences"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CabinPreferences"/>
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
                        "airlinePreferences",
                        "alliancePreferences",
                        "flightPreferences",
                        "farePreferences",
                        "pricingMethodPreference",
                        "segMaxTimePreferences",
                        "servicePricingOnlyPreference",
                        "transferPreferences",
                        "cabinPreferences"
                    })
                    public static class Preference {

                        @XmlElement(name = "AirlinePreferences")
                        protected AirlinePreferencesType airlinePreferences;
                        @XmlElement(name = "AlliancePreferences")
                        protected AlliancePreferencesType alliancePreferences;
                        @XmlElement(name = "FlightPreferences")
                        protected FlightPreferencesType flightPreferences;
                        @XmlElement(name = "FarePreferences")
                        protected FarePreferencesType farePreferences;
                        @XmlElement(name = "PricingMethodPreference")
                        protected BestPricingPreferencesType pricingMethodPreference;
                        @XmlElement(name = "SegMaxTimePreferences")
                        protected FltSegmentMaxTimePreferencesType segMaxTimePreferences;
                        @XmlElement(name = "ServicePricingOnlyPreference")
                        protected ServicePricingOnlyPreference servicePricingOnlyPreference;
                        @XmlElement(name = "TransferPreferences")
                        protected TransferPreferencesType transferPreferences;
                        @XmlElement(name = "CabinPreferences")
                        protected CabinPreferencesType cabinPreferences;

                        /**
                         * Gets the value of the airlinePreferences property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AirlinePreferencesType }
                         *     
                         */
                        public AirlinePreferencesType getAirlinePreferences() {
                            return airlinePreferences;
                        }

                        /**
                         * Sets the value of the airlinePreferences property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AirlinePreferencesType }
                         *     
                         */
                        public void setAirlinePreferences(AirlinePreferencesType value) {
                            this.airlinePreferences = value;
                        }

                        /**
                         * Gets the value of the alliancePreferences property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AlliancePreferencesType }
                         *     
                         */
                        public AlliancePreferencesType getAlliancePreferences() {
                            return alliancePreferences;
                        }

                        /**
                         * Sets the value of the alliancePreferences property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AlliancePreferencesType }
                         *     
                         */
                        public void setAlliancePreferences(AlliancePreferencesType value) {
                            this.alliancePreferences = value;
                        }

                        /**
                         * Gets the value of the flightPreferences property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link FlightPreferencesType }
                         *     
                         */
                        public FlightPreferencesType getFlightPreferences() {
                            return flightPreferences;
                        }

                        /**
                         * Sets the value of the flightPreferences property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link FlightPreferencesType }
                         *     
                         */
                        public void setFlightPreferences(FlightPreferencesType value) {
                            this.flightPreferences = value;
                        }

                        /**
                         * Gets the value of the farePreferences property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link FarePreferencesType }
                         *     
                         */
                        public FarePreferencesType getFarePreferences() {
                            return farePreferences;
                        }

                        /**
                         * Sets the value of the farePreferences property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link FarePreferencesType }
                         *     
                         */
                        public void setFarePreferences(FarePreferencesType value) {
                            this.farePreferences = value;
                        }

                        /**
                         * Gets the value of the pricingMethodPreference property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BestPricingPreferencesType }
                         *     
                         */
                        public BestPricingPreferencesType getPricingMethodPreference() {
                            return pricingMethodPreference;
                        }

                        /**
                         * Sets the value of the pricingMethodPreference property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BestPricingPreferencesType }
                         *     
                         */
                        public void setPricingMethodPreference(BestPricingPreferencesType value) {
                            this.pricingMethodPreference = value;
                        }

                        /**
                         * Gets the value of the segMaxTimePreferences property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link FltSegmentMaxTimePreferencesType }
                         *     
                         */
                        public FltSegmentMaxTimePreferencesType getSegMaxTimePreferences() {
                            return segMaxTimePreferences;
                        }

                        /**
                         * Sets the value of the segMaxTimePreferences property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link FltSegmentMaxTimePreferencesType }
                         *     
                         */
                        public void setSegMaxTimePreferences(FltSegmentMaxTimePreferencesType value) {
                            this.segMaxTimePreferences = value;
                        }

                        /**
                         * Gets the value of the servicePricingOnlyPreference property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ServicePricingOnlyPreference }
                         *     
                         */
                        public ServicePricingOnlyPreference getServicePricingOnlyPreference() {
                            return servicePricingOnlyPreference;
                        }

                        /**
                         * Sets the value of the servicePricingOnlyPreference property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ServicePricingOnlyPreference }
                         *     
                         */
                        public void setServicePricingOnlyPreference(ServicePricingOnlyPreference value) {
                            this.servicePricingOnlyPreference = value;
                        }

                        /**
                         * Gets the value of the transferPreferences property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TransferPreferencesType }
                         *     
                         */
                        public TransferPreferencesType getTransferPreferences() {
                            return transferPreferences;
                        }

                        /**
                         * Sets the value of the transferPreferences property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TransferPreferencesType }
                         *     
                         */
                        public void setTransferPreferences(TransferPreferencesType value) {
                            this.transferPreferences = value;
                        }

                        /**
                         * Gets the value of the cabinPreferences property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link CabinPreferencesType }
                         *     
                         */
                        public CabinPreferencesType getCabinPreferences() {
                            return cabinPreferences;
                        }

                        /**
                         * Sets the value of the cabinPreferences property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link CabinPreferencesType }
                         *     
                         */
                        public void setCabinPreferences(CabinPreferencesType value) {
                            this.cabinPreferences = value;
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
                 *         &lt;element name="Qualifier" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;choice>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BaggagePricingQualifier"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ExistingOrderQualifier"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardQualifiers"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ProgramQualifiers"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PromotionQualifiers"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatQualifier"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceQualifier"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SocialMediaQualifiers"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialFareQualifiers"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialNeedQualifiers"/>
                 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TripPurposeQualifier"/>
                 *                 &lt;/choice>
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
                    "qualifier"
                })
                public static class Qualifiers {

                    @XmlElement(name = "Qualifier", required = true)
                    protected List<ItinReshopRQ.Query.Reshop.Actions.Qualifiers.Qualifier> qualifier;

                    /**
                     * Gets the value of the qualifier property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the qualifier property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getQualifier().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ItinReshopRQ.Query.Reshop.Actions.Qualifiers.Qualifier }
                     * 
                     * 
                     */
                    public List<ItinReshopRQ.Query.Reshop.Actions.Qualifiers.Qualifier> getQualifier() {
                        if (qualifier == null) {
                            qualifier = new ArrayList<ItinReshopRQ.Query.Reshop.Actions.Qualifiers.Qualifier>();
                        }
                        return this.qualifier;
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
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BaggagePricingQualifier"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ExistingOrderQualifier"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardQualifiers"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ProgramQualifiers"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PromotionQualifiers"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatQualifier"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceQualifier"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SocialMediaQualifiers"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialFareQualifiers"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SpecialNeedQualifiers"/>
                     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TripPurposeQualifier"/>
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
                        "baggagePricingQualifier",
                        "existingOrderQualifier",
                        "paymentCardQualifiers",
                        "programQualifiers",
                        "promotionQualifiers",
                        "seatQualifier",
                        "serviceQualifier",
                        "socialMediaQualifiers",
                        "specialFareQualifiers",
                        "specialNeedQualifiers",
                        "tripPurposeQualifier"
                    })
                    public static class Qualifier {

                        @XmlElement(name = "BaggagePricingQualifier")
                        protected BaggagePricingQualifierType baggagePricingQualifier;
                        @XmlElement(name = "ExistingOrderQualifier")
                        protected ExistingOrderQualifier existingOrderQualifier;
                        @XmlElement(name = "PaymentCardQualifiers")
                        protected CardQualifierType paymentCardQualifiers;
                        @XmlElement(name = "ProgramQualifiers")
                        protected ProgramQualifiers programQualifiers;
                        @XmlElement(name = "PromotionQualifiers")
                        protected PromotionQualifiers promotionQualifiers;
                        @XmlElement(name = "SeatQualifier")
                        protected SeatQualifier seatQualifier;
                        @XmlElement(name = "ServiceQualifier")
                        protected ServiceQualifierPriceType serviceQualifier;
                        @XmlElement(name = "SocialMediaQualifiers")
                        protected SocialQualiferType socialMediaQualifiers;
                        @XmlElement(name = "SpecialFareQualifiers")
                        protected FareQualifierType specialFareQualifiers;
                        @XmlElement(name = "SpecialNeedQualifiers")
                        protected SpecialQualiferType specialNeedQualifiers;
                        @XmlElement(name = "TripPurposeQualifier")
                        @XmlSchemaType(name = "string")
                        protected TripPurposeListType tripPurposeQualifier;

                        /**
                         * Gets the value of the baggagePricingQualifier property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BaggagePricingQualifierType }
                         *     
                         */
                        public BaggagePricingQualifierType getBaggagePricingQualifier() {
                            return baggagePricingQualifier;
                        }

                        /**
                         * Sets the value of the baggagePricingQualifier property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BaggagePricingQualifierType }
                         *     
                         */
                        public void setBaggagePricingQualifier(BaggagePricingQualifierType value) {
                            this.baggagePricingQualifier = value;
                        }

                        /**
                         * Gets the value of the existingOrderQualifier property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ExistingOrderQualifier }
                         *     
                         */
                        public ExistingOrderQualifier getExistingOrderQualifier() {
                            return existingOrderQualifier;
                        }

                        /**
                         * Sets the value of the existingOrderQualifier property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ExistingOrderQualifier }
                         *     
                         */
                        public void setExistingOrderQualifier(ExistingOrderQualifier value) {
                            this.existingOrderQualifier = value;
                        }

                        /**
                         * Gets the value of the paymentCardQualifiers property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link CardQualifierType }
                         *     
                         */
                        public CardQualifierType getPaymentCardQualifiers() {
                            return paymentCardQualifiers;
                        }

                        /**
                         * Sets the value of the paymentCardQualifiers property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link CardQualifierType }
                         *     
                         */
                        public void setPaymentCardQualifiers(CardQualifierType value) {
                            this.paymentCardQualifiers = value;
                        }

                        /**
                         * Gets the value of the programQualifiers property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ProgramQualifiers }
                         *     
                         */
                        public ProgramQualifiers getProgramQualifiers() {
                            return programQualifiers;
                        }

                        /**
                         * Sets the value of the programQualifiers property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ProgramQualifiers }
                         *     
                         */
                        public void setProgramQualifiers(ProgramQualifiers value) {
                            this.programQualifiers = value;
                        }

                        /**
                         * Gets the value of the promotionQualifiers property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link PromotionQualifiers }
                         *     
                         */
                        public PromotionQualifiers getPromotionQualifiers() {
                            return promotionQualifiers;
                        }

                        /**
                         * Sets the value of the promotionQualifiers property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link PromotionQualifiers }
                         *     
                         */
                        public void setPromotionQualifiers(PromotionQualifiers value) {
                            this.promotionQualifiers = value;
                        }

                        /**
                         * Gets the value of the seatQualifier property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link SeatQualifier }
                         *     
                         */
                        public SeatQualifier getSeatQualifier() {
                            return seatQualifier;
                        }

                        /**
                         * Sets the value of the seatQualifier property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SeatQualifier }
                         *     
                         */
                        public void setSeatQualifier(SeatQualifier value) {
                            this.seatQualifier = value;
                        }

                        /**
                         * Gets the value of the serviceQualifier property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ServiceQualifierPriceType }
                         *     
                         */
                        public ServiceQualifierPriceType getServiceQualifier() {
                            return serviceQualifier;
                        }

                        /**
                         * Sets the value of the serviceQualifier property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ServiceQualifierPriceType }
                         *     
                         */
                        public void setServiceQualifier(ServiceQualifierPriceType value) {
                            this.serviceQualifier = value;
                        }

                        /**
                         * Gets the value of the socialMediaQualifiers property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link SocialQualiferType }
                         *     
                         */
                        public SocialQualiferType getSocialMediaQualifiers() {
                            return socialMediaQualifiers;
                        }

                        /**
                         * Sets the value of the socialMediaQualifiers property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SocialQualiferType }
                         *     
                         */
                        public void setSocialMediaQualifiers(SocialQualiferType value) {
                            this.socialMediaQualifiers = value;
                        }

                        /**
                         * Gets the value of the specialFareQualifiers property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link FareQualifierType }
                         *     
                         */
                        public FareQualifierType getSpecialFareQualifiers() {
                            return specialFareQualifiers;
                        }

                        /**
                         * Sets the value of the specialFareQualifiers property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link FareQualifierType }
                         *     
                         */
                        public void setSpecialFareQualifiers(FareQualifierType value) {
                            this.specialFareQualifiers = value;
                        }

                        /**
                         * Gets the value of the specialNeedQualifiers property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link SpecialQualiferType }
                         *     
                         */
                        public SpecialQualiferType getSpecialNeedQualifiers() {
                            return specialNeedQualifiers;
                        }

                        /**
                         * Sets the value of the specialNeedQualifiers property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SpecialQualiferType }
                         *     
                         */
                        public void setSpecialNeedQualifiers(SpecialQualiferType value) {
                            this.specialNeedQualifiers = value;
                        }

                        /**
                         * Gets the value of the tripPurposeQualifier property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TripPurposeListType }
                         *     
                         */
                        public TripPurposeListType getTripPurposeQualifier() {
                            return tripPurposeQualifier;
                        }

                        /**
                         * Sets the value of the tripPurposeQualifier property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TripPurposeListType }
                         *     
                         */
                        public void setTripPurposeQualifier(TripPurposeListType value) {
                            this.tripPurposeQualifier = value;
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
                 *         &lt;element name="TicketDocument" type="{http://www.iata.org/IATA/EDIST}TicketDocumentType" maxOccurs="unbounded" minOccurs="0"/>
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
                    "ticketDocument"
                })
                public static class TicketDocuments {

                    @XmlElement(name = "TicketDocument")
                    protected List<TicketDocumentType> ticketDocument;

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

                }

            }

        }

    }

}
