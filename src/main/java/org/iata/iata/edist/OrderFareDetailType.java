
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Order FARE DETAIL definition.
 * 
 * <p>Java class for OrderFareDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderFareDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}FareComponent" maxOccurs="unbounded"/>
 *           &lt;element name="FareRules" type="{http://www.iata.org/IATA/EDIST}OrderFareRulesType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TourCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderFareDetailType", propOrder = {
    "fareComponent",
    "fareRules",
    "tourCode",
    "remarks"
})
public class OrderFareDetailType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "FareComponent")
    protected List<FareComponentType> fareComponent;
    @XmlElement(name = "FareRules")
    protected OrderFareRulesType fareRules;
    @XmlElement(name = "TourCode")
    protected String tourCode;
    @XmlElement(name = "Remarks")
    protected RemarkType remarks;

    /**
     * Fare Component information with Price Breakdown.Gets the value of the fareComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentType }
     * 
     * 
     */
    public List<FareComponentType> getFareComponent() {
        if (fareComponent == null) {
            fareComponent = new ArrayList<FareComponentType>();
        }
        return this.fareComponent;
    }

    /**
     * Gets the value of the fareRules property.
     * 
     * @return
     *     possible object is
     *     {@link OrderFareRulesType }
     *     
     */
    public OrderFareRulesType getFareRules() {
        return fareRules;
    }

    /**
     * Sets the value of the fareRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderFareRulesType }
     *     
     */
    public void setFareRules(OrderFareRulesType value) {
        this.fareRules = value;
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
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setRemarks(RemarkType value) {
        this.remarks = value;
    }

}
