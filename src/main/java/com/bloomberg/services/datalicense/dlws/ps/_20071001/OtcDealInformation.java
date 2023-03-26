
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for OtcDealInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtcDealInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statusCode" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}ResponseStatus"/&gt;
 *         &lt;element name="customId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dealId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dealType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="action" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}OtcBvalAction" minOccurs="0"/&gt;
 *         &lt;element name="portfolioId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtcDealInformation", propOrder = {
    "statusCode",
    "customId",
    "dealId",
    "dealType",
    "action",
    "portfolioId"
})
public class OtcDealInformation {

    @XmlElement(required = true)
    protected ResponseStatus statusCode;
    protected String customId;
    protected String dealId;
    protected String dealType;
    @XmlSchemaType(name = "string")
    protected OtcBvalAction action;
    protected String portfolioId;

    /**
     * Gets the value of the statusCode property.
     *
     * @return
     *     possible object is
     *     {@link ResponseStatus }
     *
     */
    public ResponseStatus getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     *
     * @param value
     *     allowed object is
     *     {@link ResponseStatus }
     *
     */
    public void setStatusCode(ResponseStatus value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the customId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomId() {
        return customId;
    }

    /**
     * Sets the value of the customId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomId(String value) {
        this.customId = value;
    }

    /**
     * Gets the value of the dealId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDealId(String value) {
        this.dealId = value;
    }

    /**
     * Gets the value of the dealType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDealType() {
        return dealType;
    }

    /**
     * Sets the value of the dealType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDealType(String value) {
        this.dealType = value;
    }

    /**
     * Gets the value of the action property.
     *
     * @return
     *     possible object is
     *     {@link OtcBvalAction }
     *
     */
    public OtcBvalAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value
     *     allowed object is
     *     {@link OtcBvalAction }
     *     
     */
    public void setAction(OtcBvalAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the portfolioId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortfolioId() {
        return portfolioId;
    }

    /**
     * Sets the value of the portfolioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortfolioId(String value) {
        this.portfolioId = value;
    }

}
