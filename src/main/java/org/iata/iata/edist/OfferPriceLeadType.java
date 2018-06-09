
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * LEAD PRICING CALENDAR Pricing definition.
 * 
 * Price information for alternate dates.
 * 
 * Notes:
 *  1. This is based on lead pricing specified in the AirShoppingRQ/ AttributeQuery/Flight node Arrival and/ or Departure elements.
 * 
 *  2. This capability may not be supported by all NDC-enabled systems or may be supported by bilateral agreement only.The technical implementation of this capability is not dictated by this specification.
 * 
 *  3. If implemented, the client application will typically send new a new shopping request if any of these window shopping dates are selected.
 * 
 * <p>Java class for OfferPriceLeadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferPriceLeadType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="RequestedDate">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferPriceLeadDetailType">
 *                 &lt;sequence>
 *                   &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}PricedFlightOfferAssocType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OfferItemID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferPriceLeadType", propOrder = {
    "requestedDate",
    "fareDetail"
})
@XmlSeeAlso({
    org.iata.iata.edist.PricedFlightOfferType.OfferPrice.class,
    org.iata.iata.edist.PricedFlightOfferCoreType.OfferPrice.class
})
public class OfferPriceLeadType
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "RequestedDate", required = true)
    protected OfferPriceLeadType.RequestedDate requestedDate;
    @XmlElement(name = "FareDetail")
    protected FareDetailType fareDetail;
    @XmlAttribute(name = "OfferItemID")
    @XmlSchemaType(name = "anySimpleType")
    protected String offerItemID;

    /**
     * Gets the value of the requestedDate property.
     * 
     * @return
     *     possible object is
     *     {@link OfferPriceLeadType.RequestedDate }
     *     
     */
    public OfferPriceLeadType.RequestedDate getRequestedDate() {
        return requestedDate;
    }

    /**
     * Sets the value of the requestedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferPriceLeadType.RequestedDate }
     *     
     */
    public void setRequestedDate(OfferPriceLeadType.RequestedDate value) {
        this.requestedDate = value;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType }
     *     
     */
    public FareDetailType getFareDetail() {
        return fareDetail;
    }

    /**
     * Sets the value of the fareDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType }
     *     
     */
    public void setFareDetail(FareDetailType value) {
        this.fareDetail = value;
    }

    /**
     * Gets the value of the offerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferItemID(String value) {
        this.offerItemID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferPriceLeadDetailType">
     *       &lt;sequence>
     *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}PricedFlightOfferAssocType" maxOccurs="unbounded" minOccurs="0"/>
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
        "associations"
    })
    public static class RequestedDate
        extends OfferPriceLeadDetailType
    {

        @XmlElement(name = "Associations")
        protected List<PricedFlightOfferAssocType> associations;

        /**
         * Gets the value of the associations property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associations property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociations().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PricedFlightOfferAssocType }
         * 
         * 
         */
        public List<PricedFlightOfferAssocType> getAssociations() {
            if (associations == null) {
                associations = new ArrayList<PricedFlightOfferAssocType>();
            }
            return this.associations;
        }

    }

}
