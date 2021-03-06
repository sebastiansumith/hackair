
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PenaltyListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="preserve"/>
 *     &lt;enumeration value="Cancellation"/>
 *     &lt;enumeration value="Change"/>
 *     &lt;enumeration value="NoShow"/>
 *     &lt;enumeration value="Upgrade"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PenaltyListType")
@XmlEnum
public enum PenaltyListType {

    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),
    @XmlEnumValue("Change")
    CHANGE("Change"),
    @XmlEnumValue("NoShow")
    NO_SHOW("NoShow"),
    @XmlEnumValue("Upgrade")
    UPGRADE("Upgrade"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PenaltyListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PenaltyListType fromValue(String v) {
        for (PenaltyListType c: PenaltyListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
