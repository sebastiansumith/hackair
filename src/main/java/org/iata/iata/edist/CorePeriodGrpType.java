
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A data type definition for Commonly Used Effective (start) and Expiration (end) Period.
 * 
 * <p>Java class for CorePeriodGrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorePeriodGrpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.iata.org/IATA/EDIST}DatePeriodType" minOccurs="0"/>
 *         &lt;element name="DateTime" type="{http://www.iata.org/IATA/EDIST}DateTimePeriodType" minOccurs="0"/>
 *         &lt;element name="TimeStamp" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Effective" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="Expiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
@XmlType(name = "CorePeriodGrpType", propOrder = {
    "date",
    "dateTime",
    "timeStamp"
})
@XmlSeeAlso({
    org.iata.iata.edist.PolicyType.Metadata.ValidPeriod.class
})
public class CorePeriodGrpType {

    @XmlElement(name = "Date")
    protected DatePeriodType date;
    @XmlElement(name = "DateTime")
    protected DateTimePeriodType dateTime;
    @XmlElement(name = "TimeStamp")
    protected CorePeriodGrpType.TimeStamp timeStamp;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setDate(DatePeriodType value) {
        this.date = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodType }
     *     
     */
    public DateTimePeriodType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodType }
     *     
     */
    public void setDateTime(DateTimePeriodType value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link CorePeriodGrpType.TimeStamp }
     *     
     */
    public CorePeriodGrpType.TimeStamp getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorePeriodGrpType.TimeStamp }
     *     
     */
    public void setTimeStamp(CorePeriodGrpType.TimeStamp value) {
        this.timeStamp = value;
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
     *       &lt;attribute name="Effective" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="Expiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TimeStamp {

        @XmlAttribute(name = "Effective")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar effective;
        @XmlAttribute(name = "Expiration")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar expiration;

        /**
         * Gets the value of the effective property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffective() {
            return effective;
        }

        /**
         * Sets the value of the effective property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffective(XMLGregorianCalendar value) {
            this.effective = value;
        }

        /**
         * Gets the value of the expiration property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpiration() {
            return expiration;
        }

        /**
         * Sets the value of the expiration property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpiration(XMLGregorianCalendar value) {
            this.expiration = value;
        }

    }

}