
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;choice>
 *         &lt;element name="Cabin" type="{http://www.iata.org/IATA/EDIST}SimpleAircraftCabinType"/>
 *         &lt;sequence>
 *           &lt;element name="ClassOfService" type="{http://www.iata.org/IATA/EDIST}FlightCOS_CoreType"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}BagDetailAssociation" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cabin",
    "classOfService",
    "bagDetailAssociation"
})
@XmlRootElement(name = "FlightSegmentReference")
public class FlightSegmentReference {

    @XmlElement(name = "Cabin")
    protected SimpleAircraftCabinType cabin;
    @XmlElement(name = "ClassOfService")
    protected FlightCOSCoreType classOfService;
    @XmlElement(name = "BagDetailAssociation")
    protected BagDetailAssociation bagDetailAssociation;
    @XmlAttribute(name = "ref")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ref;

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleAircraftCabinType }
     *     
     */
    public SimpleAircraftCabinType getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleAircraftCabinType }
     *     
     */
    public void setCabin(SimpleAircraftCabinType value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCOSCoreType }
     *     
     */
    public FlightCOSCoreType getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCOSCoreType }
     *     
     */
    public void setClassOfService(FlightCOSCoreType value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the bagDetailAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link BagDetailAssociation }
     *     
     */
    public BagDetailAssociation getBagDetailAssociation() {
        return bagDetailAssociation;
    }

    /**
     * Sets the value of the bagDetailAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagDetailAssociation }
     *     
     */
    public void setBagDetailAssociation(BagDetailAssociation value) {
        this.bagDetailAssociation = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRef(Object value) {
        this.ref = value;
    }

}
