
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The data for a historical price correction
 * 
 * <p>Java class for CorrectionRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrectionRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="instrument" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}Instrument"/&gt;
 *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oldValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oldDateEntered" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newDateEntered" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="timeEntered" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exchangeIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectionRecord", propOrder = {
    "instrument",
    "field",
    "oldValue",
    "oldDateEntered",
    "newValue",
    "newDateEntered",
    "timeEntered",
    "exchangeIndicator"
})
public class CorrectionRecord {

    @XmlElement(required = true)
    protected Instrument instrument;
    @XmlElement(required = true)
    protected String field;
    @XmlElement(required = true)
    protected String oldValue;
    @XmlElement(required = true)
    protected String oldDateEntered;
    @XmlElement(required = true)
    protected String newValue;
    @XmlElement(required = true)
    protected String newDateEntered;
    @XmlElement(required = true)
    protected String timeEntered;
    @XmlElement(required = true)
    protected String exchangeIndicator;

    /**
     * Gets the value of the instrument property.
     *
     * @return
     *     possible object is
     *     {@link Instrument }
     *
     */
    public Instrument getInstrument() {
        return instrument;
    }

    /**
     * Sets the value of the instrument property.
     *
     * @param value
     *     allowed object is
     *     {@link Instrument }
     *     
     */
    public void setInstrument(Instrument value) {
        this.instrument = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the oldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * Sets the value of the oldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldValue(String value) {
        this.oldValue = value;
    }

    /**
     * Gets the value of the oldDateEntered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldDateEntered() {
        return oldDateEntered;
    }

    /**
     * Sets the value of the oldDateEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldDateEntered(String value) {
        this.oldDateEntered = value;
    }

    /**
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewValue(String value) {
        this.newValue = value;
    }

    /**
     * Gets the value of the newDateEntered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDateEntered() {
        return newDateEntered;
    }

    /**
     * Sets the value of the newDateEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDateEntered(String value) {
        this.newDateEntered = value;
    }

    /**
     * Gets the value of the timeEntered property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeEntered() {
        return timeEntered;
    }

    /**
     * Sets the value of the timeEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeEntered(String value) {
        this.timeEntered = value;
    }

    /**
     * Gets the value of the exchangeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeIndicator() {
        return exchangeIndicator;
    }

    /**
     * Sets the value of the exchangeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeIndicator(String value) {
        this.exchangeIndicator = value;
    }

}
