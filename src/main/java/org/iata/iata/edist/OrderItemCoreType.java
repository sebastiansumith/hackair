
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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * CORE ORDER ITEM definition.
 * 
 * <p>Java class for OrderItemCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderItem" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatItem" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OtherItem" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightItem" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}BaggageItem" minOccurs="0"/>
 *                   &lt;element name="TimeLimits" type="{http://www.iata.org/IATA/EDIST}OrderItemTimeLimitsType" minOccurs="0"/>
 *                   &lt;element name="InventoryGuarantee" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}InvGuaranteeTimeLimits"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Associations" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Passengers" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}IncludedService" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}AssociatedService" minOccurs="0"/>
 *                             &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
 *                                     &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Disclosures" minOccurs="0"/>
 *                   &lt;element name="Penalty" type="{http://www.iata.org/IATA/EDIST}OrderPenaltyType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemDetails" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "OrderItemCoreType", propOrder = {
    "orderItem"
})
@XmlSeeAlso({
    org.iata.iata.edist.ItinReshopRQ.Query.RepriceOnly.OrderItems.class,
    OrderItemDetailType.class
})
public class OrderItemCoreType {

    @XmlElement(name = "OrderItem", required = true)
    protected List<OrderItemCoreType.OrderItem> orderItem;

    /**
     * Gets the value of the orderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemCoreType.OrderItem }
     * 
     * 
     */
    public List<OrderItemCoreType.OrderItem> getOrderItem() {
        if (orderItem == null) {
            orderItem = new ArrayList<OrderItemCoreType.OrderItem>();
        }
        return this.orderItem;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatItem" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OtherItem" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightItem" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BaggageItem" minOccurs="0"/>
     *         &lt;element name="TimeLimits" type="{http://www.iata.org/IATA/EDIST}OrderItemTimeLimitsType" minOccurs="0"/>
     *         &lt;element name="InventoryGuarantee" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}InvGuaranteeTimeLimits"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Associations" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Passengers" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}IncludedService" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AssociatedService" minOccurs="0"/>
     *                   &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
     *                           &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Disclosures" minOccurs="0"/>
     *         &lt;element name="Penalty" type="{http://www.iata.org/IATA/EDIST}OrderPenaltyType" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemDetails" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orderItemID",
        "seatItem",
        "otherItem",
        "flightItem",
        "baggageItem",
        "timeLimits",
        "inventoryGuarantee",
        "associations",
        "disclosures",
        "penalty",
        "orderItemDetails"
    })
    public static class OrderItem
        extends KeyWithMetaObjectBaseType
    {

        @XmlElement(name = "OrderItemID")
        protected ItemIDType orderItemID;
        @XmlElement(name = "SeatItem")
        protected SeatItem seatItem;
        @XmlElement(name = "OtherItem")
        protected OtherItemType otherItem;
        @XmlElement(name = "FlightItem")
        protected FlightItemType flightItem;
        @XmlElement(name = "BaggageItem")
        protected BaggageItemType baggageItem;
        @XmlElement(name = "TimeLimits")
        protected OrderItemTimeLimitsType timeLimits;
        @XmlElement(name = "InventoryGuarantee")
        protected OrderItemCoreType.OrderItem.InventoryGuarantee inventoryGuarantee;
        @XmlElement(name = "Associations")
        protected OrderItemCoreType.OrderItem.Associations associations;
        @XmlElement(name = "Disclosures")
        protected Disclosures disclosures;
        @XmlElement(name = "Penalty")
        protected OrderPenaltyType penalty;
        @XmlElement(name = "OrderItemDetails")
        protected OrderItemDetails orderItemDetails;

        /**
         * Gets the value of the orderItemID property.
         * 
         * @return
         *     possible object is
         *     {@link ItemIDType }
         *     
         */
        public ItemIDType getOrderItemID() {
            return orderItemID;
        }

        /**
         * Sets the value of the orderItemID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemIDType }
         *     
         */
        public void setOrderItemID(ItemIDType value) {
            this.orderItemID = value;
        }

        /**
         * Gets the value of the seatItem property.
         * 
         * @return
         *     possible object is
         *     {@link SeatItem }
         *     
         */
        public SeatItem getSeatItem() {
            return seatItem;
        }

        /**
         * Sets the value of the seatItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatItem }
         *     
         */
        public void setSeatItem(SeatItem value) {
            this.seatItem = value;
        }

        /**
         * Gets the value of the otherItem property.
         * 
         * @return
         *     possible object is
         *     {@link OtherItemType }
         *     
         */
        public OtherItemType getOtherItem() {
            return otherItem;
        }

        /**
         * Sets the value of the otherItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherItemType }
         *     
         */
        public void setOtherItem(OtherItemType value) {
            this.otherItem = value;
        }

        /**
         * Gets the value of the flightItem property.
         * 
         * @return
         *     possible object is
         *     {@link FlightItemType }
         *     
         */
        public FlightItemType getFlightItem() {
            return flightItem;
        }

        /**
         * Sets the value of the flightItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightItemType }
         *     
         */
        public void setFlightItem(FlightItemType value) {
            this.flightItem = value;
        }

        /**
         * Gets the value of the baggageItem property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageItemType }
         *     
         */
        public BaggageItemType getBaggageItem() {
            return baggageItem;
        }

        /**
         * Sets the value of the baggageItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageItemType }
         *     
         */
        public void setBaggageItem(BaggageItemType value) {
            this.baggageItem = value;
        }

        /**
         * Gets the value of the timeLimits property.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemTimeLimitsType }
         *     
         */
        public OrderItemTimeLimitsType getTimeLimits() {
            return timeLimits;
        }

        /**
         * Sets the value of the timeLimits property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemTimeLimitsType }
         *     
         */
        public void setTimeLimits(OrderItemTimeLimitsType value) {
            this.timeLimits = value;
        }

        /**
         * Gets the value of the inventoryGuarantee property.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemCoreType.OrderItem.InventoryGuarantee }
         *     
         */
        public OrderItemCoreType.OrderItem.InventoryGuarantee getInventoryGuarantee() {
            return inventoryGuarantee;
        }

        /**
         * Sets the value of the inventoryGuarantee property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemCoreType.OrderItem.InventoryGuarantee }
         *     
         */
        public void setInventoryGuarantee(OrderItemCoreType.OrderItem.InventoryGuarantee value) {
            this.inventoryGuarantee = value;
        }

        /**
         * Gets the value of the associations property.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemCoreType.OrderItem.Associations }
         *     
         */
        public OrderItemCoreType.OrderItem.Associations getAssociations() {
            return associations;
        }

        /**
         * Sets the value of the associations property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemCoreType.OrderItem.Associations }
         *     
         */
        public void setAssociations(OrderItemCoreType.OrderItem.Associations value) {
            this.associations = value;
        }

        /**
         * Gets the value of the disclosures property.
         * 
         * @return
         *     possible object is
         *     {@link Disclosures }
         *     
         */
        public Disclosures getDisclosures() {
            return disclosures;
        }

        /**
         * Sets the value of the disclosures property.
         * 
         * @param value
         *     allowed object is
         *     {@link Disclosures }
         *     
         */
        public void setDisclosures(Disclosures value) {
            this.disclosures = value;
        }

        /**
         * Gets the value of the penalty property.
         * 
         * @return
         *     possible object is
         *     {@link OrderPenaltyType }
         *     
         */
        public OrderPenaltyType getPenalty() {
            return penalty;
        }

        /**
         * Sets the value of the penalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderPenaltyType }
         *     
         */
        public void setPenalty(OrderPenaltyType value) {
            this.penalty = value;
        }

        /**
         * Gets the value of the orderItemDetails property.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemDetails }
         *     
         */
        public OrderItemDetails getOrderItemDetails() {
            return orderItemDetails;
        }

        /**
         * Sets the value of the orderItemDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemDetails }
         *     
         */
        public void setOrderItemDetails(OrderItemDetails value) {
            this.orderItemDetails = value;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Passengers" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}IncludedService" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AssociatedService" minOccurs="0"/>
         *         &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
         *                 &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
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
        @XmlType(name = "", propOrder = {
            "orderID",
            "orderItemID",
            "passengers",
            "includedService",
            "associatedService",
            "otherAssociation"
        })
        public static class Associations {

            @XmlElement(name = "OrderID")
            protected OrderIDType orderID;
            @XmlElement(name = "OrderItemID")
            protected List<ItemIDType> orderItemID;
            @XmlElement(name = "Passengers")
            protected OrderItemCoreType.OrderItem.Associations.Passengers passengers;
            @XmlElement(name = "IncludedService")
            protected ServiceInfoAssocType includedService;
            @XmlElement(name = "AssociatedService")
            protected ServiceInfoAssocType associatedService;
            @XmlElement(name = "OtherAssociation")
            protected List<OrderItemCoreType.OrderItem.Associations.OtherAssociation> otherAssociation;

            /**
             * Associated Order ID Example: ORDER7333
             * 
             * @return
             *     possible object is
             *     {@link OrderIDType }
             *     
             */
            public OrderIDType getOrderID() {
                return orderID;
            }

            /**
             * Sets the value of the orderID property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderIDType }
             *     
             */
            public void setOrderID(OrderIDType value) {
                this.orderID = value;
            }

            /**
             * Associated Order Item ID(s). Example: ORD7333-001 Gets the value of the orderItemID property.
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

            /**
             * Gets the value of the passengers property.
             * 
             * @return
             *     possible object is
             *     {@link OrderItemCoreType.OrderItem.Associations.Passengers }
             *     
             */
            public OrderItemCoreType.OrderItem.Associations.Passengers getPassengers() {
                return passengers;
            }

            /**
             * Sets the value of the passengers property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItemCoreType.OrderItem.Associations.Passengers }
             *     
             */
            public void setPassengers(OrderItemCoreType.OrderItem.Associations.Passengers value) {
                this.passengers = value;
            }

            /**
             * Gets the value of the includedService property.
             * 
             * @return
             *     possible object is
             *     {@link ServiceInfoAssocType }
             *     
             */
            public ServiceInfoAssocType getIncludedService() {
                return includedService;
            }

            /**
             * Sets the value of the includedService property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceInfoAssocType }
             *     
             */
            public void setIncludedService(ServiceInfoAssocType value) {
                this.includedService = value;
            }

            /**
             * Gets the value of the associatedService property.
             * 
             * @return
             *     possible object is
             *     {@link ServiceInfoAssocType }
             *     
             */
            public ServiceInfoAssocType getAssociatedService() {
                return associatedService;
            }

            /**
             * Sets the value of the associatedService property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceInfoAssocType }
             *     
             */
            public void setAssociatedService(ServiceInfoAssocType value) {
                this.associatedService = value;
            }

            /**
             * Gets the value of the otherAssociation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the otherAssociation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOtherAssociation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OrderItemCoreType.OrderItem.Associations.OtherAssociation }
             * 
             * 
             */
            public List<OrderItemCoreType.OrderItem.Associations.OtherAssociation> getOtherAssociation() {
                if (otherAssociation == null) {
                    otherAssociation = new ArrayList<OrderItemCoreType.OrderItem.Associations.OtherAssociation>();
                }
                return this.otherAssociation;
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
             *       &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/EDIST}OtherOrderAssocListType" />
             *       &lt;attribute name="ReferenceValue" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class OtherAssociation {

                @XmlAttribute(name = "Type", required = true)
                protected String type;
                @XmlAttribute(name = "ReferenceValue", required = true)
                @XmlIDREF
                @XmlSchemaType(name = "IDREF")
                protected Object referenceValue;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the referenceValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getReferenceValue() {
                    return referenceValue;
                }

                /**
                 * Sets the value of the referenceValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setReferenceValue(Object value) {
                    this.referenceValue = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PassengerReferences"/>
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST}GroupReference"/>
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
                "passengerReferences",
                "groupReference"
            })
            public static class Passengers {

                @XmlList
                @XmlElement(name = "PassengerReferences")
                @XmlIDREF
                @XmlSchemaType(name = "IDREFS")
                protected List<Object> passengerReferences;
                @XmlElement(name = "GroupReference")
                @XmlIDREF
                @XmlSchemaType(name = "IDREF")
                protected Object groupReference;

                /**
                 * 
                 *                                   Association to multiple Passenger instance(s). Example: pax1 pax2
                 *                                 Gets the value of the passengerReferences property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the passengerReferences property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPassengerReferences().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getPassengerReferences() {
                    if (passengerReferences == null) {
                        passengerReferences = new ArrayList<Object>();
                    }
                    return this.passengerReferences;
                }

                /**
                 * Gets the value of the groupReference property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getGroupReference() {
                    return groupReference;
                }

                /**
                 * Sets the value of the groupReference property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setGroupReference(Object value) {
                    this.groupReference = value;
                }

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
         *         &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}InvGuaranteeTimeLimits"/>
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
            "invGuaranteeID",
            "invGuaranteeTimeLimits"
        })
        public static class InventoryGuarantee {

            @XmlElement(name = "InvGuaranteeID", required = true)
            protected String invGuaranteeID;
            @XmlElement(name = "InvGuaranteeTimeLimits", required = true)
            protected InvGuaranteeTimeLimits invGuaranteeTimeLimits;

            /**
             * Gets the value of the invGuaranteeID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvGuaranteeID() {
                return invGuaranteeID;
            }

            /**
             * Sets the value of the invGuaranteeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvGuaranteeID(String value) {
                this.invGuaranteeID = value;
            }

            /**
             * Gets the value of the invGuaranteeTimeLimits property.
             * 
             * @return
             *     possible object is
             *     {@link InvGuaranteeTimeLimits }
             *     
             */
            public InvGuaranteeTimeLimits getInvGuaranteeTimeLimits() {
                return invGuaranteeTimeLimits;
            }

            /**
             * Sets the value of the invGuaranteeTimeLimits property.
             * 
             * @param value
             *     allowed object is
             *     {@link InvGuaranteeTimeLimits }
             *     
             */
            public void setInvGuaranteeTimeLimits(InvGuaranteeTimeLimits value) {
                this.invGuaranteeTimeLimits = value;
            }

        }

    }

}
