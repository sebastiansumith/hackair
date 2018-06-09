
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherOrderAssocSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherOrderAssocSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PaymentForm"/>
 *     &lt;enumeration value="Penalty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OtherOrderAssocSimpleType")
@XmlEnum
public enum OtherOrderAssocSimpleType {

    @XmlEnumValue("PaymentForm")
    PAYMENT_FORM("PaymentForm"),
    @XmlEnumValue("Penalty")
    PENALTY("Penalty");
    private final String value;

    OtherOrderAssocSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherOrderAssocSimpleType fromValue(String v) {
        for (OtherOrderAssocSimpleType c: OtherOrderAssocSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
