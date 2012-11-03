
package com.bestbuy.bbym.ise.iseclientucs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "UnknownFailureException", targetNamespace = "http://bestbuy.com/bbym/ucs")
public class UnknownFailureException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UnknownFailureException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public UnknownFailureException_Exception(String message, UnknownFailureException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public UnknownFailureException_Exception(String message, UnknownFailureException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.bestbuy.bbym.ise.iseclientucs.UnknownFailureException
     */
    public UnknownFailureException getFaultInfo() {
        return faultInfo;
    }

}
