
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DLCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DLCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Security Master"/&gt;
 *     &lt;enumeration value="Derived Data"/&gt;
 *     &lt;enumeration value="End of Day Pricing"/&gt;
 *     &lt;enumeration value="User Entered Info."/&gt;
 *     &lt;enumeration value="Corporate Actions"/&gt;
 *     &lt;enumeration value="Historical Time Series"/&gt;
 *     &lt;enumeration value="Estimates"/&gt;
 *     &lt;enumeration value="Fundamentals"/&gt;
 *     &lt;enumeration value="Quote Composite"/&gt;
 *     &lt;enumeration value="Credit Risk"/&gt;
 *     &lt;enumeration value="Reg SSFA"/&gt;
 *     &lt;enumeration value="Bram Fair Value Hierarchy Leveling Tool"/&gt;
 *     &lt;enumeration value="Premium BRAM Transparency"/&gt;
 *     &lt;enumeration value="Price Uncertainty"/&gt;
 *     &lt;enumeration value="Not Downloadable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DLCategory")
@XmlEnum
public enum DLCategory {

    @XmlEnumValue("Security Master")
    SECURITY_MASTER("Security Master"),
    @XmlEnumValue("Derived Data")
    DERIVED_DATA("Derived Data"),
    @XmlEnumValue("End of Day Pricing")
    END_OF_DAY_PRICING("End of Day Pricing"),
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
    @XmlEnumValue("Credit Risk")
    CREDIT_RISK("Credit Risk"),
    @XmlEnumValue("Reg SSFA")
    REG_SSFA("Reg SSFA"),
    @XmlEnumValue("Bram Fair Value Hierarchy Leveling Tool")
    BRAM_FAIR_VALUE_HIERARCHY_LEVELING_TOOL("Bram Fair Value Hierarchy Leveling Tool"),
    @XmlEnumValue("Premium BRAM Transparency")
    PREMIUM_BRAM_TRANSPARENCY("Premium BRAM Transparency"),
    @XmlEnumValue("Price Uncertainty")
    PRICE_UNCERTAINTY("Price Uncertainty"),
    @XmlEnumValue("Not Downloadable")
    NOT_DOWNLOADABLE("Not Downloadable");
    private final String value;

    DLCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DLCategory fromValue(String v) {
        for (DLCategory c: DLCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
