
package com.bestbuy.bbym.ise.iseclientacdsshipping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines content for requesting a shipment.
 * 
 * <p>Java class for ShippingRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestMetaData" type="{http://www.tsh.bestbuy.com/common/metadata/components/v2}RequestMetaDataType" minOccurs="0"/>
 *         &lt;element name="InternationBusinessHierarchy" type="{http://www.tsh.bestbuy.com/common/metadata/components/v2}InternationalBusinessHierarchyType" minOccurs="0"/>
 *         &lt;element name="ShipRequest" type="{http://bestbuy.com/bbym/logistics/shipping/fields/v1}ShipRequestType"/>
 *         &lt;element ref="{http://www.tsh.bestbuy.com/common/v1}UserArea" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingRequestType", namespace = "http://bestbuy.com/bbym/logistics/shipping/service/v1", propOrder = {
    "requestMetaData",
    "internationBusinessHierarchy",
    "shipRequest",
    "userArea"
})
public class ShippingRequestType {

    @XmlElement(name = "RequestMetaData")
    protected RequestMetaDataType requestMetaData;
    @XmlElement(name = "InternationBusinessHierarchy")
    protected InternationalBusinessHierarchyType internationBusinessHierarchy;
    @XmlElement(name = "ShipRequest", required = true)
    protected ShipRequestType shipRequest;
    @XmlElement(name = "UserArea", namespace = "http://www.tsh.bestbuy.com/common/v1")
    protected UserAreaType userArea;

    /**
     * Gets the value of the requestMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMetaDataType }
     *     
     */
    public RequestMetaDataType getRequestMetaData() {
        return requestMetaData;
    }

    /**
     * Sets the value of the requestMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMetaDataType }
     *     
     */
    public void setRequestMetaData(RequestMetaDataType value) {
        this.requestMetaData = value;
    }

    /**
     * Gets the value of the internationBusinessHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalBusinessHierarchyType }
     *     
     */
    public InternationalBusinessHierarchyType getInternationBusinessHierarchy() {
        return internationBusinessHierarchy;
    }

    /**
     * Sets the value of the internationBusinessHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalBusinessHierarchyType }
     *     
     */
    public void setInternationBusinessHierarchy(InternationalBusinessHierarchyType value) {
        this.internationBusinessHierarchy = value;
    }

    /**
     * Gets the value of the shipRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ShipRequestType }
     *     
     */
    public ShipRequestType getShipRequest() {
        return shipRequest;
    }

    /**
     * Sets the value of the shipRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipRequestType }
     *     
     */
    public void setShipRequest(ShipRequestType value) {
        this.shipRequest = value;
    }

    /**
     * Allows the Tag Super Highway schema data model to extend the specification in order to provide additional information that is not captured in Canonical Schema.
     * 
     * @return
     *     possible object is
     *     {@link UserAreaType }
     *     
     */
    public UserAreaType getUserArea() {
        return userArea;
    }

    /**
     * Sets the value of the userArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAreaType }
     *     
     */
    public void setUserArea(UserAreaType value) {
        this.userArea = value;
    }

}
