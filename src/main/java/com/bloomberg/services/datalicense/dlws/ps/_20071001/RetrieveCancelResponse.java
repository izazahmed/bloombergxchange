
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for RetrieveCancelResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveCancelResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}PerSecurityResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="headers" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}CancelHeaders" minOccurs="0"/&gt;
 *         &lt;element name="cancelResponseStatus" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}CancelResponseStatus" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveCancelResponse", propOrder = {
    "headers",
    "cancelResponseStatus"
})
public class RetrieveCancelResponse
    extends PerSecurityResponse
{

    protected CancelHeaders headers;
    @XmlElement(required = true)
    protected List<CancelResponseStatus> cancelResponseStatus;

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

    /**
     * Gets the value of the cancelResponseStatus property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelResponseStatus property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelResponseStatus().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelResponseStatus }
     *
     *
     */
    public List<CancelResponseStatus> getCancelResponseStatus() {
        if (cancelResponseStatus == null) {
            cancelResponseStatus = new ArrayList<CancelResponseStatus>();
        }
        return this.cancelResponseStatus;
    }

}
