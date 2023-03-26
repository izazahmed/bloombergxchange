
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for MmktBvalDealInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MmktBvalDealInfos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deal" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}MmktBvalDealInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MmktBvalDealInfos", propOrder = {
    "deal"
})
public class MmktBvalDealInfos {

    protected List<MmktBvalDealInformation> deal;

    /**
     * Gets the value of the deal property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deal property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeal().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MmktBvalDealInformation }
     *
     *
     */
    public List<MmktBvalDealInformation> getDeal() {
        if (deal == null) {
            deal = new ArrayList<MmktBvalDealInformation>();
        }
        return this.deal;
    }

}
