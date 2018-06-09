
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer Instructions: SPECIAL BOOKING METHOD definition.
 * 
 * Special Need Order booking method.
 * Examples:
 * AE (by SSR-Special Service Request)
 * AF (by OSI-Other Service Information)
 * 
 * Encoding scheme: PADIS Code List for data element 9750 - Option
 * 
 * <p>Java class for SpecialBookingInstrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialBookingInstrType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}InstrSpecialBookingType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialBookingInstrType")
public class SpecialBookingInstrType
    extends InstrSpecialBookingType
{


}
