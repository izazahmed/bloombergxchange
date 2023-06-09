
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitMmktBvalDealsUploadRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitMmktBvalDealsUploadRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usernumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mmktBvalHeaders" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}MmktBvalHeaders"/&gt;
 *         &lt;element name="fileContent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitMmktBvalDealsUploadRequest", propOrder = {
    "usernumber",
    "mmktBvalHeaders",
    "fileContent"
})
public class SubmitMmktBvalDealsUploadRequest {

    protected int usernumber;
    @XmlElement(required = true)
    protected MmktBvalHeaders mmktBvalHeaders;
    @XmlElement(required = true)
    protected String fileContent;

    /**
     * Gets the value of the usernumber property.
     *
     */
    public int getUsernumber() {
        return usernumber;
    }

    /**
     * Sets the value of the usernumber property.
     *
     */
    public void setUsernumber(int value) {
        this.usernumber = value;
    }

    /**
     * Gets the value of the mmktBvalHeaders property.
     *
     * @return
     *     possible object is
     *     {@link MmktBvalHeaders }
     *
     */
    public MmktBvalHeaders getMmktBvalHeaders() {
        return mmktBvalHeaders;
    }

    /**
     * Sets the value of the mmktBvalHeaders property.
     *
     * @param value
     *     allowed object is
     *     {@link MmktBvalHeaders }
     *     
     */
    public void setMmktBvalHeaders(MmktBvalHeaders value) {
        this.mmktBvalHeaders = value;
    }

    /**
     * Gets the value of the fileContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileContent() {
        return fileContent;
    }

    /**
     * Sets the value of the fileContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileContent(String value) {
        this.fileContent = value;
    }

}
