
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for QRMQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QRMQuote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matchedQuote" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}QRMQuoteData" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="condCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QRMQuote", propOrder = {
    "matchedQuote"
})
public class QRMQuote {

    @XmlElement(required = true)
    protected List<QRMQuoteData> matchedQuote;
    @XmlAttribute(name = "dateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlAttribute(name = "condCode")
    protected String condCode;

    /**
     * Gets the value of the matchedQuote property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchedQuote property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchedQuote().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QRMQuoteData }
     *
     *
     */
    public List<QRMQuoteData> getMatchedQuote() {
        if (matchedQuote == null) {
            matchedQuote = new ArrayList<QRMQuoteData>();
        }
        return this.matchedQuote;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the condCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondCode() {
        return condCode;
    }

    /**
     * Sets the value of the condCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondCode(String value) {
        this.condCode = value;
    }

}
