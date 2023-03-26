
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFieldsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFieldsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}PerSecurityResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fields" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}FieldInfos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFieldsResponse", propOrder = {
    "fields"
})
public class GetFieldsResponse
    extends PerSecurityResponse
{

    protected FieldInfos fields;

    /**
     * Gets the value of the fields property.
     *
     * @return
     *     possible object is
     *     {@link FieldInfos }
     *
     */
    public FieldInfos getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     *
     * @param value
     *     allowed object is
     *     {@link FieldInfos }
     *     
     */
    public void setFields(FieldInfos value) {
        this.fields = value;
    }

}
