
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Unique NDC-Enabled System ID.
 * 
 * <p>Java class for SystemID_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemID_Type">
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
@XmlType(name = "SystemID_Type")
public class SystemIDType
    extends UniqueIDContextType
{


}
