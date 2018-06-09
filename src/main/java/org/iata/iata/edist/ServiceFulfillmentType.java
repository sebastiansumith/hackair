
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * OPTIONAL SERVICE FULFILLMENT representation, including Date/ Time Period, Location, Fulfillment Company.
 * 
 * <p>Java class for ServiceFulfillmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFulfillmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="OfferValidDates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Start" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreDateGrpType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="End" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreDateGrpType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Provider" type="{http://www.iata.org/IATA/EDIST}FulfillmentPartnerType" minOccurs="0"/>
 *         &lt;element name="Location" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportFulfillmentLocation"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OtherFulfillmentLocation"/>
 *                 &lt;/sequence>
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
@XmlType(name = "ServiceFulfillmentType", propOrder = {
    "offerValidDates",
    "provider",
    "location"
})
public class ServiceFulfillmentType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "OfferValidDates")
    protected ServiceFulfillmentType.OfferValidDates offerValidDates;
    @XmlElement(name = "Provider")
    protected FulfillmentPartnerType provider;
    @XmlElement(name = "Location")
    protected ServiceFulfillmentType.Location location;

    /**
     * Gets the value of the offerValidDates property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFulfillmentType.OfferValidDates }
     *     
     */
    public ServiceFulfillmentType.OfferValidDates getOfferValidDates() {
        return offerValidDates;
    }

    /**
     * Sets the value of the offerValidDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFulfillmentType.OfferValidDates }
     *     
     */
    public void setOfferValidDates(ServiceFulfillmentType.OfferValidDates value) {
        this.offerValidDates = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentPartnerType }
     *     
     */
    public FulfillmentPartnerType getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentPartnerType }
     *     
     */
    public void setProvider(FulfillmentPartnerType value) {
        this.provider = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFulfillmentType.Location }
     *     
     */
    public ServiceFulfillmentType.Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFulfillmentType.Location }
     *     
     */
    public void setLocation(ServiceFulfillmentType.Location value) {
        this.location = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportFulfillmentLocation"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OtherFulfillmentLocation"/>
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
        "airportFulfillmentLocation",
        "otherFulfillmentLocation"
    })
    public static class Location {

        @XmlElement(name = "AirportFulfillmentLocation", required = true)
        protected SrvcLocationAirportType airportFulfillmentLocation;
        @XmlElement(name = "OtherFulfillmentLocation", required = true)
        protected SrvcLocationAddressType otherFulfillmentLocation;

        /**
         * Gets the value of the airportFulfillmentLocation property.
         * 
         * @return
         *     possible object is
         *     {@link SrvcLocationAirportType }
         *     
         */
        public SrvcLocationAirportType getAirportFulfillmentLocation() {
            return airportFulfillmentLocation;
        }

        /**
         * Sets the value of the airportFulfillmentLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SrvcLocationAirportType }
         *     
         */
        public void setAirportFulfillmentLocation(SrvcLocationAirportType value) {
            this.airportFulfillmentLocation = value;
        }

        /**
         * Gets the value of the otherFulfillmentLocation property.
         * 
         * @return
         *     possible object is
         *     {@link SrvcLocationAddressType }
         *     
         */
        public SrvcLocationAddressType getOtherFulfillmentLocation() {
            return otherFulfillmentLocation;
        }

        /**
         * Sets the value of the otherFulfillmentLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SrvcLocationAddressType }
         *     
         */
        public void setOtherFulfillmentLocation(SrvcLocationAddressType value) {
            this.otherFulfillmentLocation = value;
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
     *         &lt;element name="Start" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreDateGrpType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="End" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreDateGrpType">
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
        "start",
        "end"
    })
    public static class OfferValidDates {

        @XmlElement(name = "Start")
        protected ServiceFulfillmentType.OfferValidDates.Start start;
        @XmlElement(name = "End")
        protected ServiceFulfillmentType.OfferValidDates.End end;

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceFulfillmentType.OfferValidDates.Start }
         *     
         */
        public ServiceFulfillmentType.OfferValidDates.Start getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceFulfillmentType.OfferValidDates.Start }
         *     
         */
        public void setStart(ServiceFulfillmentType.OfferValidDates.Start value) {
            this.start = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceFulfillmentType.OfferValidDates.End }
         *     
         */
        public ServiceFulfillmentType.OfferValidDates.End getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceFulfillmentType.OfferValidDates.End }
         *     
         */
        public void setEnd(ServiceFulfillmentType.OfferValidDates.End value) {
            this.end = value;
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
        public static class End
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
        public static class Start
            extends CoreDateGrpType
        {


        }

    }

}
