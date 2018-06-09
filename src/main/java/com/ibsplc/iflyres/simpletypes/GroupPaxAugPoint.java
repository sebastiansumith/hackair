
package com.ibsplc.iflyres.simpletypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * IBS specific augmentation type to hold Details Information for Group PNR.
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
 *         &lt;element name="PaxCountDetails" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}PaxCountAugPoint" maxOccurs="unbounded"/>
 *         &lt;element name="GroupQuoteNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="64"/>
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
    "paxCountDetails",
    "groupQuoteNumber"
})
@XmlRootElement(name = "GroupPaxAugPoint")
public class GroupPaxAugPoint {

    @XmlElement(name = "PaxCountDetails", required = true)
    protected List<PaxCountAugPoint> paxCountDetails;
    @XmlElement(name = "GroupQuoteNumber")
    protected String groupQuoteNumber;

    /**
     * Gets the value of the paxCountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxCountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxCountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxCountAugPoint }
     * 
     * 
     */
    public List<PaxCountAugPoint> getPaxCountDetails() {
        if (paxCountDetails == null) {
            paxCountDetails = new ArrayList<PaxCountAugPoint>();
        }
        return this.paxCountDetails;
    }

    /**
     * Gets the value of the groupQuoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupQuoteNumber() {
        return groupQuoteNumber;
    }

    /**
     * Sets the value of the groupQuoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupQuoteNumber(String value) {
        this.groupQuoteNumber = value;
    }

}
