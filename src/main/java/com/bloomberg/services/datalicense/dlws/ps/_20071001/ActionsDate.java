
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionsDate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionsDate"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="entry"/&gt;
 *     &lt;enumeration value="effective"/&gt;
 *     &lt;enumeration value="both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionsDate")
@XmlEnum
public enum ActionsDate {

    @XmlEnumValue("entry")
    ENTRY("entry"),
    @XmlEnumValue("effective")
    EFFECTIVE("effective"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    ActionsDate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionsDate fromValue(String v) {
        for (ActionsDate c: ActionsDate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
