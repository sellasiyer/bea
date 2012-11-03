
package com.bestbuy.bbym.ise.iseclientca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneIdListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneIdListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhoneId" type="{http://webservices.bestbuy.com/ca/services/entity/v2}IdType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CleanseActionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneIdListType", propOrder = {
    "phoneId"
})
public class PhoneIdListType {

    @XmlElement(name = "PhoneId")
    protected List<String> phoneId;
    @XmlAttribute(name = "CleanseActionIndicator")
    protected String cleanseActionIndicator;

    /**
     * Gets the value of the phoneId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPhoneId() {
        if (phoneId == null) {
            phoneId = new ArrayList<String>();
        }
        return this.phoneId;
    }

    /**
     * Gets the value of the cleanseActionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCleanseActionIndicator() {
        return cleanseActionIndicator;
    }

    /**
     * Sets the value of the cleanseActionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCleanseActionIndicator(String value) {
        this.cleanseActionIndicator = value;
    }

}
