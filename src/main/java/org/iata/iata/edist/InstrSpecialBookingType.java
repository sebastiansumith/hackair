
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer Instructions: Special Booking Method definition.
 * 
 * Special Need Order booking method.
 * Examples:
 * AE (by SSR-Special Service Request)
 * AF (by OSI-Other Service Information)
 * 
 * Encoding scheme: PADIS Codeset for data element 9750 - Option
 * 
 * <p>Java class for InstrSpecialBookingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrSpecialBookingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}CodesetType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrSpecialBookingType")
@XmlSeeAlso({
    SpecialBookingInstrType.class
})
public class InstrSpecialBookingType
    extends CodesetType
{


}
