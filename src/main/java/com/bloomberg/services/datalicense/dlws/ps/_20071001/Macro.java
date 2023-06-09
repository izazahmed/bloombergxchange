
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Macro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Macro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="primaryQualifier" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}PrimaryQualifier"/&gt;
 *         &lt;element name="secondaryQualifier" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}SecondaryQualifier" maxOccurs="7" minOccurs="0"/&gt;
 *         &lt;element name="overrides" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}Overrides" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Macro", propOrder = {
    "primaryQualifier",
    "secondaryQualifier",
    "overrides"
})
public class Macro {

    @XmlElement(required = true)
    protected PrimaryQualifier primaryQualifier;
    protected List<SecondaryQualifier> secondaryQualifier;
    protected Overrides overrides;

    /**
     * Gets the value of the primaryQualifier property.
     *
     * @return
     *     possible object is
     *     {@link PrimaryQualifier }
     *
     */
    public PrimaryQualifier getPrimaryQualifier() {
        return primaryQualifier;
    }

    /**
     * Sets the value of the primaryQualifier property.
     *
     * @param value
     *     allowed object is
     *     {@link PrimaryQualifier }
     *
     */
    public void setPrimaryQualifier(PrimaryQualifier value) {
        this.primaryQualifier = value;
    }

    /**
     * Gets the value of the secondaryQualifier property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryQualifier property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryQualifier().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecondaryQualifier }
     *
     *
     */
    public List<SecondaryQualifier> getSecondaryQualifier() {
        if (secondaryQualifier == null) {
            secondaryQualifier = new ArrayList<SecondaryQualifier>();
        }
        return this.secondaryQualifier;
    }

    /**
     * Gets the value of the overrides property.
     *
     * @return
     *     possible object is
     *     {@link Overrides }
     *
     */
    public Overrides getOverrides() {
        return overrides;
    }

    /**
     * Sets the value of the overrides property.
     *
     * @param value
     *     allowed object is
     *     {@link Overrides }
     *     
     */
    public void setOverrides(Overrides value) {
        this.overrides = value;
    }

}
