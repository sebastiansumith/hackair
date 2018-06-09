
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
@XmlRootElement(name = "Preferences")
public class Preferences {

    @XmlElement(name = "Preference", required = true)
    protected List<Preferences.Preference> preference;

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
     * {@link Preferences.Preference }
     * 
     * 
     */
    public List<Preferences.Preference> getPreference() {
        if (preference == null) {
            preference = new ArrayList<Preferences.Preference>();
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
        "transferPreferences"
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
         * Contains information to identify how reservation was re-priced to obtain best published fare (Eg. best fare in same cabin, best fare in all cabins, other parameters to select best fare).
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

    }

}
