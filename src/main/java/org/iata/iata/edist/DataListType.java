
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Common NDC Data List choices.
 * 
 * <p>Java class for DataListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AnonymousTravelerList" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}RecognizedTravelerList" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BagDisclosureList" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CarryOnAllowanceList" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CheckedBagAllowanceList" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ClassOfServiceList" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ContentSourceList" minOccurs="0"/>
 *         &lt;element name="DescriptionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Description"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DisclosureList" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareList" minOccurs="0"/>
 *         &lt;element name="FlightSegmentList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightSegment" type="{http://www.iata.org/IATA/EDIST}ListOfFlightSegmentType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Flight" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Journey" type="{http://www.iata.org/IATA/EDIST}TotalJourneyType" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
 *                           &lt;attribute name="FlightKey" type="{http://www.iata.org/IATA/EDIST}KeyIdentifier" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OriginDestinationList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestination" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}InstructionsList" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MediaList" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PenaltyList" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceClassList" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceBundleList" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceList" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TermsList" minOccurs="0"/>
 *         &lt;element name="SeatList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Seats" type="{http://www.iata.org/IATA/EDIST}ListOfSeatType" maxOccurs="unbounded"/>
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
@XmlType(name = "DataListType", propOrder = {
    "anonymousTravelerList",
    "recognizedTravelerList",
    "bagDisclosureList",
    "carryOnAllowanceList",
    "checkedBagAllowanceList",
    "classOfServiceList",
    "contentSourceList",
    "descriptionList",
    "disclosureList",
    "fareList",
    "flightSegmentList",
    "flightList",
    "originDestinationList",
    "instructionsList",
    "mediaList",
    "penaltyList",
    "priceClassList",
    "serviceBundleList",
    "serviceList",
    "termsList",
    "seatList"
})
@XmlSeeAlso({
    org.iata.iata.edist.InvGuaranteeRQ.DataLists.class,
    org.iata.iata.edist.FlightPriceRQ.DataLists.class,
    org.iata.iata.edist.AirShoppingRS.DataLists.class
})
public class DataListType {

    @XmlElement(name = "AnonymousTravelerList")
    protected AnonymousTravelerList anonymousTravelerList;
    @XmlElement(name = "RecognizedTravelerList")
    protected RecognizedTravelerList recognizedTravelerList;
    @XmlElement(name = "BagDisclosureList")
    protected ListOfBagDisclosureType bagDisclosureList;
    @XmlElement(name = "CarryOnAllowanceList")
    protected ListOfCarryOnAllowanceType carryOnAllowanceList;
    @XmlElement(name = "CheckedBagAllowanceList")
    protected ListOfBagAllowanceType checkedBagAllowanceList;
    @XmlElement(name = "ClassOfServiceList")
    protected ListOfClassOfServiceType classOfServiceList;
    @XmlElement(name = "ContentSourceList")
    protected ListOfContentSourceType contentSourceList;
    @XmlElement(name = "DescriptionList")
    protected DataListType.DescriptionList descriptionList;
    @XmlElement(name = "DisclosureList")
    protected ListOfDisclosureType disclosureList;
    @XmlElement(name = "FareList")
    protected FareList fareList;
    @XmlElement(name = "FlightSegmentList")
    protected DataListType.FlightSegmentList flightSegmentList;
    @XmlElement(name = "FlightList")
    protected DataListType.FlightList flightList;
    @XmlElement(name = "OriginDestinationList")
    protected DataListType.OriginDestinationList originDestinationList;
    @XmlElement(name = "InstructionsList")
    protected ListOfOfferInstructionsType instructionsList;
    @XmlElement(name = "MediaList")
    protected ListOfMediaType mediaList;
    @XmlElement(name = "PenaltyList")
    protected ListOfOfferPenaltyType penaltyList;
    @XmlElement(name = "PriceClassList")
    protected ListOfPriceClassType priceClassList;
    @XmlElement(name = "ServiceBundleList")
    protected ListOfServiceBundleType serviceBundleList;
    @XmlElement(name = "ServiceList")
    protected ServiceList serviceList;
    @XmlElement(name = "TermsList")
    protected ListOfOfferTermsType termsList;
    @XmlElement(name = "SeatList")
    protected DataListType.SeatList seatList;

    /**
     * Gets the value of the anonymousTravelerList property.
     * 
     * @return
     *     possible object is
     *     {@link AnonymousTravelerList }
     *     
     */
    public AnonymousTravelerList getAnonymousTravelerList() {
        return anonymousTravelerList;
    }

    /**
     * Sets the value of the anonymousTravelerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnonymousTravelerList }
     *     
     */
    public void setAnonymousTravelerList(AnonymousTravelerList value) {
        this.anonymousTravelerList = value;
    }

    /**
     * Gets the value of the recognizedTravelerList property.
     * 
     * @return
     *     possible object is
     *     {@link RecognizedTravelerList }
     *     
     */
    public RecognizedTravelerList getRecognizedTravelerList() {
        return recognizedTravelerList;
    }

    /**
     * Sets the value of the recognizedTravelerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecognizedTravelerList }
     *     
     */
    public void setRecognizedTravelerList(RecognizedTravelerList value) {
        this.recognizedTravelerList = value;
    }

    /**
     * Gets the value of the bagDisclosureList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfBagDisclosureType }
     *     
     */
    public ListOfBagDisclosureType getBagDisclosureList() {
        return bagDisclosureList;
    }

    /**
     * Sets the value of the bagDisclosureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfBagDisclosureType }
     *     
     */
    public void setBagDisclosureList(ListOfBagDisclosureType value) {
        this.bagDisclosureList = value;
    }

    /**
     * Gets the value of the carryOnAllowanceList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfCarryOnAllowanceType }
     *     
     */
    public ListOfCarryOnAllowanceType getCarryOnAllowanceList() {
        return carryOnAllowanceList;
    }

    /**
     * Sets the value of the carryOnAllowanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfCarryOnAllowanceType }
     *     
     */
    public void setCarryOnAllowanceList(ListOfCarryOnAllowanceType value) {
        this.carryOnAllowanceList = value;
    }

    /**
     * Gets the value of the checkedBagAllowanceList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfBagAllowanceType }
     *     
     */
    public ListOfBagAllowanceType getCheckedBagAllowanceList() {
        return checkedBagAllowanceList;
    }

    /**
     * Sets the value of the checkedBagAllowanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfBagAllowanceType }
     *     
     */
    public void setCheckedBagAllowanceList(ListOfBagAllowanceType value) {
        this.checkedBagAllowanceList = value;
    }

    /**
     * Gets the value of the classOfServiceList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfClassOfServiceType }
     *     
     */
    public ListOfClassOfServiceType getClassOfServiceList() {
        return classOfServiceList;
    }

    /**
     * Sets the value of the classOfServiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfClassOfServiceType }
     *     
     */
    public void setClassOfServiceList(ListOfClassOfServiceType value) {
        this.classOfServiceList = value;
    }

    /**
     * Gets the value of the contentSourceList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContentSourceType }
     *     
     */
    public ListOfContentSourceType getContentSourceList() {
        return contentSourceList;
    }

    /**
     * Sets the value of the contentSourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContentSourceType }
     *     
     */
    public void setContentSourceList(ListOfContentSourceType value) {
        this.contentSourceList = value;
    }

    /**
     * Gets the value of the descriptionList property.
     * 
     * @return
     *     possible object is
     *     {@link DataListType.DescriptionList }
     *     
     */
    public DataListType.DescriptionList getDescriptionList() {
        return descriptionList;
    }

    /**
     * Sets the value of the descriptionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataListType.DescriptionList }
     *     
     */
    public void setDescriptionList(DataListType.DescriptionList value) {
        this.descriptionList = value;
    }

    /**
     * Gets the value of the disclosureList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDisclosureType }
     *     
     */
    public ListOfDisclosureType getDisclosureList() {
        return disclosureList;
    }

    /**
     * Sets the value of the disclosureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDisclosureType }
     *     
     */
    public void setDisclosureList(ListOfDisclosureType value) {
        this.disclosureList = value;
    }

    /**
     * Gets the value of the fareList property.
     * 
     * @return
     *     possible object is
     *     {@link FareList }
     *     
     */
    public FareList getFareList() {
        return fareList;
    }

    /**
     * Sets the value of the fareList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareList }
     *     
     */
    public void setFareList(FareList value) {
        this.fareList = value;
    }

    /**
     * Gets the value of the flightSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link DataListType.FlightSegmentList }
     *     
     */
    public DataListType.FlightSegmentList getFlightSegmentList() {
        return flightSegmentList;
    }

    /**
     * Sets the value of the flightSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataListType.FlightSegmentList }
     *     
     */
    public void setFlightSegmentList(DataListType.FlightSegmentList value) {
        this.flightSegmentList = value;
    }

    /**
     * Gets the value of the flightList property.
     * 
     * @return
     *     possible object is
     *     {@link DataListType.FlightList }
     *     
     */
    public DataListType.FlightList getFlightList() {
        return flightList;
    }

    /**
     * Sets the value of the flightList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataListType.FlightList }
     *     
     */
    public void setFlightList(DataListType.FlightList value) {
        this.flightList = value;
    }

    /**
     * Gets the value of the originDestinationList property.
     * 
     * @return
     *     possible object is
     *     {@link DataListType.OriginDestinationList }
     *     
     */
    public DataListType.OriginDestinationList getOriginDestinationList() {
        return originDestinationList;
    }

    /**
     * Sets the value of the originDestinationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataListType.OriginDestinationList }
     *     
     */
    public void setOriginDestinationList(DataListType.OriginDestinationList value) {
        this.originDestinationList = value;
    }

    /**
     * Gets the value of the instructionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOfferInstructionsType }
     *     
     */
    public ListOfOfferInstructionsType getInstructionsList() {
        return instructionsList;
    }

    /**
     * Sets the value of the instructionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOfferInstructionsType }
     *     
     */
    public void setInstructionsList(ListOfOfferInstructionsType value) {
        this.instructionsList = value;
    }

    /**
     * Gets the value of the mediaList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfMediaType }
     *     
     */
    public ListOfMediaType getMediaList() {
        return mediaList;
    }

    /**
     * Sets the value of the mediaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfMediaType }
     *     
     */
    public void setMediaList(ListOfMediaType value) {
        this.mediaList = value;
    }

    /**
     * Gets the value of the penaltyList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOfferPenaltyType }
     *     
     */
    public ListOfOfferPenaltyType getPenaltyList() {
        return penaltyList;
    }

    /**
     * Sets the value of the penaltyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOfferPenaltyType }
     *     
     */
    public void setPenaltyList(ListOfOfferPenaltyType value) {
        this.penaltyList = value;
    }

    /**
     * Gets the value of the priceClassList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfPriceClassType }
     *     
     */
    public ListOfPriceClassType getPriceClassList() {
        return priceClassList;
    }

    /**
     * Sets the value of the priceClassList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfPriceClassType }
     *     
     */
    public void setPriceClassList(ListOfPriceClassType value) {
        this.priceClassList = value;
    }

    /**
     * Gets the value of the serviceBundleList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfServiceBundleType }
     *     
     */
    public ListOfServiceBundleType getServiceBundleList() {
        return serviceBundleList;
    }

    /**
     * Sets the value of the serviceBundleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfServiceBundleType }
     *     
     */
    public void setServiceBundleList(ListOfServiceBundleType value) {
        this.serviceBundleList = value;
    }

    /**
     * Gets the value of the serviceList property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceList }
     *     
     */
    public ServiceList getServiceList() {
        return serviceList;
    }

    /**
     * Sets the value of the serviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceList }
     *     
     */
    public void setServiceList(ServiceList value) {
        this.serviceList = value;
    }

    /**
     * Gets the value of the termsList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOfferTermsType }
     *     
     */
    public ListOfOfferTermsType getTermsList() {
        return termsList;
    }

    /**
     * Sets the value of the termsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOfferTermsType }
     *     
     */
    public void setTermsList(ListOfOfferTermsType value) {
        this.termsList = value;
    }

    /**
     * Gets the value of the seatList property.
     * 
     * @return
     *     possible object is
     *     {@link DataListType.SeatList }
     *     
     */
    public DataListType.SeatList getSeatList() {
        return seatList;
    }

    /**
     * Sets the value of the seatList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataListType.SeatList }
     *     
     */
    public void setSeatList(DataListType.SeatList value) {
        this.seatList = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Description"/>
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
        "description"
    })
    public static class DescriptionList {

        @XmlElement(name = "Description", required = true)
        protected Description description;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link Description }
         *     
         */
        public Description getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link Description }
         *     
         */
        public void setDescription(Description value) {
            this.description = value;
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
     *         &lt;element name="Flight" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Journey" type="{http://www.iata.org/IATA/EDIST}TotalJourneyType" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
     *                 &lt;attribute name="FlightKey" type="{http://www.iata.org/IATA/EDIST}KeyIdentifier" />
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
        "flight"
    })
    public static class FlightList {

        @XmlElement(name = "Flight", required = true)
        protected List<DataListType.FlightList.Flight> flight;

        /**
         * Gets the value of the flight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataListType.FlightList.Flight }
         * 
         * 
         */
        public List<DataListType.FlightList.Flight> getFlight() {
            if (flight == null) {
                flight = new ArrayList<DataListType.FlightList.Flight>();
            }
            return this.flight;
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
         *         &lt;element name="Journey" type="{http://www.iata.org/IATA/EDIST}TotalJourneyType" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
         *       &lt;attribute name="FlightKey" type="{http://www.iata.org/IATA/EDIST}KeyIdentifier" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "journey",
            "segmentReferences"
        })
        public static class Flight {

            @XmlElement(name = "Journey")
            protected TotalJourneyType journey;
            @XmlElement(name = "SegmentReferences", required = true)
            protected SegmentReferences segmentReferences;
            @XmlAttribute(name = "FlightKey")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            protected String flightKey;
            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;

            /**
             * Gets the value of the journey property.
             * 
             * @return
             *     possible object is
             *     {@link TotalJourneyType }
             *     
             */
            public TotalJourneyType getJourney() {
                return journey;
            }

            /**
             * Sets the value of the journey property.
             * 
             * @param value
             *     allowed object is
             *     {@link TotalJourneyType }
             *     
             */
            public void setJourney(TotalJourneyType value) {
                this.journey = value;
            }

            /**
             * Gets the value of the segmentReferences property.
             * 
             * @return
             *     possible object is
             *     {@link SegmentReferences }
             *     
             */
            public SegmentReferences getSegmentReferences() {
                return segmentReferences;
            }

            /**
             * Sets the value of the segmentReferences property.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentReferences }
             *     
             */
            public void setSegmentReferences(SegmentReferences value) {
                this.segmentReferences = value;
            }

            /**
             * Gets the value of the flightKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightKey() {
                return flightKey;
            }

            /**
             * Sets the value of the flightKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightKey(String value) {
                this.flightKey = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FlightSegment" type="{http://www.iata.org/IATA/EDIST}ListOfFlightSegmentType" maxOccurs="unbounded"/>
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
        "flightSegment"
    })
    public static class FlightSegmentList {

        @XmlElement(name = "FlightSegment", required = true)
        protected List<ListOfFlightSegmentType> flightSegment;

        /**
         * Gets the value of the flightSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListOfFlightSegmentType }
         * 
         * 
         */
        public List<ListOfFlightSegmentType> getFlightSegment() {
            if (flightSegment == null) {
                flightSegment = new ArrayList<ListOfFlightSegmentType>();
            }
            return this.flightSegment;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestination" maxOccurs="unbounded"/>
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
        "originDestination"
    })
    public static class OriginDestinationList {

        @XmlElement(name = "OriginDestination", required = true)
        protected List<OriginDestination> originDestination;

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
         * {@link OriginDestination }
         * 
         * 
         */
        public List<OriginDestination> getOriginDestination() {
            if (originDestination == null) {
                originDestination = new ArrayList<OriginDestination>();
            }
            return this.originDestination;
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
     *         &lt;element name="Seats" type="{http://www.iata.org/IATA/EDIST}ListOfSeatType" maxOccurs="unbounded"/>
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
        "seats"
    })
    public static class SeatList {

        @XmlElement(name = "Seats", required = true)
        protected List<ListOfSeatType> seats;

        /**
         * Gets the value of the seats property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seats property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeats().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListOfSeatType }
         * 
         * 
         */
        public List<ListOfSeatType> getSeats() {
            if (seats == null) {
                seats = new ArrayList<ListOfSeatType>();
            }
            return this.seats;
        }

    }

}
