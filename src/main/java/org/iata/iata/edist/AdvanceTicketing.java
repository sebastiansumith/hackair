
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.Duration;


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
 *         &lt;element name="AdvanceReservation">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>duration">
 *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}AdvPurchaseSimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdvanceDeparture">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>duration">
 *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}AdvPurchaseSimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
    "advanceReservation",
    "advanceDeparture"
})
@XmlRootElement(name = "AdvanceTicketing")
public class AdvanceTicketing {

    @XmlElement(name = "AdvanceReservation", required = true)
    protected AdvanceTicketing.AdvanceReservation advanceReservation;
    @XmlElement(name = "AdvanceDeparture", required = true)
    protected AdvanceTicketing.AdvanceDeparture advanceDeparture;

    /**
     * Gets the value of the advanceReservation property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceTicketing.AdvanceReservation }
     *     
     */
    public AdvanceTicketing.AdvanceReservation getAdvanceReservation() {
        return advanceReservation;
    }

    /**
     * Sets the value of the advanceReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceTicketing.AdvanceReservation }
     *     
     */
    public void setAdvanceReservation(AdvanceTicketing.AdvanceReservation value) {
        this.advanceReservation = value;
    }

    /**
     * Gets the value of the advanceDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceTicketing.AdvanceDeparture }
     *     
     */
    public AdvanceTicketing.AdvanceDeparture getAdvanceDeparture() {
        return advanceDeparture;
    }

    /**
     * Sets the value of the advanceDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceTicketing.AdvanceDeparture }
     *     
     */
    public void setAdvanceDeparture(AdvanceTicketing.AdvanceDeparture value) {
        this.advanceDeparture = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>duration">
     *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}AdvPurchaseSimpleType" />
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
    public static class AdvanceDeparture {

        @XmlValue
        protected Duration value;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setValue(Duration value) {
            this.value = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>duration">
     *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}AdvPurchaseSimpleType" />
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
    public static class AdvanceReservation {

        @XmlValue
        protected Duration value;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setValue(Duration value) {
            this.value = value;
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

}
