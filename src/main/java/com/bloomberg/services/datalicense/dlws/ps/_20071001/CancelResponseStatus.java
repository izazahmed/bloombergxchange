
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CancelResponseStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelResponseStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cancelStatus" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}CancelStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelResponseStatus", propOrder = {
    "responseId",
    "cancelStatus"
})
public class CancelResponseStatus {

    @XmlElement(required = true)
    protected String responseId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CancelStatus cancelStatus;

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
     * Gets the value of the cancelStatus property.
     *
     * @return
     *     possible object is
     *     {@link CancelStatus }
     *
     */
    public CancelStatus getCancelStatus() {
        return cancelStatus;
    }

    /**
     * Sets the value of the cancelStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link CancelStatus }
     *     
     */
    public void setCancelStatus(CancelStatus value) {
        this.cancelStatus = value;
    }

}
