
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MediaAppListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Audio"/>
 *     &lt;enumeration value="Image"/>
 *     &lt;enumeration value="Link"/>
 *     &lt;enumeration value="Markup"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MediaAppListType")
@XmlEnum
public enum MediaAppListType {

    @XmlEnumValue("Audio")
    AUDIO("Audio"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Link")
    LINK("Link"),
    @XmlEnumValue("Markup")
    MARKUP("Markup"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MediaAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaAppListType fromValue(String v) {
        for (MediaAppListType c: MediaAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
