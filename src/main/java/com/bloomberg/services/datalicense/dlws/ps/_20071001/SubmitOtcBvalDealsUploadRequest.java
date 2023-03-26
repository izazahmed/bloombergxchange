
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitOtcBvalDealsUploadRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitOtcBvalDealsUploadRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usernumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="otcBvalHeaders" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}OtcBvalHeaders"/&gt;
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
@XmlType(name = "SubmitOtcBvalDealsUploadRequest", propOrder = {
    "usernumber",
    "otcBvalHeaders",
    "fileContent"
})
public class SubmitOtcBvalDealsUploadRequest {

    protected int usernumber;
    @XmlElement(required = true)
    protected OtcBvalHeaders otcBvalHeaders;
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
     * Gets the value of the otcBvalHeaders property.
     *
     * @return
     *     possible object is
     *     {@link OtcBvalHeaders }
     *
     */
    public OtcBvalHeaders getOtcBvalHeaders() {
        return otcBvalHeaders;
    }

    /**
     * Sets the value of the otcBvalHeaders property.
     *
     * @param value
     *     allowed object is
     *     {@link OtcBvalHeaders }
     *     
     */
    public void setOtcBvalHeaders(OtcBvalHeaders value) {
        this.otcBvalHeaders = value;
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
