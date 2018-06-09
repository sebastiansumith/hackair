
package org.iata.iata.edist;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * TOTAL FARE TRANSACTION definition.
 * 
 * <p>Java class for TotalFareTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalFareTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>CurrencyAmountOptType">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AmountType" type="{http://www.iata.org/IATA/EDIST}FareAmountType" minOccurs="0"/>
 *         &lt;element name="Purpose" type="{http://www.iata.org/IATA/EDIST}CouponPurposeListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EquivRate">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ReissueSeqNbr">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{1,3}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalFareTransactionType", propOrder = {
    "amount",
    "amountType",
    "purpose"
})
public class TotalFareTransactionType {

    @XmlElement(name = "Amount")
    protected TotalFareTransactionType.Amount amount;
    @XmlElement(name = "AmountType")
    @XmlSchemaType(name = "string")
    protected FareAmountType amountType;
    @XmlElement(name = "Purpose")
    @XmlSchemaType(name = "string")
    protected CouponPurposeListType purpose;
    @XmlAttribute(name = "EquivRate")
    protected BigDecimal equivRate;
    @XmlAttribute(name = "ReissueSeqNbr")
    protected String reissueSeqNbr;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFareTransactionType.Amount }
     *     
     */
    public TotalFareTransactionType.Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFareTransactionType.Amount }
     *     
     */
    public void setAmount(TotalFareTransactionType.Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountType property.
     * 
     * @return
     *     possible object is
     *     {@link FareAmountType }
     *     
     */
    public FareAmountType getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareAmountType }
     *     
     */
    public void setAmountType(FareAmountType value) {
        this.amountType = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link CouponPurposeListType }
     *     
     */
    public CouponPurposeListType getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponPurposeListType }
     *     
     */
    public void setPurpose(CouponPurposeListType value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the equivRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquivRate() {
        return equivRate;
    }

    /**
     * Sets the value of the equivRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquivRate(BigDecimal value) {
        this.equivRate = value;
    }

    /**
     * Gets the value of the reissueSeqNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReissueSeqNbr() {
        return reissueSeqNbr;
    }

    /**
     * Sets the value of the reissueSeqNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReissueSeqNbr(String value) {
        this.reissueSeqNbr = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>CurrencyAmountOptType">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Amount
        extends CurrencyAmountOptType
    {


    }

}
