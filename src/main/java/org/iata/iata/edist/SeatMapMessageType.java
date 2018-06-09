
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * SEAT MAP COMPONENT MEDIA and MESSAGE definition.
 * 
 * <p>Java class for SeatMapMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatMapMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Images" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ImageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST}CabinCameraPosType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Links" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}MediaLink"/>
 *                   &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST}CabinCameraPosType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "SeatMapMessageType", propOrder = {
    "images",
    "links",
    "remarks"
})
@XmlSeeAlso({
    org.iata.iata.edist.SeatDataType.Marketing.class
})
public class SeatMapMessageType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Images")
    protected List<SeatMapMessageType.Images> images;
    @XmlElement(name = "Links")
    protected List<SeatMapMessageType.Links> links;
    @XmlElement(name = "Remarks")
    protected RemarkType remarks;

    /**
     * Gets the value of the images property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the images property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatMapMessageType.Images }
     * 
     * 
     */
    public List<SeatMapMessageType.Images> getImages() {
        if (images == null) {
            images = new ArrayList<SeatMapMessageType.Images>();
        }
        return this.images;
    }

    /**
     * Gets the value of the links property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the links property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatMapMessageType.Links }
     * 
     * 
     */
    public List<SeatMapMessageType.Links> getLinks() {
        if (links == null) {
            links = new ArrayList<SeatMapMessageType.Links>();
        }
        return this.links;
    }

    /**
     * Marketing message for all seats in this section.
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
     *         &lt;element name="ImageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST}CabinCameraPosType" minOccurs="0"/>
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
        "imageID",
        "position"
    })
    public static class Images {

        @XmlElement(name = "ImageID", required = true)
        protected String imageID;
        @XmlElement(name = "Position")
        protected CabinCameraPosType position;

        /**
         * Gets the value of the imageID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImageID() {
            return imageID;
        }

        /**
         * Sets the value of the imageID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImageID(String value) {
            this.imageID = value;
        }

        /**
         * Gets the value of the position property.
         * 
         * @return
         *     possible object is
         *     {@link CabinCameraPosType }
         *     
         */
        public CabinCameraPosType getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link CabinCameraPosType }
         *     
         */
        public void setPosition(CabinCameraPosType value) {
            this.position = value;
        }

    }


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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MediaLink"/>
     *         &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST}CabinCameraPosType" minOccurs="0"/>
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
        "mediaLink",
        "position"
    })
    public static class Links {

        @XmlElement(name = "MediaLink", required = true)
        protected MediaLink mediaLink;
        @XmlElement(name = "Position")
        protected CabinCameraPosType position;

        /**
         * Gets the value of the mediaLink property.
         * 
         * @return
         *     possible object is
         *     {@link MediaLink }
         *     
         */
        public MediaLink getMediaLink() {
            return mediaLink;
        }

        /**
         * Sets the value of the mediaLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link MediaLink }
         *     
         */
        public void setMediaLink(MediaLink value) {
            this.mediaLink = value;
        }

        /**
         * Gets the value of the position property.
         * 
         * @return
         *     possible object is
         *     {@link CabinCameraPosType }
         *     
         */
        public CabinCameraPosType getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link CabinCameraPosType }
         *     
         */
        public void setPosition(CabinCameraPosType value) {
            this.position = value;
        }

    }

}
