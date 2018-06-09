
package org.iata.iata.edist;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A data type for Search Query to Results Match.
 * 
 * Offer match to shopping criteria.  Examples: Full, None, Partial, Other
 * 
 * Note: An additional percentage qualifier, such as 50%, may be specified for a Partial match.
 * 
 * <p>Java class for OfferMatchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferMatchType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST}MatchAppSimpleType"/>
 *         &lt;element name="MatchResult">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>MatchResultsSimpleType">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Percentage" type="{http://www.iata.org/IATA/EDIST}WholePercentageSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferMatchType", propOrder = {
    "application",
    "matchResult",
    "percentage"
})
public class OfferMatchType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Application", required = true)
    protected String application;
    @XmlElement(name = "MatchResult", required = true)
    protected OfferMatchType.MatchResult matchResult;
    @XmlElement(name = "Percentage")
    protected BigDecimal percentage;

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
     * Gets the value of the matchResult property.
     * 
     * @return
     *     possible object is
     *     {@link OfferMatchType.MatchResult }
     *     
     */
    public OfferMatchType.MatchResult getMatchResult() {
        return matchResult;
    }

    /**
     * Sets the value of the matchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferMatchType.MatchResult }
     *     
     */
    public void setMatchResult(OfferMatchType.MatchResult value) {
        this.matchResult = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>MatchResultsSimpleType">
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
    public static class MatchResult {

        @XmlValue
        protected String value;

        /**
         * A data type for Offer Match Results.
         * 
         * Examples: Full, None, Partial, Others
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
