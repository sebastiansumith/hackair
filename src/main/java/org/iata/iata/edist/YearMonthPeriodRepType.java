
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A data type for Effective/ Expiration Year And Month Date Period Representation.
 * 
 * <p>Java class for YearMonthPeriodRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YearMonthPeriodRepType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Effective" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" minOccurs="0"/>
 *         &lt;element name="Expiration" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YearMonthPeriodRepType", propOrder = {
    "effective",
    "expiration"
})
public class YearMonthPeriodRepType {

    @XmlElement(name = "Effective")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar effective;
    @XmlElement(name = "Expiration")
    @XmlSchemaType(name = "gYearMonth")
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
