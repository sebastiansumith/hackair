
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareIndicatorListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareIndicatorListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="EH"/>
 *     &lt;enumeration value="FE"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PN"/>
 *     &lt;enumeration value="PO"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="TB"/>
 *     &lt;enumeration value="TS"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="WH"/>
 *     &lt;enumeration value="ZZ"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareIndicatorListType")
@XmlEnum
public enum FareIndicatorListType {


    /**
     * FareByRule, All fares included (EH/TS)
     *                     
     * 
     */
    AL("AL"),

    /**
     * Via Atlantic Pacific
     * 
     */
    AP("AP"),

    /**
     * Via Atlantic
     * 
     */
    AT("AT"),

    /**
     * Within Canada.
     * 
     */
    CA("CA"),

    /**
     * Circle trip.
     * 
     */
    CT("CT"),

    /**
     * Within Eastern Hemisphere
     *                     
     * 
     */
    EH("EH"),

    /**
     * Far East
     * 
     */
    FE("FE"),

    /**
     * FareByRule - For int'l incl.
     *                         AT/PA/WH/CT/RW
     * 
     */
    IN("IN"),

    /**
     * FareByRule for North America incl
     *                         US/CA/TB/PV
     * 
     */
    NA("NA"),

    /**
     * Via Pacific
     * 
     */
    PA("PA"),

    /**
     * Via Pacific and via North America
     *                     
     * 
     */
    PN("PN"),

    /**
     * Via Polar Route.
     * 
     */
    PO("PO"),

    /**
     * Russia - Area 3 
     * 
     */
    RU("RU"),

    /**
     * Round The World.
     * 
     */
    RW("RW"),

    /**
     * South Atlantic only
     * 
     */
    SA("SA"),

    /**
     * Via South Polar Route
     * 
     */
    SP("SP"),

    /**
     * Trans-border
     * 
     */
    TB("TB"),

    /**
     * Via Siberia.
     * 
     */
    TS("TS"),

    /**
     * Within the United States.
     *                     
     * 
     */
    US("US"),

    /**
     * Within Western Hemisphere
     *                     
     * 
     */
    WH("WH"),

    /**
     * Any Global
     * 
     */
    ZZ("ZZ"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FareIndicatorListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareIndicatorListType fromValue(String v) {
        for (FareIndicatorListType c: FareIndicatorListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
