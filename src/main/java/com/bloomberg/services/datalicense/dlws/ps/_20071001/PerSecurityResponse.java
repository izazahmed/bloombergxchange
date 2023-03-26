
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for PerSecurityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerSecurityResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statusCode" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}ResponseStatus"/&gt;
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerSecurityResponse", propOrder = {
    "statusCode",
    "requestId"
})
@XmlSeeAlso({
    SubmitGetDataResponse.class,
    RetrieveGetDataResponse.class,
    SubmitGetHistoryResponse.class,
    RetrieveGetHistoryResponse.class,
    SubmitScheduledResponse.class,
    RetrieveScheduledResponse.class,
    SubmitCancelResponse.class,
    RetrieveCancelResponse.class,
    GetCorrectionsResponse.class,
    SubmitGetFundamentalsResponse.class,
    RetrieveGetFundamentalsResponse.class,
    SubmitGetCompanyResponse.class,
    RetrieveGetCompanyResponse.class,
    SubmitGetActionsResponse.class,
    RetrieveGetActionsResponse.class,
    GetPortfolioValidationResponse.class,
    SubmitGetQuotesResponse.class,
    RetrieveGetQuotesResponse.class,
    SubmitGetAllQuotesResponse.class,
    RetrieveGetAllQuotesResponse.class,
    SubmitOtcbvalUploadResponse.class,
    RetrieveOtcbvalUploadResponse.class,
    SubmitOtcBvalDealsUploadResponse.class,
    RetrieveOtcBvalDealsUploadResponse.class,
    GetFieldsResponse.class,
    SubmitMmktBvalDealsUploadResponse.class,
    RetrieveMmktBvalDealsUploadResponse.class
})
public class PerSecurityResponse {

    @XmlElement(required = true)
    protected ResponseStatus statusCode;
    @XmlElement(required = true)
    protected String requestId;

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
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

}
