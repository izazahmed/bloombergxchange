
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for GetDataHeaders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDataHeaders"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="closingvalues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dateformat" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}DateFormat" minOccurs="0"/&gt;
 *         &lt;element name="derived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="diffflag" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}DiffFlag" minOccurs="0"/&gt;
 *         &lt;element name="hist_crncy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="historical" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="programflag" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}ProgramFlag" minOccurs="0"/&gt;
 *         &lt;element name="rundate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secid" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}InstrumentType" minOccurs="0"/&gt;
 *         &lt;element name="secmaster" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="specialchar" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}SpecialChar" minOccurs="0"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usernumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}Version" minOccurs="0"/&gt;
 *         &lt;element name="ws" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="yellowkey" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}MarketSector" minOccurs="0"/&gt;
 *         &lt;element name="quotecomposite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="creditrisk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="quotecompositehist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="exclusive_pricing_src" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="estimates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bvaltier" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}BvalTier" minOccurs="0"/&gt;
 *         &lt;element name="bvalsnapshot" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}BvalSnapshot" minOccurs="0"/&gt;
 *         &lt;element name="bvalsnapshotdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bvalbeta" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pricing_source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="portsecdes" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}PortSecDes" minOccurs="0"/&gt;
 *         &lt;element name="prp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fundamentals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pricing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="skip_pcs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vol_surface" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="regssfa" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="regfvhl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="regtransparency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="regcomp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="corpstruct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="capstruct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="regsolvency" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}RegSolvency" minOccurs="0"/&gt;
 *         &lt;element name="reghqla" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reghqlaamer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reghqlaeuro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reghqlaasia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="regcbe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="regcfid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reglqa" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mifir" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="defaultrisk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ifrs9sppi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="coltag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="uswhldtax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="regecl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="basictax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="invstprot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDataHeaders", propOrder = {

})
public class GetDataHeaders {

    protected Boolean closingvalues;
    @XmlSchemaType(name = "string")
    protected DateFormat dateformat;
    protected Boolean derived;
    @XmlSchemaType(name = "string")
    protected DiffFlag diffflag;
    @XmlElement(name = "hist_crncy")
    protected String histCrncy;
    protected Boolean historical;
    @XmlSchemaType(name = "string")
    protected ProgramFlag programflag;
    protected String rundate;
    @XmlSchemaType(name = "string")
    protected InstrumentType secid;
    protected Boolean secmaster;
    protected Integer sn;
    @XmlSchemaType(name = "string")
    protected SpecialChar specialchar;
    protected String time;
    protected String login;
    protected Integer usernumber;
    @XmlSchemaType(name = "string")
    protected Version version;
    protected Integer ws;
    @XmlSchemaType(name = "string")
    protected MarketSector yellowkey;
    protected Boolean quotecomposite;
    protected Boolean creditrisk;
    protected Boolean quotecompositehist;
    @XmlElement(name = "exclusive_pricing_src")
    protected Boolean exclusivePricingSrc;
    protected Boolean estimates;
    protected Integer bvaltier;
    @XmlSchemaType(name = "string")
    protected BvalSnapshot bvalsnapshot;
    protected String bvalsnapshotdate;
    protected Boolean bvalbeta;
    @XmlElement(name = "pricing_source")
    protected String pricingSource;
    @XmlSchemaType(name = "string")
    protected PortSecDes portsecdes;
    protected Integer prp;
    protected Boolean fundamentals;
    protected Boolean pricing;
    @XmlElement(name = "skip_pcs")
    protected String skipPcs;
    @XmlElement(name = "vol_surface")
    protected Boolean volSurface;
    protected Boolean regssfa;
    protected Boolean regfvhl;
    protected Boolean regtransparency;
    protected Boolean regcomp;
    protected Boolean corpstruct;
    protected Boolean capstruct;
    @XmlSchemaType(name = "string")
    protected RegSolvency regsolvency;
    protected Boolean reghqla;
    protected Boolean reghqlaamer;
    protected Boolean reghqlaeuro;
    protected Boolean reghqlaasia;
    protected Boolean regcbe;
    protected Boolean regcfid;
    protected Boolean reglqa;
    protected Boolean mifir;
    protected Boolean defaultrisk;
    @XmlElement(name = "ifrs9sppi")
    protected Boolean ifrs9Sppi;
    protected Boolean coltag;
    protected Boolean uswhldtax;
    protected Boolean regecl;
    protected Boolean basictax;
    protected Boolean invstprot;
    protected String encoding;

