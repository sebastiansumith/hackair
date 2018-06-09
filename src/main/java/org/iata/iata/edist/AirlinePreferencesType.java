
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * AIRLINE SUPPLIER Preferences.
 * 
 * <p>Java class for AirlinePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlinePreferencesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Airline" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineID"/>
 *                   &lt;element name="GeoIndicatorType" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *                   &lt;element name="FlightHaulLength" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}PreferenceAttrGroup"/>
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
@XmlType(name = "AirlinePreferencesType", propOrder = {
    "airline"
})
public class AirlinePreferencesType
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "Airline", required = true)
    protected List<AirlinePreferencesType.Airline> airline;

    /**
     * Gets the value of the airline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlinePreferencesType.Airline }
     * 
     * 
     */
    public List<AirlinePreferencesType.Airline> getAirline() {
        if (airline == null) {
            airline = new ArrayList<AirlinePreferencesType.Airline>();
        }
        return this.airline;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineID"/>
     *         &lt;element name="GeoIndicatorType" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
     *         &lt;element name="FlightHaulLength" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}PreferenceAttrGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airlineID",
        "geoIndicatorType",
        "flightHaulLength"
    })
    public static class Airline {

        @XmlElement(name = "AirlineID", required = true)
        protected AirlineID airlineID;
        @XmlElement(name = "GeoIndicatorType")
        protected CodesetType geoIndicatorType;
        @XmlElement(name = "FlightHaulLength")
        protected CodesetType flightHaulLength;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "PreferencesLevel")
        protected String preferencesLevel;
        @XmlAttribute(name = "PreferencesContext")
        protected String preferencesContext;

        /**
         * Gets the value of the airlineID property.
         * 
         * @return
         *     possible object is
         *     {@link AirlineID }
         *     
         */
        public AirlineID getAirlineID() {
            return airlineID;
        }

        /**
         * Sets the value of the airlineID property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirlineID }
         *     
         */
        public void setAirlineID(AirlineID value) {
            this.airlineID = value;
        }

        /**
         * Gets the value of the geoIndicatorType property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetType }
         *     
         */
        public CodesetType getGeoIndicatorType() {
            return geoIndicatorType;
        }

        /**
         * Sets the value of the geoIndicatorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetType }
         *     
         */
        public void setGeoIndicatorType(CodesetType value) {
            this.geoIndicatorType = value;
        }

        /**
         * Gets the value of the flightHaulLength property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetType }
         *     
         */
        public CodesetType getFlightHaulLength() {
            return flightHaulLength;
        }

        /**
         * Sets the value of the flightHaulLength property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetType }
         *     
         */
        public void setFlightHaulLength(CodesetType value) {
            this.flightHaulLength = value;
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
