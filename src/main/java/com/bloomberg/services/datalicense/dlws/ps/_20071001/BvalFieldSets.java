
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for BvalFieldSets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BvalFieldSets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fieldset" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}BvalFieldSet" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BvalFieldSets", propOrder = {
    "fieldset"
})
public class BvalFieldSets {

    @XmlElement(required = true)
    protected List<BvalFieldSet> fieldset;

    /**
     * Gets the value of the fieldset property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldset property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldset().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BvalFieldSet }
     *
     *
     */
    public List<BvalFieldSet> getFieldset() {
        if (fieldset == null) {
            fieldset = new ArrayList<BvalFieldSet>();
        }
        return this.fieldset;
    }

}
