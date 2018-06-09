
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information Policy Notice definition.
 * 
 * <p>Java class for InfoPolicyNoticeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoPolicyNoticeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Policy" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}PolicyType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PolicyDefinedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoPolicyNoticeType", propOrder = {
    "policy"
})
public class InfoPolicyNoticeType {

    @XmlElement(name = "Policy", required = true)
    protected List<InfoPolicyNoticeType.Policy> policy;
    @XmlAttribute(name = "PolicyDefinedInd")
    protected Boolean policyDefinedInd;

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoPolicyNoticeType.Policy }
     * 
     * 
     */
    public List<InfoPolicyNoticeType.Policy> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<InfoPolicyNoticeType.Policy>();
        }
        return this.policy;
    }

    /**
     * Gets the value of the policyDefinedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPolicyDefinedInd() {
        return policyDefinedInd;
    }

    /**
     * Sets the value of the policyDefinedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPolicyDefinedInd(Boolean value) {
        this.policyDefinedInd = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PolicyType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Policy
        extends PolicyType
    {


    }

}
