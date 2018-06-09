
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * OPTIONAL SERVICE AIRPORT LOCATION representation.
 * 
 * Airport Location Code.  Example: TPA
 * 
 * Encoding Scheme: IATA/ A4A (three character) Airport or City Code
 * 
 * <p>Java class for SrvcLocationAirportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SrvcLocationAirportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SrvcLocationAirportType", propOrder = {
    "airportCode"
})
public class SrvcLocationAirportType
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "AirportCode")
    protected AirportCode airportCode;

    /**
     * Gets the value of the airportCode property.
     * 
     * @return
     *     possible object is
     *     {@link AirportCode }
     *     
     */
    public AirportCode getAirportCode() {
        return airportCode;
    }

    /**
     * Sets the value of the airportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportCode }
     *     
     */
    public void setAirportCode(AirportCode value) {
        this.airportCode = value;
    }

}
