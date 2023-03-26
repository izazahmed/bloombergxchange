
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * QR Quote is a trade quote.  It will have date, time, price, volume, exchange, and condition code.
 * 
 * <p>Java class for QRQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QRQuote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="price" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="volume" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="exCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="condCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QRQuote")
public class QRQuote {

    @XmlAttribute(name = "dateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlAttribute(name = "price")
    protected String price;
    @XmlAttribute(name = "volume")
    protected String volume;
    @XmlAttribute(name = "exCode")
    protected String exCode;
    @XmlAttribute(name = "condCode")
    protected String condCode;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Gets the value of the exCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExCode() {
        return exCode;
    }

    /**
     * Sets the value of the exCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExCode(String value) {
        this.exCode = value;
    }

    /**
     * Gets the value of the condCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondCode() {
        return condCode;
    }

    /**
     * Sets the value of the condCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondCode(String value) {
        this.condCode = value;
    }

}
