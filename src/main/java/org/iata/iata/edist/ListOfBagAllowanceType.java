
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * BAGGAGE ALLOWANCE data list definition.
 * 
 * <p>Java class for ListOfBagAllowanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfBagAllowanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckedBagAllowance" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}DataListObjectBaseType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AllowanceDescription" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}DimensionAllowance" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PieceAllowance" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}WeightAllowance" minOccurs="0"/>
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
@XmlType(name = "ListOfBagAllowanceType", propOrder = {
    "checkedBagAllowance"
})
public class ListOfBagAllowanceType {

    @XmlElement(name = "CheckedBagAllowance", required = true)
    protected List<ListOfBagAllowanceType.CheckedBagAllowance> checkedBagAllowance;

    /**
     * Gets the value of the checkedBagAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkedBagAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckedBagAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfBagAllowanceType.CheckedBagAllowance }
     * 
     * 
     */
    public List<ListOfBagAllowanceType.CheckedBagAllowance> getCheckedBagAllowance() {
        if (checkedBagAllowance == null) {
            checkedBagAllowance = new ArrayList<ListOfBagAllowanceType.CheckedBagAllowance>();
        }
        return this.checkedBagAllowance;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AllowanceDescription" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}DimensionAllowance" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PieceAllowance" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}WeightAllowance" minOccurs="0"/>
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
        "allowanceDescription",
        "dimensionAllowance",
        "pieceAllowance",
        "weightAllowance"
    })
    public static class CheckedBagAllowance
        extends DataListObjectBaseType
    {

        @XmlElement(name = "AllowanceDescription")
        protected BagAllowanceDescType allowanceDescription;
        @XmlElement(name = "DimensionAllowance")
        protected BagAllowanceDimensionType dimensionAllowance;
        @XmlElement(name = "PieceAllowance")
        protected List<PieceAllowance> pieceAllowance;
        @XmlElement(name = "WeightAllowance")
        protected WeightAllowance weightAllowance;

        /**
         * Gets the value of the allowanceDescription property.
         * 
         * @return
         *     possible object is
         *     {@link BagAllowanceDescType }
         *     
         */
        public BagAllowanceDescType getAllowanceDescription() {
            return allowanceDescription;
        }

        /**
         * Sets the value of the allowanceDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link BagAllowanceDescType }
         *     
         */
        public void setAllowanceDescription(BagAllowanceDescType value) {
            this.allowanceDescription = value;
        }

        /**
         * Gets the value of the dimensionAllowance property.
         * 
         * @return
         *     possible object is
         *     {@link BagAllowanceDimensionType }
         *     
         */
        public BagAllowanceDimensionType getDimensionAllowance() {
            return dimensionAllowance;
        }

        /**
         * Sets the value of the dimensionAllowance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BagAllowanceDimensionType }
         *     
         */
        public void setDimensionAllowance(BagAllowanceDimensionType value) {
            this.dimensionAllowance = value;
        }

        /**
         * Gets the value of the pieceAllowance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pieceAllowance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPieceAllowance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PieceAllowance }
         * 
         * 
         */
        public List<PieceAllowance> getPieceAllowance() {
            if (pieceAllowance == null) {
                pieceAllowance = new ArrayList<PieceAllowance>();
            }
            return this.pieceAllowance;
        }

        /**
         * Gets the value of the weightAllowance property.
         * 
         * @return
         *     possible object is
         *     {@link WeightAllowance }
         *     
         */
        public WeightAllowance getWeightAllowance() {
            return weightAllowance;
        }

        /**
         * Sets the value of the weightAllowance property.
         * 
         * @param value
         *     allowed object is
         *     {@link WeightAllowance }
         *     
         */
        public void setWeightAllowance(WeightAllowance value) {
            this.weightAllowance = value;
        }

    }

}
