
package org.iata.iata.edist;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * MINIMUM/ MAXIMUM Service Ordering Quantity definition.
 * 
 * <p>Java class for ServiceItemQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceItemQuantityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="2">
 *         &lt;element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceItemQuantityType", propOrder = {
    "minimumQuantityOrMaximumQuantity"
})
public class ServiceItemQuantityType {

    @XmlElementRefs({
        @XmlElementRef(name = "MinimumQuantity", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MaximumQuantity", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<BigInteger>> minimumQuantityOrMaximumQuantity;

    /**
     * Gets the value of the minimumQuantityOrMaximumQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumQuantityOrMaximumQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumQuantityOrMaximumQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * 
     */
    public List<JAXBElement<BigInteger>> getMinimumQuantityOrMaximumQuantity() {
        if (minimumQuantityOrMaximumQuantity == null) {
            minimumQuantityOrMaximumQuantity = new ArrayList<JAXBElement<BigInteger>>();
        }
        return this.minimumQuantityOrMaximumQuantity;
    }

}
