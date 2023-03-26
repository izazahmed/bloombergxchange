
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCorrectionsHeaders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCorrectionsHeaders"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="dateformat" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}DateFormat" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCorrectionsHeaders", propOrder = {

})
public class GetCorrectionsHeaders {

    @XmlSchemaType(name = "string")
    protected DateFormat dateformat;

    /**
     * Gets the value of the dateformat property.
     *
     * @return
     *     possible object is
     *     {@link DateFormat }
     *
     */
    public DateFormat getDateformat() {
        return dateformat;
    }

    /**
     * Sets the value of the dateformat property.
     *
     * @param value
     *     allowed object is
     *     {@link DateFormat }
     *     
     */
    public void setDateformat(DateFormat value) {
        this.dateformat = value;
    }

}
