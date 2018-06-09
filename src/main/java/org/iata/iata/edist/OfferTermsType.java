
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * OFFER TERMS definition.
 * 
 * <p>Java class for OfferTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferTermsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;choice>
 *         &lt;element name="AvailablePeriod" type="{http://www.iata.org/IATA/EDIST}OfferValidPeriodType"/>
 *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST}Descriptions"/>
 *         &lt;element name="GroupSize" type="{http://www.iata.org/IATA/EDIST}OfferGroupSizeType"/>
 *         &lt;element name="OrderingQuantity" type="{http://www.iata.org/IATA/EDIST}OfferOrderQuantityType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferTermsType", propOrder = {
    "availablePeriod",
    "descriptions",
    "groupSize",
    "orderingQuantity"
})
public class OfferTermsType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "AvailablePeriod")
    protected OfferValidPeriodType availablePeriod;
    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlElement(name = "GroupSize")
    protected OfferGroupSizeType groupSize;
    @XmlElement(name = "OrderingQuantity")
    protected OfferOrderQuantityType orderingQuantity;

    /**
     * Gets the value of the availablePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link OfferValidPeriodType }
     *     
     */
    public OfferValidPeriodType getAvailablePeriod() {
        return availablePeriod;
    }

    /**
     * Sets the value of the availablePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferValidPeriodType }
     *     
     */
    public void setAvailablePeriod(OfferValidPeriodType value) {
        this.availablePeriod = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the groupSize property.
     * 
     * @return
     *     possible object is
     *     {@link OfferGroupSizeType }
     *     
     */
    public OfferGroupSizeType getGroupSize() {
        return groupSize;
    }

    /**
     * Sets the value of the groupSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferGroupSizeType }
     *     
     */
    public void setGroupSize(OfferGroupSizeType value) {
        this.groupSize = value;
    }

    /**
     * Gets the value of the orderingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OfferOrderQuantityType }
     *     
     */
    public OfferOrderQuantityType getOrderingQuantity() {
        return orderingQuantity;
    }

    /**
     * Sets the value of the orderingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferOrderQuantityType }
     *     
     */
    public void setOrderingQuantity(OfferOrderQuantityType value) {
        this.orderingQuantity = value;
    }

}
