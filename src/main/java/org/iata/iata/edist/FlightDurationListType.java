
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightDurationListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightDurationListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ConnectionTime"/>
 *     &lt;enumeration value="FlightTime"/>
 *     &lt;enumeration value="StopTime"/>
 *     &lt;enumeration value="TotalJourneyTime"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightDurationListType")
@XmlEnum
public enum FlightDurationListType {

    @XmlEnumValue("ConnectionTime")
    CONNECTION_TIME("ConnectionTime"),
    @XmlEnumValue("FlightTime")
    FLIGHT_TIME("FlightTime"),
    @XmlEnumValue("StopTime")
    STOP_TIME("StopTime"),
    @XmlEnumValue("TotalJourneyTime")
    TOTAL_JOURNEY_TIME("TotalJourneyTime"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FlightDurationListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightDurationListType fromValue(String v) {
        for (FlightDurationListType c: FlightDurationListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
