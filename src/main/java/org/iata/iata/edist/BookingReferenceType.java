
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Booking Reference definition.
 * 
 * <p>Java class for BookingReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *         &lt;element name="ID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9a-zA-Z]{1,6}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="AirlineID">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>AirlineID_Type">
 *                   &lt;attribute name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="OtherID">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>UniqueStringID_SimpleType">
 *                   &lt;attribute name="refs" type="{http://www.iata.org/IATA/EDIST}InstanceClassRefSimpleType" />
 *                   &lt;attribute name="ObjectMetaReferences" type="{http://www.iata.org/IATA/EDIST}InstanceClassRefSimpleType" />
 *                   &lt;attribute name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingReferenceType", propOrder = {
    "type",
    "id",
    "airlineID",
    "otherID"
})
@XmlSeeAlso({
    BookingReference.class
})
public class BookingReferenceType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Type")
    protected CodesetType type;
    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "AirlineID")
    protected BookingReferenceType.AirlineID airlineID;
    @XmlElement(name = "OtherID")
    protected BookingReferenceType.OtherID otherID;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setType(CodesetType value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the airlineID property.
     * 
     * @return
     *     possible object is
     *     {@link BookingReferenceType.AirlineID }
     *     
     */
    public BookingReferenceType.AirlineID getAirlineID() {
        return airlineID;
    }

    /**
     * Sets the value of the airlineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingReferenceType.AirlineID }
     *     
     */
    public void setAirlineID(BookingReferenceType.AirlineID value) {
        this.airlineID = value;
    }

    /**
     * Gets the value of the otherID property.
     * 
     * @return
     *     possible object is
     *     {@link BookingReferenceType.OtherID }
     *     
     */
    public BookingReferenceType.OtherID getOtherID() {
        return otherID;
    }

    /**
     * Sets the value of the otherID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingReferenceType.OtherID }
     *     
     */
    public void setOtherID(BookingReferenceType.OtherID value) {
        this.otherID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>AirlineID_Type">
     *       &lt;attribute name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AirlineID
        extends AirlineIDType
    {

        @XmlAttribute(name = "Name")
        protected String name;

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>UniqueStringID_SimpleType">
     *       &lt;attribute name="refs" type="{http://www.iata.org/IATA/EDIST}InstanceClassRefSimpleType" />
     *       &lt;attribute name="ObjectMetaReferences" type="{http://www.iata.org/IATA/EDIST}InstanceClassRefSimpleType" />
     *       &lt;attribute name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" />
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
    public static class OtherID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ObjectMetaReferences")
        @XmlIDREF
        protected List<Object> objectMetaReferences;
        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * A data type for a Unique String Identifier constraint.
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
         * Gets the value of the refs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getRefs() {
            if (refs == null) {
                refs = new ArrayList<Object>();
            }
            return this.refs;
        }

        /**
         * Gets the value of the objectMetaReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the objectMetaReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObjectMetaReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getObjectMetaReferences() {
            if (objectMetaReferences == null) {
                objectMetaReferences = new ArrayList<Object>();
            }
            return this.objectMetaReferences;
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
