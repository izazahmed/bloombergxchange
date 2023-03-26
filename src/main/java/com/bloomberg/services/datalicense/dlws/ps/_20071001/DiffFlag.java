
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiffFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiffFlag"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="yes"/&gt;
 *     &lt;enumeration value="no"/&gt;
 *     &lt;enumeration value="changes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DiffFlag")
@XmlEnum
public enum DiffFlag {

    @XmlEnumValue("yes")
    YES("yes"),
    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("changes")
    CHANGES("changes");
    private final String value;

    DiffFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiffFlag fromValue(String v) {
        for (DiffFlag c: DiffFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
