
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * NDC Capability Model: CODESET
 * 
 *  ============
 * Representation(s)
 *  ============
 * • IATA PADIS Encoding
 * • Third-Pary Standard Encoding
 * • Implementer-Proprietary Encoding
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Code value, code definition and code table name may be specified
 * • URI to codeset information source may be specified
 * • Supports Language Localization (Alternate Language Values)
 * • Codeset Source Details (owner, location, etc.) may be specified
 * 
 *  ============
 * Metadata
 *  ============
 * • Yes
 * 
 * <p>Java class for CodesetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodesetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/>
 *         &lt;element name="Definition" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
 *         &lt;element name="TableName" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
 *         &lt;element name="Link" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodesetType", propOrder = {
    "code",
    "definition",
    "tableName",
    "link"
})
@XmlSeeAlso({
    FlightStatusType.class,
    org.iata.iata.edist.PointOfSaleType.TouchPoint.Device.class,
    FareCodeType.class,
    InstantPurchaseType.class,
    org.iata.iata.edist.AircraftFeaturesQueryType.Feature.class,
    org.iata.iata.edist.InvDiscrepencyAlertType.Code.class,
    org.iata.iata.edist.SeatLocationType.Characteristics.Characteristic.class,
    org.iata.iata.edist.Failed.Code.class,
    org.iata.iata.edist.PaymentRulesNoticeType.FormOfPayment.Results.Code.class,
    InstrSpecialBookingType.class,
    org.iata.iata.edist.AlliancePreferencesType.Alliance.class,
    org.iata.iata.edist.FarePreferencesType.Types.Type.class,
    FlightMealsType.class,
    RFICType.class,
    org.iata.iata.edist.FlightPreferencesType.Aircraft.Cabins.Cabin.class,
    org.iata.iata.edist.FlightPreferencesType.Aircraft.Seats.Characteristic.class,
    org.iata.iata.edist.FlightPreferencesType.Aircraft.Seats.Position.class,
    org.iata.iata.edist.FlightPreferencesType.Aircraft.Rows.Feature.class,
    org.iata.iata.edist.TransferPreferencesType.Connection.Interline.class,
    AircraftCabinType.class,
    org.iata.iata.edist.ItinReshopAlertsType.OrderItemExceptions.Exception.Code.class,
    org.iata.iata.edist.DeviceType.Type.class,
    org.iata.iata.edist.PaymentStatusType.IncompletePayment.StatusCode.class,
    org.iata.iata.edist.PaymentIssueAlertType.Payment.Failed.Code.class,
    org.iata.iata.edist.PaymentIssueAlertType.Payment.Incomplete.Code.class,
    MarriedSegmentType.class,
    CabinType.class
})
public class CodesetType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Definition")
    protected String definition;
    @XmlElement(name = "TableName")
    protected String tableName;
    @XmlElement(name = "Link")
    @XmlSchemaType(name = "anyURI")
    protected String link;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

}
