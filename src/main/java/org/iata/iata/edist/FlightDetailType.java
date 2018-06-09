
package org.iata.iata.edist;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * FLIGHT DETAIL definition.
 * 
 * <p>Java class for FlightDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MarriedSegmentType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightSegmentType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightDistance" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightDuration" minOccurs="0"/>
 *         &lt;element name="Stops" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}StopLocations" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ResDateTime" minOccurs="0"/>
 *         &lt;element name="TourOperatorFlightID" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDetailType", propOrder = {
    "marriedSegmentType",
    "flightSegmentType",
    "flightDistance",
    "flightDuration",
    "stops",
    "resDateTime",
    "tourOperatorFlightID"
})
public class FlightDetailType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "MarriedSegmentType")
    protected MarriedSegmentType marriedSegmentType;
    @XmlElement(name = "FlightSegmentType")
    protected CodesetType flightSegmentType;
    @XmlElement(name = "FlightDistance")
    protected FlightDistanceType flightDistance;
    @XmlElement(name = "FlightDuration")
    protected FlightDurationType flightDuration;
    @XmlElement(name = "Stops")
    protected FlightDetailType.Stops stops;
    @XmlElement(name = "ResDateTime")
    protected ResDateTime resDateTime;
    @XmlElement(name = "TourOperatorFlightID")
    protected String tourOperatorFlightID;

    /**
     * Gets the value of the marriedSegmentType property.
     * 
     * @return
     *     possible object is
     *     {@link MarriedSegmentType }
     *     
     */
    public MarriedSegmentType getMarriedSegmentType() {
        return marriedSegmentType;
    }

    /**
     * Sets the value of the marriedSegmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarriedSegmentType }
     *     
     */
    public void setMarriedSegmentType(MarriedSegmentType value) {
        this.marriedSegmentType = value;
    }

    /**
     * Gets the value of the flightSegmentType property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getFlightSegmentType() {
        return flightSegmentType;
    }

    /**
     * Sets the value of the flightSegmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setFlightSegmentType(CodesetType value) {
        this.flightSegmentType = value;
    }

    /**
     * Gets the value of the flightDistance property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDistanceType }
     *     
     */
    public FlightDistanceType getFlightDistance() {
        return flightDistance;
    }

    /**
     * Sets the value of the flightDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDistanceType }
     *     
     */
    public void setFlightDistance(FlightDistanceType value) {
        this.flightDistance = value;
    }

    /**
     * Gets the value of the flightDuration property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDurationType }
     *     
     */
    public FlightDurationType getFlightDuration() {
        return flightDuration;
    }

    /**
     * Sets the value of the flightDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDurationType }
     *     
     */
    public void setFlightDuration(FlightDurationType value) {
        this.flightDuration = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailType.Stops }
     *     
     */
    public FlightDetailType.Stops getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailType.Stops }
     *     
     */
    public void setStops(FlightDetailType.Stops value) {
        this.stops = value;
    }

    /**
     * Gets the value of the resDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ResDateTime }
     *     
     */
    public ResDateTime getResDateTime() {
        return resDateTime;
    }

    /**
     * Sets the value of the resDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResDateTime }
     *     
     */
    public void setResDateTime(ResDateTime value) {
        this.resDateTime = value;
    }

    /**
     * Gets the value of the tourOperatorFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorFlightID() {
        return tourOperatorFlightID;
    }

    /**
     * Sets the value of the tourOperatorFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorFlightID(String value) {
        this.tourOperatorFlightID = value;
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
     *         &lt;element name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}StopLocations" minOccurs="0"/>
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
        "stopQuantity",
        "stopLocations"
    })
    public static class Stops {

        @XmlElement(name = "StopQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger stopQuantity;
        @XmlElement(name = "StopLocations")
        protected StopLocationType stopLocations;

        /**
         * Gets the value of the stopQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStopQuantity() {
            return stopQuantity;
        }

        /**
         * Sets the value of the stopQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStopQuantity(BigInteger value) {
            this.stopQuantity = value;
        }

        /**
         * Gets the value of the stopLocations property.
         * 
         * @return
         *     possible object is
         *     {@link StopLocationType }
         *     
         */
        public StopLocationType getStopLocations() {
            return stopLocations;
        }

        /**
         * Sets the value of the stopLocations property.
         * 
         * @param value
         *     allowed object is
         *     {@link StopLocationType }
         *     
         */
        public void setStopLocations(StopLocationType value) {
            this.stopLocations = value;
        }

    }

}
