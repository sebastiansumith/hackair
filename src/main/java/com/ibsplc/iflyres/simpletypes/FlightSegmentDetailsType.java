
package com.ibsplc.iflyres.simpletypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Itinerary Details
 * 
 * <p>Java class for FlightSegmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightSegmentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightIDRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SegmentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MarketingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MarketingFlightNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OperatingCarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingFlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureAirport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DepartureTime" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}TimeSimpleType"/>
 *         &lt;element name="ArrivalAirport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ArrivalTime" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}TimeSimpleType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentDetailsType", propOrder = {
    "flightIDRef",
    "segmentId",
    "marketingCarrierCode",
    "marketingFlightNumber",
    "operatingCarrierCode",
    "operatingFlightNumber",
    "departureAirport",
    "departureDate",
    "departureTime",
    "arrivalAirport",
    "arrivalDate",
    "arrivalTime"
})
public class FlightSegmentDetailsType {

    @XmlElement(name = "FlightIDRef", required = true)
    protected String flightIDRef;
    @XmlElement(name = "SegmentId", required = true)
    protected String segmentId;
    @XmlElement(name = "MarketingCarrierCode", required = true)
    protected String marketingCarrierCode;
    @XmlElement(name = "MarketingFlightNumber", required = true)
    protected String marketingFlightNumber;
    @XmlElement(name = "OperatingCarrierCode")
    protected String operatingCarrierCode;
    @XmlElement(name = "OperatingFlightNumber")
    protected String operatingFlightNumber;
    @XmlElement(name = "DepartureAirport", required = true)
    protected String departureAirport;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "DepartureTime", required = true)
    protected String departureTime;
    @XmlElement(name = "ArrivalAirport", required = true)
    protected String arrivalAirport;
    @XmlElement(name = "ArrivalDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar arrivalDate;
    @XmlElement(name = "ArrivalTime", required = true)
    protected String arrivalTime;

    /**
     * Gets the value of the flightIDRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightIDRef() {
        return flightIDRef;
    }

    /**
     * Sets the value of the flightIDRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightIDRef(String value) {
        this.flightIDRef = value;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentId(String value) {
        this.segmentId = value;
    }

    /**
     * Gets the value of the marketingCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCarrierCode() {
        return marketingCarrierCode;
    }

    /**
     * Sets the value of the marketingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCarrierCode(String value) {
        this.marketingCarrierCode = value;
    }

    /**
     * Gets the value of the marketingFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingFlightNumber() {
        return marketingFlightNumber;
    }

    /**
     * Sets the value of the marketingFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingFlightNumber(String value) {
        this.marketingFlightNumber = value;
    }

    /**
     * Gets the value of the operatingCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrierCode() {
        return operatingCarrierCode;
    }

    /**
     * Sets the value of the operatingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCarrierCode(String value) {
        this.operatingCarrierCode = value;
    }

    /**
     * Gets the value of the operatingFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingFlightNumber() {
        return operatingFlightNumber;
    }

    /**
     * Sets the value of the operatingFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingFlightNumber(String value) {
        this.operatingFlightNumber = value;
    }

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAirport(String value) {
        this.departureAirport = value;
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
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirport(String value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

}
