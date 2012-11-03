
package com.bestbuy.bbym.ise.iseclientucs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "BusinessCustomerException", targetNamespace = "http://bestbuy.com/bbym/ucs")
public class BusinessCustomerException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private BusinessCustomerException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public BusinessCustomerException_Exception(String message, BusinessCustomerException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public BusinessCustomerException_Exception(String message, BusinessCustomerException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.bestbuy.bbym.ise.iseclientucs.BusinessCustomerException
     */
    public BusinessCustomerException getFaultInfo() {
        return faultInfo;
    }

}
