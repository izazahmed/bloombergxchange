
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for CorrectionRecords complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrectionRecords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="correctionRecord" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}CorrectionRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectionRecords", propOrder = {
    "correctionRecord"
})
public class CorrectionRecords {

    protected List<CorrectionRecord> correctionRecord;

    /**
     * Gets the value of the correctionRecord property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctionRecord property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectionRecord().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectionRecord }
     *
     *
     */
    public List<CorrectionRecord> getCorrectionRecord() {
        if (correctionRecord == null) {
            correctionRecord = new ArrayList<CorrectionRecord>();
        }
        return this.correctionRecord;
    }

}
