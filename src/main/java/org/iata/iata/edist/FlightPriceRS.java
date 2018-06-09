
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
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}Document"/>
 *           &lt;element name="Success" type="{http://www.iata.org/IATA/EDIST}SuccessType"/>
 *           &lt;element name="Warnings" type="{http://www.iata.org/IATA/EDIST}WarningsType" minOccurs="0"/>
 *           &lt;element name="Processing" type="{http://www.iata.org/IATA/EDIST}ProcessingResultType" minOccurs="0"/>
 *           &lt;element name="Parameters" type="{http://www.iata.org/IATA/EDIST}FltPriceResParamsType" minOccurs="0"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseIDs" minOccurs="0"/>
 *           &lt;element name="PricedFlightOffers" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}PricedFlightOffer" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="AirlineOffers" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="AirlineOffer" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType">
 *                             &lt;sequence>
 *                               &lt;element ref="{http://www.iata.org/IATA/EDIST}PricedOffer"/>
 *                             &lt;/sequence>
 *                           &lt;/extension>
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
 *           &lt;element name="DataLists" type="{http://www.iata.org/IATA/EDIST}DataListType" minOccurs="0"/>
 *           &lt;element name="Metadata" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.iata.org/IATA/EDIST}FltPriceResMetadataType">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
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
    "processing",
    "parameters",
    "shoppingResponseIDs",
    "pricedFlightOffers",
    "airlineOffers",
    "payments",
    "promotions",
    "commission",
    "dataLists",
    "metadata",
    "policies",
    "errors"
})
@XmlRootElement(name = "FlightPriceRS")
public class FlightPriceRS {

    @XmlElement(name = "Document")
    protected MsgDocumentType document;
    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "Processing")
    protected ProcessingResultType processing;
    @XmlElement(name = "Parameters")
    protected FltPriceResParamsType parameters;
    @XmlElement(name = "ShoppingResponseIDs")
    protected ShoppingResponseIDType shoppingResponseIDs;
    @XmlElement(name = "PricedFlightOffers")
    protected FlightPriceRS.PricedFlightOffers pricedFlightOffers;
    @XmlElement(name = "AirlineOffers")
    protected FlightPriceRS.AirlineOffers airlineOffers;
    @XmlElement(name = "Payments")
    protected FlightPriceRS.Payments payments;
    @XmlElement(name = "Promotions")
    protected FlightPriceRS.Promotions promotions;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "DataLists")
    protected DataListType dataLists;
    @XmlElement(name = "Metadata")
    protected FlightPriceRS.Metadata metadata;
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
     * Gets the value of the processing property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResultType }
     *     
     */
    public ProcessingResultType getProcessing() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResultType }
     *     
     */
    public void setProcessing(ProcessingResultType value) {
        this.processing = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link FltPriceResParamsType }
     *     
     */
    public FltPriceResParamsType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltPriceResParamsType }
     *     
     */
    public void setParameters(FltPriceResParamsType value) {
        this.parameters = value;
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
     * Gets the value of the pricedFlightOffers property.
     * 
     * @return
     *     possible object is
     *     {@link FlightPriceRS.PricedFlightOffers }
     *     
     */
    public FlightPriceRS.PricedFlightOffers getPricedFlightOffers() {
        return pricedFlightOffers;
    }

    /**
     * Sets the value of the pricedFlightOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPriceRS.PricedFlightOffers }
     *     
     */
    public void setPricedFlightOffers(FlightPriceRS.PricedFlightOffers value) {
        this.pricedFlightOffers = value;
    }

    /**
     * Gets the value of the airlineOffers property.
     * 
     * @return
     *     possible object is
     *     {@link FlightPriceRS.AirlineOffers }
     *     
     */
    public FlightPriceRS.AirlineOffers getAirlineOffers() {
        return airlineOffers;
    }

    /**
     * Sets the value of the airlineOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPriceRS.AirlineOffers }
     *     
     */
    public void setAirlineOffers(FlightPriceRS.AirlineOffers value) {
        this.airlineOffers = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link FlightPriceRS.Payments }
     *     
     */
    public FlightPriceRS.Payments getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPriceRS.Payments }
     *     
     */
    public void setPayments(FlightPriceRS.Payments value) {
        this.payments = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link FlightPriceRS.Promotions }
     *     
     */
    public FlightPriceRS.Promotions getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPriceRS.Promotions }
     *     
     */
    public void setPromotions(FlightPriceRS.Promotions value) {
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
     *     {@link FlightPriceRS.Metadata }
     *     
     */
    public FlightPriceRS.Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPriceRS.Metadata }
     *     
     */
    public void setMetadata(FlightPriceRS.Metadata value) {
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AirlineOffer" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PricedOffer"/>
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
        "airlineOffer"
    })
    public static class AirlineOffers {

        @XmlElement(name = "AirlineOffer", required = true)
        protected List<FlightPriceRS.AirlineOffers.AirlineOffer> airlineOffer;

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
         * {@link FlightPriceRS.AirlineOffers.AirlineOffer }
         * 
         * 
         */
        public List<FlightPriceRS.AirlineOffers.AirlineOffer> getAirlineOffer() {
            if (airlineOffer == null) {
                airlineOffer = new ArrayList<FlightPriceRS.AirlineOffers.AirlineOffer>();
            }
            return this.airlineOffer;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PricedOffer"/>
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

            @XmlElement(name = "PricedOffer", required = true)
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}FltPriceResMetadataType">
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
        extends FltPriceResMetadataType
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PricedFlightOffer" maxOccurs="unbounded"/>
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
        "pricedFlightOffer"
    })
    public static class PricedFlightOffers {

        @XmlElement(name = "PricedFlightOffer", required = true)
        protected List<PricedFlightOffer> pricedFlightOffer;

        /**
         * Priced Flight Offer detail.
         * 
         * Notes:
         *  1. A Priced Flight Offer may contain Branded Fare information. If it is a Branded Fare, Price Class-association will be specified.
         * 
         *  2. Additionally, Lead Pricing Calendar fares (prior to and/ or after the specified departure date) may be specified by passenger type.Gets the value of the pricedFlightOffer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pricedFlightOffer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPricedFlightOffer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PricedFlightOffer }
         * 
         * 
         */
        public List<PricedFlightOffer> getPricedFlightOffer() {
            if (pricedFlightOffer == null) {
                pricedFlightOffer = new ArrayList<PricedFlightOffer>();
            }
            return this.pricedFlightOffer;
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
