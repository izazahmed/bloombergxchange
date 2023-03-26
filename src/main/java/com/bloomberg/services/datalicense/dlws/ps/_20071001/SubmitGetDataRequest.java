
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitGetDataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitGetDataRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="headers" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}GetDataHeaders"/&gt;
 *         &lt;element name="fieldsets" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}BvalFieldSets" minOccurs="0"/&gt;
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
@XmlType(name = "SubmitGetDataRequest", propOrder = {
    "headers",
    "fieldsets",
    "fields",
    "instruments"
})
public class SubmitGetDataRequest {

    @XmlElement(required = true)
    protected GetDataHeaders headers;
    protected BvalFieldSets fieldsets;
    protected Fields fields;
    @XmlElement(required = true)
    protected Instruments instruments;

    /**
     * Gets the value of the headers property.
     *
     * @return
     *     possible object is
     *     {@link GetDataHeaders }
     *
     */
    public GetDataHeaders getHeaders() {
        return headers;
    }

    /**
     * Sets the value of the headers property.
     *
     * @param value
     *     allowed object is
     *     {@link GetDataHeaders }
     *
     */
    public void setHeaders(GetDataHeaders value) {
        this.headers = value;
    }

    /**
     * Gets the value of the fieldsets property.
     *
     * @return
     *     possible object is
     *     {@link BvalFieldSets }
     *
     */
    public BvalFieldSets getFieldsets() {
        return fieldsets;
    }

    /**
     * Sets the value of the fieldsets property.
     *
     * @param value
     *     allowed object is
     *     {@link BvalFieldSets }
     *
     */
    public void setFieldsets(BvalFieldSets value) {
        this.fieldsets = value;
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
