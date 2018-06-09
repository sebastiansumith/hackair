
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchResultsListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchResultsListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="preserve"/>
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Partial"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatchResultsListType")
@XmlEnum
public enum MatchResultsListType {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MatchResultsListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatchResultsListType fromValue(String v) {
        for (MatchResultsListType c: MatchResultsListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
