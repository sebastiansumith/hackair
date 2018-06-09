
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Flight origin/ destination information.
 * 
 * <p>Java class for ListOfFlightSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfFlightSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Departure"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Arrival"/>
 *         &lt;element name="MarketingCarrier" type="{http://www.iata.org/IATA/EDIST}MarketingCarrierFlightType"/>
 *         &lt;element name="OperatingCarrier" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OperatingCarrierFlightType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Disclosures" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Equipment" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ClassOfService" minOccurs="0"/>
 *         &lt;element name="FlightDetail" type="{http://www.iata.org/IATA/EDIST}FlightDetailType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OnTimePerformance" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
 *       &lt;attribute name="SegmentKey" use="required" type="{http://www.iata.org/IATA/EDIST}KeyIdentifier" />
 *       &lt;attribute name="ConnectInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ElectronicTicketInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TicketlessInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfFlightSegmentType", propOrder = {
    "departure",
    "arrival",
    "marketingCarrier",
    "operatingCarrier",
    "equipment",
    "classOfService",
    "flightDetail",
    "onTimePerformance"
})
public class ListOfFlightSegmentType {

    @XmlElement(name = "Departure", required = true)
    protected Departure departure;
    @XmlElement(name = "Arrival", required = true)
    protected FlightArrivalType arrival;
    @XmlElement(name = "MarketingCarrier", required = true)
    protected MarketingCarrierFlightType marketingCarrier;
    @XmlElement(name = "OperatingCarrier")
    protected ListOfFlightSegmentType.OperatingCarrier operatingCarrier;
    @XmlElement(name = "Equipment")
    protected AircraftSummaryType equipment;
    @XmlElement(name = "ClassOfService")
    protected FlightCOSCoreType classOfService;
    @XmlElement(name = "FlightDetail")
    protected FlightDetailType flightDetail;
    @XmlElement(name = "OnTimePerformance")
    protected OnTimePerformance onTimePerformance;
    @XmlAttribute(name = "SegmentKey", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String segmentKey;
    @XmlAttribute(name = "ConnectInd")
    protected Boolean connectInd;
    @XmlAttribute(name = "ElectronicTicketInd")
    protected Boolean electronicTicketInd;
    @XmlAttribute(name = "TicketlessInd")
    protected Boolean ticketlessInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link Departure }
     *     
     */
    public Departure getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Departure }
     *     
     */
    public void setDeparture(Departure value) {
        this.departure = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link FlightArrivalType }
     *     
     */
    public FlightArrivalType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightArrivalType }
     *     
     */
    public void setArrival(FlightArrivalType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the marketingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingCarrierFlightType }
     *     
     */
    public MarketingCarrierFlightType getMarketingCarrier() {
        return marketingCarrier;
    }

    /**
     * Sets the value of the marketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingCarrierFlightType }
     *     
     */
    public void setMarketingCarrier(MarketingCarrierFlightType value) {
        this.marketingCarrier = value;
    }

    /**
     * Gets the value of the operatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfFlightSegmentType.OperatingCarrier }
     *     
     */
    public ListOfFlightSegmentType.OperatingCarrier getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfFlightSegmentType.OperatingCarrier }
     *     
     */
    public void setOperatingCarrier(ListOfFlightSegmentType.OperatingCarrier value) {
        this.operatingCarrier = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftSummaryType }
     *     
     */
    public AircraftSummaryType getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftSummaryType }
     *     
     */
    public void setEquipment(AircraftSummaryType value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCOSCoreType }
     *     
     */
    public FlightCOSCoreType getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCOSCoreType }
     *     
     */
    public void setClassOfService(FlightCOSCoreType value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the flightDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailType }
     *     
     */
    public FlightDetailType getFlightDetail() {
        return flightDetail;
    }

    /**
     * Sets the value of the flightDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailType }
     *     
     */
    public void setFlightDetail(FlightDetailType value) {
        this.flightDetail = value;
    }

    /**
     * Gets the value of the onTimePerformance property.
     * 
     * @return
     *     possible object is
     *     {@link OnTimePerformance }
     *     
     */
    public OnTimePerformance getOnTimePerformance() {
        return onTimePerformance;
    }

    /**
     * Sets the value of the onTimePerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnTimePerformance }
     *     
     */
    public void setOnTimePerformance(OnTimePerformance value) {
        this.onTimePerformance = value;
    }

    /**
     * Gets the value of the segmentKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentKey() {
        return segmentKey;
    }

    /**
     * Sets the value of the segmentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentKey(String value) {
        this.segmentKey = value;
    }

    /**
     * Gets the value of the connectInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectInd() {
        return connectInd;
    }

    /**
     * Sets the value of the connectInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectInd(Boolean value) {
        this.connectInd = value;
    }

    /**
     * Gets the value of the electronicTicketInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElectronicTicketInd() {
        return electronicTicketInd;
    }

    /**
     * Sets the value of the electronicTicketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElectronicTicketInd(Boolean value) {
        this.electronicTicketInd = value;
    }

    /**
     * Gets the value of the ticketlessInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketlessInd() {
        return ticketlessInd;
    }

    /**
     * Sets the value of the ticketlessInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketlessInd(Boolean value) {
        this.ticketlessInd = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OperatingCarrierFlightType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Disclosures" minOccurs="0"/>
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
        "disclosures"
    })
    public static class OperatingCarrier
        extends OperatingCarrierFlightType
    {

        @XmlElement(name = "Disclosures")
        protected Disclosures disclosures;

        /**
         * Gets the value of the disclosures property.
         * 
         * @return
         *     possible object is
         *     {@link Disclosures }
         *     
         */
        public Disclosures getDisclosures() {
            return disclosures;
        }

        /**
         * Sets the value of the disclosures property.
         * 
         * @param value
         *     allowed object is
         *     {@link Disclosures }
         *     
         */
        public void setDisclosures(Disclosures value) {
            this.disclosures = value;
        }

    }

}
