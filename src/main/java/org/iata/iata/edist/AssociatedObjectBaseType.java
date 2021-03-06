
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A base type for an Object with Instance Associations.
 * 
 * <p>Java class for AssociatedObjectBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedObjectBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/>
 *       &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RefundAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ExemptAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AllGuaranteeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DisclosureInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BrowserInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedObjectBaseType")
@XmlSeeAlso({
    BagAllowanceDimensionType.class,
    PTCQuantityPricedType.class,
    org.iata.iata.edist.BilateralTimeLimitsType.BilateralTimeLimit.class,
    org.iata.iata.edist.CombinationPriceType.Partial.class,
    LeadDatePeriodType.class,
    org.iata.iata.edist.BagChargeReqParamsType.ServiceFilters.class,
    org.iata.iata.edist.BagChargeReqParamsType.Pricing.FeeExemption.class,
    ShoppingResponseIDType.class,
    org.iata.iata.edist.BagChargeResParamsType.ServiceFilters.class,
    org.iata.iata.edist.BagChargeResParamsType.Pricing.FeeExemption.class,
    SimpleAddrType.class,
    org.iata.iata.edist.ExitPositionType.Rows.class,
    org.iata.iata.edist.WingPositionType.Rows.class,
    LeadTimePeriodType.class,
    AllianceProgramType.class,
    org.iata.iata.edist.StopLocationType.StopLocation.class,
    org.iata.iata.edist.InvGuaranteeRQ.Query.Qualifiers.Locations.class,
    BagAllowanceDescType.class,
    TravelTimePreferencesType.class,
    org.iata.iata.edist.OrderViewRS.Response.Amendments.Amendment.OfferItem.class,
    FlightDurationType.class,
    FltSegmentMaxTimePreferencesType.class,
    AlliancePreferencesType.class,
    org.iata.iata.edist.AirPassCoreType.Certificate.class,
    FarePreferencesType.class,
    org.iata.iata.edist.SrvListResParamsType.Pricing.FeeExemption.class,
    TotalJourneyType.class,
    org.iata.iata.edist.SrvListReqParamsType.ServiceFilters.class,
    org.iata.iata.edist.SrvListReqParamsType.Pricing.FeeExemption.class,
    CouponEffectiveType.class,
    org.iata.iata.edist.BagAllowResParamsType.Pricing.FeeExemption.class,
    org.iata.iata.edist.BagAllowReqParamsType.ServiceFilters.class,
    org.iata.iata.edist.BagAllowReqParamsType.Pricing.FeeExemption.class,
    StructuredAddrType.class,
    SrvcLocationAirportType.class,
    org.iata.iata.edist.AirShopReqAttributeQueryType.OriginDestination.class,
    AirlinePreferencesType.class,
    TravelDistancePreferencesType.class,
    InvGuaranteeType.class,
    org.iata.iata.edist.AirShopReqAffinityQueryType.OriginDestination.class,
    FlightPreferencesType.class,
    InvGuarResProcessType.class,
    MediaAttachmentType.class,
    org.iata.iata.edist.FltPriceReqParamsType.ServiceFilters.class,
    org.iata.iata.edist.FltPriceReqParamsType.Pricing.FeeExemption.class,
    TicketAutoExchangeType.class,
    org.iata.iata.edist.FltPriceResParamsType.Pricing.FeeExemption.class,
    TicketByTimeLimitType.class,
    org.iata.iata.edist.SrvPriceResParamsType.Pricing.FeeExemption.class,
    org.iata.iata.edist.SrvPriceReqParamsType.ServiceFilters.class,
    org.iata.iata.edist.SrvPriceReqParamsType.Pricing.FeeExemption.class,
    FlightDistanceType.class,
    CabinPreferencesType.class,
    CommissionType.class,
    org.iata.iata.edist.BagListResParamsType.Pricing.FeeExemption.class,
    org.iata.iata.edist.SeatComponentType.Locations.Location.class,
    org.iata.iata.edist.SeatComponentType.Dimensions.class,
    org.iata.iata.edist.BagListReqParamsType.ServiceFilters.class,
    org.iata.iata.edist.BagListReqParamsType.Pricing.FeeExemption.class,
    TransferPreferencesType.class,
    AdditionalReferenceType.class,
    org.iata.iata.edist.AirShopReqParamsType.ServiceFilters.class,
    org.iata.iata.edist.AirShopReqParamsType.Pricing.FeeExemption.class,
    AttributesType.class,
    PaymentAddrType.class,
    org.iata.iata.edist.SeatAvailResParamsType.Pricing.FeeExemption.class,
    AllianceAirlinePartyType.class,
    org.iata.iata.edist.SeatAvailReqParamsType.ServiceFilters.class,
    org.iata.iata.edist.SeatAvailReqParamsType.Pricing.FeeExemption.class,
    OrdChangeAlertsType.class,
    OrderListAlertsType.class,
    org.iata.iata.edist.AirShopResParamsType.Pricing.FeeExemption.class,
    ItinReshopAlertsType.class,
    GroupFarePreferencesType.class,
    org.iata.iata.edist.OrderCoreChangeType.Details.ShoppingResponse.OfferItems.OfferItem.class,
    org.iata.iata.edist.OrderCoreChangeType.Details.ShoppingResponse.class,
    org.iata.iata.edist.OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.OfferItem.class,
    org.iata.iata.edist.OrderCoreChangeType.Details.Amendments.Amendment.OrderItem.class,
    MarketingCarrierFlightType.class,
    S7Type.class,
    S5Type.class,
    MarketMsgAssocType.class,
    OrdRetrieveAlertsType.class,
    OrdCreateAlertsType.class,
    org.iata.iata.edist.DetailCurrencyPriceType.Details.class,
    FeeSurchargeType.class,
    MessageParamsBaseType.class,
    ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.AssociatedServices.AssociatedService.class,
    ShoppingResponseOrderType.Offers.Offer.OfferItems.OfferItem.class,
    ShoppingResponseOrderType.class,
    OperatingCarrierFlightType.class,
    OfferPriceLeadType.class,
    ProgramQualifiers.class,
    ProgramStatusQualifier.class,
    BagAllowanceWeightType.class,
    SecurePaymentPaxInfoType.class,
    BagAllowancePieceType.class,
    PrePaidProgramQualifier.class,
    IncentiveProgramType.class
})
public class AssociatedObjectBaseType {

