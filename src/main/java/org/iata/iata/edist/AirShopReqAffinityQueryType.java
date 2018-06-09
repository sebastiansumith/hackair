
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * AirShopReq Business Object: AFFINITY QUERY definition.
 * 
 * <p>Java class for AirShopReqAffinityQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirShopReqAffinityQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginDestination" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportCityDeparture" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryDeparture" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ReferencePointDeparture" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}StateProvDeparture" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportCityArrival" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryArrival" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ReferencePointArrival" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}StateProvArrival" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}StayPeriodDateRange" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}StayPeriodSeason" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TripDistance" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TripTime" minOccurs="0"/>
 *         &lt;element name="Budget" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupBudget"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PerPersonBudget"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="KeywordPreferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="KeywordPreference" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWordType">
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}PreferenceAttrGroup"/>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ShoppingResponseIDs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirShopReqAffinityQueryType", propOrder = {
    "originDestination",
    "stayPeriodDateRange",
    "stayPeriodSeason",
    "tripDistance",
    "tripTime",
    "budget",
    "keywordPreferences",
    "shoppingResponseIDs"
})
public class AirShopReqAffinityQueryType {

    @XmlElement(name = "OriginDestination", required = true)
    protected List<AirShopReqAffinityQueryType.OriginDestination> originDestination;
    @XmlElement(name = "StayPeriodDateRange")
    protected StayPeriodDateRangeType stayPeriodDateRange;
    @XmlElement(name = "StayPeriodSeason")
    protected StayPeriodSeasonType stayPeriodSeason;
    @XmlElement(name = "TripDistance")
    protected TravelDistancePreferencesType tripDistance;
    @XmlElement(name = "TripTime")
    protected TravelTimePreferencesType tripTime;
    @XmlElement(name = "Budget")
    protected AirShopReqAffinityQueryType.Budget budget;
    @XmlElement(name = "KeywordPreferences")
    protected AirShopReqAffinityQueryType.KeywordPreferences keywordPreferences;
    @XmlElement(name = "ShoppingResponseIDs")
    protected ShoppingResponseIDType shoppingResponseIDs;

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
     * {@link AirShopReqAffinityQueryType.OriginDestination }
     * 
     * 
     */
    public List<AirShopReqAffinityQueryType.OriginDestination> getOriginDestination() {
        if (originDestination == null) {
            originDestination = new ArrayList<AirShopReqAffinityQueryType.OriginDestination>();
        }
        return this.originDestination;
    }

    /**
     * Gets the value of the stayPeriodDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link StayPeriodDateRangeType }
     *     
     */
    public StayPeriodDateRangeType getStayPeriodDateRange() {
        return stayPeriodDateRange;
    }

    /**
     * Sets the value of the stayPeriodDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayPeriodDateRangeType }
     *     
     */
    public void setStayPeriodDateRange(StayPeriodDateRangeType value) {
        this.stayPeriodDateRange = value;
    }

    /**
     * Gets the value of the stayPeriodSeason property.
     * 
     * @return
     *     possible object is
     *     {@link StayPeriodSeasonType }
     *     
     */
    public StayPeriodSeasonType getStayPeriodSeason() {
        return stayPeriodSeason;
    }

    /**
     * Sets the value of the stayPeriodSeason property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayPeriodSeasonType }
     *     
     */
    public void setStayPeriodSeason(StayPeriodSeasonType value) {
        this.stayPeriodSeason = value;
    }

    /**
     * Gets the value of the tripDistance property.
     * 
     * @return
     *     possible object is
     *     {@link TravelDistancePreferencesType }
     *     
     */
    public TravelDistancePreferencesType getTripDistance() {
        return tripDistance;
    }

    /**
     * Sets the value of the tripDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelDistancePreferencesType }
     *     
     */
    public void setTripDistance(TravelDistancePreferencesType value) {
        this.tripDistance = value;
    }

    /**
     * Gets the value of the tripTime property.
     * 
     * @return
     *     possible object is
     *     {@link TravelTimePreferencesType }
     *     
     */
    public TravelTimePreferencesType getTripTime() {
        return tripTime;
    }

    /**
     * Sets the value of the tripTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTimePreferencesType }
     *     
     */
    public void setTripTime(TravelTimePreferencesType value) {
        this.tripTime = value;
    }

    /**
     * Gets the value of the budget property.
     * 
     * @return
     *     possible object is
     *     {@link AirShopReqAffinityQueryType.Budget }
     *     
     */
    public AirShopReqAffinityQueryType.Budget getBudget() {
        return budget;
    }

    /**
     * Sets the value of the budget property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShopReqAffinityQueryType.Budget }
     *     
     */
    public void setBudget(AirShopReqAffinityQueryType.Budget value) {
        this.budget = value;
    }

