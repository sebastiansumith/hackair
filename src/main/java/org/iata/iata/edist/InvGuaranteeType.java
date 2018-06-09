
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer/ Offer Item: INVENTORY GUARANTEE definition.
 * 
 * <p>Java class for InvGuaranteeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvGuaranteeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="InvGuaranteeTimeLimit">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreDateGrpType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferReferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvGuaranteeType", propOrder = {
    "invGuaranteeTimeLimit",
    "invGuaranteeID",
    "offerReferences"
})
public class InvGuaranteeType
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "InvGuaranteeTimeLimit", required = true)
    protected InvGuaranteeType.InvGuaranteeTimeLimit invGuaranteeTimeLimit;
    @XmlElement(name = "InvGuaranteeID", required = true)
    protected String invGuaranteeID;
    @XmlList
    @XmlElement(name = "OfferReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> offerReferences;

    /**
     * Gets the value of the invGuaranteeTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link InvGuaranteeType.InvGuaranteeTimeLimit }
     *     
     */
    public InvGuaranteeType.InvGuaranteeTimeLimit getInvGuaranteeTimeLimit() {
        return invGuaranteeTimeLimit;
    }

    /**
     * Sets the value of the invGuaranteeTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvGuaranteeType.InvGuaranteeTimeLimit }
     *     
     */
    public void setInvGuaranteeTimeLimit(InvGuaranteeType.InvGuaranteeTimeLimit value) {
        this.invGuaranteeTimeLimit = value;
    }

    /**
     * Gets the value of the invGuaranteeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvGuaranteeID() {
        return invGuaranteeID;
    }

    /**
     * Sets the value of the invGuaranteeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvGuaranteeID(String value) {
        this.invGuaranteeID = value;
    }

    /**
     * Association(s) to one or more Offers or Offer Items for which the inventory guarantee applies.Gets the value of the offerReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getOfferReferences() {
        if (offerReferences == null) {
            offerReferences = new ArrayList<Object>();
        }
        return this.offerReferences;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}CoreDateGrpType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InvGuaranteeTimeLimit
        extends CoreDateGrpType
    {


    }

}
