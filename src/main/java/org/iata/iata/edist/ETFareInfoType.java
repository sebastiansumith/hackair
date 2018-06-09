
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * COUPON-RELATED FARE INFORMATION definition.
 * 
 * Account code, net reporting code, nonendorsable and nonrefundable indicators, penalty restriction indicator, pricing system, statistical code and tour code.
 * 
 * <p>Java class for ET_FareInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ET_FareInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Waiver" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Code" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-9a-zA-Z]{1,19}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}FareWaiverRuleSimpleType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RuleInd" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RuleCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="1"/>
 *                         &lt;maxInclusive value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Detail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NetReportingCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-9a-zA-Z]{1,3}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="StatisticalCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-9a-zA-Z]{1,3}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}TourCode" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryCode" minOccurs="0"/>
 *                   &lt;element name="PricingSystemCode" type="{http://www.iata.org/IATA/EDIST}AlphaNumericStringLength1to3" minOccurs="0"/>
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
@XmlType(name = "ET_FareInfoType", propOrder = {
    "waiver",
    "ruleInd",
    "detail"
})
public class ETFareInfoType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Waiver")
    protected List<ETFareInfoType.Waiver> waiver;
    @XmlElement(name = "RuleInd")
    protected List<ETFareInfoType.RuleInd> ruleInd;
    @XmlElement(name = "Detail")
    protected ETFareInfoType.Detail detail;

    /**
     * Gets the value of the waiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETFareInfoType.Waiver }
     * 
     * 
     */
    public List<ETFareInfoType.Waiver> getWaiver() {
        if (waiver == null) {
            waiver = new ArrayList<ETFareInfoType.Waiver>();
        }
        return this.waiver;
    }

    /**
     * Gets the value of the ruleInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETFareInfoType.RuleInd }
     * 
     * 
     */
    public List<ETFareInfoType.RuleInd> getRuleInd() {
        if (ruleInd == null) {
            ruleInd = new ArrayList<ETFareInfoType.RuleInd>();
        }
        return this.ruleInd;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link ETFareInfoType.Detail }
     *     
     */
    public ETFareInfoType.Detail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETFareInfoType.Detail }
     *     
     */
    public void setDetail(ETFareInfoType.Detail value) {
        this.detail = value;
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
     *         &lt;element name="NetReportingCode" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[0-9a-zA-Z]{1,3}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="StatisticalCode" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[0-9a-zA-Z]{1,3}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TourCode" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryCode" minOccurs="0"/>
     *         &lt;element name="PricingSystemCode" type="{http://www.iata.org/IATA/EDIST}AlphaNumericStringLength1to3" minOccurs="0"/>
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
        "netReportingCode",
        "statisticalCode",
        "tourCode",
        "countryCode",
        "pricingSystemCode"
    })
    public static class Detail {

        @XmlElement(name = "NetReportingCode")
        protected String netReportingCode;
        @XmlElement(name = "StatisticalCode")
        protected String statisticalCode;
        @XmlElement(name = "TourCode")
        protected String tourCode;
        @XmlElement(name = "CountryCode")
        protected CountryCode countryCode;
        @XmlElement(name = "PricingSystemCode")
        protected String pricingSystemCode;

        /**
         * Gets the value of the netReportingCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetReportingCode() {
            return netReportingCode;
        }

        /**
         * Sets the value of the netReportingCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetReportingCode(String value) {
            this.netReportingCode = value;
        }

        /**
         * Gets the value of the statisticalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatisticalCode() {
            return statisticalCode;
        }

        /**
         * Sets the value of the statisticalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatisticalCode(String value) {
            this.statisticalCode = value;
        }

        /**
         * Gets the value of the tourCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTourCode() {
            return tourCode;
        }

        /**
         * Sets the value of the tourCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTourCode(String value) {
            this.tourCode = value;
        }

        /**
         * Country code where the ticket is issued. Example: US
         * 
         * Encoding Scheme: ISO 3166-1 (two character) Country Code
         * 
         * @return
         *     possible object is
         *     {@link CountryCode }
         *     
         */
        public CountryCode getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CountryCode }
         *     
         */
        public void setCountryCode(CountryCode value) {
            this.countryCode = value;
        }

        /**
         * Gets the value of the pricingSystemCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPricingSystemCode() {
            return pricingSystemCode;
        }

        /**
         * Sets the value of the pricingSystemCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPricingSystemCode(String value) {
            this.pricingSystemCode = value;
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
     *         &lt;element name="RuleCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="1"/>
     *               &lt;maxInclusive value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "ruleCode"
    })
    public static class RuleInd {

        @XmlElement(name = "RuleCode")
        protected int ruleCode;

        /**
         * Gets the value of the ruleCode property.
         * 
         */
        public int getRuleCode() {
            return ruleCode;
        }

        /**
         * Sets the value of the ruleCode property.
         * 
         */
        public void setRuleCode(int value) {
            this.ruleCode = value;
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
     *         &lt;element name="Code" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[0-9a-zA-Z]{1,19}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}FareWaiverRuleSimpleType" minOccurs="0"/>
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
        "code",
        "type"
    })
    public static class Waiver {

        @XmlElement(name = "Code")
        protected String code;
        @XmlElement(name = "Type")
        protected String type;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

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

    }

}
