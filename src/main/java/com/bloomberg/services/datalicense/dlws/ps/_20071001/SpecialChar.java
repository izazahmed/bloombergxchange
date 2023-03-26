
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialChar.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialChar"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fraction"/&gt;
 *     &lt;enumeration value="decimal"/&gt;
 *     &lt;enumeration value="altdecimal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialChar")
@XmlEnum
public enum SpecialChar {

    @XmlEnumValue("fraction")
    FRACTION("fraction"),
    @XmlEnumValue("decimal")
    DECIMAL("decimal"),
    @XmlEnumValue("altdecimal")
    ALTDECIMAL("altdecimal");
    private final String value;

    SpecialChar(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialChar fromValue(String v) {
        for (SpecialChar c: SpecialChar.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
