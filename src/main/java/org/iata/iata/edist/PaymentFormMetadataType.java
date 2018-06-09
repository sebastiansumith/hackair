
package org.iata.iata.edist;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for PAYMENT FORM Metadata.
 * 
 * <p>Java class for PaymentFormMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentFormMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="CustomerFileReference" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.iata.org/IATA/EDIST}ContextSimpleType">
 *               &lt;pattern value=""[0-9a-zA-Z]{1,27}" "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExtendedPaymentCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.iata.org/IATA/EDIST}DescriptionSimpleType" minOccurs="0"/>
 *         &lt;element name="CorporateContractCode" type="{http://www.iata.org/IATA/EDIST}DescriptionSimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFormMetadataType", propOrder = {
    "customerFileReference",
    "extendedPaymentCode",
    "text",
    "corporateContractCode"
})
public class PaymentFormMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "CustomerFileReference")
    protected String customerFileReference;
    @XmlElement(name = "ExtendedPaymentCode")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger extendedPaymentCode;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "CorporateContractCode")
    protected String corporateContractCode;

    /**
     * Gets the value of the customerFileReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFileReference() {
        return customerFileReference;
    }

    /**
     * Sets the value of the customerFileReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFileReference(String value) {
        this.customerFileReference = value;
    }

    /**
     * Gets the value of the extendedPaymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtendedPaymentCode() {
        return extendedPaymentCode;
    }

    /**
     * Sets the value of the extendedPaymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtendedPaymentCode(BigInteger value) {
        this.extendedPaymentCode = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the corporateContractCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateContractCode() {
        return corporateContractCode;
    }

    /**
     * Sets the value of the corporateContractCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateContractCode(String value) {
        this.corporateContractCode = value;
    }

}
