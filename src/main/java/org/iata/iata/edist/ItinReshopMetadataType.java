
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Metadata definition.
 * 
 * <p>Java class for ItinReshopMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItinReshopMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Other" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherMetadata" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AddressMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AircraftMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CityMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CodesetMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ContactMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ContentMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}DescriptionMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}EquivalentID_Metadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}LanguageMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentFormMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}RuleMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}StateProvMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ZoneMetadatas"/>
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
@XmlType(name = "ItinReshopMetadataType", propOrder = {
    "passengerMetadata",
    "other"
})
public class ItinReshopMetadataType {

    @XmlElement(name = "PassengerMetadata")
    protected List<PassengerMetadataType> passengerMetadata;
    @XmlElement(name = "Other")
    protected ItinReshopMetadataType.Other other;

    /**
     * Gets the value of the passengerMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerMetadataType }
     * 
     * 
     */
    public List<PassengerMetadataType> getPassengerMetadata() {
        if (passengerMetadata == null) {
            passengerMetadata = new ArrayList<PassengerMetadataType>();
        }
        return this.passengerMetadata;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link ItinReshopMetadataType.Other }
     *     
     */
    public ItinReshopMetadataType.Other getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinReshopMetadataType.Other }
     *     
     */
    public void setOther(ItinReshopMetadataType.Other value) {
        this.other = value;
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
     *         &lt;element name="OtherMetadata" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AddressMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AircraftMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CityMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CodesetMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ContactMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ContentMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DescriptionMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}EquivalentID_Metadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}LanguageMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentFormMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}RuleMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}StateProvMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ZoneMetadatas"/>
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
        "otherMetadata"
    })
    public static class Other {

        @XmlElement(name = "OtherMetadata", required = true)
        protected List<ItinReshopMetadataType.Other.OtherMetadata> otherMetadata;

        /**
         * Gets the value of the otherMetadata property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherMetadata property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherMetadata().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItinReshopMetadataType.Other.OtherMetadata }
         * 
         * 
         */
        public List<ItinReshopMetadataType.Other.OtherMetadata> getOtherMetadata() {
            if (otherMetadata == null) {
                otherMetadata = new ArrayList<ItinReshopMetadataType.Other.OtherMetadata>();
            }
            return this.otherMetadata;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AddressMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AircraftMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CityMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CodesetMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ContactMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ContentMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CurrencyMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DescriptionMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}EquivalentID_Metadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}LanguageMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentCardMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PaymentFormMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}RuleMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}StateProvMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ZoneMetadatas"/>
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
            "addressMetadatas",
            "aircraftMetadatas",
            "airportMetadatas",
            "cityMetadatas",
            "codesetMetadatas",
            "contactMetadatas",
            "contentMetadatas",
            "countryMetadatas",
            "currencyMetadatas",
            "descriptionMetadatas",
            "equivalentIDMetadatas",
            "languageMetadatas",
            "paymentCardMetadatas",
            "paymentFormMetadatas",
            "priceMetadatas",
            "ruleMetadatas",
            "stateProvMetadatas",
            "zoneMetadatas"
        })
        public static class OtherMetadata {

            @XmlElement(name = "AddressMetadatas")
            protected AddressMetadatas addressMetadatas;
            @XmlElement(name = "AircraftMetadatas")
            protected AircraftMetadatas aircraftMetadatas;
            @XmlElement(name = "AirportMetadatas")
            protected AirportMetadatas airportMetadatas;
            @XmlElement(name = "CityMetadatas")
            protected CityMetadatas cityMetadatas;
            @XmlElement(name = "CodesetMetadatas")
            protected CodesetMetadatas codesetMetadatas;
            @XmlElement(name = "ContactMetadatas")
            protected ContactMetadatas contactMetadatas;
            @XmlElement(name = "ContentMetadatas")
            protected ContentMetadatas contentMetadatas;
            @XmlElement(name = "CountryMetadatas")
            protected CountryMetadatas countryMetadatas;
            @XmlElement(name = "CurrencyMetadatas")
            protected CurrencyMetadatas currencyMetadatas;
            @XmlElement(name = "DescriptionMetadatas")
            protected DescriptionMetadatas descriptionMetadatas;
            @XmlElement(name = "EquivalentID_Metadatas")
            protected EquivalentIDMetadatas equivalentIDMetadatas;
            @XmlElement(name = "LanguageMetadatas")
            protected LanguageMetadatas languageMetadatas;
            @XmlElement(name = "PaymentCardMetadatas")
            protected PaymentCardMetadatas paymentCardMetadatas;
            @XmlElement(name = "PaymentFormMetadatas")
            protected PaymentFormMetadatas paymentFormMetadatas;
            @XmlElement(name = "PriceMetadatas")
            protected PriceMetadatas priceMetadatas;
            @XmlElement(name = "RuleMetadatas")
            protected RuleMetadatas ruleMetadatas;
            @XmlElement(name = "StateProvMetadatas")
            protected StateProvMetadatas stateProvMetadatas;
            @XmlElement(name = "ZoneMetadatas")
            protected ZoneMetadatas zoneMetadatas;

            /**
             * Gets the value of the addressMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link AddressMetadatas }
             *     
             */
            public AddressMetadatas getAddressMetadatas() {
                return addressMetadatas;
            }

            /**
             * Sets the value of the addressMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressMetadatas }
             *     
             */
            public void setAddressMetadatas(AddressMetadatas value) {
                this.addressMetadatas = value;
            }

            /**
             * Gets the value of the aircraftMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link AircraftMetadatas }
             *     
             */
            public AircraftMetadatas getAircraftMetadatas() {
                return aircraftMetadatas;
            }

            /**
             * Sets the value of the aircraftMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link AircraftMetadatas }
             *     
             */
            public void setAircraftMetadatas(AircraftMetadatas value) {
                this.aircraftMetadatas = value;
            }

            /**
             * Gets the value of the airportMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link AirportMetadatas }
             *     
             */
            public AirportMetadatas getAirportMetadatas() {
                return airportMetadatas;
            }

            /**
             * Sets the value of the airportMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirportMetadatas }
             *     
             */
            public void setAirportMetadatas(AirportMetadatas value) {
                this.airportMetadatas = value;
            }

            /**
             * Gets the value of the cityMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link CityMetadatas }
             *     
             */
            public CityMetadatas getCityMetadatas() {
                return cityMetadatas;
            }

            /**
             * Sets the value of the cityMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link CityMetadatas }
             *     
             */
            public void setCityMetadatas(CityMetadatas value) {
                this.cityMetadatas = value;
            }

            /**
             * Gets the value of the codesetMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link CodesetMetadatas }
             *     
             */
            public CodesetMetadatas getCodesetMetadatas() {
                return codesetMetadatas;
            }

            /**
             * Sets the value of the codesetMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodesetMetadatas }
             *     
             */
            public void setCodesetMetadatas(CodesetMetadatas value) {
                this.codesetMetadatas = value;
            }

            /**
             * Gets the value of the contactMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link ContactMetadatas }
             *     
             */
            public ContactMetadatas getContactMetadatas() {
                return contactMetadatas;
            }

            /**
             * Sets the value of the contactMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link ContactMetadatas }
             *     
             */
            public void setContactMetadatas(ContactMetadatas value) {
                this.contactMetadatas = value;
            }

            /**
             * Gets the value of the contentMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link ContentMetadatas }
             *     
             */
            public ContentMetadatas getContentMetadatas() {
                return contentMetadatas;
            }

            /**
             * Sets the value of the contentMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link ContentMetadatas }
             *     
             */
            public void setContentMetadatas(ContentMetadatas value) {
                this.contentMetadatas = value;
            }

            /**
             * Gets the value of the countryMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link CountryMetadatas }
             *     
             */
            public CountryMetadatas getCountryMetadatas() {
                return countryMetadatas;
            }

            /**
             * Sets the value of the countryMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link CountryMetadatas }
             *     
             */
            public void setCountryMetadatas(CountryMetadatas value) {
                this.countryMetadatas = value;
            }

            /**
             * Gets the value of the currencyMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyMetadatas }
             *     
             */
            public CurrencyMetadatas getCurrencyMetadatas() {
                return currencyMetadatas;
            }

            /**
             * Sets the value of the currencyMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyMetadatas }
             *     
             */
            public void setCurrencyMetadatas(CurrencyMetadatas value) {
                this.currencyMetadatas = value;
            }

            /**
             * Gets the value of the descriptionMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link DescriptionMetadatas }
             *     
             */
            public DescriptionMetadatas getDescriptionMetadatas() {
                return descriptionMetadatas;
            }

            /**
             * Sets the value of the descriptionMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link DescriptionMetadatas }
             *     
             */
            public void setDescriptionMetadatas(DescriptionMetadatas value) {
                this.descriptionMetadatas = value;
            }

            /**
             * Gets the value of the equivalentIDMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link EquivalentIDMetadatas }
             *     
             */
            public EquivalentIDMetadatas getEquivalentIDMetadatas() {
                return equivalentIDMetadatas;
            }

            /**
             * Sets the value of the equivalentIDMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link EquivalentIDMetadatas }
             *     
             */
            public void setEquivalentIDMetadatas(EquivalentIDMetadatas value) {
                this.equivalentIDMetadatas = value;
            }

            /**
             * Gets the value of the languageMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link LanguageMetadatas }
             *     
             */
            public LanguageMetadatas getLanguageMetadatas() {
                return languageMetadatas;
            }

            /**
             * Sets the value of the languageMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link LanguageMetadatas }
             *     
             */
            public void setLanguageMetadatas(LanguageMetadatas value) {
                this.languageMetadatas = value;
            }

            /**
             * Gets the value of the paymentCardMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link PaymentCardMetadatas }
             *     
             */
            public PaymentCardMetadatas getPaymentCardMetadatas() {
                return paymentCardMetadatas;
            }

            /**
             * Sets the value of the paymentCardMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentCardMetadatas }
             *     
             */
            public void setPaymentCardMetadatas(PaymentCardMetadatas value) {
                this.paymentCardMetadatas = value;
            }

            /**
             * Gets the value of the paymentFormMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link PaymentFormMetadatas }
             *     
             */
            public PaymentFormMetadatas getPaymentFormMetadatas() {
                return paymentFormMetadatas;
            }

            /**
             * Sets the value of the paymentFormMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentFormMetadatas }
             *     
             */
            public void setPaymentFormMetadatas(PaymentFormMetadatas value) {
                this.paymentFormMetadatas = value;
            }

            /**
             * Gets the value of the priceMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link PriceMetadatas }
             *     
             */
            public PriceMetadatas getPriceMetadatas() {
                return priceMetadatas;
            }

            /**
             * Sets the value of the priceMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceMetadatas }
             *     
             */
            public void setPriceMetadatas(PriceMetadatas value) {
                this.priceMetadatas = value;
            }

            /**
             * Gets the value of the ruleMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link RuleMetadatas }
             *     
             */
            public RuleMetadatas getRuleMetadatas() {
                return ruleMetadatas;
            }

            /**
             * Sets the value of the ruleMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link RuleMetadatas }
             *     
             */
            public void setRuleMetadatas(RuleMetadatas value) {
                this.ruleMetadatas = value;
            }

            /**
             * Gets the value of the stateProvMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link StateProvMetadatas }
             *     
             */
            public StateProvMetadatas getStateProvMetadatas() {
                return stateProvMetadatas;
            }

            /**
             * Sets the value of the stateProvMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link StateProvMetadatas }
             *     
             */
            public void setStateProvMetadatas(StateProvMetadatas value) {
                this.stateProvMetadatas = value;
            }

            /**
             * Gets the value of the zoneMetadatas property.
             * 
             * @return
             *     possible object is
             *     {@link ZoneMetadatas }
             *     
             */
            public ZoneMetadatas getZoneMetadatas() {
                return zoneMetadatas;
            }

            /**
             * Sets the value of the zoneMetadatas property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZoneMetadatas }
             *     
             */
            public void setZoneMetadatas(ZoneMetadatas value) {
                this.zoneMetadatas = value;
            }

        }

    }

}
