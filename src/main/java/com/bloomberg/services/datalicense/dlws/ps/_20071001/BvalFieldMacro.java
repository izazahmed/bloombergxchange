
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BvalFieldMacro.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BvalFieldMacro"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BVAL_ALL"/&gt;
 *     &lt;enumeration value="BVAL_BOND"/&gt;
 *     &lt;enumeration value="BVAL_MTGE"/&gt;
 *     &lt;enumeration value="BVAL_MUNI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BvalFieldMacro")
@XmlEnum
public enum BvalFieldMacro {

    BVAL_ALL,
    BVAL_BOND,
    BVAL_MTGE,
    BVAL_MUNI;

    public String value() {
        return name();
    }

    public static BvalFieldMacro fromValue(String v) {
        return valueOf(v);
    }

}
