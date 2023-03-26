
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for FieldInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mnemonic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dlCategory" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}DLCategory" minOccurs="0"/&gt;
 *         &lt;element name="definition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marketsectors" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}MarketSector" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element name="standardWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="standardDecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fieldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="backoffice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="extendedBackoffice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="productionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dlCategory2" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}DLCategory2" minOccurs="0"/&gt;
 *         &lt;element name="psBoOpt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="getHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="getCompany" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bval" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bvalBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dsBvalMetered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sapiOMS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="oldMnemonic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentMaximumWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dlBoOptFundamentals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dlBoOptBDVD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dlBoOptBEST" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dlBoOptCreditRisk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dlBoOptCapStruct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dlBoOptCreditRiskGetCompany" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dlBoOptCapStructGetCompany" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dlBoOptRegCompliance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dlBoOptIssuerRatings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldInfo", propOrder = {
    "id",
    "mnemonic",
    "description",
    "dlCategory",
    "definition",
    "marketsectors",
    "standardWidth",
    "standardDecimalPlaces",
    "fieldType",
    "backoffice",
    "extendedBackoffice",
    "productionDate",
    "dlCategory2",
    "psBoOpt",
    "getHistory",
    "getCompany",
    "bval",
    "bvalBlocked",
    "dsBvalMetered",
    "sapiOMS",
    "oldMnemonic",
    "currentMaximumWidth",
    "dlBoOptFundamentals",
    "dlBoOptBDVD",
    "dlBoOptBEST",
    "dlBoOptCreditRisk",
    "dlBoOptCapStruct",
    "dlBoOptCreditRiskGetCompany",
    "dlBoOptCapStructGetCompany",
    "dlBoOptRegCompliance",
    "dlBoOptIssuerRatings"
})
public class FieldInfo {

    protected String id;
    protected String mnemonic;
    protected String description;
    @XmlSchemaType(name = "string")
    protected DLCategory dlCategory;
    protected String definition;
    @XmlSchemaType(name = "string")
    protected List<MarketSector> marketsectors;
    protected Integer standardWidth;
    protected Integer standardDecimalPlaces;
    protected String fieldType;
    protected Boolean backoffice;
    protected Boolean extendedBackoffice;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar productionDate;
    @XmlSchemaType(name = "string")
    protected DLCategory2 dlCategory2;
    protected Boolean psBoOpt;
    protected Boolean getHistory;
    protected Boolean getCompany;
    protected Boolean bval;
    protected Boolean bvalBlocked;
    protected Boolean dsBvalMetered;
    protected Boolean sapiOMS;
    protected String oldMnemonic;
    protected Integer currentMaximumWidth;
    protected Boolean dlBoOptFundamentals;
    protected Boolean dlBoOptBDVD;
    protected Boolean dlBoOptBEST;
    protected Boolean dlBoOptCreditRisk;
    protected Boolean dlBoOptCapStruct;
    protected Boolean dlBoOptCreditRiskGetCompany;
    protected Boolean dlBoOptCapStructGetCompany;
    protected Boolean dlBoOptRegCompliance;
    protected Boolean dlBoOptIssuerRatings;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the dlCategory property.
     *
     * @return
     *     possible object is
     *     {@link DLCategory }
     *
     */
    public DLCategory getDlCategory() {
        return dlCategory;
    }

    /**
     * Sets the value of the dlCategory property.
     *
     * @param value
     *     allowed object is
     *     {@link DLCategory }
     *
     */
    public void setDlCategory(DLCategory value) {
        this.dlCategory = value;
    }

    /**
     * Gets the value of the definition property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDefinition(String value) {
        this.definition = value;
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
     * Gets the value of the standardWidth property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getStandardWidth() {
        return standardWidth;
    }

    /**
     * Sets the value of the standardWidth property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setStandardWidth(Integer value) {
        this.standardWidth = value;
    }

    /**
     * Gets the value of the standardDecimalPlaces property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getStandardDecimalPlaces() {
        return standardDecimalPlaces;
    }

    /**
     * Sets the value of the standardDecimalPlaces property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setStandardDecimalPlaces(Integer value) {
        this.standardDecimalPlaces = value;
    }

    /**
     * Gets the value of the fieldType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFieldType(String value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the backoffice property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isBackoffice() {
        return backoffice;
    }

    /**
     * Sets the value of the backoffice property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setBackoffice(Boolean value) {
        this.backoffice = value;
    }

    /**
     * Gets the value of the extendedBackoffice property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isExtendedBackoffice() {
        return extendedBackoffice;
    }

    /**
     * Sets the value of the extendedBackoffice property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setExtendedBackoffice(Boolean value) {
        this.extendedBackoffice = value;
    }

    /**
     * Gets the value of the productionDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getProductionDate() {
        return productionDate;
    }

    /**
     * Sets the value of the productionDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setProductionDate(XMLGregorianCalendar value) {
        this.productionDate = value;
    }

    /**
     * Gets the value of the dlCategory2 property.
     *
     * @return
     *     possible object is
     *     {@link DLCategory2 }
     *
     */
    public DLCategory2 getDlCategory2() {
        return dlCategory2;
    }

