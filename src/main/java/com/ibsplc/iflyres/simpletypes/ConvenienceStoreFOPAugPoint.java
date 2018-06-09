
package com.ibsplc.iflyres.simpletypes;

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
 *         &lt;element name="ConvenienceStoreType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConvenienceStoreCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConvenienceStoreName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerLastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerPhonenumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "convenienceStoreType",
    "convenienceStoreCode",
    "convenienceStoreName",
    "customerFirstName",
    "customerLastName",
    "customerPhonenumber"
})
@XmlRootElement(name = "ConvenienceStoreFOPAugPoint")
public class ConvenienceStoreFOPAugPoint {

    @XmlElement(name = "ConvenienceStoreType", required = true)
    protected String convenienceStoreType;
    @XmlElement(name = "ConvenienceStoreCode", required = true)
    protected String convenienceStoreCode;
    @XmlElement(name = "ConvenienceStoreName", required = true)
    protected String convenienceStoreName;
    @XmlElement(name = "CustomerFirstName", required = true)
    protected String customerFirstName;
    @XmlElement(name = "CustomerLastName", required = true)
    protected String customerLastName;
    @XmlElement(name = "CustomerPhonenumber", required = true)
    protected String customerPhonenumber;

    /**
     * Gets the value of the convenienceStoreType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvenienceStoreType() {
        return convenienceStoreType;
    }

    /**
     * Sets the value of the convenienceStoreType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvenienceStoreType(String value) {
        this.convenienceStoreType = value;
    }

    /**
     * Gets the value of the convenienceStoreCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvenienceStoreCode() {
        return convenienceStoreCode;
    }

    /**
     * Sets the value of the convenienceStoreCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvenienceStoreCode(String value) {
        this.convenienceStoreCode = value;
    }

    /**
     * Gets the value of the convenienceStoreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvenienceStoreName() {
        return convenienceStoreName;
    }

    /**
     * Sets the value of the convenienceStoreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvenienceStoreName(String value) {
        this.convenienceStoreName = value;
    }

    /**
     * Gets the value of the customerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * Sets the value of the customerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFirstName(String value) {
        this.customerFirstName = value;
    }

    /**
     * Gets the value of the customerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Sets the value of the customerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLastName(String value) {
        this.customerLastName = value;
    }

    /**
     * Gets the value of the customerPhonenumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhonenumber() {
        return customerPhonenumber;
    }

    /**
     * Sets the value of the customerPhonenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhonenumber(String value) {
        this.customerPhonenumber = value;
    }

}
