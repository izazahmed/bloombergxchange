
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegSolvency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegSolvency"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="no"/&gt;
 *     &lt;enumeration value="packaged"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegSolvency")
@XmlEnum
public enum RegSolvency {

    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("packaged")
    PACKAGED("packaged");
    private final String value;

    RegSolvency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegSolvency fromValue(String v) {
        for (RegSolvency c: RegSolvency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
