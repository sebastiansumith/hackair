
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * AIRCRAFT EQUIPMENT CODE QUERY representation.
 * 
 * <p>Java class for AircraftCodeQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftCodeQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AircraftCode" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftCodeQueryType", propOrder = {
    "aircraftCode"
})
@XmlSeeAlso({
    org.iata.iata.edist.FlightPreferencesType.Aircraft.Equipment.class
})
public class AircraftCodeQueryType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "AircraftCode", required = true)
    protected List<AircraftCode> aircraftCode;

    /**
     * The IATA aircraft type 3 character code; use SSIM Appendix A. Example:318.Gets the value of the aircraftCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraftCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraftCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftCode }
     * 
     * 
     */
    public List<AircraftCode> getAircraftCode() {
        if (aircraftCode == null) {
            aircraftCode = new ArrayList<AircraftCode>();
        }
        return this.aircraftCode;
    }

}
