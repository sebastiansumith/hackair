
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * DETAIL OFFER ITEM definition.
 * 
 * <p>Java class for OrderItemDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OrderItemCoreType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemDetailType")
@XmlSeeAlso({
    org.iata.iata.edist.ItinReshopRQ.Query.Reshop.Actions.OrderItems.class,
    org.iata.iata.edist.OrderViewRS.Response.Order.OrderItems.class
})
public class OrderItemDetailType
    extends OrderItemCoreType
{


}
