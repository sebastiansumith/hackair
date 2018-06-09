
package org.iata.iata.edist;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A data type for Flight Origin with Additional Location Preference and Date/Time Qualifiers.
 * 
 * <p>Java class for FltDepartQualifiedQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FltDepartQualifiedQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="LocationCode" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>AirportCitySimpleType">
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}PreferenceAttrGroup"/>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.iata.org/IATA/EDIST}TimeSimpleType" minOccurs="0"/>
 *         &lt;element name="LeadPricing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="2">
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}LeadDatePeriod"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}LeadTimePeriod"/>
 *                 &lt;/choice>
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
@XmlType(name = "FltDepartQualifiedQueryType", propOrder = {
    "rest"
})
public class FltDepartQualifiedQueryType
    extends KeyWithMetaObjectBaseType
{

    @XmlElementRefs({
        @XmlElementRef(name = "LocationCode", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Date", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LeadPricing", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Time", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Time" is used by two different parts of a schema. See: 
     * line 25565 of http://demo.ibsplc.aero/iRes_NdcRes_WS/services/NdcResServiceSOAPPort?xsd=../../xsd/ndcres/edist_commontypes.xsd
     * line 895 of http://demo.ibsplc.aero/iRes_NdcRes_WS/services/NdcResServiceSOAPPort?xsd=../../xsd/ndcres/edist_structures.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FltDepartQualifiedQueryType.LocationCode }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link FltDepartQualifiedQueryType.LeadPricing }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
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
     *       &lt;choice maxOccurs="2">
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}LeadDatePeriod"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}LeadTimePeriod"/>
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
        "leadDatePeriodOrLeadTimePeriod"
    })
    public static class LeadPricing {

        @XmlElements({
            @XmlElement(name = "LeadDatePeriod", type = LeadDatePeriodType.class),
            @XmlElement(name = "LeadTimePeriod", type = LeadTimePeriodType.class)
        })
        protected List<AssociatedObjectBaseType> leadDatePeriodOrLeadTimePeriod;

        /**
         * Gets the value of the leadDatePeriodOrLeadTimePeriod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the leadDatePeriodOrLeadTimePeriod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLeadDatePeriodOrLeadTimePeriod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LeadDatePeriodType }
         * {@link LeadTimePeriodType }
         * 
         * 
         */
        public List<AssociatedObjectBaseType> getLeadDatePeriodOrLeadTimePeriod() {
            if (leadDatePeriodOrLeadTimePeriod == null) {
                leadDatePeriodOrLeadTimePeriod = new ArrayList<AssociatedObjectBaseType>();
            }
            return this.leadDatePeriodOrLeadTimePeriod;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>AirportCitySimpleType">
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}PreferenceAttrGroup"/>
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}RadiusAttrGroup"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LocationCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "PreferencesLevel")
        protected String preferencesLevel;
        @XmlAttribute(name = "PreferencesContext")
        protected String preferencesContext;
        @XmlAttribute(name = "Application")
        protected String application;
        @XmlAttribute(name = "Area")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger area;
        @XmlAttribute(name = "UOM")
        protected DistanceUnitListType uom;

        /**
         * Examples: JFK, NYC
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

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

        /**
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplication(String value) {
            this.application = value;
        }

        /**
         * Gets the value of the area property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getArea() {
            return area;
        }

        /**
         * Sets the value of the area property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setArea(BigInteger value) {
            this.area = value;
        }

        /**
         * Gets the value of the uom property.
         * 
         * @return
         *     possible object is
         *     {@link DistanceUnitListType }
         *     
         */
        public DistanceUnitListType getUOM() {
            return uom;
        }

        /**
         * Sets the value of the uom property.
         * 
         * @param value
         *     allowed object is
         *     {@link DistanceUnitListType }
         *     
         */
        public void setUOM(DistanceUnitListType value) {
            this.uom = value;
        }

    }

}
