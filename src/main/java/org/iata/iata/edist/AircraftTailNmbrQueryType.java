
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * AIRCRAFT EQUIPMENT CODE QUERY representation.
 * 
 * <p>Java class for AircraftTailNmbrQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftTailNmbrQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="TailNumber" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftTailNmbrQueryType", propOrder = {
    "tailNumber"
})
public class AircraftTailNmbrQueryType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "TailNumber", required = true)
    protected List<String> tailNumber;

    /**
     * Gets the value of the tailNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tailNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTailNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTailNumber() {
        if (tailNumber == null) {
            tailNumber = new ArrayList<String>();
        }
        return this.tailNumber;
    }

}
