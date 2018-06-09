
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * NDC Capability Model: FARE - FARE DETAIL
 * 
 *  ============
 * Representation(s)
 *  ============
 * • Fare Component information
 * • Fare Rules information
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Fare Code Indicator to represent pricing method (IATA PADIS Code List for data element 5387 - Price Type Qualifier)
 * • Price Class association
 * • Associated Flight Mileage
 * • Fare Remarks
 * • Tour Code support (A special code arranged between the travel agency and the sales representative for a particular airline. When the agent enters the tour code into the reservation and ticketing system, it will input certain information onto the ticket. For example, agent commisions, specific fare fules that supercede the published fare rules etc.)
 * 
 *  ============
 * Metadata
 *  ============
 * • FareMetadata
 * 
 * <p>Java class for FareDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="FareIndicatorCode" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareComponent" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PriceClassReference" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FlightMileage" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}TourCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Remarks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDetailType", propOrder = {
    "fareIndicatorCode",
    "fareComponent",
    "priceClassReference",
    "flightMileage",
    "tourCode",
    "remarks"
})
public class FareDetailType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "FareIndicatorCode")
    protected CodesetType fareIndicatorCode;
    @XmlElement(name = "FareComponent", required = true)
    protected List<FareComponentType> fareComponent;
    @XmlElement(name = "PriceClassReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object priceClassReference;
    @XmlElement(name = "FlightMileage")
    protected FlightMileageType flightMileage;
    @XmlElement(name = "TourCode")
    protected String tourCode;
    @XmlElement(name = "Remarks")
    protected RemarkType remarks;

    /**
     * Gets the value of the fareIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getFareIndicatorCode() {
        return fareIndicatorCode;
    }

    /**
     * Sets the value of the fareIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setFareIndicatorCode(CodesetType value) {
        this.fareIndicatorCode = value;
    }

    /**
     * Fare Component information with Price Breakdown.Gets the value of the fareComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentType }
     * 
     * 
     */
    public List<FareComponentType> getFareComponent() {
        if (fareComponent == null) {
            fareComponent = new ArrayList<FareComponentType>();
        }
        return this.fareComponent;
    }

    /**
     * Associated Price Class.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPriceClassReference() {
        return priceClassReference;
    }

    /**
     * Sets the value of the priceClassReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPriceClassReference(Object value) {
        this.priceClassReference = value;
    }

    /**
     * Gets the value of the flightMileage property.
     * 
     * @return
     *     possible object is
     *     {@link FlightMileageType }
     *     
     */
    public FlightMileageType getFlightMileage() {
        return flightMileage;
    }

    /**
     * Sets the value of the flightMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightMileageType }
     *     
     */
    public void setFlightMileage(FlightMileageType value) {
        this.flightMileage = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setRemarks(RemarkType value) {
        this.remarks = value;
    }

}
