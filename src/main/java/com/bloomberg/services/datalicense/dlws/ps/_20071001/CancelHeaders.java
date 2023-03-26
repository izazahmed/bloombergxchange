
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CancelHeaders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelHeaders"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="programflag" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}ProgramFlag"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelHeaders", propOrder = {

})
public class CancelHeaders {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProgramFlag programflag;

    /**
     * Gets the value of the programflag property.
     *
     * @return
     *     possible object is
     *     {@link ProgramFlag }
     *
     */
    public ProgramFlag getProgramflag() {
        return programflag;
    }

    /**
     * Sets the value of the programflag property.
     *
     * @param value
     *     allowed object is
     *     {@link ProgramFlag }
     *     
     */
    public void setProgramflag(ProgramFlag value) {
        this.programflag = value;
    }

}
