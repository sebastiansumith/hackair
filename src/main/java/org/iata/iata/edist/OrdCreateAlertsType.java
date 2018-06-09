
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Alerts definition.
 * 
 * <p>Java class for OrdCreateAlertsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdCreateAlertsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="PIN_AuthResponse" type="{http://www.iata.org/IATA/EDIST}PinPhraseAnswerType" minOccurs="0"/>
 *         &lt;element name="PaymentAuthentication" type="{http://www.iata.org/IATA/EDIST}SecurePaymentAlertType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdCreateAlertsType", propOrder = {
    "pinAuthResponse",
    "paymentAuthentication"
})
public class OrdCreateAlertsType
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "PIN_AuthResponse")
    protected PinPhraseAnswerType pinAuthResponse;
    @XmlElement(name = "PaymentAuthentication")
    protected SecurePaymentAlertType paymentAuthentication;

    /**
     * Gets the value of the pinAuthResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PinPhraseAnswerType }
     *     
     */
    public PinPhraseAnswerType getPINAuthResponse() {
        return pinAuthResponse;
    }

    /**
     * Sets the value of the pinAuthResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinPhraseAnswerType }
     *     
     */
    public void setPINAuthResponse(PinPhraseAnswerType value) {
        this.pinAuthResponse = value;
    }

    /**
     * Gets the value of the paymentAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAlertType }
     *     
     */
    public SecurePaymentAlertType getPaymentAuthentication() {
        return paymentAuthentication;
    }

    /**
     * Sets the value of the paymentAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAlertType }
     *     
     */
    public void setPaymentAuthentication(SecurePaymentAlertType value) {
        this.paymentAuthentication = value;
    }

}
