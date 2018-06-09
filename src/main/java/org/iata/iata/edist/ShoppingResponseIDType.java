
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * SHOPPING RESPONSE object definition.
 * 
 * <p>Java class for ShoppingResponseID_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingResponseID_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Owner" type="{http://www.iata.org/IATA/EDIST}AirlineDesigSimpleType" minOccurs="0"/>
 *         &lt;element name="ResponseID">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>UniqueStringID_SimpleType">
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "ShoppingResponseID_Type", propOrder = {
    "owner",
    "responseID",
    "associatedIDs"
})
public class ShoppingResponseIDType
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "Owner")
    protected String owner;
    @XmlElement(name = "ResponseID", required = true)
    protected ShoppingResponseIDType.ResponseID responseID;
    @XmlElement(name = "AssociatedIDs")
    protected ShoppingResponseIDType.AssociatedIDs associatedIDs;

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the responseID property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseIDType.ResponseID }
     *     
     */
    public ShoppingResponseIDType.ResponseID getResponseID() {
        return responseID;
    }

    /**
     * Sets the value of the responseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseIDType.ResponseID }
     *     
     */
    public void setResponseID(ShoppingResponseIDType.ResponseID value) {
        this.responseID = value;
    }

    /**
     * Gets the value of the associatedIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseIDType.AssociatedIDs }
     *     
     */
    public ShoppingResponseIDType.AssociatedIDs getAssociatedIDs() {
        return associatedIDs;
    }

    /**
     * Sets the value of the associatedIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseIDType.AssociatedIDs }
     *     
     */
    public void setAssociatedIDs(ShoppingResponseIDType.AssociatedIDs value) {
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
        protected List<ShoppingResponseIDType.AssociatedIDs.AssociatedID> associatedID;

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
         * {@link ShoppingResponseIDType.AssociatedIDs.AssociatedID }
         * 
         * 
         */
        public List<ShoppingResponseIDType.AssociatedIDs.AssociatedID> getAssociatedID() {
            if (associatedID == null) {
                associatedID = new ArrayList<ShoppingResponseIDType.AssociatedIDs.AssociatedID>();
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
            "offerItemID",
            "serviceID"
        })
        public static class AssociatedID {

            @XmlElement(name = "OfferItemID")
            protected ItemIDType offerItemID;
            @XmlElement(name = "ServiceID")
            protected ServiceIDType serviceID;

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>UniqueStringID_SimpleType">
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ResponseID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * A data type for a Unique String Identifier constraint.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the refs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getRefs() {
            if (refs == null) {
                refs = new ArrayList<Object>();
            }
            return this.refs;
        }

    }

}
