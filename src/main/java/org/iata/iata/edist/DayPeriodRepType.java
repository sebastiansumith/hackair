
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Effective/ Expiration Day of Week Date Period Representation.
 * 
 * <p>Java class for DayPeriodRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayPeriodRepType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Effective" type="{http://www.iata.org/IATA/EDIST}DayRepType" minOccurs="0"/>
 *         &lt;element name="Expiration" type="{http://www.iata.org/IATA/EDIST}DayRepType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayPeriodRepType", propOrder = {
    "effective",
    "expiration"
})
public class DayPeriodRepType {

    @XmlElement(name = "Effective")
    protected DayRepType effective;
    @XmlElement(name = "Expiration")
    protected DayRepType expiration;

    /**
     * Gets the value of the effective property.
     * 
     * @return
     *     possible object is
     *     {@link DayRepType }
     *     
     */
    public DayRepType getEffective() {
        return effective;
    }

    /**
     * Sets the value of the effective property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayRepType }
     *     
     */
    public void setEffective(DayRepType value) {
        this.effective = value;
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link DayRepType }
     *     
     */
    public DayRepType getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayRepType }
     *     
     */
    public void setExpiration(DayRepType value) {
        this.expiration = value;
    }

}
