
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for a list of Classes of Service.
 * 
 * <p>Java class for ListOfClassOfServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfClassOfServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceClass" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}DataListObjectBaseType">
 *                 &lt;sequence>
 *                   &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST}Flight_COS_SimpleType" minOccurs="0"/>
 *                   &lt;element name="MarketingName" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
 *                   &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}COS_AssocType" minOccurs="0"/>
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
@XmlType(name = "ListOfClassOfServiceType", propOrder = {
    "serviceClass"
})
public class ListOfClassOfServiceType {

    @XmlElement(name = "ServiceClass", required = true)
    protected List<ListOfClassOfServiceType.ServiceClass> serviceClass;

    /**
     * Gets the value of the serviceClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfClassOfServiceType.ServiceClass }
     * 
     * 
     */
    public List<ListOfClassOfServiceType.ServiceClass> getServiceClass() {
        if (serviceClass == null) {
            serviceClass = new ArrayList<ListOfClassOfServiceType.ServiceClass>();
        }
        return this.serviceClass;
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
     *         &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST}Flight_COS_SimpleType" minOccurs="0"/>
     *         &lt;element name="MarketingName" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
     *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}COS_AssocType" minOccurs="0"/>
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
        "code",
        "marketingName",
        "associations"
    })
    public static class ServiceClass
        extends DataListObjectBaseType
    {

        @XmlElement(name = "Code")
        protected String code;
        @XmlElement(name = "MarketingName")
        protected String marketingName;
        @XmlElement(name = "Associations")
        protected COSAssocType associations;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the marketingName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMarketingName() {
            return marketingName;
        }

        /**
         * Sets the value of the marketingName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMarketingName(String value) {
            this.marketingName = value;
        }

        /**
         * Gets the value of the associations property.
         * 
         * @return
         *     possible object is
         *     {@link COSAssocType }
         *     
         */
        public COSAssocType getAssociations() {
            return associations;
        }

        /**
         * Sets the value of the associations property.
         * 
         * @param value
         *     allowed object is
         *     {@link COSAssocType }
         *     
         */
        public void setAssociations(COSAssocType value) {
            this.associations = value;
        }

    }

}
