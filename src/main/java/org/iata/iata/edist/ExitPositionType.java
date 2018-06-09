
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * SEAT MAP DISPLAY definition.
 * 
 * <p>Java class for ExitPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExitPositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Rows" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *                 &lt;sequence>
 *                   &lt;element name="First">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>CodesetValueSimpleType">
 *                           &lt;attribute name="Columns" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Last">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>CodesetValueSimpleType">
 *                           &lt;attribute name="Columns" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}CabinType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReference" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="UpperDeckInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExitPositionType", propOrder = {
    "rows",
    "segmentReference"
})
public class ExitPositionType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Rows", required = true)
    protected List<ExitPositionType.Rows> rows;
    @XmlElement(name = "SegmentReference")
    protected SegmentReference segmentReference;

    /**
     * Gets the value of the rows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExitPositionType.Rows }
     * 
     * 
     */
    public List<ExitPositionType.Rows> getRows() {
        if (rows == null) {
            rows = new ArrayList<ExitPositionType.Rows>();
        }
        return this.rows;
    }

    /**
     * Gets the value of the segmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentReference }
     *     
     */
    public SegmentReference getSegmentReference() {
        return segmentReference;
    }

    /**
     * Sets the value of the segmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentReference }
     *     
     */
    public void setSegmentReference(SegmentReference value) {
        this.segmentReference = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
     *       &lt;sequence>
     *         &lt;element name="First">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>CodesetValueSimpleType">
     *                 &lt;attribute name="Columns" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Last">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>CodesetValueSimpleType">
     *                 &lt;attribute name="Columns" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}CabinType" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReference" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="UpperDeckInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "first",
        "last",
        "position",
        "cabinType",
        "segmentReference"
    })
    public static class Rows
        extends AssociatedObjectBaseType
    {

        @XmlElement(name = "First", required = true)
        protected ExitPositionType.Rows.First first;
        @XmlElement(name = "Last", required = true)
        protected ExitPositionType.Rows.Last last;
        @XmlElement(name = "Position")
        protected CodesetType position;
        @XmlElement(name = "CabinType")
        protected CabinType cabinType;
        @XmlElement(name = "SegmentReference")
        protected SegmentReference segmentReference;
        @XmlAttribute(name = "UpperDeckInd")
        protected Boolean upperDeckInd;

        /**
         * Gets the value of the first property.
         * 
         * @return
         *     possible object is
         *     {@link ExitPositionType.Rows.First }
         *     
         */
        public ExitPositionType.Rows.First getFirst() {
            return first;
        }

        /**
         * Sets the value of the first property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExitPositionType.Rows.First }
         *     
         */
        public void setFirst(ExitPositionType.Rows.First value) {
            this.first = value;
        }

        /**
         * Gets the value of the last property.
         * 
         * @return
         *     possible object is
         *     {@link ExitPositionType.Rows.Last }
         *     
         */
        public ExitPositionType.Rows.Last getLast() {
            return last;
        }

        /**
         * Sets the value of the last property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExitPositionType.Rows.Last }
         *     
         */
        public void setLast(ExitPositionType.Rows.Last value) {
            this.last = value;
        }

        /**
         * Gets the value of the position property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetType }
         *     
         */
        public CodesetType getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetType }
         *     
         */
        public void setPosition(CodesetType value) {
            this.position = value;
        }

        /**
         * Gets the value of the cabinType property.
         * 
         * @return
         *     possible object is
         *     {@link CabinType }
         *     
         */
        public CabinType getCabinType() {
            return cabinType;
        }

        /**
         * Sets the value of the cabinType property.
         * 
         * @param value
         *     allowed object is
         *     {@link CabinType }
         *     
         */
        public void setCabinType(CabinType value) {
            this.cabinType = value;
        }

        /**
         * Gets the value of the segmentReference property.
         * 
         * @return
         *     possible object is
         *     {@link SegmentReference }
         *     
         */
        public SegmentReference getSegmentReference() {
            return segmentReference;
        }

        /**
         * Sets the value of the segmentReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentReference }
         *     
         */
        public void setSegmentReference(SegmentReference value) {
            this.segmentReference = value;
        }

        /**
         * Gets the value of the upperDeckInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUpperDeckInd() {
            return upperDeckInd;
        }

        /**
         * Sets the value of the upperDeckInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUpperDeckInd(Boolean value) {
            this.upperDeckInd = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>CodesetValueSimpleType">
         *       &lt;attribute name="Columns" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        public static class First {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Columns")
            @XmlSchemaType(name = "anySimpleType")
            protected String columns;

            /**
             * Examples: A, ABC, 1
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
             * Gets the value of the columns property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getColumns() {
                return columns;
            }

            /**
             * Sets the value of the columns property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setColumns(String value) {
                this.columns = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>CodesetValueSimpleType">
         *       &lt;attribute name="Columns" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        public static class Last {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Columns")
            @XmlSchemaType(name = "anySimpleType")
            protected String columns;

            /**
             * Examples: A, ABC, 1
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
             * Gets the value of the columns property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getColumns() {
                return columns;
            }

            /**
             * Sets the value of the columns property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setColumns(String value) {
                this.columns = value;
            }

        }

    }

}
