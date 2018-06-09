
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AddressCore"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AddressDetail"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressCore",
    "addressDetail"
})
@XmlRootElement(name = "Address")
public class Address {

    @XmlElement(name = "AddressCore")
    protected AddressCoreType addressCore;
    @XmlElement(name = "AddressDetail")
    protected AddressDetailType addressDetail;

    /**
     * Gets the value of the addressCore property.
     * 
     * @return
     *     possible object is
     *     {@link AddressCoreType }
     *     
     */
    public AddressCoreType getAddressCore() {
        return addressCore;
    }

    /**
     * Sets the value of the addressCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressCoreType }
     *     
     */
    public void setAddressCore(AddressCoreType value) {
        this.addressCore = value;
    }

    /**
     * Gets the value of the addressDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailType }
     *     
     */
    public AddressDetailType getAddressDetail() {
        return addressDetail;
    }

    /**
     * Sets the value of the addressDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailType }
     *     
     */
    public void setAddressDetail(AddressDetailType value) {
        this.addressDetail = value;
    }

}
