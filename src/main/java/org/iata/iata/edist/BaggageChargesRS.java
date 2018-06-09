
package org.iata.iata.edist;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
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
 *           &lt;element name="Parameters" type="{http://www.iata.org/IATA/EDIST}BagChargeResParamsType" minOccurs="0"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseIDs" minOccurs="0"/>
 *           &lt;element name="BaggageCharge" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="TotalPrice">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.iata.org/IATA/EDIST}FarePriceDetailType">
 *                             &lt;attribute name="PrepaidInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="OriginDestination" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element ref="{http://www.iata.org/IATA/EDIST}DepartureCode"/>
 *                               &lt;element ref="{http://www.iata.org/IATA/EDIST}ArrivalCode"/>
 *                               &lt;element ref="{http://www.iata.org/IATA/EDIST}CheckedBags" minOccurs="0"/>
 *                               &lt;element ref="{http://www.iata.org/IATA/EDIST}CarryOnBags" minOccurs="0"/>
 *                               &lt;element name="Services" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="Service" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;extension base="{http://www.iata.org/IATA/EDIST}ServiceDetailType">
 *                                               &lt;/extension>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="BaggageDeterminingCarrier" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineID"/>
 *                                         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="USDOT" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.iata.org/IATA/EDIST}BagDisclosureType">
 *                             &lt;sequence>
 *                               &lt;element ref="{http://www.iata.org/IATA/EDIST}BagDisclosureKey" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Metadata" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.iata.org/IATA/EDIST}BagChargeResMetadataType">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="DataLists" type="{http://www.iata.org/IATA/EDIST}DataListType" minOccurs="0"/>
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
    "baggageCharge",
    "dataLists",
    "policies",
    "errors"
})
@XmlRootElement(name = "BaggageChargesRS")
public class BaggageChargesRS {

