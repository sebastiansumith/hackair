
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence>
 *         &lt;element name="FareGroup" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}DataListObjectBaseType">
 *                 &lt;sequence>
 *                   &lt;element name="Fare">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}FareCode"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}FareDetail" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FareBasisCode">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/>
 *                             &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST}FareBasisAppSimpleType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "", propOrder = {
    "fareGroup"
})
@XmlRootElement(name = "FareList")
public class FareList {

    @XmlElement(name = "FareGroup", required = true)
    protected List<FareList.FareGroup> fareGroup;

    /**
     * Gets the value of the fareGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareList.FareGroup }
     * 
     * 
     */
    public List<FareList.FareGroup> getFareGroup() {
        if (fareGroup == null) {
            fareGroup = new ArrayList<FareList.FareGroup>();
        }
        return this.fareGroup;
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
     *         &lt;element name="Fare">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FareCode"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}FareDetail" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FareBasisCode">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/>
     *                   &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST}FareBasisAppSimpleType" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "fare",
        "fareBasisCode"
    })
    public static class FareGroup
        extends DataListObjectBaseType
    {

        @XmlElement(name = "Fare", required = true)
        protected FareList.FareGroup.Fare fare;
        @XmlElement(name = "FareBasisCode", required = true)
        protected FareList.FareGroup.FareBasisCode fareBasisCode;

        /**
         * Gets the value of the fare property.
         * 
         * @return
         *     possible object is
         *     {@link FareList.FareGroup.Fare }
         *     
         */
        public FareList.FareGroup.Fare getFare() {
            return fare;
        }

        /**
         * Sets the value of the fare property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareList.FareGroup.Fare }
         *     
         */
        public void setFare(FareList.FareGroup.Fare value) {
            this.fare = value;
        }

        /**
         * Gets the value of the fareBasisCode property.
         * 
         * @return
         *     possible object is
         *     {@link FareList.FareGroup.FareBasisCode }
         *     
         */
        public FareList.FareGroup.FareBasisCode getFareBasisCode() {
            return fareBasisCode;
        }

        /**
         * Sets the value of the fareBasisCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareList.FareGroup.FareBasisCode }
         *     
         */
        public void setFareBasisCode(FareList.FareGroup.FareBasisCode value) {
            this.fareBasisCode = value;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareCode"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareDetail" minOccurs="0"/>
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
            "fareCode",
            "fareDetail"
        })
        public static class Fare {

            @XmlElement(name = "FareCode", required = true)
            protected FareCodeType fareCode;
            @XmlElement(name = "FareDetail")
            protected FareDetailType fareDetail;

            /**
             * Gets the value of the fareCode property.
             * 
             * @return
             *     possible object is
             *     {@link FareCodeType }
             *     
             */
            public FareCodeType getFareCode() {
                return fareCode;
            }

            /**
             * Sets the value of the fareCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareCodeType }
             *     
             */
            public void setFareCode(FareCodeType value) {
                this.fareCode = value;
            }

            /**
             * Gets the value of the fareDetail property.
             * 
             * @return
             *     possible object is
             *     {@link FareDetailType }
             *     
             */
            public FareDetailType getFareDetail() {
                return fareDetail;
            }

            /**
             * Sets the value of the fareDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareDetailType }
             *     
             */
            public void setFareDetail(FareDetailType value) {
                this.fareDetail = value;
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
         *         &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/>
         *         &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST}FareBasisAppSimpleType" minOccurs="0"/>
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
            "code",
            "application"
        })
        public static class FareBasisCode {

            @XmlElement(name = "Code", required = true)
            protected String code;
            @XmlElement(name = "Application")
            protected String application;

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
             * Gets the value of the application property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplication() {
                return application;
            }

            /**
             * Sets the value of the application property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplication(String value) {
                this.application = value;
            }

        }

    }

}
