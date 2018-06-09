
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Core Seller Actor Group Representation.
 * 
 * <p>Java class for SellerCoreRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerCoreRepType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}ActorObjectType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}AgencyCategorySimpleType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Contacts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerCoreRepType", propOrder = {
    "name",
    "type",
    "contacts"
})
@XmlSeeAlso({
    AgencyCoreRepType.class
})
public class SellerCoreRepType
    extends ActorObjectType
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Contacts")
    protected Contacts contacts;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link Contacts }
     *     
     */
    public Contacts getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contacts }
     *     
     */
    public void setContacts(Contacts value) {
        this.contacts = value;
    }

}