    @XmlAttribute(name = "ApproxInd")
    protected Boolean approxInd;
    @XmlAttribute(name = "RefundAllInd")
    protected Boolean refundAllInd;
    @XmlAttribute(name = "ExemptAllInd")
    protected Boolean exemptAllInd;
    @XmlAttribute(name = "AllGuaranteeInd")
    protected Boolean allGuaranteeInd;
    @XmlAttribute(name = "DisclosureInd")
    protected Boolean disclosureInd;
    @XmlAttribute(name = "BrowserInd")
    protected Boolean browserInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the approxInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproxInd() {
        return approxInd;
    }

    /**
     * Sets the value of the approxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproxInd(Boolean value) {
        this.approxInd = value;
    }

    /**
     * Gets the value of the refundAllInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundAllInd() {
        return refundAllInd;
    }

    /**
     * Sets the value of the refundAllInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundAllInd(Boolean value) {
        this.refundAllInd = value;
    }

    /**
     * Gets the value of the exemptAllInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExemptAllInd() {
        return exemptAllInd;
    }

    /**
     * Sets the value of the exemptAllInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExemptAllInd(Boolean value) {
        this.exemptAllInd = value;
    }

    /**
     * Gets the value of the allGuaranteeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllGuaranteeInd() {
        return allGuaranteeInd;
    }

    /**
     * Sets the value of the allGuaranteeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllGuaranteeInd(Boolean value) {
        this.allGuaranteeInd = value;
    }

    /**
     * Gets the value of the disclosureInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisclosureInd() {
        return disclosureInd;
    }

    /**
     * Sets the value of the disclosureInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisclosureInd(Boolean value) {
        this.disclosureInd = value;
    }

    /**
     * Gets the value of the browserInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrowserInd() {
        return browserInd;
    }

    /**
     * Sets the value of the browserInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrowserInd(Boolean value) {
        this.browserInd = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
    }

}
