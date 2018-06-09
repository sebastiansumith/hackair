
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Detail Frequent Traveler Program.
 * 
 * <p>Java class for FQTV_ProgramDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FQTV_ProgramDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}FQTV_ProgramSummaryType">
 *       &lt;sequence>
 *         &lt;element name="Alliances" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Alliance" type="{http://www.iata.org/IATA/EDIST}FQTV_AllianceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FQTV_ProgramDetailType", propOrder = {
    "alliances"
})
public class FQTVProgramDetailType
    extends FQTVProgramSummaryType
{

    @XmlElement(name = "Alliances")
    protected FQTVProgramDetailType.Alliances alliances;

    /**
     * Gets the value of the alliances property.
     * 
     * @return
     *     possible object is
     *     {@link FQTVProgramDetailType.Alliances }
     *     
     */
    public FQTVProgramDetailType.Alliances getAlliances() {
        return alliances;
    }

    /**
     * Sets the value of the alliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link FQTVProgramDetailType.Alliances }
     *     
     */
    public void setAlliances(FQTVProgramDetailType.Alliances value) {
        this.alliances = value;
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
     *         &lt;element name="Alliance" type="{http://www.iata.org/IATA/EDIST}FQTV_AllianceType" maxOccurs="unbounded"/>
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
        "alliance"
    })
    public static class Alliances {

        @XmlElement(name = "Alliance", required = true)
        protected List<FQTVAllianceType> alliance;

        /**
         * Gets the value of the alliance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alliance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlliance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FQTVAllianceType }
         * 
         * 
         */
        public List<FQTVAllianceType> getAlliance() {
            if (alliance == null) {
                alliance = new ArrayList<FQTVAllianceType>();
            }
            return this.alliance;
        }

    }

}