    @XmlElement(name = "Document")
    protected MsgDocumentType document;
    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "Processing")
    protected ProcessingResultType processing;
    @XmlElement(name = "Parameters")
    protected BagChargeResParamsType parameters;
    @XmlElement(name = "ShoppingResponseIDs")
    protected ShoppingResponseIDType shoppingResponseIDs;
    @XmlElement(name = "BaggageCharge")
    protected BaggageChargesRS.BaggageCharge baggageCharge;
    @XmlElement(name = "DataLists")
    protected DataListType dataLists;
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
     *     {@link BagChargeResParamsType }
     *     
     */
    public BagChargeResParamsType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagChargeResParamsType }
     *     
     */
    public void setParameters(BagChargeResParamsType value) {
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
     * Gets the value of the baggageCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageChargesRS.BaggageCharge }
     *     
     */
    public BaggageChargesRS.BaggageCharge getBaggageCharge() {
        return baggageCharge;
    }

    /**
     * Sets the value of the baggageCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageChargesRS.BaggageCharge }
     *     
     */
    public void setBaggageCharge(BaggageChargesRS.BaggageCharge value) {
        this.baggageCharge = value;
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
     *         &lt;element name="TotalPrice">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}FarePriceDetailType">
     *                 &lt;attribute name="PrepaidInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OriginDestination" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DepartureCode"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ArrivalCode"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CheckedBags" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CarryOnBags" minOccurs="0"/>
     *                   &lt;element name="Services" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Service" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST}ServiceDetailType">
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BaggageDeterminingCarrier" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineID"/>
     *                             &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
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
     *         &lt;element name="USDOT" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}BagDisclosureType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BagDisclosureKey" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Metadata" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}BagChargeResMetadataType">
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
        "totalPrice",
        "originDestination",
        "usdot",
        "metadata"
    })
    public static class BaggageCharge {

        @XmlElement(name = "TotalPrice", required = true)
        protected BaggageChargesRS.BaggageCharge.TotalPrice totalPrice;
        @XmlElement(name = "OriginDestination", required = true)
        protected List<BaggageChargesRS.BaggageCharge.OriginDestination> originDestination;
        @XmlElement(name = "USDOT")
        protected BaggageChargesRS.BaggageCharge.USDOT usdot;
        @XmlElement(name = "Metadata")
        protected BaggageChargesRS.BaggageCharge.Metadata metadata;

        /**
         * Gets the value of the totalPrice property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageChargesRS.BaggageCharge.TotalPrice }
         *     
         */
        public BaggageChargesRS.BaggageCharge.TotalPrice getTotalPrice() {
            return totalPrice;
        }

        /**
         * Sets the value of the totalPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageChargesRS.BaggageCharge.TotalPrice }
         *     
         */
        public void setTotalPrice(BaggageChargesRS.BaggageCharge.TotalPrice value) {
            this.totalPrice = value;
        }

        /**
         * Gets the value of the originDestination property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestination property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestination().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaggageChargesRS.BaggageCharge.OriginDestination }
         * 
         * 
         */
        public List<BaggageChargesRS.BaggageCharge.OriginDestination> getOriginDestination() {
            if (originDestination == null) {
                originDestination = new ArrayList<BaggageChargesRS.BaggageCharge.OriginDestination>();
            }
            return this.originDestination;
        }

        /**
         * Gets the value of the usdot property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageChargesRS.BaggageCharge.USDOT }
         *     
         */
        public BaggageChargesRS.BaggageCharge.USDOT getUSDOT() {
            return usdot;
        }

        /**
         * Sets the value of the usdot property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageChargesRS.BaggageCharge.USDOT }
         *     
         */
        public void setUSDOT(BaggageChargesRS.BaggageCharge.USDOT value) {
            this.usdot = value;
        }

        /**
         * Gets the value of the metadata property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageChargesRS.BaggageCharge.Metadata }
         *     
         */
        public BaggageChargesRS.BaggageCharge.Metadata getMetadata() {
            return metadata;
        }

        /**
         * Sets the value of the metadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageChargesRS.BaggageCharge.Metadata }
         *     
         */
        public void setMetadata(BaggageChargesRS.BaggageCharge.Metadata value) {
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
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}BagChargeResMetadataType">
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
            extends BagChargeResMetadataType
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DepartureCode"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ArrivalCode"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CheckedBags" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CarryOnBags" minOccurs="0"/>
         *         &lt;element name="Services" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Service" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}ServiceDetailType">
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BaggageDeterminingCarrier" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineID"/>
         *                   &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
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
            "departureCode",
            "arrivalCode",
            "checkedBags",
            "carryOnBags",
            "services",
            "baggageDeterminingCarrier"
        })
        public static class OriginDestination {

            @XmlElement(name = "DepartureCode", required = true)
            protected DepartureCode departureCode;
            @XmlElement(name = "ArrivalCode", required = true)
            protected ArrivalCode arrivalCode;
            @XmlElement(name = "CheckedBags")
            protected CheckedBags checkedBags;
            @XmlElement(name = "CarryOnBags")
            protected CarryOnBags carryOnBags;
            @XmlElement(name = "Services")
            protected BaggageChargesRS.BaggageCharge.OriginDestination.Services services;
            @XmlElement(name = "BaggageDeterminingCarrier")
            protected BaggageChargesRS.BaggageCharge.OriginDestination.BaggageDeterminingCarrier baggageDeterminingCarrier;

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

            /**
             * Gets the value of the checkedBags property.
             * 
             * @return
             *     possible object is
             *     {@link CheckedBags }
             *     
             */
            public CheckedBags getCheckedBags() {
                return checkedBags;
            }

            /**
             * Sets the value of the checkedBags property.
             * 
             * @param value
             *     allowed object is
             *     {@link CheckedBags }
             *     
             */
            public void setCheckedBags(CheckedBags value) {
                this.checkedBags = value;
            }

            /**
             * Gets the value of the carryOnBags property.
             * 
             * @return
             *     possible object is
             *     {@link CarryOnBags }
             *     
             */
            public CarryOnBags getCarryOnBags() {
                return carryOnBags;
            }

            /**
             * Sets the value of the carryOnBags property.
             * 
             * @param value
             *     allowed object is
             *     {@link CarryOnBags }
             *     
             */
            public void setCarryOnBags(CarryOnBags value) {
                this.carryOnBags = value;
            }

            /**
             * Gets the value of the services property.
             * 
             * @return
             *     possible object is
             *     {@link BaggageChargesRS.BaggageCharge.OriginDestination.Services }
             *     
             */
            public BaggageChargesRS.BaggageCharge.OriginDestination.Services getServices() {
                return services;
            }

            /**
             * Sets the value of the services property.
             * 
             * @param value
             *     allowed object is
             *     {@link BaggageChargesRS.BaggageCharge.OriginDestination.Services }
             *     
             */
            public void setServices(BaggageChargesRS.BaggageCharge.OriginDestination.Services value) {
                this.services = value;
            }

            /**
             * Gets the value of the baggageDeterminingCarrier property.
             * 
             * @return
             *     possible object is
             *     {@link BaggageChargesRS.BaggageCharge.OriginDestination.BaggageDeterminingCarrier }
             *     
             */
            public BaggageChargesRS.BaggageCharge.OriginDestination.BaggageDeterminingCarrier getBaggageDeterminingCarrier() {
                return baggageDeterminingCarrier;
            }

            /**
             * Sets the value of the baggageDeterminingCarrier property.
             * 
             * @param value
             *     allowed object is
             *     {@link BaggageChargesRS.BaggageCharge.OriginDestination.BaggageDeterminingCarrier }
             *     
             */
            public void setBaggageDeterminingCarrier(BaggageChargesRS.BaggageCharge.OriginDestination.BaggageDeterminingCarrier value) {
                this.baggageDeterminingCarrier = value;
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
             *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
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
                "name"
            })
            public static class BaggageDeterminingCarrier {

                @XmlElement(name = "AirlineID", required = true)
                protected AirlineID airlineID;
                @XmlElement(name = "Name")
                protected String name;

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
             *         &lt;element name="Service" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.iata.org/IATA/EDIST}ServiceDetailType">
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
                "service"
            })
            public static class Services {

                @XmlElement(name = "Service", required = true)
                protected List<BaggageChargesRS.BaggageCharge.OriginDestination.Services.Service> service;

                /**
                 * Gets the value of the service property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the service property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getService().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BaggageChargesRS.BaggageCharge.OriginDestination.Services.Service }
                 * 
                 * 
                 */
                public List<BaggageChargesRS.BaggageCharge.OriginDestination.Services.Service> getService() {
                    if (service == null) {
                        service = new ArrayList<BaggageChargesRS.BaggageCharge.OriginDestination.Services.Service>();
                    }
                    return this.service;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}ServiceDetailType">
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Service
                    extends ServiceDetailType
                {


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
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}FarePriceDetailType">
         *       &lt;attribute name="PrepaidInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TotalPrice
            extends FarePriceDetailType
        {

            @XmlAttribute(name = "PrepaidInd")
            protected Boolean prepaidInd;

            /**
             * Gets the value of the prepaidInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPrepaidInd() {
                return prepaidInd;
            }

            /**
             * Sets the value of the prepaidInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPrepaidInd(Boolean value) {
                this.prepaidInd = value;
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
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}BagDisclosureType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BagDisclosureKey" minOccurs="0"/>
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
            "bagDisclosureKey"
        })
        public static class USDOT
            extends BagDisclosureType
        {

            @XmlElement(name = "BagDisclosureKey")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String bagDisclosureKey;

            /**
             * Gets the value of the bagDisclosureKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBagDisclosureKey() {
                return bagDisclosureKey;
            }

            /**
             * Sets the value of the bagDisclosureKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBagDisclosureKey(String value) {
                this.bagDisclosureKey = value;
            }

        }

    }

}
