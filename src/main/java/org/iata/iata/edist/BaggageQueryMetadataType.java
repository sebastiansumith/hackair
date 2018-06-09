
package org.iata.iata.edist;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * BAGGAGE QUERY Metadata definition.
 * 
 * <p>Java class for BaggageQueryMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageQueryMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Ownership" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CRSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketIssuePlace" type="{http://www.iata.org/IATA/EDIST}AirlineDesigSimpleType" minOccurs="0"/>
 *         &lt;element name="TicketIssueCountry" type="{http://www.iata.org/IATA/EDIST}CountrySimpleType" minOccurs="0"/>
 *         &lt;element name="TravelerCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/EDIST}CurrencyAmountOptType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageQueryMetadataType", propOrder = {
    "ownership",
    "ticketIssuePlace",
    "ticketIssueCountry",
    "travelerCount",
    "totalPrice"
})
public class BaggageQueryMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "Ownership")
    protected BaggageQueryMetadataType.Ownership ownership;
    @XmlElement(name = "TicketIssuePlace")
    protected String ticketIssuePlace;
    @XmlElement(name = "TicketIssueCountry")
    protected String ticketIssueCountry;
    @XmlElement(name = "TravelerCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger travelerCount;
    @XmlElement(name = "TotalPrice")
    protected CurrencyAmountOptType totalPrice;

    /**
     * Gets the value of the ownership property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageQueryMetadataType.Ownership }
     *     
     */
    public BaggageQueryMetadataType.Ownership getOwnership() {
        return ownership;
    }

    /**
     * Sets the value of the ownership property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageQueryMetadataType.Ownership }
     *     
     */
    public void setOwnership(BaggageQueryMetadataType.Ownership value) {
        this.ownership = value;
    }

    /**
     * Gets the value of the ticketIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssuePlace() {
        return ticketIssuePlace;
    }

    /**
     * Sets the value of the ticketIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssuePlace(String value) {
        this.ticketIssuePlace = value;
    }

    /**
     * Gets the value of the ticketIssueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssueCountry() {
        return ticketIssueCountry;
    }

    /**
     * Sets the value of the ticketIssueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssueCountry(String value) {
        this.ticketIssueCountry = value;
    }

    /**
     * Gets the value of the travelerCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelerCount() {
        return travelerCount;
    }

    /**
     * Sets the value of the travelerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTravelerCount(BigInteger value) {
        this.travelerCount = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public CurrencyAmountOptType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public void setTotalPrice(CurrencyAmountOptType value) {
        this.totalPrice = value;
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
     *         &lt;element name="CRSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GDS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "crsid",
        "gds"
    })
    public static class Ownership {

        @XmlElement(name = "CRSID")
        protected String crsid;
        @XmlElement(name = "GDS")
        protected String gds;

        /**
         * Gets the value of the crsid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRSID() {
            return crsid;
        }

        /**
         * Sets the value of the crsid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRSID(String value) {
            this.crsid = value;
        }

        /**
         * Gets the value of the gds property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGDS() {
            return gds;
        }

        /**
         * Sets the value of the gds property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGDS(String value) {
            this.gds = value;
        }

    }

}
