
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * PASSENGER Metadata definition.
 * 
 * <p>Java class for PassengerMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="NameDetail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GivenNamePrefix" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" maxOccurs="3" minOccurs="0"/>
 *                   &lt;element name="TitleSuffix" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="SurnamePrefix" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" minOccurs="0"/>
 *                   &lt;element name="SurnameSuffix" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerMetadataType", propOrder = {
    "nameDetail"
})
public class PassengerMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "NameDetail")
    protected PassengerMetadataType.NameDetail nameDetail;

    /**
     * Gets the value of the nameDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerMetadataType.NameDetail }
     *     
     */
    public PassengerMetadataType.NameDetail getNameDetail() {
        return nameDetail;
    }

    /**
     * Sets the value of the nameDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerMetadataType.NameDetail }
     *     
     */
    public void setNameDetail(PassengerMetadataType.NameDetail value) {
        this.nameDetail = value;
    }


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
     *         &lt;element name="GivenNamePrefix" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" maxOccurs="3" minOccurs="0"/>
     *         &lt;element name="TitleSuffix" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="SurnamePrefix" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" minOccurs="0"/>
     *         &lt;element name="SurnameSuffix" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" maxOccurs="3" minOccurs="0"/>
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
        "givenNamePrefix",
        "titleSuffix",
        "surnamePrefix",
        "surnameSuffix"
    })
    public static class NameDetail {

        @XmlElement(name = "GivenNamePrefix")
        protected List<String> givenNamePrefix;
        @XmlElement(name = "TitleSuffix")
        protected List<String> titleSuffix;
        @XmlElement(name = "SurnamePrefix")
        protected String surnamePrefix;
        @XmlElement(name = "SurnameSuffix")
        protected List<String> surnameSuffix;

        /**
         * Gets the value of the givenNamePrefix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the givenNamePrefix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGivenNamePrefix().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getGivenNamePrefix() {
            if (givenNamePrefix == null) {
                givenNamePrefix = new ArrayList<String>();
            }
            return this.givenNamePrefix;
        }

        /**
         * Gets the value of the titleSuffix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the titleSuffix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTitleSuffix().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTitleSuffix() {
            if (titleSuffix == null) {
                titleSuffix = new ArrayList<String>();
            }
            return this.titleSuffix;
        }

        /**
         * Gets the value of the surnamePrefix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurnamePrefix() {
            return surnamePrefix;
        }

        /**
         * Sets the value of the surnamePrefix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurnamePrefix(String value) {
            this.surnamePrefix = value;
        }

        /**
         * Gets the value of the surnameSuffix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the surnameSuffix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSurnameSuffix().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSurnameSuffix() {
            if (surnameSuffix == null) {
                surnameSuffix = new ArrayList<String>();
            }
            return this.surnameSuffix;
        }

    }

}
