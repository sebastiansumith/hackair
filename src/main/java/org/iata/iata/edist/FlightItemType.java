
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * FLIGHT Order Item.
 * 
 * <p>Java class for FlightItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Price" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}FlightPriceType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OriginDestination" type="{http://www.iata.org/IATA/EDIST}FlightType" maxOccurs="unbounded"/>
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/EDIST}OrderFareDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightItemType", propOrder = {
    "price",
    "originDestination",
    "fareDetail"
})
public class FlightItemType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Price")
    protected FlightItemType.Price price;
    @XmlElement(name = "OriginDestination", required = true)
    protected List<FlightType> originDestination;
    @XmlElement(name = "FareDetail")
    protected OrderFareDetailType fareDetail;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link FlightItemType.Price }
     *     
     */
    public FlightItemType.Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightItemType.Price }
     *     
     */
    public void setPrice(FlightItemType.Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the originDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightType }
     * 
     * 
     */
    public List<FlightType> getOriginDestination() {
        if (originDestination == null) {
            originDestination = new ArrayList<FlightType>();
        }
        return this.originDestination;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrderFareDetailType }
     *     
     */
    public OrderFareDetailType getFareDetail() {
        return fareDetail;
    }

    /**
     * Sets the value of the fareDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderFareDetailType }
     *     
     */
    public void setFareDetail(OrderFareDetailType value) {
        this.fareDetail = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}FlightPriceType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Price
        extends FlightPriceType
    {


    }

}
