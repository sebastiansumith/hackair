
package com.ibsplc.iflyres.simpletypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * IBS specific augmentation type to hold Contact Details Information.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SendItineraryToEmailId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendItineraryToSMS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "sendItineraryToEmailId",
    "sendItineraryToSMS"
})
@XmlRootElement(name = "ContactAugPoint")
public class ContactAugPoint {

    @XmlElement(name = "SendItineraryToEmailId")
    protected Boolean sendItineraryToEmailId;
    @XmlElement(name = "SendItineraryToSMS")
    protected Boolean sendItineraryToSMS;

    /**
     * Gets the value of the sendItineraryToEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendItineraryToEmailId() {
        return sendItineraryToEmailId;
    }

    /**
     * Sets the value of the sendItineraryToEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendItineraryToEmailId(Boolean value) {
        this.sendItineraryToEmailId = value;
    }

    /**
     * Gets the value of the sendItineraryToSMS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendItineraryToSMS() {
        return sendItineraryToSMS;
    }

    /**
     * Sets the value of the sendItineraryToSMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendItineraryToSMS(Boolean value) {
        this.sendItineraryToSMS = value;
    }

}
