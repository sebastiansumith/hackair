
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AssociatedObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="PrepaidProgram">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirPassCore"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AirPassDetail"/>
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
@XmlType(name = "", propOrder = {
    "prepaidProgram"
})
@XmlRootElement(name = "PrePaidProgramQualifier")
public class PrePaidProgramQualifier
    extends AssociatedObjectBaseType
{

    @XmlElement(name = "PrepaidProgram", required = true)
    protected PrePaidProgramQualifier.PrepaidProgram prepaidProgram;

    /**
     * Gets the value of the prepaidProgram property.
     * 
     * @return
     *     possible object is
     *     {@link PrePaidProgramQualifier.PrepaidProgram }
     *     
     */
    public PrePaidProgramQualifier.PrepaidProgram getPrepaidProgram() {
        return prepaidProgram;
    }

    /**
     * Sets the value of the prepaidProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePaidProgramQualifier.PrepaidProgram }
     *     
     */
    public void setPrepaidProgram(PrePaidProgramQualifier.PrepaidProgram value) {
        this.prepaidProgram = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirPassCore"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AirPassDetail"/>
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
        "airPassCore",
        "airPassDetail"
    })
    public static class PrepaidProgram {

        @XmlElement(name = "AirPassCore", required = true)
        protected AirPassCoreType airPassCore;
        @XmlElement(name = "AirPassDetail", required = true)
        protected AirPassDetailType airPassDetail;

        /**
         * Gets the value of the airPassCore property.
         * 
         * @return
         *     possible object is
         *     {@link AirPassCoreType }
         *     
         */
        public AirPassCoreType getAirPassCore() {
            return airPassCore;
        }

        /**
         * Sets the value of the airPassCore property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirPassCoreType }
         *     
         */
        public void setAirPassCore(AirPassCoreType value) {
            this.airPassCore = value;
        }

        /**
         * Gets the value of the airPassDetail property.
         * 
         * @return
         *     possible object is
         *     {@link AirPassDetailType }
         *     
         */
        public AirPassDetailType getAirPassDetail() {
            return airPassDetail;
        }

        /**
         * Sets the value of the airPassDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirPassDetailType }
         *     
         */
        public void setAirPassDetail(AirPassDetailType value) {
            this.airPassDetail = value;
        }

    }

}
