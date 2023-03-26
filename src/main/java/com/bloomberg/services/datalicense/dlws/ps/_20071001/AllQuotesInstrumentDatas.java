
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for AllQuotesInstrumentDatas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllQuotesInstrumentDatas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="instrumentData" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}AllQuotesInstrumentData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllQuotesInstrumentDatas", propOrder = {
    "instrumentData"
})
public class AllQuotesInstrumentDatas {

    protected List<AllQuotesInstrumentData> instrumentData;

    /**
     * Gets the value of the instrumentData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrumentData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrumentData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllQuotesInstrumentData }
     *
     *
     */
    public List<AllQuotesInstrumentData> getInstrumentData() {
        if (instrumentData == null) {
            instrumentData = new ArrayList<AllQuotesInstrumentData>();
        }
        return this.instrumentData;
    }

}
