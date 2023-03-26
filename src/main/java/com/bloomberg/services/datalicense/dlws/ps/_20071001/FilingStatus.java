
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilingStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FilingStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="mostrecent"/&gt;
 *     &lt;enumeration value="prelim"/&gt;
 *     &lt;enumeration value="original"/&gt;
 *     &lt;enumeration value="restated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FilingStatus")
@XmlEnum
public enum FilingStatus {

    @XmlEnumValue("mostrecent")
    MOSTRECENT("mostrecent"),
    @XmlEnumValue("prelim")
    PRELIM("prelim"),
    @XmlEnumValue("original")
    ORIGINAL("original"),
    @XmlEnumValue("restated")
    RESTATED("restated");
    private final String value;

    FilingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FilingStatus fromValue(String v) {
        for (FilingStatus c: FilingStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
