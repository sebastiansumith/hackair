
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Ticketing Time Limit value.
 * Examples: 2017-05-30T09:00:00,  2015-01-13T13:59:38Z
 * 
 * The time by which passengers must secure tickets (or other accountable documents) for confirmed reservation as agreed with the airline. Passengers meet this requirement by purchasing a ticket (or other accountable document) which indicates the reserved services, or by having previously issued documents revalidated or reissued to reflect the reservation.
 * 
 * <p>Java class for TicketingTimeLimitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingTimeLimitType">
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
@XmlType(name = "TicketingTimeLimitType")
@XmlSeeAlso({
    TicketingTimeLimits.class
})
public class TicketingTimeLimitType
    extends KeyWithMetaObjectBaseType
{


}
