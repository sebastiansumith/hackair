
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer Geographic Specification information
 * 
 * <p>Java class for OfferGeographicSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferGeographicSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DirectionalIndicator" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *         &lt;element name="OfferOriginPoint" type="{http://www.iata.org/IATA/EDIST}GeographicSpecificationType" minOccurs="0"/>
 *         &lt;element name="OfferDestinationPoint" type="{http://www.iata.org/IATA/EDIST}GeographicSpecificationType" minOccurs="0"/>
 *         &lt;element name="TravelWithinLocation" type="{http://www.iata.org/IATA/EDIST}GeographicSpecificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferGeographicSpecificationType", propOrder = {
    "directionalIndicator",
    "offerOriginPoint",
    "offerDestinationPoint",
    "travelWithinLocation"
})
public class OfferGeographicSpecificationType {

    @XmlElement(name = "DirectionalIndicator")
    protected CodesetType directionalIndicator;
    @XmlElement(name = "OfferOriginPoint")
    protected GeographicSpecificationType offerOriginPoint;
    @XmlElement(name = "OfferDestinationPoint")
    protected GeographicSpecificationType offerDestinationPoint;
    @XmlElement(name = "TravelWithinLocation")
    protected GeographicSpecificationType travelWithinLocation;

    /**
     * Gets the value of the directionalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getDirectionalIndicator() {
        return directionalIndicator;
    }

    /**
     * Sets the value of the directionalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setDirectionalIndicator(CodesetType value) {
        this.directionalIndicator = value;
    }

    /**
     * Gets the value of the offerOriginPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public GeographicSpecificationType getOfferOriginPoint() {
        return offerOriginPoint;
    }

    /**
     * Sets the value of the offerOriginPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public void setOfferOriginPoint(GeographicSpecificationType value) {
        this.offerOriginPoint = value;
    }

    /**
     * Gets the value of the offerDestinationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public GeographicSpecificationType getOfferDestinationPoint() {
        return offerDestinationPoint;
    }

    /**
     * Sets the value of the offerDestinationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public void setOfferDestinationPoint(GeographicSpecificationType value) {
        this.offerDestinationPoint = value;
    }

    /**
     * Gets the value of the travelWithinLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public GeographicSpecificationType getTravelWithinLocation() {
        return travelWithinLocation;
    }

    /**
     * Sets the value of the travelWithinLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSpecificationType }
     *     
     */
    public void setTravelWithinLocation(GeographicSpecificationType value) {
        this.travelWithinLocation = value;
    }

}
