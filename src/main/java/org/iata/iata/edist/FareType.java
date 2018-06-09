
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * NDC Capability Model: FARE
 * 
 *  ============
 * Representation(s)
 *  ============
 * • Core Fare information
 * • Detail Fare information (Fare Component, Fare Rules)
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Fare Indicators for Cat35 Fare, Reissue Pricing, Auto Exchange Pricing
 * • Fare Code (PADIS codeset element 9910 - Fare Qualifier)
 * 
 *  ============
 * Metadata
 *  ============
 * • FareMetadata
 * 
 * 
 * <p>Java class for FareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareCode"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareType", propOrder = {
    "fareCode",
    "fareDetail"
})
public class FareType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "FareCode", required = true)
    protected FareCodeType fareCode;
    @XmlElement(name = "FareDetail")
    protected FareDetailType fareDetail;

    /**
     * Gets the value of the fareCode property.
     * 
     * @return
     *     possible object is
     *     {@link FareCodeType }
     *     
     */
    public FareCodeType getFareCode() {
        return fareCode;
    }

    /**
     * Sets the value of the fareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareCodeType }
     *     
     */
    public void setFareCode(FareCodeType value) {
        this.fareCode = value;
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

}
