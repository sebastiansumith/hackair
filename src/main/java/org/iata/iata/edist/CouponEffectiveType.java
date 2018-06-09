
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * COUPON EFFECTIVE PERIOD definition.
 * 
 * <p>Java class for CouponEffectiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponEffectiveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;choice>
 *         &lt;element name="EffectiveDatePeriod" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType">
 *                 &lt;sequence>
 *                   &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EffectiveDateTimePeriod" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}DateTimePeriodRepType">
 *                 &lt;sequence>
 *                   &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponEffectiveType", propOrder = {
    "effectiveDatePeriod",
    "effectiveDateTimePeriod"
})
public class CouponEffectiveType
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "EffectiveDatePeriod")
    protected CouponEffectiveType.EffectiveDatePeriod effectiveDatePeriod;
    @XmlElement(name = "EffectiveDateTimePeriod")
    protected CouponEffectiveType.EffectiveDateTimePeriod effectiveDateTimePeriod;

    /**
     * Gets the value of the effectiveDatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CouponEffectiveType.EffectiveDatePeriod }
     *     
     */
    public CouponEffectiveType.EffectiveDatePeriod getEffectiveDatePeriod() {
        return effectiveDatePeriod;
    }

    /**
     * Sets the value of the effectiveDatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponEffectiveType.EffectiveDatePeriod }
     *     
     */
    public void setEffectiveDatePeriod(CouponEffectiveType.EffectiveDatePeriod value) {
        this.effectiveDatePeriod = value;
    }

    /**
     * Gets the value of the effectiveDateTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CouponEffectiveType.EffectiveDateTimePeriod }
     *     
     */
    public CouponEffectiveType.EffectiveDateTimePeriod getEffectiveDateTimePeriod() {
        return effectiveDateTimePeriod;
    }

    /**
     * Sets the value of the effectiveDateTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponEffectiveType.EffectiveDateTimePeriod }
     *     
     */
    public void setEffectiveDateTimePeriod(CouponEffectiveType.EffectiveDateTimePeriod value) {
        this.effectiveDateTimePeriod = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}DatePeriodRepType">
     *       &lt;sequence>
     *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
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
        "duration"
    })
    public static class EffectiveDatePeriod
        extends DatePeriodRepType
    {

        @XmlElement(name = "Duration")
        protected Duration duration;

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDuration(Duration value) {
            this.duration = value;
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
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}DateTimePeriodRepType">
     *       &lt;sequence>
     *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
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
        "duration"
    })
    public static class EffectiveDateTimePeriod
        extends DateTimePeriodRepType
    {

        @XmlElement(name = "Duration")
        protected Duration duration;

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDuration(Duration value) {
            this.duration = value;
        }

    }

}
