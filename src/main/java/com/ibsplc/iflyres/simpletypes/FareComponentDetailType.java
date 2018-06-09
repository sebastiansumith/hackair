
package com.ibsplc.iflyres.simpletypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareComponentDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SegmentIDRefs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PricingUnitID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentDetailType", propOrder = {
    "fareBasisCode",
    "segmentIDRefs",
    "pricingUnitID",
    "fareComponentId"
})
public class FareComponentDetailType {

    @XmlElement(name = "FareBasisCode", required = true)
    protected String fareBasisCode;
    @XmlElement(name = "SegmentIDRefs")
    protected List<String> segmentIDRefs;
    @XmlElement(name = "PricingUnitID")
    protected String pricingUnitID;
    @XmlElement(name = "FareComponentId")
    protected String fareComponentId;

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the segmentIDRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentIDRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentIDRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSegmentIDRefs() {
        if (segmentIDRefs == null) {
            segmentIDRefs = new ArrayList<String>();
        }
        return this.segmentIDRefs;
    }

    /**
     * Gets the value of the pricingUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingUnitID() {
        return pricingUnitID;
    }

    /**
     * Sets the value of the pricingUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingUnitID(String value) {
        this.pricingUnitID = value;
    }

    /**
     * Gets the value of the fareComponentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareComponentId() {
        return fareComponentId;
    }

    /**
     * Sets the value of the fareComponentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareComponentId(String value) {
        this.fareComponentId = value;
    }

}