    /**
     * Gets the value of the keywordPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link AirShopReqAffinityQueryType.KeywordPreferences }
     *     
     */
    public AirShopReqAffinityQueryType.KeywordPreferences getKeywordPreferences() {
        return keywordPreferences;
    }

    /**
     * Sets the value of the keywordPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShopReqAffinityQueryType.KeywordPreferences }
     *     
     */
    public void setKeywordPreferences(AirShopReqAffinityQueryType.KeywordPreferences value) {
        this.keywordPreferences = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupBudget"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PerPersonBudget"/>
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
        "groupBudget",
        "perPersonBudget"
    })
    public static class Budget {

        @XmlElement(name = "GroupBudget")
        protected GroupBudgetType groupBudget;
        @XmlElement(name = "PerPersonBudget")
        protected PersonBudgetType perPersonBudget;

        /**
         * Gets the value of the groupBudget property.
         * 
         * @return
         *     possible object is
         *     {@link GroupBudgetType }
         *     
         */
        public GroupBudgetType getGroupBudget() {
            return groupBudget;
        }

        /**
         * Sets the value of the groupBudget property.
         * 
         * @param value
         *     allowed object is
         *     {@link GroupBudgetType }
         *     
         */
        public void setGroupBudget(GroupBudgetType value) {
            this.groupBudget = value;
        }

        /**
         * Gets the value of the perPersonBudget property.
         * 
         * @return
         *     possible object is
         *     {@link PersonBudgetType }
         *     
         */
        public PersonBudgetType getPerPersonBudget() {
            return perPersonBudget;
        }

        /**
         * Sets the value of the perPersonBudget property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonBudgetType }
         *     
         */
        public void setPerPersonBudget(PersonBudgetType value) {
            this.perPersonBudget = value;
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
     *         &lt;element name="KeywordPreference" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWordType">
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}PreferenceAttrGroup"/>
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
        "keywordPreference"
    })
    public static class KeywordPreferences {

        @XmlElement(name = "KeywordPreference", required = true)
        protected List<AirShopReqAffinityQueryType.KeywordPreferences.KeywordPreference> keywordPreference;

        /**
         * Gets the value of the keywordPreference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the keywordPreference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKeywordPreference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirShopReqAffinityQueryType.KeywordPreferences.KeywordPreference }
         * 
         * 
         */
        public List<AirShopReqAffinityQueryType.KeywordPreferences.KeywordPreference> getKeywordPreference() {
            if (keywordPreference == null) {
                keywordPreference = new ArrayList<AirShopReqAffinityQueryType.KeywordPreferences.KeywordPreference>();
            }
            return this.keywordPreference;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWordType">
         *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}PreferenceAttrGroup"/>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class KeywordPreference
            extends KeyWordType
        {

            @XmlAttribute(name = "PreferencesLevel")
            protected String preferencesLevel;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

            /**
             * Gets the value of the preferencesLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesLevel() {
                return preferencesLevel;
            }

            /**
             * Sets the value of the preferencesLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesLevel(String value) {
                this.preferencesLevel = value;
            }

            /**
             * Gets the value of the preferencesContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesContext() {
                return preferencesContext;
            }

            /**
             * Sets the value of the preferencesContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesContext(String value) {
                this.preferencesContext = value;
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
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportCityDeparture" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryDeparture" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ReferencePointDeparture" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}StateProvDeparture" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportCityArrival" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryArrival" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ReferencePointArrival" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}StateProvArrival" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegMaxTimePreferences" minOccurs="0"/>
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
        "airportCityDeparture",
        "countryDeparture",
        "referencePointDeparture",
        "stateProvDeparture",
        "airportCityArrival",
        "countryArrival",
        "referencePointArrival",
        "stateProvArrival",
        "segMaxTimePreferences"
    })
    public static class OriginDestination
        extends AssociatedObjectBaseType
    {

        @XmlElement(name = "AirportCityDeparture")
        protected FltDepartQualifiedQueryType airportCityDeparture;
        @XmlElement(name = "CountryDeparture")
        protected AffinityCountryDepartType countryDeparture;
        @XmlElement(name = "ReferencePointDeparture")
        protected AffinityReferencePointDepartType referencePointDeparture;
        @XmlElement(name = "StateProvDeparture")
        protected AffinityStateProvDepartType stateProvDeparture;
        @XmlElement(name = "AirportCityArrival")
        protected FltArriveQualifiedQueryType airportCityArrival;
        @XmlElement(name = "CountryArrival")
        protected AffinityCountryArriveType countryArrival;
        @XmlElement(name = "ReferencePointArrival")
        protected AffinityReferencePointArriveType referencePointArrival;
        @XmlElement(name = "StateProvArrival")
        protected AffinityStateProvArriveType stateProvArrival;
        @XmlElement(name = "SegMaxTimePreferences")
        protected FltSegmentMaxTimePreferencesType segMaxTimePreferences;

        /**
         * Gets the value of the airportCityDeparture property.
         * 
         * @return
         *     possible object is
         *     {@link FltDepartQualifiedQueryType }
         *     
         */
        public FltDepartQualifiedQueryType getAirportCityDeparture() {
            return airportCityDeparture;
        }

        /**
         * Sets the value of the airportCityDeparture property.
         * 
         * @param value
         *     allowed object is
         *     {@link FltDepartQualifiedQueryType }
         *     
         */
        public void setAirportCityDeparture(FltDepartQualifiedQueryType value) {
            this.airportCityDeparture = value;
        }

        /**
         * Gets the value of the countryDeparture property.
         * 
         * @return
         *     possible object is
         *     {@link AffinityCountryDepartType }
         *     
         */
        public AffinityCountryDepartType getCountryDeparture() {
            return countryDeparture;
        }

        /**
         * Sets the value of the countryDeparture property.
         * 
         * @param value
         *     allowed object is
         *     {@link AffinityCountryDepartType }
         *     
         */
        public void setCountryDeparture(AffinityCountryDepartType value) {
            this.countryDeparture = value;
        }

        /**
         * Gets the value of the referencePointDeparture property.
         * 
         * @return
         *     possible object is
         *     {@link AffinityReferencePointDepartType }
         *     
         */
        public AffinityReferencePointDepartType getReferencePointDeparture() {
            return referencePointDeparture;
        }

        /**
         * Sets the value of the referencePointDeparture property.
         * 
         * @param value
         *     allowed object is
         *     {@link AffinityReferencePointDepartType }
         *     
         */
        public void setReferencePointDeparture(AffinityReferencePointDepartType value) {
            this.referencePointDeparture = value;
        }

        /**
         * Gets the value of the stateProvDeparture property.
         * 
         * @return
         *     possible object is
         *     {@link AffinityStateProvDepartType }
         *     
         */
        public AffinityStateProvDepartType getStateProvDeparture() {
            return stateProvDeparture;
        }

        /**
         * Sets the value of the stateProvDeparture property.
         * 
         * @param value
         *     allowed object is
         *     {@link AffinityStateProvDepartType }
         *     
         */
        public void setStateProvDeparture(AffinityStateProvDepartType value) {
            this.stateProvDeparture = value;
        }

        /**
         * Gets the value of the airportCityArrival property.
         * 
         * @return
         *     possible object is
         *     {@link FltArriveQualifiedQueryType }
         *     
         */
        public FltArriveQualifiedQueryType getAirportCityArrival() {
            return airportCityArrival;
        }

        /**
         * Sets the value of the airportCityArrival property.
         * 
         * @param value
         *     allowed object is
         *     {@link FltArriveQualifiedQueryType }
         *     
         */
        public void setAirportCityArrival(FltArriveQualifiedQueryType value) {
            this.airportCityArrival = value;
        }

        /**
         * Gets the value of the countryArrival property.
         * 
         * @return
         *     possible object is
         *     {@link AffinityCountryArriveType }
         *     
         */
        public AffinityCountryArriveType getCountryArrival() {
            return countryArrival;
        }

        /**
         * Sets the value of the countryArrival property.
         * 
         * @param value
         *     allowed object is
         *     {@link AffinityCountryArriveType }
         *     
         */
        public void setCountryArrival(AffinityCountryArriveType value) {
            this.countryArrival = value;
        }

        /**
         * Gets the value of the referencePointArrival property.
         * 
         * @return
         *     possible object is
         *     {@link AffinityReferencePointArriveType }
         *     
         */
        public AffinityReferencePointArriveType getReferencePointArrival() {
            return referencePointArrival;
        }

        /**
         * Sets the value of the referencePointArrival property.
         * 
         * @param value
         *     allowed object is
         *     {@link AffinityReferencePointArriveType }
         *     
         */
        public void setReferencePointArrival(AffinityReferencePointArriveType value) {
            this.referencePointArrival = value;
        }

        /**
         * Gets the value of the stateProvArrival property.
         * 
         * @return
         *     possible object is
         *     {@link AffinityStateProvArriveType }
         *     
         */
        public AffinityStateProvArriveType getStateProvArrival() {
            return stateProvArrival;
        }

        /**
         * Sets the value of the stateProvArrival property.
         * 
         * @param value
         *     allowed object is
         *     {@link AffinityStateProvArriveType }
         *     
         */
        public void setStateProvArrival(AffinityStateProvArriveType value) {
            this.stateProvArrival = value;
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

    }

}