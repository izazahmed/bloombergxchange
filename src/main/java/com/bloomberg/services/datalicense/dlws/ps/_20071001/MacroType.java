
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MacroType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MacroType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOND_SRCH"/&gt;
 *     &lt;enumeration value="EQUITY_SRCH"/&gt;
 *     &lt;enumeration value="EXCH"/&gt;
 *     &lt;enumeration value="INDEX"/&gt;
 *     &lt;enumeration value="PFD_SRCH"/&gt;
 *     &lt;enumeration value="PORTFOLIO"/&gt;
 *     &lt;enumeration value="SECTYP"/&gt;
 *     &lt;enumeration value="BSRCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MacroType")
@XmlEnum
public enum MacroType {

    BOND_SRCH,
    EQUITY_SRCH,
    EXCH,
    INDEX,
    PFD_SRCH,
    PORTFOLIO,
    SECTYP,
    BSRCH;

    public String value() {
        return name();
    }

    public static MacroType fromValue(String v) {
        return valueOf(v);
    }

}
