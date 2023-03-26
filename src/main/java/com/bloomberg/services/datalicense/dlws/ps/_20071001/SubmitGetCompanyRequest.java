
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitGetCompanyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitGetCompanyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="headers" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}GetCompanyHeaders"/&gt;
 *         &lt;element name="fieldset" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}FieldSet" minOccurs="0"/&gt;
 *         &lt;element name="fields" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}Fields" minOccurs="0"/&gt;
 *         &lt;element name="instruments" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}Instruments"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitGetCompanyRequest", propOrder = {
    "headers",
    "fieldset",
    "fields",
    "instruments"
})
public class SubmitGetCompanyRequest {

    @XmlElement(required = true)
    protected GetCompanyHeaders headers;
    protected FieldSet fieldset;
    protected Fields fields;
    @XmlElement(required = true)
    protected Instruments instruments;

    /**
     * Gets the value of the headers property.
     *
     * @return
     *     possible object is
     *     {@link GetCompanyHeaders }
     *
     */
    public GetCompanyHeaders getHeaders() {
        return headers;
    }

    /**
     * Sets the value of the headers property.
     *
     * @param value
     *     allowed object is
     *     {@link GetCompanyHeaders }
     *
     */
    public void setHeaders(GetCompanyHeaders value) {
        this.headers = value;
    }

    /**
     * Gets the value of the fieldset property.
     *
     * @return
     *     possible object is
     *     {@link FieldSet }
     *
     */
    public FieldSet getFieldset() {
        return fieldset;
    }

    /**
     * Sets the value of the fieldset property.
     *
     * @param value
     *     allowed object is
     *     {@link FieldSet }
     *
     */
    public void setFieldset(FieldSet value) {
        this.fieldset = value;
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
     * Gets the value of the instruments property.
     *
     * @return
     *     possible object is
     *     {@link Instruments }
     *
     */
    public Instruments getInstruments() {
        return instruments;
    }

    /**
     * Sets the value of the instruments property.
     *
     * @param value
     *     allowed object is
     *     {@link Instruments }
     *     
     */
    public void setInstruments(Instruments value) {
        this.instruments = value;
    }

}
