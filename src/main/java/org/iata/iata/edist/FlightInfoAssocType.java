
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Flight that the offer applies to.
 * 
 * <p>Java class for FlightInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightInfoAssocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AllFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="AllOriginDestinationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="AllSegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}OriginDestinationReferences" minOccurs="0"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightReferences" minOccurs="0"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightSegmentReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInfoAssocType", propOrder = {
    "allFlightInd",
    "allOriginDestinationInd",
    "allSegmentInd",
    "originDestinationReferences",
    "flightReferences",
    "flightSegmentReference"
})
@XmlSeeAlso({
    ApplicableFlight.class
})
public class FlightInfoAssocType {

    @XmlElement(name = "AllFlightInd")
    protected Boolean allFlightInd;
    @XmlElement(name = "AllOriginDestinationInd")
    protected Boolean allOriginDestinationInd;
    @XmlElement(name = "AllSegmentInd")
    protected Boolean allSegmentInd;
    @XmlList
    @XmlElement(name = "OriginDestinationReferences")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> originDestinationReferences;
    @XmlElement(name = "FlightReferences")
    protected FlightReferences flightReferences;
    @XmlElement(name = "FlightSegmentReference")
    protected List<FlightSegmentReference> flightSegmentReference;

    /**
     * Gets the value of the allFlightInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllFlightInd() {
        return allFlightInd;
    }

    /**
     * Sets the value of the allFlightInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllFlightInd(Boolean value) {
        this.allFlightInd = value;
    }

    /**
     * Gets the value of the allOriginDestinationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllOriginDestinationInd() {
        return allOriginDestinationInd;
    }

    /**
     * Sets the value of the allOriginDestinationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllOriginDestinationInd(Boolean value) {
        this.allOriginDestinationInd = value;
    }

    /**
     * Gets the value of the allSegmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllSegmentInd() {
        return allSegmentInd;
    }

    /**
     * Sets the value of the allSegmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllSegmentInd(Boolean value) {
        this.allSegmentInd = value;
    }

    /**
     * Gets the value of the originDestinationReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getOriginDestinationReferences() {
        if (originDestinationReferences == null) {
            originDestinationReferences = new ArrayList<Object>();
        }
        return this.originDestinationReferences;
    }

    /**
     * Gets the value of the flightReferences property.
     * 
     * @return
     *     possible object is
     *     {@link FlightReferences }
     *     
     */
    public FlightReferences getFlightReferences() {
        return flightReferences;
    }

    /**
     * Sets the value of the flightReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightReferences }
     *     
     */
    public void setFlightReferences(FlightReferences value) {
        this.flightReferences = value;
    }

    /**
     * Gets the value of the flightSegmentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightSegmentReference }
     * 
     * 
     */
    public List<FlightSegmentReference> getFlightSegmentReference() {
        if (flightSegmentReference == null) {
            flightSegmentReference = new ArrayList<FlightSegmentReference>();
        }
        return this.flightSegmentReference;
    }

}
