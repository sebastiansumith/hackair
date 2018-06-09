
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * COUPON FLIGHT SEGMENT definition.
 * 
 * <p>Java class for CouponFlightSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponFlightSegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="InfoSource" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" minOccurs="0"/>
 *         &lt;element name="DepartureDateTime" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreDateGrpType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TourOperatorFlightID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Departure" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Arrival" minOccurs="0"/>
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
 *         &lt;element name="MarketingCarrier" type="{http://www.iata.org/IATA/EDIST}MarketingCarrierFlightType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Equipment" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="InvoluntaryIndicatorCode" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponFlightSegmentType", propOrder = {
    "infoSource",
    "departureDateTime",
    "tourOperatorFlightID",
    "departure",
    "arrival",
    "operatingCarrier",
    "marketingCarrier",
    "equipment",
    "involuntaryIndicatorCode"
})
@XmlSeeAlso({
    org.iata.iata.edist.ReissuedFlownType.FlightCouponData.class
})
public class CouponFlightSegmentType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "InfoSource")
    protected String infoSource;
    @XmlElement(name = "DepartureDateTime")
    protected CouponFlightSegmentType.DepartureDateTime departureDateTime;
    @XmlElement(name = "TourOperatorFlightID")
    protected String tourOperatorFlightID;
    @XmlElement(name = "Departure")
    protected Departure departure;
    @XmlElement(name = "Arrival")
    protected FlightArrivalType arrival;
    @XmlElement(name = "OperatingCarrier")
    protected CouponFlightSegmentType.OperatingCarrier operatingCarrier;
    @XmlElement(name = "MarketingCarrier")
    protected MarketingCarrierFlightType marketingCarrier;
    @XmlElement(name = "Equipment")
    protected List<AircraftSummaryType> equipment;
    @XmlElement(name = "InvoluntaryIndicatorCode")
    protected CodesetType involuntaryIndicatorCode;

    /**
     * Gets the value of the infoSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoSource() {
        return infoSource;
    }

    /**
     * Sets the value of the infoSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoSource(String value) {
        this.infoSource = value;
    }

    /**
     * Gets the value of the departureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link CouponFlightSegmentType.DepartureDateTime }
     *     
     */
    public CouponFlightSegmentType.DepartureDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponFlightSegmentType.DepartureDateTime }
     *     
     */
    public void setDepartureDateTime(CouponFlightSegmentType.DepartureDateTime value) {
        this.departureDateTime = value;
    }

    /**
     * Gets the value of the tourOperatorFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorFlightID() {
        return tourOperatorFlightID;
    }

    /**
     * Sets the value of the tourOperatorFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorFlightID(String value) {
        this.tourOperatorFlightID = value;
    }

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
     * Gets the value of the operatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link CouponFlightSegmentType.OperatingCarrier }
     *     
     */
    public CouponFlightSegmentType.OperatingCarrier getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponFlightSegmentType.OperatingCarrier }
     *     
     */
    public void setOperatingCarrier(CouponFlightSegmentType.OperatingCarrier value) {
        this.operatingCarrier = value;
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
     * Aircraft Equipment.
     * 
     * Note: Two instances of aircraft equipment may be specified if there is a change of gauge.Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftSummaryType }
     * 
     * 
     */
    public List<AircraftSummaryType> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<AircraftSummaryType>();
        }
        return this.equipment;
    }

    /**
     * Gets the value of the involuntaryIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getInvoluntaryIndicatorCode() {
        return involuntaryIndicatorCode;
    }

    /**
     * Sets the value of the involuntaryIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setInvoluntaryIndicatorCode(CodesetType value) {
        this.involuntaryIndicatorCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreDateGrpType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DepartureDateTime
        extends CoreDateGrpType
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
