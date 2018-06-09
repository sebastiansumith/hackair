
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BagDisclosureReferences" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CheckedBagReferences" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CarryOnReferences" minOccurs="0"/>
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
    "bagDisclosureReferences",
    "checkedBagReferences",
    "carryOnReferences"
})
@XmlRootElement(name = "BagDetailAssociation")
public class BagDetailAssociation {

    @XmlList
    @XmlElement(name = "BagDisclosureReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> bagDisclosureReferences;
    @XmlList
    @XmlElement(name = "CheckedBagReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> checkedBagReferences;
    @XmlList
    @XmlElement(name = "CarryOnReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> carryOnReferences;

    /**
     * Gets the value of the bagDisclosureReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagDisclosureReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagDisclosureReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getBagDisclosureReferences() {
        if (bagDisclosureReferences == null) {
            bagDisclosureReferences = new ArrayList<Object>();
        }
        return this.bagDisclosureReferences;
    }

    /**
     * Gets the value of the checkedBagReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkedBagReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckedBagReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getCheckedBagReferences() {
        if (checkedBagReferences == null) {
            checkedBagReferences = new ArrayList<Object>();
        }
        return this.checkedBagReferences;
    }

    /**
     * Gets the value of the carryOnReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carryOnReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarryOnReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getCarryOnReferences() {
        if (carryOnReferences == null) {
            carryOnReferences = new ArrayList<Object>();
        }
        return this.carryOnReferences;
    }

}
