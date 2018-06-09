
package com.ibsplc.iflyres.simpletypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="FlightSegmentDetails" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}FlightSegmentDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FareComponentDetails" type="{http://www.ibsplc.com/iFlyRes/simpleTypes}FareComponentDetailType" maxOccurs="unbounded" minOccurs="0"/>
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
    "flightSegmentDetails",
    "fareComponentDetails"
})
@XmlRootElement(name = "JourneyDataAugPoint")
public class JourneyDataAugPoint {

    @XmlElement(name = "FlightSegmentDetails")
    protected List<FlightSegmentDetailsType> flightSegmentDetails;
    @XmlElement(name = "FareComponentDetails")
    protected List<FareComponentDetailType> fareComponentDetails;

    /**
     * Gets the value of the flightSegmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightSegmentDetailsType }
     * 
     * 
     */
    public List<FlightSegmentDetailsType> getFlightSegmentDetails() {
        if (flightSegmentDetails == null) {
            flightSegmentDetails = new ArrayList<FlightSegmentDetailsType>();
        }
        return this.flightSegmentDetails;
    }

    /**
     * Gets the value of the fareComponentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareComponentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareComponentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentDetailType }
     * 
     * 
     */
    public List<FareComponentDetailType> getFareComponentDetails() {
        if (fareComponentDetails == null) {
            fareComponentDetails = new ArrayList<FareComponentDetailType>();
        }
        return this.fareComponentDetails;
    }

}
