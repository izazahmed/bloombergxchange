
package com.bloomberg.services.datalicense.dlws.ps._20071001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ScheduledResponses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduledResponses"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileData" type="{http://services.bloomberg.com/datalicense/dlws/ps/20071001}ScheduledResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledResponses", propOrder = {
    "fileData"
})
public class ScheduledResponses {

    protected List<ScheduledResponse> fileData;

    /**
     * Gets the value of the fileData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduledResponse }
     *
     *
     */
    public List<ScheduledResponse> getFileData() {
        if (fileData == null) {
            fileData = new ArrayList<ScheduledResponse>();
        }
        return this.fileData;
    }

}
