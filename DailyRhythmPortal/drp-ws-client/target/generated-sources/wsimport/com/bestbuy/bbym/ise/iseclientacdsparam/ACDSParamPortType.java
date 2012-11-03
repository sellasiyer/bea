
package com.bestbuy.bbym.ise.iseclientacdsparam;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * ACDS_Param Operations.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "ACDS_ParamPortType", targetNamespace = "http://www.tsh.bestbuy.com/bbym/logistics/shipping/acds_param/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ACDSParamPortType {


    /**
     * ACDS_Param Operation.
     * 
     * @param acdsParamRequest
     * @return
     *     returns com.bestbuy.bbym.ise.iseclientacdsparam.ParamResponseType
     * @throws ACDSParamFault
     */
    @WebMethod(operationName = "ACDS_Param", action = "/ACDS_Param")
    @WebResult(name = "ParamResponse", targetNamespace = "http://bestbuy.com/bbym/logistics/param/service/v1", partName = "ACDS_ParamResponse")
    public ParamResponseType acdsParam(
        @WebParam(name = "ParamRequest", targetNamespace = "http://bestbuy.com/bbym/logistics/param/service/v1", partName = "ACDS_ParamRequest")
        ParamRequestType acdsParamRequest)
        throws ACDSParamFault
    ;

}
