
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Baggage Offer Association definition.
 * 
 * <p>Java class for BagOfferAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagOfferAssocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AssociatedTraveler"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ApplicableFlight"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OfferDetailAssociation" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}BagDetailAssociation" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AssociatedService" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}OtherAssociation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagOfferAssocType", propOrder = {
    "associatedTraveler",
    "applicableFlight",
    "offerDetailAssociation",
    "bagDetailAssociation",
    "associatedService",
    "otherAssociation"
})
public class BagOfferAssocType {

    @XmlElement(name = "AssociatedTraveler", required = true)
    protected TravelerInfoAssocType associatedTraveler;
    @XmlElement(name = "ApplicableFlight", required = true)
    protected ApplicableFlight applicableFlight;
    @XmlElement(name = "OfferDetailAssociation")
    protected OfferDetailInfoAssocType offerDetailAssociation;
    @XmlElement(name = "BagDetailAssociation")
    protected BagDetailAssociation bagDetailAssociation;
    @XmlElement(name = "AssociatedService")
    protected ServiceInfoAssocType associatedService;
    @XmlElement(name = "OtherAssociation")
    protected OtherOfferAssocType otherAssociation;

    /**
     * Gets the value of the associatedTraveler property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerInfoAssocType }
     *     
     */
    public TravelerInfoAssocType getAssociatedTraveler() {
        return associatedTraveler;
    }

    /**
     * Sets the value of the associatedTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerInfoAssocType }
     *     
     */
    public void setAssociatedTraveler(TravelerInfoAssocType value) {
        this.associatedTraveler = value;
    }

    /**
     * Gets the value of the applicableFlight property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicableFlight }
     *     
     */
    public ApplicableFlight getApplicableFlight() {
        return applicableFlight;
    }

    /**
     * Sets the value of the applicableFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicableFlight }
     *     
     */
    public void setApplicableFlight(ApplicableFlight value) {
        this.applicableFlight = value;
    }

    /**
     * Gets the value of the offerDetailAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public OfferDetailInfoAssocType getOfferDetailAssociation() {
        return offerDetailAssociation;
    }

    /**
     * Sets the value of the offerDetailAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public void setOfferDetailAssociation(OfferDetailInfoAssocType value) {
        this.offerDetailAssociation = value;
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
     * Gets the value of the associatedService property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public ServiceInfoAssocType getAssociatedService() {
        return associatedService;
    }

    /**
     * Sets the value of the associatedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public void setAssociatedService(ServiceInfoAssocType value) {
        this.associatedService = value;
    }

    /**
     * Gets the value of the otherAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link OtherOfferAssocType }
     *     
     */
    public OtherOfferAssocType getOtherAssociation() {
        return otherAssociation;
    }

    /**
     * Sets the value of the otherAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherOfferAssocType }
     *     
     */
    public void setOtherAssociation(OtherOfferAssocType value) {
        this.otherAssociation = value;
    }

}
