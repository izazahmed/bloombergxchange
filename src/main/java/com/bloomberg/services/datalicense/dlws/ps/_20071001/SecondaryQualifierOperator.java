
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecondaryQualifierOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecondaryQualifierOperator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Equals"/&gt;
 *     &lt;enumeration value="NotEquals"/&gt;
 *     &lt;enumeration value="GreaterThan"/&gt;
 *     &lt;enumeration value="LessThan"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecondaryQualifierOperator")
@XmlEnum
public enum SecondaryQualifierOperator {

    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("NotEquals")
    NOT_EQUALS("NotEquals"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan");
    private final String value;

    SecondaryQualifierOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecondaryQualifierOperator fromValue(String v) {
        for (SecondaryQualifierOperator c: SecondaryQualifierOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
