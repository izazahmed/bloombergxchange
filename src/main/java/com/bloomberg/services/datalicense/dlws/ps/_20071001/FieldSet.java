
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FieldSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fieldmacro" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}FieldMacro"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldSet", propOrder = {
    "fieldmacro",
    "date"
})
public class FieldSet {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FieldMacro fieldmacro;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the fieldmacro property.
     *
     * @return
     *     possible object is
     *     {@link FieldMacro }
     *
     */
    public FieldMacro getFieldmacro() {
        return fieldmacro;
    }

    /**
     * Sets the value of the fieldmacro property.
     *
     * @param value
     *     allowed object is
     *     {@link FieldMacro }
     *     
     */
    public void setFieldmacro(FieldMacro value) {
        this.fieldmacro = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
