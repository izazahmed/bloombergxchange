
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgramFlag.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgramFlag"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="oneshot"/&gt;
 *     &lt;enumeration value="daily"/&gt;
 *     &lt;enumeration value="weekly"/&gt;
 *     &lt;enumeration value="monthly"/&gt;
 *     &lt;enumeration value="weekday"/&gt;
 *     &lt;enumeration value="weekend"/&gt;
 *     &lt;enumeration value="adhoc"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProgramFlag")
@XmlEnum
public enum ProgramFlag {

    @XmlEnumValue("oneshot")
    ONESHOT("oneshot"),
    @XmlEnumValue("daily")
    DAILY("daily"),
    @XmlEnumValue("weekly")
    WEEKLY("weekly"),
    @XmlEnumValue("monthly")
    MONTHLY("monthly"),
    @XmlEnumValue("weekday")
    WEEKDAY("weekday"),
    @XmlEnumValue("weekend")
    WEEKEND("weekend"),
    @XmlEnumValue("adhoc")
    ADHOC("adhoc");
    private final String value;

    ProgramFlag(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProgramFlag fromValue(String v) {
        for (ProgramFlag c: ProgramFlag.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
