
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Message Processing Results.
 * 
 * May include errors, business warnings, alternate offers indicator, supplemental marketing messages and/ or additional information required to complete a transaction.
 * 
 * <p>Java class for ProcessingResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingResultType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Marketing" type="{http://www.iata.org/IATA/EDIST}MarketingInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingResultType", propOrder = {
    "marketing"
})
public class ProcessingResultType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Marketing")
    protected MarketingInfoType marketing;

    /**
     * Gets the value of the marketing property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingInfoType }
     *     
     */
    public MarketingInfoType getMarketing() {
        return marketing;
    }

    /**
     * Sets the value of the marketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingInfoType }
     *     
     */
    public void setMarketing(MarketingInfoType value) {
        this.marketing = value;
    }

}
