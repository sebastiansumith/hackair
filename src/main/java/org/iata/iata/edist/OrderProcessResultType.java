
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * ORDER PROCESSING RESULTS Information definition.
 * 
 * <p>Java class for OrderProcessResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderProcessResultType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MarketingMessages" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderProcessResultType", propOrder = {
    "marketingMessages"
})
@XmlSeeAlso({
    OrdCancelProcessType.class,
    ItinReshopProcessType.class,
    OrderListProcessType.class,
    OrderViewProcessType.class,
    OrdViewProcessType.class,
    ServicePriceProcessType.class
})
public class OrderProcessResultType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "MarketingMessages")
    protected MarketingMessages marketingMessages;

    /**
     * Gets the value of the marketingMessages property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingMessages }
     *     
     */
    public MarketingMessages getMarketingMessages() {
        return marketingMessages;
    }

    /**
     * Sets the value of the marketingMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingMessages }
     *     
     */
    public void setMarketingMessages(MarketingMessages value) {
        this.marketingMessages = value;
    }

}
