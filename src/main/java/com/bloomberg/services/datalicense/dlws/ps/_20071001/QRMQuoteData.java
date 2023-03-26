
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * QRM Quote is a matched bid/ask, or a trade quote.  It will have price, volume, market maker, and exchange, for each bid/ask, and trade.
 *                         It will have a single date/time and condition code associated with the set (1 trade, or 1+1 bid+ask).
 * 
 * <p>Java class for QRMQuoteData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QRMQuoteData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="price" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="volume" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="exCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QRMQuoteData")
public class QRMQuoteData {

    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "price")
    protected String price;
    @XmlAttribute(name = "volume")
    protected String volume;
    @XmlAttribute(name = "mm")
    protected String mm;
    @XmlAttribute(name = "exCode")
    protected String exCode;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the mm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMm() {
        return mm;
    }

    /**
     * Sets the value of the mm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMm(String value) {
        this.mm = value;
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

}
