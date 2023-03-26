
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SecondaryQualifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondaryQualifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="secondaryQualifierType" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}SecondaryQualifierType"/&gt;
 *         &lt;element name="secondaryQualifierOperator" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}SecondaryQualifierOperator"/&gt;
 *         &lt;element name="secondaryQualifierValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryQualifier", propOrder = {
    "secondaryQualifierType",
    "secondaryQualifierOperator",
    "secondaryQualifierValue"
})
public class SecondaryQualifier {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SecondaryQualifierType secondaryQualifierType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SecondaryQualifierOperator secondaryQualifierOperator;
    @XmlElement(required = true)
    protected String secondaryQualifierValue;

    /**
     * Gets the value of the secondaryQualifierType property.
     *
     * @return
     *     possible object is
     *     {@link SecondaryQualifierType }
     *
     */
    public SecondaryQualifierType getSecondaryQualifierType() {
        return secondaryQualifierType;
    }

    /**
     * Sets the value of the secondaryQualifierType property.
     *
     * @param value
     *     allowed object is
     *     {@link SecondaryQualifierType }
     *
     */
    public void setSecondaryQualifierType(SecondaryQualifierType value) {
        this.secondaryQualifierType = value;
    }

    /**
     * Gets the value of the secondaryQualifierOperator property.
     *
     * @return
     *     possible object is
     *     {@link SecondaryQualifierOperator }
     *
     */
    public SecondaryQualifierOperator getSecondaryQualifierOperator() {
        return secondaryQualifierOperator;
    }

    /**
     * Sets the value of the secondaryQualifierOperator property.
     *
     * @param value
     *     allowed object is
     *     {@link SecondaryQualifierOperator }
     *     
     */
    public void setSecondaryQualifierOperator(SecondaryQualifierOperator value) {
        this.secondaryQualifierOperator = value;
    }

    /**
     * Gets the value of the secondaryQualifierValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryQualifierValue() {
        return secondaryQualifierValue;
    }

    /**
     * Sets the value of the secondaryQualifierValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryQualifierValue(String value) {
        this.secondaryQualifierValue = value;
    }

}