    /**
     * Sets the value of the dlCategory2 property.
     *
     * @param value
     *     allowed object is
     *     {@link DLCategory2 }
     *     
     */
    public void setDlCategory2(DLCategory2 value) {
        this.dlCategory2 = value;
    }

    /**
     * Gets the value of the psBoOpt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPsBoOpt() {
        return psBoOpt;
    }

    /**
     * Sets the value of the psBoOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPsBoOpt(Boolean value) {
        this.psBoOpt = value;
    }

    /**
     * Gets the value of the getHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetHistory() {
        return getHistory;
    }

    /**
     * Sets the value of the getHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetHistory(Boolean value) {
        this.getHistory = value;
    }

    /**
     * Gets the value of the getCompany property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetCompany() {
        return getCompany;
    }

    /**
     * Sets the value of the getCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetCompany(Boolean value) {
        this.getCompany = value;
    }

    /**
     * Gets the value of the bval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBval() {
        return bval;
    }

    /**
     * Sets the value of the bval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBval(Boolean value) {
        this.bval = value;
    }

    /**
     * Gets the value of the bvalBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBvalBlocked() {
        return bvalBlocked;
    }

    /**
     * Sets the value of the bvalBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBvalBlocked(Boolean value) {
        this.bvalBlocked = value;
    }

    /**
     * Gets the value of the dsBvalMetered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDsBvalMetered() {
        return dsBvalMetered;
    }

    /**
     * Sets the value of the dsBvalMetered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDsBvalMetered(Boolean value) {
        this.dsBvalMetered = value;
    }

    /**
     * Gets the value of the sapiOMS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSapiOMS() {
        return sapiOMS;
    }

    /**
     * Sets the value of the sapiOMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSapiOMS(Boolean value) {
        this.sapiOMS = value;
    }

    /**
     * Gets the value of the oldMnemonic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMnemonic() {
        return oldMnemonic;
    }

    /**
     * Sets the value of the oldMnemonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMnemonic(String value) {
        this.oldMnemonic = value;
    }

    /**
     * Gets the value of the currentMaximumWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentMaximumWidth() {
        return currentMaximumWidth;
    }

    /**
     * Sets the value of the currentMaximumWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentMaximumWidth(Integer value) {
        this.currentMaximumWidth = value;
    }

    /**
     * Gets the value of the dlBoOptFundamentals property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDlBoOptFundamentals() {
        return dlBoOptFundamentals;
    }

    /**
     * Sets the value of the dlBoOptFundamentals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDlBoOptFundamentals(Boolean value) {
        this.dlBoOptFundamentals = value;
    }

    /**
     * Gets the value of the dlBoOptBDVD property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDlBoOptBDVD() {
        return dlBoOptBDVD;
    }

    /**
     * Sets the value of the dlBoOptBDVD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDlBoOptBDVD(Boolean value) {
        this.dlBoOptBDVD = value;
    }

    /**
     * Gets the value of the dlBoOptBEST property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDlBoOptBEST() {
        return dlBoOptBEST;
    }

    /**
     * Sets the value of the dlBoOptBEST property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDlBoOptBEST(Boolean value) {
        this.dlBoOptBEST = value;
    }

    /**
     * Gets the value of the dlBoOptCreditRisk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDlBoOptCreditRisk() {
        return dlBoOptCreditRisk;
    }

    /**
     * Sets the value of the dlBoOptCreditRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDlBoOptCreditRisk(Boolean value) {
        this.dlBoOptCreditRisk = value;
    }

    /**
     * Gets the value of the dlBoOptCapStruct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDlBoOptCapStruct() {
        return dlBoOptCapStruct;
    }

    /**
     * Sets the value of the dlBoOptCapStruct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDlBoOptCapStruct(Boolean value) {
        this.dlBoOptCapStruct = value;
    }

    /**
     * Gets the value of the dlBoOptCreditRiskGetCompany property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDlBoOptCreditRiskGetCompany() {
        return dlBoOptCreditRiskGetCompany;
    }

    /**
     * Sets the value of the dlBoOptCreditRiskGetCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDlBoOptCreditRiskGetCompany(Boolean value) {
        this.dlBoOptCreditRiskGetCompany = value;
    }

    /**
     * Gets the value of the dlBoOptCapStructGetCompany property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDlBoOptCapStructGetCompany() {
        return dlBoOptCapStructGetCompany;
    }

    /**
     * Sets the value of the dlBoOptCapStructGetCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDlBoOptCapStructGetCompany(Boolean value) {
        this.dlBoOptCapStructGetCompany = value;
    }

    /**
     * Gets the value of the dlBoOptRegCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDlBoOptRegCompliance() {
        return dlBoOptRegCompliance;
    }

    /**
     * Sets the value of the dlBoOptRegCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDlBoOptRegCompliance(Boolean value) {
        this.dlBoOptRegCompliance = value;
    }

    /**
     * Gets the value of the dlBoOptIssuerRatings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDlBoOptIssuerRatings() {
        return dlBoOptIssuerRatings;
    }

    /**
     * Sets the value of the dlBoOptIssuerRatings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDlBoOptIssuerRatings(Boolean value) {
        this.dlBoOptIssuerRatings = value;
    }

}
