
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * FLIGHT Metadata definition.
 * 
 * <p>Java class for FlightMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="ActionCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" minOccurs="0"/>
 *         &lt;element name="BindingKey" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightStatus" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Frequency" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}InstantPurchase" minOccurs="0"/>
 *         &lt;element name="Meals" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Meal" type="{http://www.iata.org/IATA/EDIST}FlightMealsType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OnTimePerformance" minOccurs="0"/>
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
@XmlType(name = "FlightMetadataType", propOrder = {
    "actionCode",
    "bindingKey",
    "flightStatus",
    "frequency",
    "instantPurchase",
    "meals",
    "onTimePerformance",
    "remarks"
})
@XmlSeeAlso({
    FlightMetadata.class
})
public class FlightMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "ActionCode")
    protected String actionCode;
    @XmlElement(name = "BindingKey")
    protected String bindingKey;
    @XmlElement(name = "FlightStatus")
    protected FlightStatusType flightStatus;
    @XmlElement(name = "Frequency")
    protected FlightFrequencyType frequency;
    @XmlElement(name = "InstantPurchase")
    protected InstantPurchaseType instantPurchase;
    @XmlElement(name = "Meals")
    protected FlightMetadataType.Meals meals;
    @XmlElement(name = "OnTimePerformance")
    protected OnTimePerformance onTimePerformance;
    @XmlElement(name = "Remarks")
    protected RemarkType remarks;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the bindingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingKey() {
        return bindingKey;
    }

    /**
     * Sets the value of the bindingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingKey(String value) {
        this.bindingKey = value;
    }

    /**
     * Gets the value of the flightStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusType }
     *     
     */
    public FlightStatusType getFlightStatus() {
        return flightStatus;
    }

    /**
     * Sets the value of the flightStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusType }
     *     
     */
    public void setFlightStatus(FlightStatusType value) {
        this.flightStatus = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link FlightFrequencyType }
     *     
     */
    public FlightFrequencyType getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightFrequencyType }
     *     
     */
    public void setFrequency(FlightFrequencyType value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the instantPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link InstantPurchaseType }
     *     
     */
    public InstantPurchaseType getInstantPurchase() {
        return instantPurchase;
    }

    /**
     * Sets the value of the instantPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantPurchaseType }
     *     
     */
    public void setInstantPurchase(InstantPurchaseType value) {
        this.instantPurchase = value;
    }

    /**
     * Gets the value of the meals property.
     * 
     * @return
     *     possible object is
     *     {@link FlightMetadataType.Meals }
     *     
     */
    public FlightMetadataType.Meals getMeals() {
        return meals;
    }

    /**
     * Sets the value of the meals property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightMetadataType.Meals }
     *     
     */
    public void setMeals(FlightMetadataType.Meals value) {
        this.meals = value;
    }

    /**
     * Gets the value of the onTimePerformance property.
     * 
     * @return
     *     possible object is
     *     {@link OnTimePerformance }
     *     
     */
    public OnTimePerformance getOnTimePerformance() {
        return onTimePerformance;
    }

    /**
     * Sets the value of the onTimePerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnTimePerformance }
     *     
     */
    public void setOnTimePerformance(OnTimePerformance value) {
        this.onTimePerformance = value;
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
     *         &lt;element name="Meal" type="{http://www.iata.org/IATA/EDIST}FlightMealsType" maxOccurs="unbounded"/>
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
        "meal"
    })
    public static class Meals {

        @XmlElement(name = "Meal", required = true)
        protected List<FlightMealsType> meal;

        /**
         * Gets the value of the meal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the meal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMeal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightMealsType }
         * 
         * 
         */
        public List<FlightMealsType> getMeal() {
            if (meal == null) {
                meal = new ArrayList<FlightMealsType>();
            }
            return this.meal;
        }

    }

}
