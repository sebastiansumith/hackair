
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A base type definition for Metadata Object.
 * 
 * <p>Java class for MetaBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaBaseType")
@XmlSeeAlso({
    org.iata.iata.edist.PointOfSaleType.Metadata.class,
    org.iata.iata.edist.EncSchemeType.Metadata.class,
    org.iata.iata.edist.PolicyType.Metadata.class
})
public class MetaBaseType {


}
