
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PenaltyAppListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="preserve"/>
 *     &lt;enumeration value="MaximumPenaltyAmount"/>
 *     &lt;enumeration value="MinimumPenaltyAmount"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PenaltyAppListType")
@XmlEnum
public enum PenaltyAppListType {

    @XmlEnumValue("MaximumPenaltyAmount")
    MAXIMUM_PENALTY_AMOUNT("MaximumPenaltyAmount"),
    @XmlEnumValue("MinimumPenaltyAmount")
    MINIMUM_PENALTY_AMOUNT("MinimumPenaltyAmount"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PenaltyAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PenaltyAppListType fromValue(String v) {
        for (PenaltyAppListType c: PenaltyAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}