
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Baggage Allowance Request Metadata definition.
 * 
 * <p>Java class for BagAllowReqMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagAllowReqMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Shopping" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ShopMetadataGroup"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Traveler" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TravelerMetadata"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AircraftMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CityMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}CodesetMetadatas"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ContactMetadatas"/>
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
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AddressMetadatas"/>
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
@XmlType(name = "BagAllowReqMetadataType", propOrder = {
    "shopping",
    "traveler",
    "other"
})
public class BagAllowReqMetadataType {

    @XmlElement(name = "Shopping")
    protected BagAllowReqMetadataType.Shopping shopping;
    @XmlElement(name = "Traveler")
    protected BagAllowReqMetadataType.Traveler traveler;
    @XmlElement(name = "Other")
    protected BagAllowReqMetadataType.Other other;

    /**
     * Gets the value of the shopping property.
     * 
     * @return
     *     possible object is
     *     {@link BagAllowReqMetadataType.Shopping }
     *     
     */
    public BagAllowReqMetadataType.Shopping getShopping() {
        return shopping;
    }

    /**
     * Sets the value of the shopping property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagAllowReqMetadataType.Shopping }
     *     
     */
    public void setShopping(BagAllowReqMetadataType.Shopping value) {
        this.shopping = value;
    }

    /**
     * Gets the value of the traveler property.
     * 
     * @return
     *     possible object is
     *     {@link BagAllowReqMetadataType.Traveler }
     *     
     */
    public BagAllowReqMetadataType.Traveler getTraveler() {
        return traveler;
    }

    /**
     * Sets the value of the traveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagAllowReqMetadataType.Traveler }
     *     
     */
    public void setTraveler(BagAllowReqMetadataType.Traveler value) {
        this.traveler = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link BagAllowReqMetadataType.Other }
     *     
     */
    public BagAllowReqMetadataType.Other getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagAllowReqMetadataType.Other }
     *     
     */
    public void setOther(BagAllowReqMetadataType.Other value) {
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
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AircraftMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CityMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CodesetMetadatas"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ContactMetadatas"/>
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
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AddressMetadatas"/>
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
        protected List<BagAllowReqMetadataType.Other.OtherMetadata> otherMetadata;

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
         * {@link BagAllowReqMetadataType.Other.OtherMetadata }
         * 
         * 
         */
        public List<BagAllowReqMetadataType.Other.OtherMetadata> getOtherMetadata() {
            if (otherMetadata == null) {
                otherMetadata = new ArrayList<BagAllowReqMetadataType.Other.OtherMetadata>();
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AircraftMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CityMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CodesetMetadatas"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ContactMetadatas"/>
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AddressMetadatas"/>
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
            "aircraftMetadatas",
            "airportMetadatas",
            "cityMetadatas",
            "codesetMetadatas",
            "contactMetadatas",
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
            "zoneMetadatas",
            "addressMetadatas"
        })
        public static class OtherMetadata {

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
            @XmlElement(name = "AddressMetadatas")
            protected AddressMetadatas addressMetadatas;

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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ShopMetadataGroup"/>
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
        "shopMetadataGroup"
    })
    public static class Shopping {

        @XmlElement(name = "ShopMetadataGroup", required = true)
        protected ShopMetadataGroup shopMetadataGroup;

        /**
         * Gets the value of the shopMetadataGroup property.
         * 
         * @return
         *     possible object is
         *     {@link ShopMetadataGroup }
         *     
         */
        public ShopMetadataGroup getShopMetadataGroup() {
            return shopMetadataGroup;
        }

        /**
         * Sets the value of the shopMetadataGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link ShopMetadataGroup }
         *     
         */
        public void setShopMetadataGroup(ShopMetadataGroup value) {
            this.shopMetadataGroup = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TravelerMetadata"/>
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
        "travelerMetadata"
    })
    public static class Traveler {

        @XmlElement(name = "TravelerMetadata", required = true)
        protected TravelerMetadataType travelerMetadata;

        /**
         * Gets the value of the travelerMetadata property.
         * 
         * @return
         *     possible object is
         *     {@link TravelerMetadataType }
         *     
         */
        public TravelerMetadataType getTravelerMetadata() {
            return travelerMetadata;
        }

        /**
         * Sets the value of the travelerMetadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerMetadataType }
         *     
         */
        public void setTravelerMetadata(TravelerMetadataType value) {
            this.travelerMetadata = value;
        }

    }

}
