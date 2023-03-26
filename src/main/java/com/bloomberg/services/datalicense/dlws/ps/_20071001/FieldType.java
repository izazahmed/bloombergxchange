
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Character"/&gt;
 *     &lt;enumeration value="Numeric"/&gt;
 *     &lt;enumeration value="Price"/&gt;
 *     &lt;enumeration value="Security"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="Time"/&gt;
 *     &lt;enumeration value="Date/Time"/&gt;
 *     &lt;enumeration value="Bulk"/&gt;
 *     &lt;enumeration value="Month/Year"/&gt;
 *     &lt;enumeration value="Boolean"/&gt;
 *     &lt;enumeration value="Currency"/&gt;
 *     &lt;enumeration value="Integer"/&gt;
 *     &lt;enumeration value="Real"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FieldType")
@XmlEnum
public enum FieldType {

    @XmlEnumValue("Character")
    CHARACTER("Character"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("Price")
    PRICE("Price"),
    @XmlEnumValue("Security")
    SECURITY("Security"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("Date/Time")
    DATE_TIME("Date/Time"),
    @XmlEnumValue("Bulk")
    BULK("Bulk"),
    @XmlEnumValue("Month/Year")
    MONTH_YEAR("Month/Year"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("Real")
    REAL("Real");
    private final String value;

    FieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldType fromValue(String v) {
        for (FieldType c: FieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
