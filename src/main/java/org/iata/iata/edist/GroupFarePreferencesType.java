
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Shopping Request Business Object: GROUP FARE Preferences.
 * 
 * <p>Java class for GroupFarePreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupFarePreferencesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="GroupFare" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareBasis" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST}FareBasisCodeType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PTC" type="{http://www.iata.org/IATA/EDIST}PaxSimpleType"/>
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
@XmlType(name = "GroupFarePreferencesType", propOrder = {
    "groupFare"
})
public class GroupFarePreferencesType
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "GroupFare", required = true)
    protected List<GroupFarePreferencesType.GroupFare> groupFare;

    /**
     * Gets the value of the groupFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupFarePreferencesType.GroupFare }
     * 
     * 
     */
    public List<GroupFarePreferencesType.GroupFare> getGroupFare() {
        if (groupFare == null) {
            groupFare = new ArrayList<GroupFarePreferencesType.GroupFare>();
        }
        return this.groupFare;
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
     *         &lt;element name="FareBasis" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST}FareBasisCodeType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PTC" type="{http://www.iata.org/IATA/EDIST}PaxSimpleType"/>
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
        "fareBasis",
        "ptc"
    })
    public static class GroupFare {

        @XmlElement(name = "FareBasis", required = true)
        protected List<GroupFarePreferencesType.GroupFare.FareBasis> fareBasis;
        @XmlElement(name = "PTC", required = true)
        protected String ptc;

        /**
         * Gets the value of the fareBasis property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareBasis property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareBasis().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GroupFarePreferencesType.GroupFare.FareBasis }
         * 
         * 
         */
        public List<GroupFarePreferencesType.GroupFare.FareBasis> getFareBasis() {
            if (fareBasis == null) {
                fareBasis = new ArrayList<GroupFarePreferencesType.GroupFare.FareBasis>();
            }
            return this.fareBasis;
        }

        /**
         * Gets the value of the ptc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPTC() {
            return ptc;
        }

        /**
         * Sets the value of the ptc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPTC(String value) {
            this.ptc = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST}FareBasisCodeType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/>
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
            "segmentReferences"
        })
        public static class FareBasis
            extends FareBasisCodeType
        {

            @XmlElement(name = "SegmentReferences", required = true)
            protected SegmentReferences segmentReferences;

            /**
             * Gets the value of the segmentReferences property.
             * 
             * @return
             *     possible object is
             *     {@link SegmentReferences }
             *     
             */
            public SegmentReferences getSegmentReferences() {
                return segmentReferences;
            }

            /**
             * Sets the value of the segmentReferences property.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentReferences }
             *     
             */
            public void setSegmentReferences(SegmentReferences value) {
                this.segmentReferences = value;
            }

        }

    }

}
