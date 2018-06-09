
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A SEAT OFFER with additional Seat Characteristics information.
 * 
 * <p>Java class for SeatItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Price" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderPriceType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST}Descriptions" minOccurs="0"/>
 *         &lt;element name="SeatDetail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}SeatCharacteristicType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="Location" type="{http://www.iata.org/IATA/EDIST}SeatLocationType" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatReference" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}SeatAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatItemType", propOrder = {
    "price",
    "descriptions",
    "seatDetail",
    "location",
    "seatReference",
    "seatAssociation"
})
@XmlSeeAlso({
    SeatItem.class
})
public class SeatItemType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Price")
    protected SeatItemType.Price price;
    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlElement(name = "SeatDetail")
    protected SeatItemType.SeatDetail seatDetail;
    @XmlElement(name = "Location")
    protected SeatLocationType location;
    @XmlElementRef(name = "SeatReference", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> seatReference;
    @XmlElement(name = "SeatAssociation")
    protected List<SeatAssociation> seatAssociation;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link SeatItemType.Price }
     *     
     */
    public SeatItemType.Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatItemType.Price }
     *     
     */
    public void setPrice(SeatItemType.Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the seatDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SeatItemType.SeatDetail }
     *     
     */
    public SeatItemType.SeatDetail getSeatDetail() {
        return seatDetail;
    }

    /**
     * Sets the value of the seatDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatItemType.SeatDetail }
     *     
     */
    public void setSeatDetail(SeatItemType.SeatDetail value) {
        this.seatDetail = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link SeatLocationType }
     *     
     */
    public SeatLocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatLocationType }
     *     
     */
    public void setLocation(SeatLocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the seatReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getSeatReference() {
        if (seatReference == null) {
            seatReference = new ArrayList<JAXBElement<Object>>();
        }
        return this.seatReference;
    }

    /**
     * Gets the value of the seatAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatAssociation }
     * 
     * 
     */
    public List<SeatAssociation> getSeatAssociation() {
        if (seatAssociation == null) {
            seatAssociation = new ArrayList<SeatAssociation>();
        }
        return this.seatAssociation;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderPriceType">
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
        extends OrderPriceType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}SeatCharacteristicType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SeatDetail
        extends SeatCharacteristicType
    {


    }

}
