
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecondaryQualifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecondaryQualifierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE_PRICING"/&gt;
 *     &lt;enumeration value="COUNTRY"/&gt;
 *     &lt;enumeration value="CPN_TYP"/&gt;
 *     &lt;enumeration value="CRNCY"/&gt;
 *     &lt;enumeration value="EXCH_TRADED"/&gt;
 *     &lt;enumeration value="MATURED"/&gt;
 *     &lt;enumeration value="NET_CPN"/&gt;
 *     &lt;enumeration value="RATE"/&gt;
 *     &lt;enumeration value="RATING"/&gt;
 *     &lt;enumeration value="SECURITY_DES"/&gt;
 *     &lt;enumeration value="SECURITY_TYP"/&gt;
 *     &lt;enumeration value="SERIES"/&gt;
 *     &lt;enumeration value="TICKER"/&gt;
 *     &lt;enumeration value="WAC"/&gt;
 *     &lt;enumeration value="WALA"/&gt;
 *     &lt;enumeration value="WAM"/&gt;
 *     &lt;enumeration value="BVAL_OTC_FREQUENCY"/&gt;
 *     &lt;enumeration value="BVAL_OTC_EXPIRED"/&gt;
 *     &lt;enumeration value="BVAL_OTC_ASSET"/&gt;
 *     &lt;enumeration value="BVAL_OTC_SNAPSHOT"/&gt;
 *     &lt;enumeration value="BVAL_OTC_UNWOUND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecondaryQualifierType")
@XmlEnum
public enum SecondaryQualifierType {

    ACTIVE_PRICING,
    COUNTRY,
    CPN_TYP,
    CRNCY,
    EXCH_TRADED,
    MATURED,
    NET_CPN,
    RATE,
    RATING,
    SECURITY_DES,
    SECURITY_TYP,
    SERIES,
    TICKER,
    WAC,
    WALA,
    WAM,
    BVAL_OTC_FREQUENCY,
    BVAL_OTC_EXPIRED,
    BVAL_OTC_ASSET,
    BVAL_OTC_SNAPSHOT,
    BVAL_OTC_UNWOUND;

    public String value() {
        return name();
    }

    public static SecondaryQualifierType fromValue(String v) {
        return valueOf(v);
    }

}
