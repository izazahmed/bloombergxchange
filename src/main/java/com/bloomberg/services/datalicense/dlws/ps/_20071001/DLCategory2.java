
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DLCategory2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DLCategory2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Security Master"/&gt;
 *     &lt;enumeration value="Derived - Intraday"/&gt;
 *     &lt;enumeration value="Derived - End of Day"/&gt;
 *     &lt;enumeration value="Pricing - Intraday"/&gt;
 *     &lt;enumeration value="Pricing - End of Day"/&gt;
 *     &lt;enumeration value="User Entered Info."/&gt;
 *     &lt;enumeration value="Corporate Actions"/&gt;
 *     &lt;enumeration value="Historical Time Series"/&gt;
 *     &lt;enumeration value="Estimates"/&gt;
 *     &lt;enumeration value="Fundamentals"/&gt;
 *     &lt;enumeration value="Quote Composite"/&gt;
 *     &lt;enumeration value="Quote Composite History"/&gt;
 *     &lt;enumeration value="Credit Risk"/&gt;
 *     &lt;enumeration value="Packaged"/&gt;
 *     &lt;enumeration value="Open Source"/&gt;
 *     &lt;enumeration value="Reg SSFA"/&gt;
 *     &lt;enumeration value="Volatility Surface"/&gt;
 *     &lt;enumeration value="Volatility Cube"/&gt;
 *     &lt;enumeration value="Bram Fair Value Hierarchy Leveling Tool"/&gt;
 *     &lt;enumeration value="Credit Risk Corporate Structure"/&gt;
 *     &lt;enumeration value="Credit Risk Capital Structure"/&gt;
 *     &lt;enumeration value="Credit Risk Regulatory Compliance"/&gt;
 *     &lt;enumeration value="Premium BRAM Transparency"/&gt;
 *     &lt;enumeration value="Price Uncertainty"/&gt;
 *     &lt;enumeration value="Not Downloadable"/&gt;
 *     &lt;enumeration value="Central Bank Eligibility"/&gt;
 *     &lt;enumeration value="Covered Funds"/&gt;
 *     &lt;enumeration value="High Quality Liquid Assets"/&gt;
 *     &lt;enumeration value="Liquidity Assessment"/&gt;
 *     &lt;enumeration value="MiFIR"/&gt;
 *     &lt;enumeration value="Default Risk"/&gt;
 *     &lt;enumeration value="IFRS 9 SPPI"/&gt;
 *     &lt;enumeration value="Collateral Tagging"/&gt;
 *     &lt;enumeration value="US Withholding Tax"/&gt;
 *     &lt;enumeration value="Expected Credit Loss"/&gt;
 *     &lt;enumeration value="Basic Tax"/&gt;
 *     &lt;enumeration value="Investor Protection"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DLCategory2")
@XmlEnum
public enum DLCategory2 {

    @XmlEnumValue("Security Master")
    SECURITY_MASTER("Security Master"),
    @XmlEnumValue("Derived - Intraday")
    DERIVED_INTRADAY("Derived - Intraday"),
    @XmlEnumValue("Derived - End of Day")
    DERIVED_END_OF_DAY("Derived - End of Day"),
    @XmlEnumValue("Pricing - Intraday")
    PRICING_INTRADAY("Pricing - Intraday"),
    @XmlEnumValue("Pricing - End of Day")
    PRICING_END_OF_DAY("Pricing - End of Day"),
    @XmlEnumValue("User Entered Info.")
    USER_ENTERED_INFO("User Entered Info."),
    @XmlEnumValue("Corporate Actions")
    CORPORATE_ACTIONS("Corporate Actions"),
    @XmlEnumValue("Historical Time Series")
    HISTORICAL_TIME_SERIES("Historical Time Series"),
    @XmlEnumValue("Estimates")
    ESTIMATES("Estimates"),
    @XmlEnumValue("Fundamentals")
    FUNDAMENTALS("Fundamentals"),
    @XmlEnumValue("Quote Composite")
    QUOTE_COMPOSITE("Quote Composite"),
    @XmlEnumValue("Quote Composite History")
    QUOTE_COMPOSITE_HISTORY("Quote Composite History"),
    @XmlEnumValue("Credit Risk")
    CREDIT_RISK("Credit Risk"),
    @XmlEnumValue("Packaged")
    PACKAGED("Packaged"),
    @XmlEnumValue("Open Source")
    OPEN_SOURCE("Open Source"),
    @XmlEnumValue("Reg SSFA")
    REG_SSFA("Reg SSFA"),
    @XmlEnumValue("Volatility Surface")
    VOLATILITY_SURFACE("Volatility Surface"),
    @XmlEnumValue("Volatility Cube")
    VOLATILITY_CUBE("Volatility Cube"),
    @XmlEnumValue("Bram Fair Value Hierarchy Leveling Tool")
    BRAM_FAIR_VALUE_HIERARCHY_LEVELING_TOOL("Bram Fair Value Hierarchy Leveling Tool"),
    @XmlEnumValue("Credit Risk Corporate Structure")
    CREDIT_RISK_CORPORATE_STRUCTURE("Credit Risk Corporate Structure"),
    @XmlEnumValue("Credit Risk Capital Structure")
    CREDIT_RISK_CAPITAL_STRUCTURE("Credit Risk Capital Structure"),
    @XmlEnumValue("Credit Risk Regulatory Compliance")
    CREDIT_RISK_REGULATORY_COMPLIANCE("Credit Risk Regulatory Compliance"),
    @XmlEnumValue("Premium BRAM Transparency")
    PREMIUM_BRAM_TRANSPARENCY("Premium BRAM Transparency"),
    @XmlEnumValue("Price Uncertainty")
    PRICE_UNCERTAINTY("Price Uncertainty"),
    @XmlEnumValue("Not Downloadable")
    NOT_DOWNLOADABLE("Not Downloadable"),
    @XmlEnumValue("Central Bank Eligibility")
    CENTRAL_BANK_ELIGIBILITY("Central Bank Eligibility"),
    @XmlEnumValue("Covered Funds")
    COVERED_FUNDS("Covered Funds"),
    @XmlEnumValue("High Quality Liquid Assets")
    HIGH_QUALITY_LIQUID_ASSETS("High Quality Liquid Assets"),
    @XmlEnumValue("Liquidity Assessment")
    LIQUIDITY_ASSESSMENT("Liquidity Assessment"),
    @XmlEnumValue("MiFIR")
    MI_FIR("MiFIR"),
    @XmlEnumValue("Default Risk")
    DEFAULT_RISK("Default Risk"),
    @XmlEnumValue("IFRS 9 SPPI")
    IFRS_9_SPPI("IFRS 9 SPPI"),
    @XmlEnumValue("Collateral Tagging")
    COLLATERAL_TAGGING("Collateral Tagging"),
    @XmlEnumValue("US Withholding Tax")
    US_WITHHOLDING_TAX("US Withholding Tax"),
    @XmlEnumValue("Expected Credit Loss")
    EXPECTED_CREDIT_LOSS("Expected Credit Loss"),
    @XmlEnumValue("Basic Tax")
    BASIC_TAX("Basic Tax"),
    @XmlEnumValue("Investor Protection")
    INVESTOR_PROTECTION("Investor Protection");
    private final String value;

    DLCategory2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DLCategory2 fromValue(String v) {
        for (DLCategory2 c: DLCategory2.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
