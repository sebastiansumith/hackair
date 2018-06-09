
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer/ Offer Item: PAYMENT Time Limit definition.
 * 
 * Payment Time Limit value.
 * Examples: 2017-05-30T09:00:00,  2015-01-13T13:59:38Z
 * 
 * Notes:
 *  1. This is the deadline by which a commitment to pay must be made for the items in an order. This includes ticketless transactions and other accountable documents, such as EMD. 
 * 
 *  2. Payment Time Limit and Ticket Time Limit may be the same in most cases; however, Payment Time Limit expands to include ticketless transactions and other accountable documents.
 * 
 * <p>Java class for PaymentTimeLimitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTimeLimitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTimeLimitType")
public class PaymentTimeLimitType
    extends KeyWithMetaObjectBaseType
{


}