    /**
     * Gets the value of the closingvalues property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isClosingvalues() {
        return closingvalues;
    }

    /**
     * Sets the value of the closingvalues property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setClosingvalues(Boolean value) {
        this.closingvalues = value;
    }

    /**
     * Gets the value of the dateformat property.
     *
     * @return
     *     possible object is
     *     {@link DateFormat }
     *
     */
    public DateFormat getDateformat() {
        return dateformat;
    }

    /**
     * Sets the value of the dateformat property.
     *
     * @param value
     *     allowed object is
     *     {@link DateFormat }
     *
     */
    public void setDateformat(DateFormat value) {
        this.dateformat = value;
    }

    /**
     * Gets the value of the derived property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDerived() {
        return derived;
    }

    /**
     * Sets the value of the derived property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDerived(Boolean value) {
        this.derived = value;
    }

    /**
     * Gets the value of the diffflag property.
     *
     * @return
     *     possible object is
     *     {@link DiffFlag }
     *
     */
    public DiffFlag getDiffflag() {
        return diffflag;
    }

    /**
     * Sets the value of the diffflag property.
     *
     * @param value
     *     allowed object is
     *     {@link DiffFlag }
     *
     */
    public void setDiffflag(DiffFlag value) {
        this.diffflag = value;
    }

    /**
     * Gets the value of the histCrncy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHistCrncy() {
        return histCrncy;
    }

    /**
     * Sets the value of the histCrncy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHistCrncy(String value) {
        this.histCrncy = value;
    }

    /**
     * Gets the value of the historical property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isHistorical() {
        return historical;
    }

    /**
     * Sets the value of the historical property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setHistorical(Boolean value) {
        this.historical = value;
    }

    /**
     * Gets the value of the programflag property.
     *
     * @return
     *     possible object is
     *     {@link ProgramFlag }
     *
     */
    public ProgramFlag getProgramflag() {
        return programflag;
    }

    /**
     * Sets the value of the programflag property.
     *
     * @param value
     *     allowed object is
     *     {@link ProgramFlag }
     *
     */
    public void setProgramflag(ProgramFlag value) {
        this.programflag = value;
    }

    /**
     * Gets the value of the rundate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRundate() {
        return rundate;
    }

    /**
     * Sets the value of the rundate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRundate(String value) {
        this.rundate = value;
    }

    /**
     * Gets the value of the secid property.
     *
     * @return
     *     possible object is
     *     {@link InstrumentType }
     *
     */
    public InstrumentType getSecid() {
        return secid;
    }

    /**
     * Sets the value of the secid property.
     *
     * @param value
     *     allowed object is
     *     {@link InstrumentType }
     *
     */
    public void setSecid(InstrumentType value) {
        this.secid = value;
    }

    /**
     * Gets the value of the secmaster property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isSecmaster() {
        return secmaster;
    }

    /**
     * Sets the value of the secmaster property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setSecmaster(Boolean value) {
        this.secmaster = value;
    }

    /**
     * Gets the value of the sn property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSn() {
        return sn;
    }

    /**
     * Sets the value of the sn property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSn(Integer value) {
        this.sn = value;
    }

    /**
     * Gets the value of the specialchar property.
     *
     * @return
     *     possible object is
     *     {@link SpecialChar }
     *
     */
    public SpecialChar getSpecialchar() {
        return specialchar;
    }

    /**
     * Sets the value of the specialchar property.
     *
     * @param value
     *     allowed object is
     *     {@link SpecialChar }
     *
     */
    public void setSpecialchar(SpecialChar value) {
        this.specialchar = value;
    }

