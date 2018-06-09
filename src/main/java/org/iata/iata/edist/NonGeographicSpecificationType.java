
package org.iata.iata.edist;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Non Geographic Specification information
 * 
 * <p>Java class for NonGeographicSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonGeographicSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetType"/>
 *         &lt;choice>
 *           &lt;element name="AgentPseudoCityCode">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="6"/>
 *                 &lt;minLength value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="AgentNumericCode">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                 &lt;totalDigits value="8"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="DepartmentID">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                 &lt;totalDigits value="7"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="CRSDepartmentCode">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="6"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="LNIATANumber">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;maxLength value="8"/>
 *                 &lt;minLength value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST}AirlineID" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonGeographicSpecificationType", propOrder = {
    "type",
    "agentPseudoCityCode",
    "agentNumericCode",
    "departmentID",
    "crsDepartmentCode",
    "lniataNumber",
    "airlineID"
})
public class NonGeographicSpecificationType {

    @XmlElement(name = "Type", required = true)
    protected CodesetType type;
    @XmlElement(name = "AgentPseudoCityCode")
    protected String agentPseudoCityCode;
    @XmlElement(name = "AgentNumericCode")
    protected BigInteger agentNumericCode;
    @XmlElement(name = "DepartmentID")
    protected BigInteger departmentID;
    @XmlElement(name = "CRSDepartmentCode")
    protected String crsDepartmentCode;
    @XmlElement(name = "LNIATANumber")
    protected String lniataNumber;
    @XmlElement(name = "AirlineID")
    protected List<AirlineID> airlineID;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setType(CodesetType value) {
        this.type = value;
    }

    /**
     * Gets the value of the agentPseudoCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentPseudoCityCode() {
        return agentPseudoCityCode;
    }

    /**
     * Sets the value of the agentPseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentPseudoCityCode(String value) {
        this.agentPseudoCityCode = value;
    }

    /**
     * Gets the value of the agentNumericCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAgentNumericCode() {
        return agentNumericCode;
    }

    /**
     * Sets the value of the agentNumericCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAgentNumericCode(BigInteger value) {
        this.agentNumericCode = value;
    }

    /**
     * Gets the value of the departmentID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepartmentID() {
        return departmentID;
    }

    /**
     * Sets the value of the departmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepartmentID(BigInteger value) {
        this.departmentID = value;
    }

    /**
     * Gets the value of the crsDepartmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRSDepartmentCode() {
        return crsDepartmentCode;
    }

    /**
     * Sets the value of the crsDepartmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRSDepartmentCode(String value) {
        this.crsDepartmentCode = value;
    }

    /**
     * Gets the value of the lniataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNIATANumber() {
        return lniataNumber;
    }

    /**
     * Sets the value of the lniataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNIATANumber(String value) {
        this.lniataNumber = value;
    }

    /**
     * Gets the value of the airlineID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airlineID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirlineID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlineID }
     * 
     * 
     */
    public List<AirlineID> getAirlineID() {
        if (airlineID == null) {
            airlineID = new ArrayList<AirlineID>();
        }
        return this.airlineID;
    }

}
