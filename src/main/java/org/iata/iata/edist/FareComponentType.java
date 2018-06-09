
package org.iata.iata.edist;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * FARE COMPONENT definition.
 * 
 * <p>Java class for FareComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Parameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReference" minOccurs="0"/>
 *         &lt;element name="PriceBreakdown" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST}FarePriceDetailType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareBasis" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FareBasisCode" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FareRulesRemarks" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FareBasisCityPair" minOccurs="0"/>
 *                   &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TicketDesig" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareRules" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentType", propOrder = {
    "parameters",
    "segmentReference",
    "priceBreakdown",
    "fareBasis",
    "ticketDesig",
    "fareRules"
})
public class FareComponentType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Parameters")
    protected FareComponentType.Parameters parameters;
    @XmlElement(name = "SegmentReference")
    protected SegmentReference segmentReference;
    @XmlElement(name = "PriceBreakdown")
    protected FareComponentType.PriceBreakdown priceBreakdown;
    @XmlElement(name = "FareBasis")
    protected FareComponentType.FareBasis fareBasis;
    @XmlElement(name = "TicketDesig")
    protected TicketDesignatorType ticketDesig;
    @XmlElement(name = "FareRules")
    protected FareRulesType fareRules;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType.Parameters }
     *     
     */
    public FareComponentType.Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType.Parameters }
     *     
     */
    public void setParameters(FareComponentType.Parameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the segmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentReference }
     *     
     */
    public SegmentReference getSegmentReference() {
        return segmentReference;
    }

    /**
     * Sets the value of the segmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentReference }
     *     
     */
    public void setSegmentReference(SegmentReference value) {
        this.segmentReference = value;
    }

    /**
     * Gets the value of the priceBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType.PriceBreakdown }
     *     
     */
    public FareComponentType.PriceBreakdown getPriceBreakdown() {
        return priceBreakdown;
    }

    /**
     * Sets the value of the priceBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType.PriceBreakdown }
     *     
     */
    public void setPriceBreakdown(FareComponentType.PriceBreakdown value) {
        this.priceBreakdown = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType.FareBasis }
     *     
     */
    public FareComponentType.FareBasis getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType.FareBasis }
     *     
     */
    public void setFareBasis(FareComponentType.FareBasis value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the ticketDesig property.
     * 
     * @return
     *     possible object is
     *     {@link TicketDesignatorType }
     *     
     */
    public TicketDesignatorType getTicketDesig() {
        return ticketDesig;
    }

    /**
     * Sets the value of the ticketDesig property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketDesignatorType }
     *     
     */
    public void setTicketDesig(TicketDesignatorType value) {
        this.ticketDesig = value;
    }

    /**
     * Gets the value of the fareRules property.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesType }
     *     
     */
    public FareRulesType getFareRules() {
        return fareRules;
    }

    /**
     * Sets the value of the fareRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesType }
     *     
     */
    public void setFareRules(FareRulesType value) {
        this.fareRules = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareBasisCode" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareRulesRemarks" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareBasisCityPair" minOccurs="0"/>
     *         &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "fareBasisCode",
        "fareRulesRemarks",
        "fareBasisCityPair",
        "rbd"
    })
    public static class FareBasis {

        @XmlElement(name = "FareBasisCode")
        protected FareBasisCodeType fareBasisCode;
        @XmlElement(name = "FareRulesRemarks")
        protected FareRulesRemarks fareRulesRemarks;
        @XmlElement(name = "FareBasisCityPair")
        protected String fareBasisCityPair;
        @XmlElement(name = "RBD")
        protected String rbd;

        /**
         * Gets the value of the fareBasisCode property.
         * 
         * @return
         *     possible object is
         *     {@link FareBasisCodeType }
         *     
         */
        public FareBasisCodeType getFareBasisCode() {
            return fareBasisCode;
        }

        /**
         * Sets the value of the fareBasisCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareBasisCodeType }
         *     
         */
        public void setFareBasisCode(FareBasisCodeType value) {
            this.fareBasisCode = value;
        }

        /**
         * Gets the value of the fareRulesRemarks property.
         * 
         * @return
         *     possible object is
         *     {@link FareRulesRemarks }
         *     
         */
        public FareRulesRemarks getFareRulesRemarks() {
            return fareRulesRemarks;
        }

        /**
         * Sets the value of the fareRulesRemarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRulesRemarks }
         *     
         */
        public void setFareRulesRemarks(FareRulesRemarks value) {
            this.fareRulesRemarks = value;
        }

        /**
         * Gets the value of the fareBasisCityPair property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareBasisCityPair() {
            return fareBasisCityPair;
        }

        /**
         * Sets the value of the fareBasisCityPair property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareBasisCityPair(String value) {
            this.fareBasisCityPair = value;
        }

        /**
         * Gets the value of the rbd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRBD() {
            return rbd;
        }

        /**
         * Sets the value of the rbd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRBD(String value) {
            this.rbd = value;
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
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Parameters {

        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger quantity;

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
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
     *         &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST}FarePriceDetailType"/>
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
        "price"
    })
    public static class PriceBreakdown {

        @XmlElement(name = "Price", required = true)
        protected FarePriceDetailType price;

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link FarePriceDetailType }
         *     
         */
        public FarePriceDetailType getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link FarePriceDetailType }
         *     
         */
        public void setPrice(FarePriceDetailType value) {
            this.price = value;
        }

    }

}
