
package org.iata.iata.edist;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Media Content Seat Camera Position information.
 * 
 * <p>Java class for CabinCameraPosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinCameraPosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Row">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="Orientation" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Column">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/>
 *                   &lt;element name="Orientation" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "CabinCameraPosType", propOrder = {
    "row",
    "column"
})
public class CabinCameraPosType {

    @XmlElement(name = "Row", required = true)
    protected CabinCameraPosType.Row row;
    @XmlElement(name = "Column", required = true)
    protected CabinCameraPosType.Column column;

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link CabinCameraPosType.Row }
     *     
     */
    public CabinCameraPosType.Row getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinCameraPosType.Row }
     *     
     */
    public void setRow(CabinCameraPosType.Row value) {
        this.row = value;
    }

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link CabinCameraPosType.Column }
     *     
     */
    public CabinCameraPosType.Column getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinCameraPosType.Column }
     *     
     */
    public void setColumn(CabinCameraPosType.Column value) {
        this.column = value;
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
     *         &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/>
     *         &lt;element name="Orientation" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
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
        "position",
        "orientation"
    })
    public static class Column {

        @XmlElement(name = "Position", required = true)
        protected String position;
        @XmlElement(name = "Orientation")
        protected CodesetType orientation;

        /**
         * Gets the value of the position property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosition(String value) {
            this.position = value;
        }

        /**
         * Gets the value of the orientation property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetType }
         *     
         */
        public CodesetType getOrientation() {
            return orientation;
        }

        /**
         * Sets the value of the orientation property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetType }
         *     
         */
        public void setOrientation(CodesetType value) {
            this.orientation = value;
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
     *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="Orientation" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
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
        "position",
        "orientation"
    })
    public static class Row {

        @XmlElement(name = "Position", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger position;
        @XmlElement(name = "Orientation")
        protected CodesetType orientation;

        /**
         * Gets the value of the position property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPosition(BigInteger value) {
            this.position = value;
        }

        /**
         * Gets the value of the orientation property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetType }
         *     
         */
        public CodesetType getOrientation() {
            return orientation;
        }

        /**
         * Sets the value of the orientation property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetType }
         *     
         */
        public void setOrientation(CodesetType value) {
            this.orientation = value;
        }

    }

}
