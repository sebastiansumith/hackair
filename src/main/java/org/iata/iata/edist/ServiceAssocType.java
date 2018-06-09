
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Service Associations.
 * 
 * <p>Java class for ServiceAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAssocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Traveler" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="AllTravelerInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TravelerReferences"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Flight" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="AllFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="AllOriginDestinationInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="AllSegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;choice>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestinationReferences"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/>
 *                   &lt;/choice>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Offer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferReferences"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherAssociations" type="{http://www.iata.org/IATA/EDIST}ServiceOtherAssocType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAssocType", propOrder = {
    "traveler",
    "flight",
    "offer",
    "otherAssociations",
    "seatReference"
})
@XmlSeeAlso({
    org.iata.iata.edist.ServiceCoreType.Associations.class
})
public class ServiceAssocType {

    @XmlElement(name = "Traveler")
    protected ServiceAssocType.Traveler traveler;
    @XmlElement(name = "Flight")
    protected ServiceAssocType.Flight flight;
    @XmlElement(name = "Offer")
    protected ServiceAssocType.Offer offer;
    @XmlElement(name = "OtherAssociations")
    protected ServiceOtherAssocType otherAssociations;
    @XmlElement(name = "SeatReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object seatReference;

    /**
     * Gets the value of the traveler property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAssocType.Traveler }
     *     
     */
    public ServiceAssocType.Traveler getTraveler() {
        return traveler;
    }

    /**
     * Sets the value of the traveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAssocType.Traveler }
     *     
     */
    public void setTraveler(ServiceAssocType.Traveler value) {
        this.traveler = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAssocType.Flight }
     *     
     */
    public ServiceAssocType.Flight getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAssocType.Flight }
     *     
     */
    public void setFlight(ServiceAssocType.Flight value) {
        this.flight = value;
    }

    /**
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAssocType.Offer }
     *     
     */
    public ServiceAssocType.Offer getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAssocType.Offer }
     *     
     */
    public void setOffer(ServiceAssocType.Offer value) {
        this.offer = value;
    }

    /**
     * Gets the value of the otherAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOtherAssocType }
     *     
     */
    public ServiceOtherAssocType getOtherAssociations() {
        return otherAssociations;
    }

    /**
     * Sets the value of the otherAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOtherAssocType }
     *     
     */
    public void setOtherAssociations(ServiceOtherAssocType value) {
        this.otherAssociations = value;
    }

    /**
     * Gets the value of the seatReference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSeatReference() {
        return seatReference;
    }

    /**
     * Sets the value of the seatReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSeatReference(Object value) {
        this.seatReference = value;
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
     *       &lt;choice>
     *         &lt;element name="AllFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="AllOriginDestinationInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="AllSegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;choice>
     *           &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestinationReferences"/>
     *           &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/>
     *         &lt;/choice>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allFlightInd",
        "allOriginDestinationInd",
        "allSegmentInd",
        "originDestinationReferences",
        "segmentReferences"
    })
    public static class Flight {

        @XmlElement(name = "AllFlightInd")
        protected Boolean allFlightInd;
        @XmlElement(name = "AllOriginDestinationInd")
        protected Boolean allOriginDestinationInd;
        @XmlElement(name = "AllSegmentInd")
        protected Boolean allSegmentInd;
        @XmlList
        @XmlElement(name = "OriginDestinationReferences")
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> originDestinationReferences;
        @XmlElement(name = "SegmentReferences")
        protected SegmentReferences segmentReferences;

        /**
         * Gets the value of the allFlightInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllFlightInd() {
            return allFlightInd;
        }

        /**
         * Sets the value of the allFlightInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllFlightInd(Boolean value) {
            this.allFlightInd = value;
        }

        /**
         * Gets the value of the allOriginDestinationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllOriginDestinationInd() {
            return allOriginDestinationInd;
        }

        /**
         * Sets the value of the allOriginDestinationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllOriginDestinationInd(Boolean value) {
            this.allOriginDestinationInd = value;
        }

        /**
         * Gets the value of the allSegmentInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllSegmentInd() {
            return allSegmentInd;
        }

        /**
         * Sets the value of the allSegmentInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllSegmentInd(Boolean value) {
            this.allSegmentInd = value;
        }

        /**
         * Gets the value of the originDestinationReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestinationReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestinationReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getOriginDestinationReferences() {
            if (originDestinationReferences == null) {
                originDestinationReferences = new ArrayList<Object>();
            }
            return this.originDestinationReferences;
        }

        /**
         * Gets the value of the segmentReferences property.
         * 
         * @return
         *     possible object is
         *     {@link SegmentReferences }
         *     
         */
        public SegmentReferences getSegmentReferences() {
            return segmentReferences;
        }

        /**
         * Sets the value of the segmentReferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentReferences }
         *     
         */
        public void setSegmentReferences(SegmentReferences value) {
            this.segmentReferences = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferReferences"/>
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
        "offerReferences"
    })
    public static class Offer {

        @XmlList
        @XmlElement(name = "OfferReferences", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> offerReferences;

        /**
         * Gets the value of the offerReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getOfferReferences() {
            if (offerReferences == null) {
                offerReferences = new ArrayList<Object>();
            }
            return this.offerReferences;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="AllTravelerInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TravelerReferences"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allTravelerInd",
        "travelerReferences"
    })
    public static class Traveler {

        @XmlElement(name = "AllTravelerInd")
        protected Boolean allTravelerInd;
        @XmlList
        @XmlElement(name = "TravelerReferences")
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> travelerReferences;

        /**
         * Gets the value of the allTravelerInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllTravelerInd() {
            return allTravelerInd;
        }

        /**
         * Sets the value of the allTravelerInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllTravelerInd(Boolean value) {
            this.allTravelerInd = value;
        }

        /**
         * Association to multiple Traveler instance(s). Example: Traveler1 Traveler2
         * 
         * Note: May be Recognized or Anonymous Traveler (by PTC) instance(s).Gets the value of the travelerReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelerReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelerReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getTravelerReferences() {
            if (travelerReferences == null) {
                travelerReferences = new ArrayList<Object>();
            }
            return this.travelerReferences;
        }

    }

}
