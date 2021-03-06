
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Inventory Guarantee Notice definition.
 * 
 * <p>Java class for InvGuaranteeNoticeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvGuaranteeNoticeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;choice>
 *         &lt;element name="Query">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="GuaranteeRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Results">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InventoryGuarantee" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}InvGuaranteeTimeLimits"/>
 *                             &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}MultiAssociationType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="NoGuaranteeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvGuaranteeNoticeType", propOrder = {
    "query",
    "results"
})
public class InvGuaranteeNoticeType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Query")
    protected InvGuaranteeNoticeType.Query query;
    @XmlElement(name = "Results")
    protected InvGuaranteeNoticeType.Results results;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link InvGuaranteeNoticeType.Query }
     *     
     */
    public InvGuaranteeNoticeType.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvGuaranteeNoticeType.Query }
     *     
     */
    public void setQuery(InvGuaranteeNoticeType.Query value) {
        this.query = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link InvGuaranteeNoticeType.Results }
     *     
     */
    public InvGuaranteeNoticeType.Results getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvGuaranteeNoticeType.Results }
     *     
     */
    public void setResults(InvGuaranteeNoticeType.Results value) {
        this.results = value;
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
     *       &lt;attribute name="GuaranteeRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Query {

        @XmlAttribute(name = "GuaranteeRequestInd")
        protected Boolean guaranteeRequestInd;

        /**
         * Gets the value of the guaranteeRequestInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuaranteeRequestInd() {
            return guaranteeRequestInd;
        }

        /**
         * Sets the value of the guaranteeRequestInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuaranteeRequestInd(Boolean value) {
            this.guaranteeRequestInd = value;
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
     *         &lt;element name="InventoryGuarantee" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}InvGuaranteeTimeLimits"/>
     *                   &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}MultiAssociationType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="NoGuaranteeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inventoryGuarantee"
    })
    public static class Results {

        @XmlElement(name = "InventoryGuarantee")
        protected InvGuaranteeNoticeType.Results.InventoryGuarantee inventoryGuarantee;
        @XmlAttribute(name = "NoGuaranteeInd")
        protected Boolean noGuaranteeInd;

        /**
         * Gets the value of the inventoryGuarantee property.
         * 
         * @return
         *     possible object is
         *     {@link InvGuaranteeNoticeType.Results.InventoryGuarantee }
         *     
         */
        public InvGuaranteeNoticeType.Results.InventoryGuarantee getInventoryGuarantee() {
            return inventoryGuarantee;
        }

        /**
         * Sets the value of the inventoryGuarantee property.
         * 
         * @param value
         *     allowed object is
         *     {@link InvGuaranteeNoticeType.Results.InventoryGuarantee }
         *     
         */
        public void setInventoryGuarantee(InvGuaranteeNoticeType.Results.InventoryGuarantee value) {
            this.inventoryGuarantee = value;
        }

        /**
         * Gets the value of the noGuaranteeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoGuaranteeInd() {
            return noGuaranteeInd;
        }

        /**
         * Sets the value of the noGuaranteeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoGuaranteeInd(Boolean value) {
            this.noGuaranteeInd = value;
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
         *         &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}InvGuaranteeTimeLimits"/>
         *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}MultiAssociationType" minOccurs="0"/>
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
            "invGuaranteeID",
            "invGuaranteeTimeLimits",
            "associations"
        })
        public static class InventoryGuarantee {

            @XmlElement(name = "InvGuaranteeID")
            protected String invGuaranteeID;
            @XmlElement(name = "InvGuaranteeTimeLimits", required = true)
            protected InvGuaranteeTimeLimits invGuaranteeTimeLimits;
            @XmlElement(name = "Associations")
            protected MultiAssociationType associations;

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
             * Gets the value of the invGuaranteeTimeLimits property.
             * 
             * @return
             *     possible object is
             *     {@link InvGuaranteeTimeLimits }
             *     
             */
            public InvGuaranteeTimeLimits getInvGuaranteeTimeLimits() {
                return invGuaranteeTimeLimits;
            }

            /**
             * Sets the value of the invGuaranteeTimeLimits property.
             * 
             * @param value
             *     allowed object is
             *     {@link InvGuaranteeTimeLimits }
             *     
             */
            public void setInvGuaranteeTimeLimits(InvGuaranteeTimeLimits value) {
                this.invGuaranteeTimeLimits = value;
            }

            /**
             * Gets the value of the associations property.
             * 
             * @return
             *     possible object is
             *     {@link MultiAssociationType }
             *     
             */
            public MultiAssociationType getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link MultiAssociationType }
             *     
             */
            public void setAssociations(MultiAssociationType value) {
                this.associations = value;
            }

        }

    }

}
