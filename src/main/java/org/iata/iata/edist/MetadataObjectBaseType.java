
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Base type for NDC Metadata Representation.
 * 
 * Notes: Within NDC, metadata is defined as data about data. This may include information such as the security of a piece of data or the source of the data. These pieces of metadata may be composed into a metadata type. The types of data to which metadata may be applied may be constrained.
 * 
 * <p>Java class for MetadataObjectBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataObjectBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AugmentationPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refs" type="{http://www.iata.org/IATA/EDIST}InstanceClassRefSimpleType" />
 *       &lt;attribute name="MetadataKey" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataObjectBaseType", propOrder = {
    "augmentationPoint"
})
@XmlSeeAlso({
    DisclosureMetadataType.class,
    EquivalentIDMetadataType.class,
    RuleMetadataType.class,
    BaggageDisclosureMetadataType.class,
    ZoneMetadataType.class,
    CurrencyMetadataType.class,
    ContactMetadataType.class,
    AirportMetadataType.class,
    PenaltyMetadataType.class,
    PaymentCardMetadataType.class,
    BaggageQueryMetadataType.class,
    CodesetMetadataType.class,
    ContentMetadataType.class,
    BaggageCarryOnMetadataType.class,
    SeatMetadataType.class,
    DirectionsMetadataType.class,
    AddressMetadataType.class,
    ItineraryMetadataType.class,
    LanguageMetadataType.class,
    CountryMetadataType.class,
    BaggageCheckedMetadataType.class,
    BaggageDetailMetadataType.class,
    OfferItemMetadataType.class,
    OfferInstructionMetadataType.class,
    OfferTermsMetadataType.class,
    SeatMapMetadataType.class,
    StateProvMetadataType.class,
    PaymentFormMetadataType.class,
    DescriptionMetadataType.class,
    TravelerMetadataType.class,
    AircraftMetadataType.class,
    CityMetadataType.class,
    PriceMetadataType.class,
    MediaMetadataType.class,
    PassengerMetadataType.class,
    FlightMetadataType.class
})
public class MetadataObjectBaseType {

    @XmlElement(name = "AugmentationPoint")
    protected AugPointInfoType augmentationPoint;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;
    @XmlAttribute(name = "MetadataKey", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String metadataKey;

    /**
     * Augmentation Point for this Metadata Structure.
     * 
     * @return
     *     possible object is
     *     {@link AugPointInfoType }
     *     
     */
    public AugPointInfoType getAugmentationPoint() {
        return augmentationPoint;
    }

    /**
     * Sets the value of the augmentationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AugPointInfoType }
     *     
     */
    public void setAugmentationPoint(AugPointInfoType value) {
        this.augmentationPoint = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the metadataKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataKey() {
        return metadataKey;
    }

    /**
     * Sets the value of the metadataKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataKey(String value) {
        this.metadataKey = value;
    }

}
