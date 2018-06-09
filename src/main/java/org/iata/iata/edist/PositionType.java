
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * POSITION AND GEOCODING helper object.
 * 
 * <p>Java class for PositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Latitude" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Sign">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="SOUTH"/>
 *                       &lt;enumeration value="NORTH"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Minute" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
 *                 &lt;attribute name="Second" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Longitude" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Sign">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="EAST"/>
 *                       &lt;enumeration value="WEST"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Minute" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
 *                 &lt;attribute name="Second" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Altitude" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Unit" type="{http://www.iata.org/IATA/EDIST}DistanceUnitSimpleType" />
 *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NAC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "PositionType", propOrder = {
    "latitude",
    "longitude",
    "altitude",
    "nac"
})
@XmlSeeAlso({
    Position.class
})
public class PositionType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Latitude")
    protected PositionType.Latitude latitude;
    @XmlElement(name = "Longitude")
    protected PositionType.Longitude longitude;
    @XmlElement(name = "Altitude")
    protected PositionType.Altitude altitude;
    @XmlElement(name = "NAC")
    protected String nac;

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType.Latitude }
     *     
     */
    public PositionType.Latitude getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType.Latitude }
     *     
     */
    public void setLatitude(PositionType.Latitude value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType.Longitude }
     *     
     */
    public PositionType.Longitude getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType.Longitude }
     *     
     */
    public void setLongitude(PositionType.Longitude value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType.Altitude }
     *     
     */
    public PositionType.Altitude getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType.Altitude }
     *     
     */
    public void setAltitude(PositionType.Altitude value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the nac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAC() {
        return nac;
    }

    /**
     * Sets the value of the nac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAC(String value) {
        this.nac = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="Unit" type="{http://www.iata.org/IATA/EDIST}DistanceUnitSimpleType" />
     *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
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
    public static class Altitude {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Unit")
        protected String unit;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * Gets the value of the value property.
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
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

        /**
         * Gets the value of the context property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContext() {
            return context;
        }

        /**
         * Sets the value of the context property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContext(String value) {
            this.context = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="Sign">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="SOUTH"/>
     *             &lt;enumeration value="NORTH"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Minute" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
     *       &lt;attribute name="Second" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
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
    public static class Latitude {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Sign")
        protected String sign;
        @XmlAttribute(name = "Minute")
        protected String minute;
        @XmlAttribute(name = "Second")
        protected String second;

        /**
         * Gets the value of the value property.
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
         * Gets the value of the sign property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSign() {
            return sign;
        }

        /**
         * Sets the value of the sign property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSign(String value) {
            this.sign = value;
        }

        /**
         * Gets the value of the minute property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinute() {
            return minute;
        }

        /**
         * Sets the value of the minute property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinute(String value) {
            this.minute = value;
        }

        /**
         * Gets the value of the second property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecond() {
            return second;
        }

        /**
         * Sets the value of the second property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecond(String value) {
            this.second = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="Sign">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="EAST"/>
     *             &lt;enumeration value="WEST"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Minute" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
     *       &lt;attribute name="Second" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" />
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
    public static class Longitude {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Sign")
        protected String sign;
        @XmlAttribute(name = "Minute")
        protected String minute;
        @XmlAttribute(name = "Second")
        protected String second;

        /**
         * Gets the value of the value property.
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
         * Gets the value of the sign property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSign() {
            return sign;
        }

        /**
         * Sets the value of the sign property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSign(String value) {
            this.sign = value;
        }

        /**
         * Gets the value of the minute property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinute() {
            return minute;
        }

        /**
         * Sets the value of the minute property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinute(String value) {
            this.minute = value;
        }

        /**
         * Gets the value of the second property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecond() {
            return second;
        }

        /**
         * Sets the value of the second property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecond(String value) {
            this.second = value;
        }

    }

}
