
package org.iata.iata.edist;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Baggage Allowance by Piece.
 * 
 * <p>Java class for BagAllowancePieceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagAllowancePieceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="ApplicableParty" type="{http://www.iata.org/IATA/EDIST}BagAppSimpleType"/>
 *         &lt;element name="TotalQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="BagType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicableBag" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST}Descriptions" minOccurs="0"/>
 *         &lt;element name="PieceMeasurements" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PieceWeightAllowance" type="{http://www.iata.org/IATA/EDIST}BagAllowanceWeightType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PieceDimensionAllowance" type="{http://www.iata.org/IATA/EDIST}BagAllowanceDimensionType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PieceAllowanceCombination">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="OR"/>
 *             &lt;enumeration value="AND"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagAllowancePieceType", propOrder = {
    "applicableParty",
    "totalQuantity",
    "bagType",
    "applicableBag",
    "descriptions",
    "pieceMeasurements"
})
@XmlSeeAlso({
    PieceAllowance.class
})
public class BagAllowancePieceType
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "ApplicableParty", required = true)
    protected String applicableParty;
    @XmlElement(name = "TotalQuantity", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalQuantity;
    @XmlElement(name = "BagType")
    protected String bagType;
    @XmlElement(name = "ApplicableBag")
    protected String applicableBag;
    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlElement(name = "PieceMeasurements", required = true)
    protected List<BagAllowancePieceType.PieceMeasurements> pieceMeasurements;
    @XmlAttribute(name = "PieceAllowanceCombination")
    protected String pieceAllowanceCombination;

    /**
     * Gets the value of the applicableParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableParty() {
        return applicableParty;
    }

    /**
     * Sets the value of the applicableParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableParty(String value) {
        this.applicableParty = value;
    }

    /**
     * Gets the value of the totalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Sets the value of the totalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalQuantity(BigInteger value) {
        this.totalQuantity = value;
    }

    /**
     * Gets the value of the bagType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagType() {
        return bagType;
    }

    /**
     * Sets the value of the bagType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagType(String value) {
        this.bagType = value;
    }

    /**
     * Gets the value of the applicableBag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableBag() {
        return applicableBag;
    }

    /**
     * Sets the value of the applicableBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableBag(String value) {
        this.applicableBag = value;
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

    /**
     * Gets the value of the pieceMeasurements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieceMeasurements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPieceMeasurements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagAllowancePieceType.PieceMeasurements }
     * 
     * 
     */
    public List<BagAllowancePieceType.PieceMeasurements> getPieceMeasurements() {
        if (pieceMeasurements == null) {
            pieceMeasurements = new ArrayList<BagAllowancePieceType.PieceMeasurements>();
        }
        return this.pieceMeasurements;
    }

    /**
     * Gets the value of the pieceAllowanceCombination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPieceAllowanceCombination() {
        return pieceAllowanceCombination;
    }

    /**
     * Sets the value of the pieceAllowanceCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPieceAllowanceCombination(String value) {
        this.pieceAllowanceCombination = value;
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
     *         &lt;element name="PieceWeightAllowance" type="{http://www.iata.org/IATA/EDIST}BagAllowanceWeightType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PieceDimensionAllowance" type="{http://www.iata.org/IATA/EDIST}BagAllowanceDimensionType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pieceWeightAllowance",
        "pieceDimensionAllowance"
    })
    public static class PieceMeasurements {

        @XmlElement(name = "PieceWeightAllowance")
        protected List<BagAllowanceWeightType> pieceWeightAllowance;
        @XmlElement(name = "PieceDimensionAllowance")
        protected List<BagAllowanceDimensionType> pieceDimensionAllowance;
        @XmlAttribute(name = "Quantity", required = true)
        protected int quantity;

        /**
         * Gets the value of the pieceWeightAllowance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pieceWeightAllowance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPieceWeightAllowance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BagAllowanceWeightType }
         * 
         * 
         */
        public List<BagAllowanceWeightType> getPieceWeightAllowance() {
            if (pieceWeightAllowance == null) {
                pieceWeightAllowance = new ArrayList<BagAllowanceWeightType>();
            }
            return this.pieceWeightAllowance;
        }

        /**
         * Gets the value of the pieceDimensionAllowance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pieceDimensionAllowance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPieceDimensionAllowance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BagAllowanceDimensionType }
         * 
         * 
         */
        public List<BagAllowanceDimensionType> getPieceDimensionAllowance() {
            if (pieceDimensionAllowance == null) {
                pieceDimensionAllowance = new ArrayList<BagAllowanceDimensionType>();
            }
            return this.pieceDimensionAllowance;
        }

        /**
         * Gets the value of the quantity property.
         * 
         */
        public int getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         */
        public void setQuantity(int value) {
            this.quantity = value;
        }

    }

}
