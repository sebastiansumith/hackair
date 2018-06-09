
package org.iata.iata.edist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * FQTV PROGRAM ALLIANCE representation.
 * 
 * <p>Java class for FQTV_AllianceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FQTV_AllianceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}KeyWithMetaObjectBaseType">
 *       &lt;sequence>
 *         &lt;element name="Code">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>UniqueIDContextType">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="URL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/>
 *         &lt;element name="Participants" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Participant" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ParticipatingAirline"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST}ParticipatingProgram"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FQTV_AllianceType", propOrder = {
    "code",
    "url",
    "name",
    "participants"
})
public class FQTVAllianceType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Code", required = true)
    protected FQTVAllianceType.Code code;
    @XmlElement(name = "URL")
    protected FQTVAllianceType.URL url;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Participants")
    protected FQTVAllianceType.Participants participants;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link FQTVAllianceType.Code }
     *     
     */
    public FQTVAllianceType.Code getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link FQTVAllianceType.Code }
     *     
     */
    public void setCode(FQTVAllianceType.Code value) {
        this.code = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link FQTVAllianceType.URL }
     *     
     */
    public FQTVAllianceType.URL getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link FQTVAllianceType.URL }
     *     
     */
    public void setURL(FQTVAllianceType.URL value) {
        this.url = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the participants property.
     * 
     * @return
     *     possible object is
     *     {@link FQTVAllianceType.Participants }
     *     
     */
    public FQTVAllianceType.Participants getParticipants() {
        return participants;
    }

    /**
     * Sets the value of the participants property.
     * 
     * @param value
     *     allowed object is
     *     {@link FQTVAllianceType.Participants }
     *     
     */
    public void setParticipants(FQTVAllianceType.Participants value) {
        this.participants = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST>UniqueIDContextType">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Code
        extends UniqueIDContextType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Participant" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ParticipatingAirline"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}ParticipatingProgram"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "participant"
    })
    public static class Participants {

        @XmlElement(name = "Participant", required = true)
        protected List<FQTVAllianceType.Participants.Participant> participant;

        /**
         * Gets the value of the participant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the participant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParticipant().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FQTVAllianceType.Participants.Participant }
         * 
         * 
         */
        public List<FQTVAllianceType.Participants.Participant> getParticipant() {
            if (participant == null) {
                participant = new ArrayList<FQTVAllianceType.Participants.Participant>();
            }
            return this.participant;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ParticipatingAirline"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST}ParticipatingProgram"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "participatingAirline",
            "participatingProgram"
        })
        public static class Participant {

            @XmlElement(name = "ParticipatingAirline", required = true)
            protected AllianceAirlinePartyType participatingAirline;
            @XmlElement(name = "ParticipatingProgram", required = true)
            protected AllianceProgramType participatingProgram;

            /**
             * Identifies a particular Airline participant in an Alliance in view of an FQTV program details.
             * 
             * @return
             *     possible object is
             *     {@link AllianceAirlinePartyType }
             *     
             */
            public AllianceAirlinePartyType getParticipatingAirline() {
                return participatingAirline;
            }

            /**
             * Sets the value of the participatingAirline property.
             * 
             * @param value
             *     allowed object is
             *     {@link AllianceAirlinePartyType }
             *     
             */
            public void setParticipatingAirline(AllianceAirlinePartyType value) {
                this.participatingAirline = value;
            }

            /**
             * Identifies a particular affiliated FQTV program in an Alliance in view of an FQTV program details.
             * 
             * @return
             *     possible object is
             *     {@link AllianceProgramType }
             *     
             */
            public AllianceProgramType getParticipatingProgram() {
                return participatingProgram;
            }

            /**
             * Sets the value of the participatingProgram property.
             * 
             * @param value
             *     allowed object is
             *     {@link AllianceProgramType }
             *     
             */
            public void setParticipatingProgram(AllianceProgramType value) {
                this.participatingProgram = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class URL {

        @XmlValue
        @XmlSchemaType(name = "anyURI")
        protected String value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
