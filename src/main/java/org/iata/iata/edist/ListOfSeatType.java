
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CORE SEAT definition.
 * 
 * <p>Java class for ListOfSeatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSeatType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}DataListObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Location" type="{http://www.iata.org/IATA/EDIST}SeatLocationType"/>
 *         &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSeatType", propOrder = {
    "location",
    "details"
})
public class ListOfSeatType
    extends DataListObjectBaseType
{

    @XmlElement(name = "Location", required = true)
    protected SeatLocationType location;
    @XmlElement(name = "Details")
    protected Object details;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link SeatLocationType }
     *     
     */
    public SeatLocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatLocationType }
     *     
     */
    public void setLocation(SeatLocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDetails(Object value) {
        this.details = value;
    }

}
