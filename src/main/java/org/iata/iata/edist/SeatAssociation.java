
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SegmentReferences"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TravelerReference"/>
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
    "segmentReferences",
    "travelerReference"
})
@XmlRootElement(name = "SeatAssociation")
public class SeatAssociation {

    @XmlElement(name = "SegmentReferences", required = true)
    protected SegmentReferences segmentReferences;
    @XmlElement(name = "TravelerReference", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object travelerReference;

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

    /**
     * Gets the value of the travelerReference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTravelerReference() {
        return travelerReference;
    }

    /**
     * Sets the value of the travelerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTravelerReference(Object value) {
        this.travelerReference = value;
    }

}
