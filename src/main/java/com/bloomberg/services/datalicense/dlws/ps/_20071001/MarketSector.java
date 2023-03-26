
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketSector.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketSector"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Govt"/&gt;
 *     &lt;enumeration value="Corp"/&gt;
 *     &lt;enumeration value="Mtge"/&gt;
 *     &lt;enumeration value="M-Mkt"/&gt;
 *     &lt;enumeration value="Muni"/&gt;
 *     &lt;enumeration value="Pfd"/&gt;
 *     &lt;enumeration value="Equity"/&gt;
 *     &lt;enumeration value="Comdty"/&gt;
 *     &lt;enumeration value="Index"/&gt;
 *     &lt;enumeration value="Curncy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketSector")
@XmlEnum
public enum MarketSector {

    @XmlEnumValue("Govt")
    GOVT("Govt"),
    @XmlEnumValue("Corp")
    CORP("Corp"),
    @XmlEnumValue("Mtge")
    MTGE("Mtge"),
    @XmlEnumValue("M-Mkt")
    M_MKT("M-Mkt"),
    @XmlEnumValue("Muni")
    MUNI("Muni"),
    @XmlEnumValue("Pfd")
    PFD("Pfd"),
    @XmlEnumValue("Equity")
    EQUITY("Equity"),
    @XmlEnumValue("Comdty")
    COMDTY("Comdty"),
    @XmlEnumValue("Index")
    INDEX("Index"),
    @XmlEnumValue("Curncy")
    CURNCY("Curncy");
    private final String value;

    MarketSector(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarketSector fromValue(String v) {
        for (MarketSector c: MarketSector.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
