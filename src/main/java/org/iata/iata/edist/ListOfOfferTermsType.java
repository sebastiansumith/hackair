
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * OFFER/OFFER ITEM TERMS data list definition.
 * 
 * <p>Java class for ListOfOfferTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfOfferTermsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}DataListObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Term" type="{http://www.iata.org/IATA/EDIST}OfferTermsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfOfferTermsType", propOrder = {
    "term"
})
public class ListOfOfferTermsType
    extends DataListObjectBaseType
{

    @XmlElement(name = "Term", required = true)
    protected List<OfferTermsType> term;

    /**
     * Gets the value of the term property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the term property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferTermsType }
     * 
     * 
     */
    public List<OfferTermsType> getTerm() {
        if (term == null) {
            term = new ArrayList<OfferTermsType>();
        }
        return this.term;
    }

}
