
package org.iata.iata.edist;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Maximum Flight Segment Travel Time.
 * 
 * <p>Java class for FltSegmentMaxTimePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FltSegmentMaxTimePreferencesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="MaxFlightTime">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TimeAmount">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="UOM">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Days"/>
 *                         &lt;enumeration value="Hours"/>
 *                         &lt;enumeration value="Minutes"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}PreferenceAttrGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FltSegmentMaxTimePreferencesType", propOrder = {
    "maxFlightTime"
})
public class FltSegmentMaxTimePreferencesType
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "MaxFlightTime", required = true)
    protected FltSegmentMaxTimePreferencesType.MaxFlightTime maxFlightTime;
    @XmlAttribute(name = "PreferencesLevel")
    protected String preferencesLevel;
    @XmlAttribute(name = "PreferencesContext")
    protected String preferencesContext;

    /**
     * Gets the value of the maxFlightTime property.
     * 
     * @return
     *     possible object is
     *     {@link FltSegmentMaxTimePreferencesType.MaxFlightTime }
     *     
     */
    public FltSegmentMaxTimePreferencesType.MaxFlightTime getMaxFlightTime() {
        return maxFlightTime;
    }

    /**
     * Sets the value of the maxFlightTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltSegmentMaxTimePreferencesType.MaxFlightTime }
     *     
     */
    public void setMaxFlightTime(FltSegmentMaxTimePreferencesType.MaxFlightTime value) {
        this.maxFlightTime = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TimeAmount">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="UOM">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Days"/>
     *               &lt;enumeration value="Hours"/>
     *               &lt;enumeration value="Minutes"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "timeAmount",
        "uom"
    })
    public static class MaxFlightTime {

        @XmlElement(name = "TimeAmount", required = true)
        protected BigDecimal timeAmount;
        @XmlElement(name = "UOM", required = true)
        protected String uom;

        /**
         * Gets the value of the timeAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTimeAmount() {
            return timeAmount;
        }

        /**
         * Sets the value of the timeAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTimeAmount(BigDecimal value) {
            this.timeAmount = value;
        }

        /**
         * Gets the value of the uom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUOM() {
            return uom;
        }

        /**
         * Sets the value of the uom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUOM(String value) {
            this.uom = value;
        }

    }

}