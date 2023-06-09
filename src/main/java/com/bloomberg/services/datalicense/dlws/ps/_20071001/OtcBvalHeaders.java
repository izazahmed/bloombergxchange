
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtcBvalHeaders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtcBvalHeaders"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mimeVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contentEncoding" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contentDisposition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtcBvalHeaders", propOrder = {
    "contentType",
    "mimeVersion",
    "contentEncoding",
    "contentDisposition",
    "fileName"
})
public class OtcBvalHeaders {

    @XmlElement(required = true)
    protected String contentType;
    @XmlElement(required = true)
    protected String mimeVersion;
    @XmlElement(required = true)
    protected String contentEncoding;
    @XmlElement(required = true)
    protected String contentDisposition;
    @XmlElement(required = true)
    protected String fileName;

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the mimeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeVersion() {
        return mimeVersion;
    }

    /**
     * Sets the value of the mimeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeVersion(String value) {
        this.mimeVersion = value;
    }

    /**
     * Gets the value of the contentEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * Sets the value of the contentEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentEncoding(String value) {
        this.contentEncoding = value;
    }

    /**
     * Gets the value of the contentDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * Sets the value of the contentDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentDisposition(String value) {
        this.contentDisposition = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

}
