
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Select a value from the enumerated list or enter a string value.
 *  =enumerated values=
 * N = NOT SUBJECT TO US DOT RESERVATION OR DISCLOSURE
 * Y = SUBJECT TO US DOT RESERVATION AND DISCLOSURE
 * D = SUBJECT TO DISCLOSURE BUT NOT TO US DOT RESERVATION
 * 
 * <p>Java class for ListOfBagDisclosureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfBagDisclosureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BagDisclosure" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}DataListObjectBaseType">
 *                 &lt;sequence>
 *                   &lt;element name="BagRule" type="{http://www.iata.org/IATA/EDIST}BagDiscloseRuleSimpleType"/>
 *                   &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST}Descriptions" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfBagDisclosureType", propOrder = {
    "bagDisclosure"
})
public class ListOfBagDisclosureType {

    @XmlElement(name = "BagDisclosure", required = true)
    protected List<ListOfBagDisclosureType.BagDisclosure> bagDisclosure;

    /**
     * Gets the value of the bagDisclosure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagDisclosure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagDisclosure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfBagDisclosureType.BagDisclosure }
     * 
     * 
     */
    public List<ListOfBagDisclosureType.BagDisclosure> getBagDisclosure() {
        if (bagDisclosure == null) {
            bagDisclosure = new ArrayList<ListOfBagDisclosureType.BagDisclosure>();
        }
        return this.bagDisclosure;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}DataListObjectBaseType">
     *       &lt;sequence>
     *         &lt;element name="BagRule" type="{http://www.iata.org/IATA/EDIST}BagDiscloseRuleSimpleType"/>
     *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST}Descriptions" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bagRule",
        "descriptions"
    })
    public static class BagDisclosure
        extends DataListObjectBaseType
    {

        @XmlElement(name = "BagRule", required = true)
        protected String bagRule;
        @XmlElement(name = "Descriptions")
        protected Descriptions descriptions;

        /**
         * Gets the value of the bagRule property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBagRule() {
            return bagRule;
        }

        /**
         * Sets the value of the bagRule property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBagRule(String value) {
            this.bagRule = value;
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

    }

}
