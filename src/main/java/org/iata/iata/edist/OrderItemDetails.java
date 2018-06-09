
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="OrderItemDetail" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderCommision"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderInstructions"/>
 *                 &lt;/choice>
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
    "orderItemDetail"
})
@XmlRootElement(name = "OrderItemDetails")
public class OrderItemDetails {

    @XmlElement(name = "OrderItemDetail", required = true)
    protected List<OrderItemDetails.OrderItemDetail> orderItemDetail;

    /**
     * Gets the value of the orderItemDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemDetails.OrderItemDetail }
     * 
     * 
     */
    public List<OrderItemDetails.OrderItemDetail> getOrderItemDetail() {
        if (orderItemDetail == null) {
            orderItemDetail = new ArrayList<OrderItemDetails.OrderItemDetail>();
        }
        return this.orderItemDetail;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderCommision"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OrderInstructions"/>
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
        "orderCommision",
        "orderInstructions"
    })
    public static class OrderItemDetail {

        @XmlElement(name = "OrderCommision")
        protected OrderCommissionType orderCommision;
        @XmlElement(name = "OrderInstructions")
        protected OrderInstructions orderInstructions;

        /**
         * Details of the commission claimed by a Travel Agent for selling air transportation/services on behalf of an airline.
         * 
         * @return
         *     possible object is
         *     {@link OrderCommissionType }
         *     
         */
        public OrderCommissionType getOrderCommision() {
            return orderCommision;
        }

        /**
         * Sets the value of the orderCommision property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderCommissionType }
         *     
         */
        public void setOrderCommision(OrderCommissionType value) {
            this.orderCommision = value;
        }

        /**
         * Gets the value of the orderInstructions property.
         * 
         * @return
         *     possible object is
         *     {@link OrderInstructions }
         *     
         */
        public OrderInstructions getOrderInstructions() {
            return orderInstructions;
        }

        /**
         * Sets the value of the orderInstructions property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderInstructions }
         *     
         */
        public void setOrderInstructions(OrderInstructions value) {
            this.orderInstructions = value;
        }

    }

}
