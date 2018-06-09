
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A data type for PADIS/ CODESET Metadata.
 * 
 * <p>Java class for CodesetMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodesetMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Source" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OwnerID" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Name">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType">
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="File" type="{http://www.iata.org/IATA/EDIST}ShortDescSimpleType" minOccurs="0"/>
 *                   &lt;element name="Version" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherLanguage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}LanguageCode"/>
 *                   &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST}DescriptionSimpleType" minOccurs="0"/>
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
@XmlType(name = "CodesetMetadataType", propOrder = {
    "source",
    "otherLanguage"
})
public class CodesetMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "Source")
    protected CodesetMetadataType.Source source;
    @XmlElement(name = "OtherLanguage")
    protected CodesetMetadataType.OtherLanguage otherLanguage;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetMetadataType.Source }
     *     
     */
    public CodesetMetadataType.Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetMetadataType.Source }
     *     
     */
    public void setSource(CodesetMetadataType.Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the otherLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetMetadataType.OtherLanguage }
     *     
     */
    public CodesetMetadataType.OtherLanguage getOtherLanguage() {
        return otherLanguage;
    }

    /**
     * Sets the value of the otherLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetMetadataType.OtherLanguage }
     *     
     */
    public void setOtherLanguage(CodesetMetadataType.OtherLanguage value) {
        this.otherLanguage = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}LanguageCode"/>
     *         &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST}DescriptionSimpleType" minOccurs="0"/>
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
        "languageCode",
        "description"
    })
    public static class OtherLanguage {

        @XmlElement(name = "LanguageCode", required = true)
        protected LanguageCodeType languageCode;
        @XmlElement(name = "Description")
        protected String description;

        /**
         * Gets the value of the languageCode property.
         * 
         * @return
         *     possible object is
         *     {@link LanguageCodeType }
         *     
         */
        public LanguageCodeType getLanguageCode() {
            return languageCode;
        }

        /**
         * Sets the value of the languageCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link LanguageCodeType }
         *     
         */
        public void setLanguageCode(LanguageCodeType value) {
            this.languageCode = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

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
     *         &lt;element name="OwnerID" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Name">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType">
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="File" type="{http://www.iata.org/IATA/EDIST}ShortDescSimpleType" minOccurs="0"/>
     *         &lt;element name="Version" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" minOccurs="0"/>
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
        "ownerID",
        "file",
        "version"
    })
    public static class Source {

        @XmlElement(name = "OwnerID")
        protected CodesetMetadataType.Source.OwnerID ownerID;
        @XmlElement(name = "File")
        protected String file;
        @XmlElement(name = "Version")
        protected String version;

        /**
         * Gets the value of the ownerID property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetMetadataType.Source.OwnerID }
         *     
         */
        public CodesetMetadataType.Source.OwnerID getOwnerID() {
            return ownerID;
        }

        /**
         * Sets the value of the ownerID property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetMetadataType.Source.OwnerID }
         *     
         */
        public void setOwnerID(CodesetMetadataType.Source.OwnerID value) {
            this.ownerID = value;
        }

        /**
         * Gets the value of the file property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFile() {
            return file;
        }

        /**
         * Sets the value of the file property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFile(String value) {
            this.file = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="Name">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType">
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class OwnerID {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Name")
            protected String name;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

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

        }

    }

}
