
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SEAT Metadata definition.
 * 
 * <p>Java class for SeatMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="SeatStatus" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMetadataType", propOrder = {
    "seatStatus"
})
public class SeatMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "SeatStatus")
    protected CodesetType seatStatus;

    /**
     * Gets the value of the seatStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getSeatStatus() {
        return seatStatus;
    }

    /**
     * Sets the value of the seatStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setSeatStatus(CodesetType value) {
        this.seatStatus = value;
    }

}
