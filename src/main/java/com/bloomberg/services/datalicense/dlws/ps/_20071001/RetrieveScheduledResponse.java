
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveScheduledResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveScheduledResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}PerSecurityResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fileDatas" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}ScheduledResponses" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveScheduledResponse", propOrder = {
    "responseId",
    "fileDatas"
})
public class RetrieveScheduledResponse
    extends PerSecurityResponse
{

    @XmlElement(required = true)
    protected String responseId;
    protected ScheduledResponses fileDatas;

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
     * Gets the value of the fileDatas property.
     *
     * @return
     *     possible object is
     *     {@link ScheduledResponses }
     *
     */
    public ScheduledResponses getFileDatas() {
        return fileDatas;
    }

    /**
     * Sets the value of the fileDatas property.
     *
     * @param value
     *     allowed object is
     *     {@link ScheduledResponses }
     *     
     */
    public void setFileDatas(ScheduledResponses value) {
        this.fileDatas = value;
    }

}
