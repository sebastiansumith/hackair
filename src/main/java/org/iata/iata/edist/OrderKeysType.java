
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Shopping CR: This fulfills the requirement to allow previously ordered items to be used as a shopping session qualifiers.
 * 
 * <p>Java class for OrderKeysType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderKeysType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderID"/>
 *         &lt;element name="AssociatedIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AssociatedID" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderKeysType", propOrder = {
    "orderID",
    "associatedIDs"
})
public class OrderKeysType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "OrderID", required = true)
    protected OrderIDType orderID;
    @XmlElement(name = "AssociatedIDs")
    protected OrderKeysType.AssociatedIDs associatedIDs;

    /**
     * Gets the value of the orderID property.
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
     * Gets the value of the associatedIDs property.
     * 
     * @return
     *     possible object is
     *     {@link OrderKeysType.AssociatedIDs }
     *     
     */
    public OrderKeysType.AssociatedIDs getAssociatedIDs() {
        return associatedIDs;
    }

    /**
     * Sets the value of the associatedIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderKeysType.AssociatedIDs }
     *     
     */
    public void setAssociatedIDs(OrderKeysType.AssociatedIDs value) {
        this.associatedIDs = value;
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
     *         &lt;element name="AssociatedID" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" minOccurs="0"/>
     *                 &lt;/sequence>
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
        "associatedID"
    })
    public static class AssociatedIDs {

        @XmlElement(name = "AssociatedID", required = true)
        protected List<OrderKeysType.AssociatedIDs.AssociatedID> associatedID;

        /**
         * Gets the value of the associatedID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associatedID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociatedID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderKeysType.AssociatedIDs.AssociatedID }
         * 
         * 
         */
        public List<OrderKeysType.AssociatedIDs.AssociatedID> getAssociatedID() {
            if (associatedID == null) {
                associatedID = new ArrayList<OrderKeysType.AssociatedIDs.AssociatedID>();
            }
            return this.associatedID;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderItemID" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferItemID" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ServiceID" minOccurs="0"/>
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
            "orderItemID",
            "offerItemID",
            "serviceID"
        })
        public static class AssociatedID {

            @XmlElement(name = "OrderItemID")
            protected ItemIDType orderItemID;
            @XmlElement(name = "OfferItemID")
            protected ItemIDType offerItemID;
            @XmlElement(name = "ServiceID")
            protected ServiceIDType serviceID;

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
             * Gets the value of the offerItemID property.
             * 
             * @return
             *     possible object is
             *     {@link ItemIDType }
             *     
             */
            public ItemIDType getOfferItemID() {
                return offerItemID;
            }

            /**
             * Sets the value of the offerItemID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemIDType }
             *     
             */
            public void setOfferItemID(ItemIDType value) {
                this.offerItemID = value;
            }

            /**
             * Gets the value of the serviceID property.
             * 
             * @return
             *     possible object is
             *     {@link ServiceIDType }
             *     
             */
            public ServiceIDType getServiceID() {
                return serviceID;
            }

            /**
             * Sets the value of the serviceID property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceIDType }
             *     
             */
            public void setServiceID(ServiceIDType value) {
                this.serviceID = value;
            }

        }

    }

}
