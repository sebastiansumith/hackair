
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareQualifierCode" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareQualifierCode"
})
@XmlRootElement(name = "FareQualifierCode")
public class FareQualifierCode {

    @XmlElement(name = "FareQualifierCode", required = true)
    protected List<FareQualifierCode> fareQualifierCode;

    /**
     * Gets the value of the fareQualifierCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareQualifierCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareQualifierCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareQualifierCode }
     * 
     * 
     */
    public List<FareQualifierCode> getFareQualifierCode() {
        if (fareQualifierCode == null) {
            fareQualifierCode = new ArrayList<FareQualifierCode>();
        }
        return this.fareQualifierCode;
    }

}
