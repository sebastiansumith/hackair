
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * PRICE CLASS data list definition.
 * 
 * <p>Java class for ListOfPriceClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPriceClassType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceClass" type="{http://www.iata.org/IATA/EDIST}PriceClassType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPriceClassType", propOrder = {
    "priceClass"
})
public class ListOfPriceClassType {

    @XmlElement(name = "PriceClass", required = true)
    protected List<PriceClassType> priceClass;

    /**
     * Gets the value of the priceClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceClassType }
     * 
     * 
     */
    public List<PriceClassType> getPriceClass() {
        if (priceClass == null) {
            priceClass = new ArrayList<PriceClassType>();
        }
        return this.priceClass;
    }

}
