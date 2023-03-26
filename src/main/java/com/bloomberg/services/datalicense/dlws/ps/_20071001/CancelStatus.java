
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="NOT FOUND"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancelStatus")
@XmlEnum
public enum CancelStatus {

    ERROR("ERROR"),
    @XmlEnumValue("NOT FOUND")
    NOT_FOUND("NOT FOUND"),
    CANCELLED("CANCELLED");
    private final String value;

    CancelStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CancelStatus fromValue(String v) {
        for (CancelStatus c: CancelStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
