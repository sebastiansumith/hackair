
package org.iata.iata.edist;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Record S7 diagnostic definition.
 * 
 * <p>Java class for S7Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S7Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="UID" type="{http://www.iata.org/IATA/EDIST}UniqueStringID_SimpleType" minOccurs="0"/>
 *         &lt;element name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S7Type", propOrder = {
    "uid",
    "seq",
    "excessFirst",
    "excessLast"
})
public class S7Type
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "UID")
    protected String uid;
    @XmlElement(name = "Seq")
    protected BigInteger seq;
    @XmlElement(name = "ExcessFirst")
    protected BigInteger excessFirst;
    @XmlElement(name = "ExcessLast")
    protected BigInteger excessLast;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeq(BigInteger value) {
        this.seq = value;
    }

    /**
     * Gets the value of the excessFirst property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExcessFirst() {
        return excessFirst;
    }

    /**
     * Sets the value of the excessFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExcessFirst(BigInteger value) {
        this.excessFirst = value;
    }

    /**
     * Gets the value of the excessLast property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExcessLast() {
        return excessLast;
    }

    /**
     * Sets the value of the excessLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExcessLast(BigInteger value) {
        this.excessLast = value;
    }

}
