
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * A data type for Season (Months/ Quarters) with Minimum/ Maximum Stay Duration.
 * 
 * <p>Java class for StayPeriodSeasonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StayPeriodSeasonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}Month" maxOccurs="12"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}QuarterPeriod" maxOccurs="4"/>
 *         &lt;/choice>
 *         &lt;element name="MinimumStay" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         &lt;element name="MaximumStay" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StayPeriodSeasonType", propOrder = {
    "month",
    "quarterPeriod",
    "minimumStay",
    "maximumStay"
})
public class StayPeriodSeasonType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Month")
    protected List<MonthRepType> month;
    @XmlElement(name = "QuarterPeriod")
    protected List<QuarterPeriodRepType> quarterPeriod;
    @XmlElement(name = "MinimumStay", required = true)
    protected Duration minimumStay;
    @XmlElement(name = "MaximumStay", required = true)
    protected Duration maximumStay;

    /**
     * Gets the value of the month property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the month property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthRepType }
     * 
     * 
     */
    public List<MonthRepType> getMonth() {
        if (month == null) {
            month = new ArrayList<MonthRepType>();
        }
        return this.month;
    }

    /**
     * Gets the value of the quarterPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quarterPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuarterPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuarterPeriodRepType }
     * 
     * 
     */
    public List<QuarterPeriodRepType> getQuarterPeriod() {
        if (quarterPeriod == null) {
            quarterPeriod = new ArrayList<QuarterPeriodRepType>();
        }
        return this.quarterPeriod;
    }

    /**
     * Gets the value of the minimumStay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumStay() {
        return minimumStay;
    }

    /**
     * Sets the value of the minimumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumStay(Duration value) {
        this.minimumStay = value;
    }

    /**
     * Gets the value of the maximumStay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumStay() {
        return maximumStay;
    }

    /**
     * Sets the value of the maximumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumStay(Duration value) {
        this.maximumStay = value;
    }

}
