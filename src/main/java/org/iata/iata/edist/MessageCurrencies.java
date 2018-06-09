
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
 *         &lt;element name="CurrCode" type="{http://www.iata.org/IATA/EDIST}CurrencyCodeType" maxOccurs="unbounded"/>
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
    "currCode"
})
@XmlRootElement(name = "MessageCurrencies")
public class MessageCurrencies {

    @XmlElement(name = "CurrCode", required = true)
    protected List<CurrencyCodeType> currCode;

    /**
     * Gets the value of the currCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyCodeType }
     * 
     * 
     */
    public List<CurrencyCodeType> getCurrCode() {
        if (currCode == null) {
            currCode = new ArrayList<CurrencyCodeType>();
        }
        return this.currCode;
    }

}
