
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Item association(s).
 * 
 * <p>Java class for OrderItemAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Passengers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Passenger" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST}GroupType" minOccurs="0"/>
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
 *         &lt;element name="OrderItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OfferItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Services" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherAssociations" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AllPassengersInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WholeItineraryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemAssociationType", propOrder = {
    "passengers",
    "group",
    "flight",
    "orderItems",
    "offerItems",
    "services",
    "otherAssociations"
})
public class OrderItemAssociationType {

    @XmlElement(name = "Passengers")
    protected OrderItemAssociationType.Passengers passengers;
    @XmlElement(name = "Group")
    protected GroupType group;
    @XmlElement(name = "Flight")
    protected OrderItemAssociationType.Flight flight;
    @XmlElement(name = "OrderItems")
    protected OrderItemAssociationType.OrderItems orderItems;
    @XmlElement(name = "OfferItems")
    protected OrderItemAssociationType.OfferItems offerItems;
    @XmlElement(name = "Services")
    protected OrderItemAssociationType.Services services;
    @XmlElement(name = "OtherAssociations")
    protected OtherOrderAssocType otherAssociations;
    @XmlAttribute(name = "AllPassengersInd")
    protected Boolean allPassengersInd;
    @XmlAttribute(name = "WholeItineraryInd")
    protected Boolean wholeItineraryInd;

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType.Passengers }
     *     
     */
    public OrderItemAssociationType.Passengers getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType.Passengers }
     *     
     */
    public void setPassengers(OrderItemAssociationType.Passengers value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link GroupType }
     *     
     */
    public GroupType getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupType }
     *     
     */
    public void setGroup(GroupType value) {
        this.group = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType.Flight }
     *     
     */
    public OrderItemAssociationType.Flight getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType.Flight }
     *     
     */
    public void setFlight(OrderItemAssociationType.Flight value) {
        this.flight = value;
    }

    /**
     * Gets the value of the orderItems property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType.OrderItems }
     *     
     */
    public OrderItemAssociationType.OrderItems getOrderItems() {
        return orderItems;
    }

    /**
     * Sets the value of the orderItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType.OrderItems }
     *     
     */
    public void setOrderItems(OrderItemAssociationType.OrderItems value) {
        this.orderItems = value;
    }

    /**
     * Gets the value of the offerItems property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType.OfferItems }
     *     
     */
    public OrderItemAssociationType.OfferItems getOfferItems() {
        return offerItems;
    }

    /**
     * Sets the value of the offerItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType.OfferItems }
     *     
     */
    public void setOfferItems(OrderItemAssociationType.OfferItems value) {
        this.offerItems = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType.Services }
     *     
     */
    public OrderItemAssociationType.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType.Services }
     *     
     */
    public void setServices(OrderItemAssociationType.Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the otherAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link OtherOrderAssocType }
     *     
     */
    public OtherOrderAssocType getOtherAssociations() {
        return otherAssociations;
    }

    /**
     * Sets the value of the otherAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherOrderAssocType }
     *     
     */
    public void setOtherAssociations(OtherOrderAssocType value) {
        this.otherAssociations = value;
    }

    /**
     * Gets the value of the allPassengersInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllPassengersInd() {
        return allPassengersInd;
    }

    /**
     * Sets the value of the allPassengersInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllPassengersInd(Boolean value) {
        this.allPassengersInd = value;
    }

    /**
     * Gets the value of the wholeItineraryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWholeItineraryInd() {
        return wholeItineraryInd;
    }

    /**
     * Sets the value of the wholeItineraryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWholeItineraryInd(Boolean value) {
        this.wholeItineraryInd = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" maxOccurs="unbounded"/>
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
        "offerItemID"
    })
    public static class OfferItems {

        @XmlElement(name = "OfferItemID", required = true)
        protected List<ItemIDType> offerItemID;

        /**
         * Gets the value of the offerItemID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerItemID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferItemID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemIDType }
         * 
         * 
         */
        public List<ItemIDType> getOfferItemID() {
            if (offerItemID == null) {
                offerItemID = new ArrayList<ItemIDType>();
            }
            return this.offerItemID;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" maxOccurs="unbounded"/>
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
        "orderItemID"
    })
    public static class OrderItems {

        @XmlElement(name = "OrderItemID", required = true)
        protected List<ItemIDType> orderItemID;

        /**
         * Gets the value of the orderItemID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderItemID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrderItemID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemIDType }
         * 
         * 
         */
        public List<ItemIDType> getOrderItemID() {
            if (orderItemID == null) {
                orderItemID = new ArrayList<ItemIDType>();
            }
            return this.orderItemID;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Passenger" maxOccurs="unbounded"/>
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
        "passenger"
    })
    public static class Passengers {

        @XmlElement(name = "Passenger", required = true)
        protected List<Passenger> passenger;

        /**
         * Associated Passenger detail.Gets the value of the passenger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passenger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassenger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Passenger }
         * 
         * 
         */
        public List<Passenger> getPassenger() {
            if (passenger == null) {
                passenger = new ArrayList<Passenger>();
            }
            return this.passenger;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" maxOccurs="unbounded"/>
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
        "serviceID"
    })
    public static class Services {

        @XmlElement(name = "ServiceID", required = true)
        protected List<ServiceIDType> serviceID;

        /**
         * Gets the value of the serviceID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceIDType }
         * 
         * 
         */
        public List<ServiceIDType> getServiceID() {
            if (serviceID == null) {
                serviceID = new ArrayList<ServiceIDType>();
            }
            return this.serviceID;
        }

    }

}
