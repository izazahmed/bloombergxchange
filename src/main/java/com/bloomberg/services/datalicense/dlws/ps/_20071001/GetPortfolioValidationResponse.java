
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetPortfolioValidationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPortfolioValidationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}PerSecurityResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="headers" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}GetPortfolioValidationHeaders" minOccurs="0"/&gt;
 *         &lt;element name="fields" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}Fields" minOccurs="0"/&gt;
 *         &lt;element name="timestarted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="instrumentDatas" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}InstrumentDatas" minOccurs="0"/&gt;
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
@XmlType(name = "GetPortfolioValidationResponse", propOrder = {
    "responseId",
    "headers",
    "fields",
    "timestarted",
    "instrumentDatas",
    "timefinished"
})
public class GetPortfolioValidationResponse
    extends PerSecurityResponse
{

    @XmlElement(required = true)
    protected String responseId;
    protected GetPortfolioValidationHeaders headers;
    protected Fields fields;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestarted;
    protected InstrumentDatas instrumentDatas;
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
     * Gets the value of the headers property.
     *
     * @return
     *     possible object is
     *     {@link GetPortfolioValidationHeaders }
     *
     */
    public GetPortfolioValidationHeaders getHeaders() {
        return headers;
    }

    /**
     * Sets the value of the headers property.
     *
     * @param value
     *     allowed object is
     *     {@link GetPortfolioValidationHeaders }
     *
     */
    public void setHeaders(GetPortfolioValidationHeaders value) {
        this.headers = value;
    }

    /**
     * Gets the value of the fields property.
     *
     * @return
     *     possible object is
     *     {@link Fields }
     *
     */
    public Fields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     *
     * @param value
     *     allowed object is
     *     {@link Fields }
     *
     */
    public void setFields(Fields value) {
        this.fields = value;
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
     * Gets the value of the instrumentDatas property.
     *
     * @return
     *     possible object is
     *     {@link InstrumentDatas }
     *
     */
    public InstrumentDatas getInstrumentDatas() {
        return instrumentDatas;
    }

    /**
     * Sets the value of the instrumentDatas property.
     *
     * @param value
     *     allowed object is
     *     {@link InstrumentDatas }
     *     
     */
    public void setInstrumentDatas(InstrumentDatas value) {
        this.instrumentDatas = value;
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
