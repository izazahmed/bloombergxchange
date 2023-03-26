
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="mmddyy"/&gt;
 *     &lt;enumeration value="yyddmm"/&gt;
 *     &lt;enumeration value="mmyydd"/&gt;
 *     &lt;enumeration value="ddmmyy"/&gt;
 *     &lt;enumeration value="yyyyddmm"/&gt;
 *     &lt;enumeration value="mmyyyydd"/&gt;
 *     &lt;enumeration value="yyyymmdd"/&gt;
 *     &lt;enumeration value="yymmdd"/&gt;
 *     &lt;enumeration value="ddyymm"/&gt;
 *     &lt;enumeration value="mmddyyyy"/&gt;
 *     &lt;enumeration value="yyyy/mm/dd"/&gt;
 *     &lt;enumeration value="ddyyyymm"/&gt;
 *     &lt;enumeration value="dd-mmm-yy"/&gt;
 *     &lt;enumeration value="ddmmyyyy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateFormat")
@XmlEnum
public enum DateFormat {

    @XmlEnumValue("mmddyy")
    MMDDYY("mmddyy"),
    @XmlEnumValue("yyddmm")
    YYDDMM("yyddmm"),
    @XmlEnumValue("mmyydd")
    MMYYDD("mmyydd"),
    @XmlEnumValue("ddmmyy")
    DDMMYY("ddmmyy"),
    @XmlEnumValue("yyyyddmm")
    YYYYDDMM("yyyyddmm"),
    @XmlEnumValue("mmyyyydd")
    MMYYYYDD("mmyyyydd"),
    @XmlEnumValue("yyyymmdd")
    YYYYMMDD("yyyymmdd"),
    @XmlEnumValue("yymmdd")
    YYMMDD("yymmdd"),
    @XmlEnumValue("ddyymm")
    DDYYMM("ddyymm"),
    @XmlEnumValue("mmddyyyy")
    MMDDYYYY("mmddyyyy"),
    @XmlEnumValue("yyyy/mm/dd")
    YYYY_MM_DD("yyyy/mm/dd"),
    @XmlEnumValue("ddyyyymm")
    DDYYYYMM("ddyyyymm"),
    @XmlEnumValue("dd-mmm-yy")
    DD_MMM_YY("dd-mmm-yy"),
    @XmlEnumValue("ddmmyyyy")
    DDMMYYYY("ddmmyyyy");
    private final String value;

    DateFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateFormat fromValue(String v) {
        for (DateFormat c: DateFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
