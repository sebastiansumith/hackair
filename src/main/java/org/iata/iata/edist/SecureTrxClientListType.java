
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecureTrxClientListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecureTrxClientListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InteractiveVoiceResponse"/>
 *     &lt;enumeration value="Internet"/>
 *     &lt;enumeration value="MailOrTelephoneOrder"/>
 *     &lt;enumeration value="Recurring"/>
 *     &lt;enumeration value="Unattended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecureTrxClientListType")
@XmlEnum
public enum SecureTrxClientListType {


    /**
     * IVR
     * 
     */
    @XmlEnumValue("InteractiveVoiceResponse")
    INTERACTIVE_VOICE_RESPONSE("InteractiveVoiceResponse"),
    @XmlEnumValue("Internet")
    INTERNET("Internet"),

    /**
     * MOTO
     * 
     */
    @XmlEnumValue("MailOrTelephoneOrder")
    MAIL_OR_TELEPHONE_ORDER("MailOrTelephoneOrder"),
    @XmlEnumValue("Recurring")
    RECURRING("Recurring"),
    @XmlEnumValue("Unattended")
    UNATTENDED("Unattended");
    private final String value;

    SecureTrxClientListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecureTrxClientListType fromValue(String v) {
        for (SecureTrxClientListType c: SecureTrxClientListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
