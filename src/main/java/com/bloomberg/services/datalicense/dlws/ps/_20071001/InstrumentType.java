
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstrumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstrumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUSTRIAN"/&gt;
 *     &lt;enumeration value="BB_UNIQUE"/&gt;
 *     &lt;enumeration value="BB_GLOBAL"/&gt;
 *     &lt;enumeration value="BELGIAN"/&gt;
 *     &lt;enumeration value="CATS"/&gt;
 *     &lt;enumeration value="CEDEL"/&gt;
 *     &lt;enumeration value="CINS"/&gt;
 *     &lt;enumeration value="COMMON_NUMBER"/&gt;
 *     &lt;enumeration value="CUSIP"/&gt;
 *     &lt;enumeration value="CZECH"/&gt;
 *     &lt;enumeration value="DUTCH"/&gt;
 *     &lt;enumeration value="EUROCLEAR"/&gt;
 *     &lt;enumeration value="FRENCH"/&gt;
 *     &lt;enumeration value="IRISH"/&gt;
 *     &lt;enumeration value="ISIN"/&gt;
 *     &lt;enumeration value="ISRAELI"/&gt;
 *     &lt;enumeration value="ITALY"/&gt;
 *     &lt;enumeration value="JAPAN"/&gt;
 *     &lt;enumeration value="LUXEMBOURG"/&gt;
 *     &lt;enumeration value="SEDOL"/&gt;
 *     &lt;enumeration value="SPAIN"/&gt;
 *     &lt;enumeration value="TICKER"/&gt;
 *     &lt;enumeration value="VALOREN"/&gt;
 *     &lt;enumeration value="WPK"/&gt;
 *     &lt;enumeration value="BB_COMPANY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstrumentType")
@XmlEnum
public enum InstrumentType {

    AUSTRIAN,
    BB_UNIQUE,
    BB_GLOBAL,
    BELGIAN,
    CATS,
    CEDEL,
    CINS,
    COMMON_NUMBER,
    CUSIP,
    CZECH,
    DUTCH,
    EUROCLEAR,
    FRENCH,
    IRISH,
    ISIN,
    ISRAELI,
    ITALY,
    JAPAN,
    LUXEMBOURG,
    SEDOL,
    SPAIN,
    TICKER,
    VALOREN,
    WPK,
    BB_COMPANY;

    public String value() {
        return name();
    }

    public static InstrumentType fromValue(String v) {
        return valueOf(v);
    }

}
