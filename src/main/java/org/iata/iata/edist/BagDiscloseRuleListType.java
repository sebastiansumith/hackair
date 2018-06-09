
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BagDiscloseRuleListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BagDiscloseRuleListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BagDiscloseRuleListType")
@XmlEnum
public enum BagDiscloseRuleListType {


    /**
     * Disclosure with NO US DOT Reservation
     * 
     */
    D("D"),

    /**
     * No Disclosure or US DOT Reservation
     * 
     */
    N("N"),

    /**
     * Disclosure AND US DOT Reservation
     * 
     */
    Y("Y"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BagDiscloseRuleListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BagDiscloseRuleListType fromValue(String v) {
        for (BagDiscloseRuleListType c: BagDiscloseRuleListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
