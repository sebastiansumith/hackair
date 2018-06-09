
package org.iata.iata.edist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A data type definition for Other Date/ Time Period Representation. Includes: Day of week number, Month number, Short Month and Short Year, Full Year, Full Year and Short Month.
 * 
 * <p>Java class for AllDateGrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllDateGrpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MonthYear" type="{http://www.iata.org/IATA/EDIST}ShortYearMonthSimpleType" />
 *       &lt;attribute name="Year" type="{http://www.w3.org/2001/XMLSchema}gYear" />
 *       &lt;attribute name="YearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" />
 *       &lt;attribute name="DayNumber" type="{http://www.iata.org/IATA/EDIST}DayOfWeekSimpleType" />
 *       &lt;attribute name="MonthNumber" type="{http://www.iata.org/IATA/EDIST}MonthNumberSimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllDateGrpType")
public class AllDateGrpType {

    @XmlAttribute(name = "MonthYear")
    protected String monthYear;
    @XmlAttribute(name = "Year")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar year;
    @XmlAttribute(name = "YearMonth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar yearMonth;
    @XmlAttribute(name = "DayNumber")
    protected String dayNumber;
    @XmlAttribute(name = "MonthNumber")
    protected String monthNumber;

    /**
     * Gets the value of the monthYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthYear() {
        return monthYear;
    }

    /**
     * Sets the value of the monthYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthYear(String value) {
        this.monthYear = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYear(XMLGregorianCalendar value) {
        this.year = value;
    }

    /**
     * Gets the value of the yearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearMonth() {
        return yearMonth;
    }

    /**
     * Sets the value of the yearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearMonth(XMLGregorianCalendar value) {
        this.yearMonth = value;
    }

    /**
     * Gets the value of the dayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayNumber() {
        return dayNumber;
    }

    /**
     * Sets the value of the dayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayNumber(String value) {
        this.dayNumber = value;
    }

    /**
     * Gets the value of the monthNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthNumber() {
        return monthNumber;
    }

    /**
     * Sets the value of the monthNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthNumber(String value) {
        this.monthNumber = value;
    }

}
