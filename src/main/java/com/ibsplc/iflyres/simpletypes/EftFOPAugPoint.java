
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
 *         &lt;element name="OriginalAuthCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AuthorisationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OriginalAuthDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AuthenticationTxnId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TokenNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcReturnCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "originalAuthCode",
    "authorisationCode",
    "originalAuthDate",
    "authenticationTxnId",
    "paymentStatus",
    "tokenNumber",
    "procReturnCode",
    "paymentMethod",
    "exchangeRate",
    "paymentDescription"
})
@XmlRootElement(name = "EftFOPAugPoint")
public class EftFOPAugPoint {

    @XmlElement(name = "OriginalAuthCode", required = true)
    protected String originalAuthCode;
    @XmlElement(name = "AuthorisationCode", required = true)
    protected String authorisationCode;
    @XmlElement(name = "OriginalAuthDate", required = true)
    protected String originalAuthDate;
    @XmlElement(name = "AuthenticationTxnId", required = true)
    protected String authenticationTxnId;
    @XmlElement(name = "PaymentStatus", required = true)
    protected String paymentStatus;
    @XmlElement(name = "TokenNumber", required = true)
    protected String tokenNumber;
    @XmlElement(name = "ProcReturnCode", required = true)
    protected String procReturnCode;
    @XmlElement(name = "PaymentMethod", required = true)
    protected String paymentMethod;
    @XmlElement(name = "ExchangeRate", required = true)
    protected String exchangeRate;
    @XmlElement(name = "PaymentDescription", required = true)
    protected String paymentDescription;

    /**
     * Gets the value of the originalAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAuthCode() {
        return originalAuthCode;
    }

    /**
     * Sets the value of the originalAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAuthCode(String value) {
        this.originalAuthCode = value;
    }

    /**
     * Gets the value of the authorisationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorisationCode() {
        return authorisationCode;
    }

    /**
     * Sets the value of the authorisationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorisationCode(String value) {
        this.authorisationCode = value;
    }

    /**
     * Gets the value of the originalAuthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAuthDate() {
        return originalAuthDate;
    }

    /**
     * Sets the value of the originalAuthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAuthDate(String value) {
        this.originalAuthDate = value;
    }

    /**
     * Gets the value of the authenticationTxnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationTxnId() {
        return authenticationTxnId;
    }

    /**
     * Sets the value of the authenticationTxnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationTxnId(String value) {
        this.authenticationTxnId = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the tokenNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenNumber() {
        return tokenNumber;
    }

    /**
     * Sets the value of the tokenNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenNumber(String value) {
        this.tokenNumber = value;
    }

    /**
     * Gets the value of the procReturnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcReturnCode() {
        return procReturnCode;
    }

    /**
     * Sets the value of the procReturnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcReturnCode(String value) {
        this.procReturnCode = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the paymentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDescription() {
        return paymentDescription;
    }

    /**
     * Sets the value of the paymentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDescription(String value) {
        this.paymentDescription = value;
    }

}
