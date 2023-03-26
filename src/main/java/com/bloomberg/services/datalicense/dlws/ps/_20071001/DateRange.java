
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="period" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}Period" minOccurs="0"/&gt;
 *         &lt;element name="duration" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}Duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateRange", propOrder = {
    "period",
    "duration"
})
public class DateRange {

    protected Period period;
    protected Duration duration;

    /**
     * Gets the value of the period property.
     *
     * @return
     *     possible object is
     *     {@link Period }
     *
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     *
     * @param value
     *     allowed object is
     *     {@link Period }
     *
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the duration property.
     *
     * @return
     *     possible object is
     *     {@link Duration }
     *
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     *
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

}
