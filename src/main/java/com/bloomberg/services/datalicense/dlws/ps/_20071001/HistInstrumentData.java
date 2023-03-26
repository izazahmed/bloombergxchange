
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * The historical data for an instrument
 * 
 * <p>Java class for HistInstrumentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistInstrumentData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="instrument" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}Instrument" minOccurs="0"/&gt;
 *         &lt;element name="macro" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}Macro" minOccurs="0"/&gt;
 *         &lt;element name="pricingSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}HistData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistInstrumentData", propOrder = {
    "code",
    "instrument",
    "macro",
    "pricingSource",
    "date",
    "data"
})
public class HistInstrumentData {

    @XmlElement(required = true)
    protected String code;
    protected Instrument instrument;
    protected Macro macro;
    protected String pricingSource;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    protected List<HistData> data;

    /**
     * Gets the value of the code property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCode(String value) {
        this.code = value;
    }

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
     * Gets the value of the macro property.
     *
     * @return
     *     possible object is
     *     {@link Macro }
     *
     */
    public Macro getMacro() {
        return macro;
    }

    /**
     * Sets the value of the macro property.
     *
     * @param value
     *     allowed object is
     *     {@link Macro }
     *
     */
    public void setMacro(Macro value) {
        this.macro = value;
    }

    /**
     * Gets the value of the pricingSource property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPricingSource() {
        return pricingSource;
    }

    /**
     * Sets the value of the pricingSource property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPricingSource(String value) {
        this.pricingSource = value;
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

    /**
     * Gets the value of the data property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistData }
     *
     *
     */
    public List<HistData> getData() {
        if (data == null) {
            data = new ArrayList<HistData>();
        }
        return this.data;
    }

}
