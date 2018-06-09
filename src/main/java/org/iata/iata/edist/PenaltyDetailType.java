
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * NDC Capability Model: PENALTY
 * 
 *  ============
 * Representation(s)
 *  ============
 * • Core Penalty
 * • Detail Penalty
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Penalty indicators (xxxx)
 * • Free-Text Penalty Remarks
 * 
 *  ============
 * Metadata
 *  ============
 * • PenaltyMetadata
 * 
 * <p>Java class for PenaltyDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PenaltyDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}PenaltyType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyDetailType")
public class PenaltyDetailType
    extends PenaltyType
{


}
