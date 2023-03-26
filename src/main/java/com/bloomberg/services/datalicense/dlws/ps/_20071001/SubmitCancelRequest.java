
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitCancelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitCancelRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="headers" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}CancelHeaders"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitCancelRequest", propOrder = {
    "headers"
})
public class SubmitCancelRequest {

    @XmlElement(required = true)
    protected CancelHeaders headers;

    /**
     * Gets the value of the headers property.
     *
     * @return
     *     possible object is
     *     {@link CancelHeaders }
     *
     */
    public CancelHeaders getHeaders() {
        return headers;
    }

    /**
     * Sets the value of the headers property.
     *
     * @param value
     *     allowed object is
     *     {@link CancelHeaders }
     *     
     */
    public void setHeaders(CancelHeaders value) {
        this.headers = value;
    }

}
