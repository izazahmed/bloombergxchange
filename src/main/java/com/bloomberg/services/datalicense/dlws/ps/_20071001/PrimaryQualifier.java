
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for PrimaryQualifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrimaryQualifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="primaryQualifierType" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}MacroType"/&gt;
 *         &lt;element name="primaryQualifierValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimaryQualifier", propOrder = {
    "primaryQualifierType",
    "primaryQualifierValue"
})
public class PrimaryQualifier {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MacroType primaryQualifierType;
    @XmlElement(required = true)
    protected String primaryQualifierValue;

    /**
     * Gets the value of the primaryQualifierType property.
     *
     * @return
     *     possible object is
     *     {@link MacroType }
     *
     */
    public MacroType getPrimaryQualifierType() {
        return primaryQualifierType;
    }

    /**
     * Sets the value of the primaryQualifierType property.
     *
     * @param value
     *     allowed object is
     *     {@link MacroType }
     *     
     */
    public void setPrimaryQualifierType(MacroType value) {
        this.primaryQualifierType = value;
    }

    /**
     * Gets the value of the primaryQualifierValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryQualifierValue() {
        return primaryQualifierValue;
    }

    /**
     * Sets the value of the primaryQualifierValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryQualifierValue(String value) {
        this.primaryQualifierValue = value;
    }

}
