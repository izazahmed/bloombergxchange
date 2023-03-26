
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for FieldSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldSearchCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mnemonic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dlCategories" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}DLCategory" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="overridable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="marketsectors" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}MarketSector" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element name="dlCategories2" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}DLCategory2" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldSearchCriteria", propOrder = {
    "keyword",
    "mnemonic",
    "dlCategories",
    "overridable",
    "marketsectors",
    "dlCategories2"
})
public class FieldSearchCriteria {

    protected String keyword;
    protected String mnemonic;
    @XmlSchemaType(name = "string")
    protected List<DLCategory> dlCategories;
    protected Boolean overridable;
    @XmlSchemaType(name = "string")
    protected List<MarketSector> marketsectors;
    @XmlSchemaType(name = "string")
    protected List<DLCategory2> dlCategories2;

    /**
     * Gets the value of the keyword property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the mnemonic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMnemonic() {
        return mnemonic;
    }

    /**
     * Sets the value of the mnemonic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMnemonic(String value) {
        this.mnemonic = value;
    }

    /**
     * Gets the value of the dlCategories property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlCategories property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlCategories().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DLCategory }
     *
     *
     */
    public List<DLCategory> getDlCategories() {
        if (dlCategories == null) {
            dlCategories = new ArrayList<DLCategory>();
        }
        return this.dlCategories;
    }

    /**
     * Gets the value of the overridable property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isOverridable() {
        return overridable;
    }

    /**
     * Sets the value of the overridable property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setOverridable(Boolean value) {
        this.overridable = value;
    }

    /**
     * Gets the value of the marketsectors property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketsectors property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketsectors().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketSector }
     *
     *
     */
    public List<MarketSector> getMarketsectors() {
        if (marketsectors == null) {
            marketsectors = new ArrayList<MarketSector>();
        }
        return this.marketsectors;
    }

    /**
     * Gets the value of the dlCategories2 property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlCategories2 property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlCategories2().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DLCategory2 }
     *
     *
     */
    public List<DLCategory2> getDlCategories2() {
        if (dlCategories2 == null) {
            dlCategories2 = new ArrayList<DLCategory2>();
        }
        return this.dlCategories2;
    }

}
