
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * OFFER ITEM TIME LIMIT SET (collection) definition.
 * 
 * <p>Java class for OfferItemTimeLimitSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferItemTimeLimitSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeLimit" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceGuaranteeTimeLimit"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketByTimeLimit"/>
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
@XmlType(name = "OfferItemTimeLimitSetType", propOrder = {
    "timeLimit"
})
public class OfferItemTimeLimitSetType {

    @XmlElement(name = "TimeLimit", required = true)
    protected List<OfferItemTimeLimitSetType.TimeLimit> timeLimit;

    /**
     * Gets the value of the timeLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferItemTimeLimitSetType.TimeLimit }
     * 
     * 
     */
    public List<OfferItemTimeLimitSetType.TimeLimit> getTimeLimit() {
        if (timeLimit == null) {
            timeLimit = new ArrayList<OfferItemTimeLimitSetType.TimeLimit>();
        }
        return this.timeLimit;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceGuaranteeTimeLimit"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketByTimeLimit"/>
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
        "priceGuaranteeTimeLimit",
        "ticketByTimeLimit"
    })
    public static class TimeLimit
        extends KeyWithMetaObjectBaseType
    {

        @XmlElement(name = "PriceGuaranteeTimeLimit", required = true)
        protected PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
        @XmlElement(name = "TicketByTimeLimit", required = true)
        protected TicketByTimeLimitType ticketByTimeLimit;

        /**
         * Gets the value of the priceGuaranteeTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link PriceGuaranteeTimeLimit }
         *     
         */
        public PriceGuaranteeTimeLimit getPriceGuaranteeTimeLimit() {
            return priceGuaranteeTimeLimit;
        }

        /**
         * Sets the value of the priceGuaranteeTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceGuaranteeTimeLimit }
         *     
         */
        public void setPriceGuaranteeTimeLimit(PriceGuaranteeTimeLimit value) {
            this.priceGuaranteeTimeLimit = value;
        }

        /**
         * Gets the value of the ticketByTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link TicketByTimeLimitType }
         *     
         */
        public TicketByTimeLimitType getTicketByTimeLimit() {
            return ticketByTimeLimit;
        }

        /**
         * Sets the value of the ticketByTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketByTimeLimitType }
         *     
         */
        public void setTicketByTimeLimit(TicketByTimeLimitType value) {
            this.ticketByTimeLimit = value;
        }

    }

}
