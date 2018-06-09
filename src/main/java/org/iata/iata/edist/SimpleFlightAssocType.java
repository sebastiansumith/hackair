
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Specific structure for providing flight associations, would typically associate to flights from a Data List.
 * 
 * <p>Java class for SimpleFlightAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleFlightAssocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestinationReference" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightReferences" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightSegmentReferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleFlightAssocType", propOrder = {
    "originDestinationReference",
    "flightReferences",
    "flightSegmentReferences"
})
@XmlSeeAlso({
    org.iata.iata.edist.SeatAvailabilityRS.Flights.class
})
public class SimpleFlightAssocType {

    @XmlElement(name = "OriginDestinationReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object originDestinationReference;
    @XmlElement(name = "FlightReferences")
    protected FlightReferences flightReferences;
    @XmlElement(name = "FlightSegmentReferences")
    protected FlightSegmentReferences flightSegmentReferences;

    /**
     * Gets the value of the originDestinationReference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOriginDestinationReference() {
        return originDestinationReference;
    }

    /**
     * Sets the value of the originDestinationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOriginDestinationReference(Object value) {
        this.originDestinationReference = value;
    }

    /**
     * Gets the value of the flightReferences property.
     * 
     * @return
     *     possible object is
     *     {@link FlightReferences }
     *     
     */
    public FlightReferences getFlightReferences() {
        return flightReferences;
    }

    /**
     * Sets the value of the flightReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightReferences }
     *     
     */
    public void setFlightReferences(FlightReferences value) {
        this.flightReferences = value;
    }

    /**
     * Gets the value of the flightSegmentReferences property.
     * 
     * @return
     *     possible object is
     *     {@link FlightSegmentReferences }
     *     
     */
    public FlightSegmentReferences getFlightSegmentReferences() {
        return flightSegmentReferences;
    }

    /**
     * Sets the value of the flightSegmentReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightSegmentReferences }
     *     
     */
    public void setFlightSegmentReferences(FlightSegmentReferences value) {
        this.flightSegmentReferences = value;
    }

}