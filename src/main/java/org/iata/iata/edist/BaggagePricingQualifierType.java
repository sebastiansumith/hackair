
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * BAGGAGE PRICING Qualifier.
 * 
 * <p>Java class for BaggagePricingQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggagePricingQualifierType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="CarryOn" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *         &lt;element name="PrepaidOption" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *         &lt;element name="RequestAction" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *         &lt;element name="OptionalCharges" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggagePricingQualifierType", propOrder = {
    "carryOn",
    "prepaidOption",
    "requestAction",
    "optionalCharges"
})
public class BaggagePricingQualifierType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "CarryOn")
    protected CodesetType carryOn;
    @XmlElement(name = "PrepaidOption")
    protected CodesetType prepaidOption;
    @XmlElement(name = "RequestAction")
    protected CodesetType requestAction;
    @XmlElement(name = "OptionalCharges")
    protected String optionalCharges;

    /**
     * Gets the value of the carryOn property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getCarryOn() {
        return carryOn;
    }

    /**
     * Sets the value of the carryOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setCarryOn(CodesetType value) {
        this.carryOn = value;
    }

    /**
     * Gets the value of the prepaidOption property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getPrepaidOption() {
        return prepaidOption;
    }

    /**
     * Sets the value of the prepaidOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setPrepaidOption(CodesetType value) {
        this.prepaidOption = value;
    }

    /**
     * Gets the value of the requestAction property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getRequestAction() {
        return requestAction;
    }

    /**
     * Sets the value of the requestAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setRequestAction(CodesetType value) {
        this.requestAction = value;
    }

    /**
     * Gets the value of the optionalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalCharges() {
        return optionalCharges;
    }

    /**
     * Sets the value of the optionalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalCharges(String value) {
        this.optionalCharges = value;
    }

}
