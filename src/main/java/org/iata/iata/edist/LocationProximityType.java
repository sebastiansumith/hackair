
package org.iata.iata.edist;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * LOCATION PROXIMITY definition.
 * 
 * Note: This contains either the requested maximum distance search radius values -or- the actual Proximity information, which is typically used to specify the results from the named location radius search.
 * 
 * <p>Java class for LocationProximityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationProximityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST}ProximityAppSimpleType"/>
 *         &lt;element name="AreaValue">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UOM" type="{http://www.iata.org/IATA/EDIST}DistanceUnitSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationProximityType", propOrder = {
    "application",
    "areaValue",
    "uom"
})
@XmlSeeAlso({
    CountryProximityType.class,
    StateProvProximityType.class
})
public class LocationProximityType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Application", required = true)
    protected String application;
    @XmlElement(name = "AreaValue", required = true)
    protected LocationProximityType.AreaValue areaValue;
    @XmlElement(name = "UOM")
    protected String uom;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the areaValue property.
     * 
     * @return
     *     possible object is
     *     {@link LocationProximityType.AreaValue }
     *     
     */
    public LocationProximityType.AreaValue getAreaValue() {
        return areaValue;
    }

    /**
     * Sets the value of the areaValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationProximityType.AreaValue }
     *     
     */
    public void setAreaValue(LocationProximityType.AreaValue value) {
        this.areaValue = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOM(String value) {
        this.uom = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
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
    public static class AreaValue {

        @XmlValue
        protected BigDecimal value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

    }

}
