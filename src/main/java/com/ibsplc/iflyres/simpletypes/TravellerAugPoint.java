
package com.ibsplc.iflyres.simpletypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * IBS specific augmentation type to hold Passenger Details Information.
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
 *         &lt;element name="PnrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalSurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PnrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestAmountDetails" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}GuestAmountDetailsType" minOccurs="0"/>
 *         &lt;element name="PaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isServiceBooking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TourOperatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TourOperatorBookingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pnrType",
    "localGivenName",
    "localSurName",
    "preferredLanguage",
    "pnrStatus",
    "guestAmountDetails",
    "paxType",
    "paxSubType",
    "isServiceBooking",
    "tourOperatorCode",
    "tourOperatorBookingNo"
})
@XmlRootElement(name = "TravellerAugPoint")
public class TravellerAugPoint {

    @XmlElement(name = "PnrType")
    protected String pnrType;
    @XmlElement(name = "LocalGivenName")
    protected String localGivenName;
    @XmlElement(name = "LocalSurName")
    protected String localSurName;
    @XmlElement(name = "PreferredLanguage")
    protected String preferredLanguage;
    @XmlElement(name = "PnrStatus")
    protected String pnrStatus;
    @XmlElement(name = "GuestAmountDetails")
    protected GuestAmountDetailsType guestAmountDetails;
    @XmlElement(name = "PaxType")
    protected String paxType;
    @XmlElement(name = "PaxSubType")
    protected String paxSubType;
    protected Boolean isServiceBooking;
    @XmlElement(name = "TourOperatorCode")
    protected String tourOperatorCode;
    @XmlElement(name = "TourOperatorBookingNo")
    protected String tourOperatorBookingNo;

    /**
     * Gets the value of the pnrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrType() {
        return pnrType;
    }

    /**
     * Sets the value of the pnrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrType(String value) {
        this.pnrType = value;
    }

    /**
     * Gets the value of the localGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalGivenName() {
        return localGivenName;
    }

    /**
     * Sets the value of the localGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalGivenName(String value) {
        this.localGivenName = value;
    }

    /**
     * Gets the value of the localSurName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalSurName() {
        return localSurName;
    }

    /**
     * Sets the value of the localSurName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalSurName(String value) {
        this.localSurName = value;
    }

    /**
     * Gets the value of the preferredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Sets the value of the preferredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredLanguage(String value) {
        this.preferredLanguage = value;
    }

    /**
     * Gets the value of the pnrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrStatus() {
        return pnrStatus;
    }

    /**
     * Sets the value of the pnrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrStatus(String value) {
        this.pnrStatus = value;
    }

    /**
     * Gets the value of the guestAmountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GuestAmountDetailsType }
     *     
     */
    public GuestAmountDetailsType getGuestAmountDetails() {
        return guestAmountDetails;
    }

    /**
     * Sets the value of the guestAmountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestAmountDetailsType }
     *     
     */
    public void setGuestAmountDetails(GuestAmountDetailsType value) {
        this.guestAmountDetails = value;
    }

    /**
     * Gets the value of the paxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxType() {
        return paxType;
    }

    /**
     * Sets the value of the paxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxType(String value) {
        this.paxType = value;
    }

    /**
     * Gets the value of the paxSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxSubType() {
        return paxSubType;
    }

    /**
     * Sets the value of the paxSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxSubType(String value) {
        this.paxSubType = value;
    }

    /**
     * Gets the value of the isServiceBooking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsServiceBooking() {
        return isServiceBooking;
    }

    /**
     * Sets the value of the isServiceBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsServiceBooking(Boolean value) {
        this.isServiceBooking = value;
    }

    /**
     * Gets the value of the tourOperatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorCode() {
        return tourOperatorCode;
    }

    /**
     * Sets the value of the tourOperatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorCode(String value) {
        this.tourOperatorCode = value;
    }

    /**
     * Gets the value of the tourOperatorBookingNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorBookingNo() {
        return tourOperatorBookingNo;
    }

    /**
     * Sets the value of the tourOperatorBookingNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorBookingNo(String value) {
        this.tourOperatorBookingNo = value;
    }

}
