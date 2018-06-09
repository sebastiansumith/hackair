
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Unique Aggregator ID.
 * 
 * <p>Java class for AggregatorID_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AggregatorID_Type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>UniqueIDContextType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregatorID_Type")
public class AggregatorIDType
    extends UniqueIDContextType
{


}
