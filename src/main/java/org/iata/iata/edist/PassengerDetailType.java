
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for DETAIL PASSENGER representation.
 * 
 * <p>Java class for PassengerDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PassengerSummaryType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerDetailType")
@XmlSeeAlso({
    org.iata.iata.edist.ItinReshopRS.Response.Passengers.Passenger.class,
    org.iata.iata.edist.OrderChangeRQ.Query.Passengers.Passenger.class,
    org.iata.iata.edist.Passenger.class
})
public class PassengerDetailType
    extends PassengerSummaryType
{


}
