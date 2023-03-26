
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFieldsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFieldsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criteria" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}FieldSearchCriteria"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFieldsRequest", propOrder = {
    "criteria"
})
public class GetFieldsRequest {

    @XmlElement(required = true)
    protected FieldSearchCriteria criteria;

    /**
     * Gets the value of the criteria property.
     *
     * @return
     *     possible object is
     *     {@link FieldSearchCriteria }
     *
     */
    public FieldSearchCriteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     *
     * @param value
     *     allowed object is
     *     {@link FieldSearchCriteria }
     *     
     */
    public void setCriteria(FieldSearchCriteria value) {
        this.criteria = value;
    }

}
