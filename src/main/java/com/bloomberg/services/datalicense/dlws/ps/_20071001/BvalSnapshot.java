
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BvalSnapshot.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BvalSnapshot"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ny4pm"/&gt;
 *     &lt;enumeration value="lo4pm"/&gt;
 *     &lt;enumeration value="to4pm"/&gt;
 *     &lt;enumeration value="ny3pm"/&gt;
 *     &lt;enumeration value="lo3pm"/&gt;
 *     &lt;enumeration value="to3pm"/&gt;
 *     &lt;enumeration value="lo12pm"/&gt;
 *     &lt;enumeration value="to5pm"/&gt;
 *     &lt;enumeration value="sy5pm"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BvalSnapshot")
@XmlEnum
public enum BvalSnapshot {

    @XmlEnumValue("ny4pm")
    NY_4_PM("ny4pm"),
    @XmlEnumValue("lo4pm")
    LO_4_PM("lo4pm"),
    @XmlEnumValue("to4pm")
    TO_4_PM("to4pm"),
    @XmlEnumValue("ny3pm")
    NY_3_PM("ny3pm"),
    @XmlEnumValue("lo3pm")
    LO_3_PM("lo3pm"),
    @XmlEnumValue("to3pm")
    TO_3_PM("to3pm"),
    @XmlEnumValue("lo12pm")
    LO_12_PM("lo12pm"),
    @XmlEnumValue("to5pm")
    TO_5_PM("to5pm"),
    @XmlEnumValue("sy5pm")
    SY_5_PM("sy5pm");
    private final String value;

    BvalSnapshot(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BvalSnapshot fromValue(String v) {
        for (BvalSnapshot c: BvalSnapshot.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
