
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
 *         &lt;element name="Parameters" type="{http://www.iata.org/IATA/EDIST}AirShopReqParamsType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Travelers"/>
 *         &lt;element name="CoreQuery">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Affinity"/>
 *                   &lt;element name="OriginDestinations" type="{http://www.iata.org/IATA/EDIST}AirShopReqAttributeQueryType"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightSpecific"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseIDs"/>
 *                 &lt;/choice>
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
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}FarePreferences"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightPreferences"/>
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
 *         &lt;element name="Metadata" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}AirShopReqMetadataType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Policies" minOccurs="0"/>
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
    "parameters",
    "travelers",
    "coreQuery",
    "qualifiers",
    "preferences",
    "metadata",
    "policies"
})
@XmlRootElement(name = "AirShoppingRQ")
public class AirShoppingRQ {

    @XmlElement(name = "PointOfSale")
    protected PointOfSaleType pointOfSale;
    @XmlElement(name = "Document", required = true)
    protected MsgDocumentType document;
    @XmlElement(name = "Party", required = true)
    protected MsgPartiesType party;
    @XmlElement(name = "Parameters")
    protected AirShopReqParamsType parameters;
    @XmlElement(name = "Travelers", required = true)
    protected Travelers travelers;
    @XmlElement(name = "CoreQuery", required = true)
    protected AirShoppingRQ.CoreQuery coreQuery;
    @XmlElement(name = "Qualifiers")
    protected AirShoppingRQ.Qualifiers qualifiers;
    @XmlElement(name = "Preferences")
    protected AirShoppingRQ.Preferences preferences;
    @XmlElement(name = "Metadata")
    protected AirShoppingRQ.Metadata metadata;
    @XmlElement(name = "Policies")
    protected Policies policies;
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
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link AirShopReqParamsType }
     *     
     */
    public AirShopReqParamsType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShopReqParamsType }
     *     
     */
    public void setParameters(AirShopReqParamsType value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the travelers property.
     * 
     * @return
     *     possible object is
     *     {@link Travelers }
     *     
     */
    public Travelers getTravelers() {
        return travelers;
    }

    /**
     * Sets the value of the travelers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Travelers }
     *     
     */
    public void setTravelers(Travelers value) {
        this.travelers = value;
    }

    /**
     * Gets the value of the coreQuery property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRQ.CoreQuery }
     *     
     */
    public AirShoppingRQ.CoreQuery getCoreQuery() {
        return coreQuery;
    }

    /**
     * Sets the value of the coreQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRQ.CoreQuery }
     *     
     */
    public void setCoreQuery(AirShoppingRQ.CoreQuery value) {
        this.coreQuery = value;
    }

    /**
     * Gets the value of the qualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRQ.Qualifiers }
     *     
     */
    public AirShoppingRQ.Qualifiers getQualifiers() {
        return qualifiers;
    }

    /**
     * Sets the value of the qualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRQ.Qualifiers }
     *     
     */
    public void setQualifiers(AirShoppingRQ.Qualifiers value) {
        this.qualifiers = value;
    }

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRQ.Preferences }
     *     
     */
    public AirShoppingRQ.Preferences getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRQ.Preferences }
     *     
     */
    public void setPreferences(AirShoppingRQ.Preferences value) {
        this.preferences = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link AirShoppingRQ.Metadata }
     *     
     */
    public AirShoppingRQ.Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShoppingRQ.Metadata }
     *     
     */
    public void setMetadata(AirShoppingRQ.Metadata value) {
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Affinity"/>
     *         &lt;element name="OriginDestinations" type="{http://www.iata.org/IATA/EDIST}AirShopReqAttributeQueryType"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightSpecific"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseIDs"/>
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
        "affinity",
        "originDestinations",
        "flightSpecific",
        "shoppingResponseIDs"
    })
    public static class CoreQuery {

        @XmlElement(name = "Affinity")
        protected AirShopReqAffinityQueryType affinity;
        @XmlElement(name = "OriginDestinations")
        protected AirShopReqAttributeQueryType originDestinations;
        @XmlElement(name = "FlightSpecific")
        protected AirShopFlightSpecificType flightSpecific;
        @XmlElement(name = "ShoppingResponseIDs")
        protected ShoppingResponseIDType shoppingResponseIDs;

        /**
         * Gets the value of the affinity property.
         * 
         * @return
         *     possible object is
         *     {@link AirShopReqAffinityQueryType }
         *     
         */
        public AirShopReqAffinityQueryType getAffinity() {
            return affinity;
        }

        /**
         * Sets the value of the affinity property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShopReqAffinityQueryType }
         *     
         */
        public void setAffinity(AirShopReqAffinityQueryType value) {
            this.affinity = value;
        }

        /**
         * Gets the value of the originDestinations property.
         * 
         * @return
         *     possible object is
         *     {@link AirShopReqAttributeQueryType }
         *     
         */
        public AirShopReqAttributeQueryType getOriginDestinations() {
            return originDestinations;
        }

        /**
         * Sets the value of the originDestinations property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShopReqAttributeQueryType }
         *     
         */
        public void setOriginDestinations(AirShopReqAttributeQueryType value) {
            this.originDestinations = value;
        }

        /**
         * Gets the value of the flightSpecific property.
         * 
         * @return
         *     possible object is
         *     {@link AirShopFlightSpecificType }
         *     
         */
        public AirShopFlightSpecificType getFlightSpecific() {
            return flightSpecific;
        }

        /**
         * Sets the value of the flightSpecific property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShopFlightSpecificType }
         *     
         */
        public void setFlightSpecific(AirShopFlightSpecificType value) {
            this.flightSpecific = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AirShopReqMetadataType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Metadata
        extends AirShopReqMetadataType
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
     *         &lt;element name="Preference" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlinePreferences"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AlliancePreferences"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FarePreferences"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightPreferences"/>
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
        protected List<AirShoppingRQ.Preferences.Preference> preference;

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
         * {@link AirShoppingRQ.Preferences.Preference }
         * 
         * 
         */
        public List<AirShoppingRQ.Preferences.Preference> getPreference() {
            if (preference == null) {
                preference = new ArrayList<AirShoppingRQ.Preferences.Preference>();
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FarePreferences"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightPreferences"/>
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
            "farePreferences",
            "flightPreferences",
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
            @XmlElement(name = "FarePreferences")
            protected FarePreferencesType farePreferences;
            @XmlElement(name = "FlightPreferences")
            protected FlightPreferencesType flightPreferences;
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
        protected List<AirShoppingRQ.Qualifiers.Qualifier> qualifier;

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
         * {@link AirShoppingRQ.Qualifiers.Qualifier }
         * 
         * 
         */
        public List<AirShoppingRQ.Qualifiers.Qualifier> getQualifier() {
            if (qualifier == null) {
                qualifier = new ArrayList<AirShoppingRQ.Qualifiers.Qualifier>();
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

}
