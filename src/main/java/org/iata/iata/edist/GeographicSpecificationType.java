
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Geographic Specification information
 * 
 * <p>Java class for GeographicSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetType"/>
 *         &lt;choice>
 *           &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *           &lt;element name="SubArea" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}CountryCode"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}CityCode"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}StateCode"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}AirportCode"/>
 *           &lt;element name="Coordinates" type="{http://www.iata.org/IATA/EDIST}PositionType"/>
 *           &lt;element name="CoordinateRadius" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicSpecificationType", propOrder = {
    "type",
    "area",
    "subArea",
    "countryCode",
    "cityCode",
    "stateCode",
    "airportCode",
    "coordinates",
    "coordinateRadius"
})
public class GeographicSpecificationType {

    @XmlElement(name = "Type", required = true)
    protected CodesetType type;
    @XmlElement(name = "Area")
    protected Object area;
    @XmlElement(name = "SubArea")
    protected Object subArea;
    @XmlElement(name = "CountryCode")
    protected CountryCode countryCode;
    @XmlElement(name = "CityCode")
    protected CityCode cityCode;
    @XmlElement(name = "StateCode")
    protected StateProvCodeType stateCode;
    @XmlElement(name = "AirportCode")
    protected AirportCode airportCode;
    @XmlElement(name = "Coordinates")
    protected PositionType coordinates;
    @XmlElement(name = "CoordinateRadius")
    protected Object coordinateRadius;

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
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setArea(Object value) {
        this.area = value;
    }

    /**
     * Gets the value of the subArea property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSubArea() {
        return subArea;
    }

    /**
     * Sets the value of the subArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSubArea(Object value) {
        this.subArea = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountryCode(CountryCode value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CityCode }
     *     
     */
    public CityCode getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityCode }
     *     
     */
    public void setCityCode(CityCode value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvCodeType }
     *     
     */
    public StateProvCodeType getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvCodeType }
     *     
     */
    public void setStateCode(StateProvCodeType value) {
        this.stateCode = value;
    }

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

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setCoordinates(PositionType value) {
        this.coordinates = value;
    }

    /**
     * Gets the value of the coordinateRadius property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCoordinateRadius() {
        return coordinateRadius;
    }

    /**
     * Sets the value of the coordinateRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCoordinateRadius(Object value) {
        this.coordinateRadius = value;
    }

}
