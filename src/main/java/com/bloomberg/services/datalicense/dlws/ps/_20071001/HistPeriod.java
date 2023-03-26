
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistPeriod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HistPeriod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="daily"/&gt;
 *     &lt;enumeration value="weekly"/&gt;
 *     &lt;enumeration value="monthly"/&gt;
 *     &lt;enumeration value="quarterly"/&gt;
 *     &lt;enumeration value="yearly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HistPeriod")
@XmlEnum
public enum HistPeriod {

    @XmlEnumValue("daily")
    DAILY("daily"),
    @XmlEnumValue("weekly")
    WEEKLY("weekly"),
    @XmlEnumValue("monthly")
    MONTHLY("monthly"),
    @XmlEnumValue("quarterly")
    QUARTERLY("quarterly"),
    @XmlEnumValue("yearly")
    YEARLY("yearly");
    private final String value;

    HistPeriod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HistPeriod fromValue(String v) {
        for (HistPeriod c: HistPeriod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
