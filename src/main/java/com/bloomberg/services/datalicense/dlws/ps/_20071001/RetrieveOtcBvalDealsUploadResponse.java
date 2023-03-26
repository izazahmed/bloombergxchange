
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RetrieveOtcBvalDealsUploadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveOtcBvalDealsUploadResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}PerSecurityResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="timestarted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deals" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}OtcDealInfos" minOccurs="0"/&gt;
 *         &lt;element name="timefinished" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveOtcBvalDealsUploadResponse", propOrder = {
    "responseId",
    "timestarted",
    "deals",
    "timefinished"
})
public class RetrieveOtcBvalDealsUploadResponse
    extends PerSecurityResponse
{

    @XmlElement(required = true)
    protected String responseId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestarted;
    protected OtcDealInfos deals;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timefinished;

    /**
     * Gets the value of the responseId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponseId() {
        return responseId;
    }

    /**
     * Sets the value of the responseId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponseId(String value) {
        this.responseId = value;
    }

    /**
     * Gets the value of the timestarted property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getTimestarted() {
        return timestarted;
    }

    /**
     * Sets the value of the timestarted property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setTimestarted(XMLGregorianCalendar value) {
        this.timestarted = value;
    }

    /**
     * Gets the value of the deals property.
     *
     * @return
     *     possible object is
     *     {@link OtcDealInfos }
     *
     */
    public OtcDealInfos getDeals() {
        return deals;
    }

    /**
     * Sets the value of the deals property.
     *
     * @param value
     *     allowed object is
     *     {@link OtcDealInfos }
     *     
     */
    public void setDeals(OtcDealInfos value) {
        this.deals = value;
    }

    /**
     * Gets the value of the timefinished property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimefinished() {
        return timefinished;
    }

    /**
     * Sets the value of the timefinished property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimefinished(XMLGregorianCalendar value) {
        this.timefinished = value;
    }

}