    /**
     * Gets the value of the time property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the login property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the usernumber property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getUsernumber() {
        return usernumber;
    }

    /**
     * Sets the value of the usernumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setUsernumber(Integer value) {
        this.usernumber = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link Version }
     *
     */
    public Version getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link Version }
     *
     */
    public void setVersion(Version value) {
        this.version = value;
    }

    /**
     * Gets the value of the ws property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getWs() {
        return ws;
    }

    /**
     * Sets the value of the ws property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setWs(Integer value) {
        this.ws = value;
    }

    /**
     * Gets the value of the yellowkey property.
     *
     * @return
     *     possible object is
     *     {@link MarketSector }
     *
     */
    public MarketSector getYellowkey() {
        return yellowkey;
    }

    /**
     * Sets the value of the yellowkey property.
     *
     * @param value
     *     allowed object is
     *     {@link MarketSector }
     *
     */
    public void setYellowkey(MarketSector value) {
        this.yellowkey = value;
    }

    /**
     * Gets the value of the quotecomposite property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isQuotecomposite() {
        return quotecomposite;
    }

    /**
     * Sets the value of the quotecomposite property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setQuotecomposite(Boolean value) {
        this.quotecomposite = value;
    }

    /**
     * Gets the value of the creditrisk property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCreditrisk() {
        return creditrisk;
    }

    /**
     * Sets the value of the creditrisk property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCreditrisk(Boolean value) {
        this.creditrisk = value;
    }

    /**
     * Gets the value of the quotecompositehist property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isQuotecompositehist() {
        return quotecompositehist;
    }

    /**
     * Sets the value of the quotecompositehist property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setQuotecompositehist(Boolean value) {
        this.quotecompositehist = value;
    }

    /**
     * Gets the value of the exclusivePricingSrc property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isExclusivePricingSrc() {
        return exclusivePricingSrc;
    }

    /**
     * Sets the value of the exclusivePricingSrc property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setExclusivePricingSrc(Boolean value) {
        this.exclusivePricingSrc = value;
    }

    /**
     * Gets the value of the estimates property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isEstimates() {
        return estimates;
    }

    /**
     * Sets the value of the estimates property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setEstimates(Boolean value) {
        this.estimates = value;
    }

    /**
     * Gets the value of the bvaltier property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getBvaltier() {
        return bvaltier;
    }

    /**
     * Sets the value of the bvaltier property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setBvaltier(Integer value) {
        this.bvaltier = value;
    }

    /**
     * Gets the value of the bvalsnapshot property.
     *
     * @return
     *     possible object is
     *     {@link BvalSnapshot }
     *
     */
    public BvalSnapshot getBvalsnapshot() {
        return bvalsnapshot;
    }

    /**
     * Sets the value of the bvalsnapshot property.
     *
     * @param value
     *     allowed object is
     *     {@link BvalSnapshot }
     *
     */
    public void setBvalsnapshot(BvalSnapshot value) {
        this.bvalsnapshot = value;
    }

    /**
     * Gets the value of the bvalsnapshotdate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBvalsnapshotdate() {
        return bvalsnapshotdate;
    }

    /**
     * Sets the value of the bvalsnapshotdate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBvalsnapshotdate(String value) {
        this.bvalsnapshotdate = value;
    }

    /**
     * Gets the value of the bvalbeta property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isBvalbeta() {
        return bvalbeta;
    }

    /**
     * Sets the value of the bvalbeta property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setBvalbeta(Boolean value) {
        this.bvalbeta = value;
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
     * Gets the value of the portsecdes property.
     *
     * @return
     *     possible object is
     *     {@link PortSecDes }
     *
     */
    public PortSecDes getPortsecdes() {
        return portsecdes;
    }

    /**
     * Sets the value of the portsecdes property.
     *
     * @param value
     *     allowed object is
     *     {@link PortSecDes }
     *
     */
    public void setPortsecdes(PortSecDes value) {
        this.portsecdes = value;
    }

    /**
     * Gets the value of the prp property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getPrp() {
        return prp;
    }

    /**
     * Sets the value of the prp property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setPrp(Integer value) {
        this.prp = value;
    }

    /**
     * Gets the value of the fundamentals property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isFundamentals() {
        return fundamentals;
    }

    /**
     * Sets the value of the fundamentals property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setFundamentals(Boolean value) {
        this.fundamentals = value;
    }

    /**
     * Gets the value of the pricing property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setPricing(Boolean value) {
        this.pricing = value;
    }

    /**
     * Gets the value of the skipPcs property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSkipPcs() {
        return skipPcs;
    }

    /**
     * Sets the value of the skipPcs property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSkipPcs(String value) {
        this.skipPcs = value;
    }

    /**
     * Gets the value of the volSurface property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isVolSurface() {
        return volSurface;
    }

    /**
     * Sets the value of the volSurface property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setVolSurface(Boolean value) {
        this.volSurface = value;
    }

    /**
     * Gets the value of the regssfa property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRegssfa() {
        return regssfa;
    }

    /**
     * Sets the value of the regssfa property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setRegssfa(Boolean value) {
        this.regssfa = value;
    }

    /**
     * Gets the value of the regfvhl property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRegfvhl() {
        return regfvhl;
    }

    /**
     * Sets the value of the regfvhl property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setRegfvhl(Boolean value) {
        this.regfvhl = value;
    }

    /**
     * Gets the value of the regtransparency property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRegtransparency() {
        return regtransparency;
    }

    /**
     * Sets the value of the regtransparency property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setRegtransparency(Boolean value) {
        this.regtransparency = value;
    }

    /**
     * Gets the value of the regcomp property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRegcomp() {
        return regcomp;
    }

    /**
     * Sets the value of the regcomp property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setRegcomp(Boolean value) {
        this.regcomp = value;
    }

    /**
     * Gets the value of the corpstruct property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCorpstruct() {
        return corpstruct;
    }

    /**
     * Sets the value of the corpstruct property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCorpstruct(Boolean value) {
        this.corpstruct = value;
    }

    /**
     * Gets the value of the capstruct property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCapstruct() {
        return capstruct;
    }

    /**
     * Sets the value of the capstruct property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCapstruct(Boolean value) {
        this.capstruct = value;
    }

    /**
     * Gets the value of the regsolvency property.
     *
     * @return
     *     possible object is
     *     {@link RegSolvency }
     *
     */
    public RegSolvency getRegsolvency() {
        return regsolvency;
    }

    /**
     * Sets the value of the regsolvency property.
     *
     * @param value
     *     allowed object is
     *     {@link RegSolvency }
     *     
     */
    public void setRegsolvency(RegSolvency value) {
        this.regsolvency = value;
    }

    /**
     * Gets the value of the reghqla property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReghqla() {
        return reghqla;
    }

    /**
     * Sets the value of the reghqla property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReghqla(Boolean value) {
        this.reghqla = value;
    }

    /**
     * Gets the value of the reghqlaamer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReghqlaamer() {
        return reghqlaamer;
    }

    /**
     * Sets the value of the reghqlaamer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReghqlaamer(Boolean value) {
        this.reghqlaamer = value;
    }

    /**
     * Gets the value of the reghqlaeuro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReghqlaeuro() {
        return reghqlaeuro;
    }

    /**
     * Sets the value of the reghqlaeuro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReghqlaeuro(Boolean value) {
        this.reghqlaeuro = value;
    }

    /**
     * Gets the value of the reghqlaasia property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReghqlaasia() {
        return reghqlaasia;
    }

    /**
     * Sets the value of the reghqlaasia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReghqlaasia(Boolean value) {
        this.reghqlaasia = value;
    }

    /**
     * Gets the value of the regcbe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegcbe() {
        return regcbe;
    }

    /**
     * Sets the value of the regcbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegcbe(Boolean value) {
        this.regcbe = value;
    }

    /**
     * Gets the value of the regcfid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegcfid() {
        return regcfid;
    }

    /**
     * Sets the value of the regcfid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegcfid(Boolean value) {
        this.regcfid = value;
    }

    /**
     * Gets the value of the reglqa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReglqa() {
        return reglqa;
    }

    /**
     * Sets the value of the reglqa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReglqa(Boolean value) {
        this.reglqa = value;
    }

    /**
     * Gets the value of the mifir property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMifir() {
        return mifir;
    }

    /**
     * Sets the value of the mifir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMifir(Boolean value) {
        this.mifir = value;
    }

    /**
     * Gets the value of the defaultrisk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultrisk() {
        return defaultrisk;
    }

    /**
     * Sets the value of the defaultrisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultrisk(Boolean value) {
        this.defaultrisk = value;
    }

    /**
     * Gets the value of the ifrs9Sppi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIfrs9Sppi() {
        return ifrs9Sppi;
    }

    /**
     * Sets the value of the ifrs9Sppi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIfrs9Sppi(Boolean value) {
        this.ifrs9Sppi = value;
    }

    /**
     * Gets the value of the coltag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColtag() {
        return coltag;
    }

    /**
     * Sets the value of the coltag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColtag(Boolean value) {
        this.coltag = value;
    }

    /**
     * Gets the value of the uswhldtax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUswhldtax() {
        return uswhldtax;
    }

    /**
     * Sets the value of the uswhldtax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUswhldtax(Boolean value) {
        this.uswhldtax = value;
    }

    /**
     * Gets the value of the regecl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegecl() {
        return regecl;
    }

    /**
     * Sets the value of the regecl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegecl(Boolean value) {
        this.regecl = value;
    }

    /**
     * Gets the value of the basictax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBasictax() {
        return basictax;
    }

    /**
     * Sets the value of the basictax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBasictax(Boolean value) {
        this.basictax = value;
    }

    /**
     * Gets the value of the invstprot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvstprot() {
        return invstprot;
    }

    /**
     * Sets the value of the invstprot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvstprot(Boolean value) {
        this.invstprot = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

}
