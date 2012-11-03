
package com.bestbuy.bbym.ise.iseclientca;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "CustomerAccountServicesPortType", targetNamespace = "http://webservices.bestbuy.com/ca/services/v2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerAccountServicesPortType {


    /**
     * 
     * @param manageAccountRequest
     * @param security
     * @return
     *     returns com.bestbuy.bbym.ise.iseclientca.ManageAccountResponseType
     */
    @WebMethod(action = "http://webservices.bestbuy.com/ca/orchestratedservices/manageAccount")
    @WebResult(name = "ManageAccountResponse", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "manageAccountResponse")
    public ManageAccountResponseType manageAccount(
        @WebParam(name = "ManageAccountRequest", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "manageAccountRequest")
        ManageAccountRequestType manageAccountRequest,
        @WebParam(name = "Security", targetNamespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", header = true, partName = "Security")
        Security security);

    /**
     * 
     * @param security
     * @param matchPartyRequest
     * @return
     *     returns com.bestbuy.bbym.ise.iseclientca.MatchPartyResponseType
     */
    @WebMethod(action = "http://webservices.bestbuy.com/ca/orchestratedservices/matchParty")
    @WebResult(name = "MatchPartyResponse", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "matchPartyResponse")
    public MatchPartyResponseType matchAndVerifyParty(
        @WebParam(name = "MatchPartyRequest", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "matchPartyRequest")
        MatchPartyRequestType matchPartyRequest,
        @WebParam(name = "Security", targetNamespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", header = true, partName = "Security")
        Security security);

    /**
     * 
     * @param searchCustomerRequest
     * @param security
     * @return
     *     returns com.bestbuy.bbym.ise.iseclientca.SearchCustomerResponseType
     */
    @WebMethod(action = "http://webservices.bestbuy.com/ca/orchestratedservices/searchParty")
    @WebResult(name = "SearchCustomerResponse", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "searchCustomerResponse")
    public SearchCustomerResponseType searchCustomer(
        @WebParam(name = "SearchCustomerRequest", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "searchCustomerRequest")
        SearchCustomerRequestType searchCustomerRequest,
        @WebParam(name = "Security", targetNamespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", header = true, partName = "Security")
        Security security);

    /**
     * 
     * @param cleanseCustomerDataRequest
     * @param security
     * @return
     *     returns com.bestbuy.bbym.ise.iseclientca.CleanseCustomerDataResponseType
     */
    @WebMethod(action = "http://webservices.bestbuy.com/ca/services/cleanseCustomerData")
    @WebResult(name = "CleanseCustomerDataResponse", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "cleanseCustomerDataResponse")
    public CleanseCustomerDataResponseType cleanseCustomerData(
        @WebParam(name = "CleanseCustomerDataRequest", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "cleanseCustomerDataRequest")
        CleanseCustomerDataRequestType cleanseCustomerDataRequest,
        @WebParam(name = "Security", targetNamespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", header = true, partName = "Security")
        Security security);

    /**
     * 
     * @param security
     * @param transferAccountRequest
     * @return
     *     returns com.bestbuy.bbym.ise.iseclientca.TransferAccountResponseType
     */
    @WebMethod(action = "http://webservices.bestbuy.com/ca/services/transferAccount")
    @WebResult(name = "TransferAccountResponse", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "transferAccountResponse")
    public TransferAccountResponseType transferAccount(
        @WebParam(name = "TransferAccountRequest", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "transferAccountRequest")
        TransferAccountRequestType transferAccountRequest,
        @WebParam(name = "Security", targetNamespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", header = true, partName = "Security")
        Security security);

    /**
     * 
     * @param consolidatePartyRequest
     * @param security
     * @return
     *     returns com.bestbuy.bbym.ise.iseclientca.ConsolidatePartyResponseType
     */
    @WebMethod(action = "http://webservices.bestbuy.com/ca/services/consolidateParty")
    @WebResult(name = "ConsolidatePartyResponse", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "consolidatePartyResponse")
    public ConsolidatePartyResponseType consolidateParty(
        @WebParam(name = "ConsolidatePartyRequest", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "consolidatePartyRequest")
        ConsolidatePartyRequestType consolidatePartyRequest,
        @WebParam(name = "Security", targetNamespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", header = true, partName = "Security")
        Security security);

    /**
     * 
     * @param manageSubAccountAttributesRequest
     * @param security
     * @return
     *     returns com.bestbuy.bbym.ise.iseclientca.ManageSubAccountAttributesResponseType
     */
    @WebMethod(action = "http://webservices.bestbuy.com/ca/services/manageSubAccountAttributes")
    @WebResult(name = "ManageSubAccountAttributesResponse", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "mangeSubAccountAttributesResponse")
    public ManageSubAccountAttributesResponseType manageSubAccountAttributes(
        @WebParam(name = "ManageSubAccountAttributesRequest", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "manageSubAccountAttributesRequest")
        ManageSubAccountAttributesRequestType manageSubAccountAttributesRequest,
        @WebParam(name = "Security", targetNamespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", header = true, partName = "Security")
        Security security);

    /**
     * 
     * @param getSubAccountAttributesRequest
     * @param security
     * @return
     *     returns com.bestbuy.bbym.ise.iseclientca.GetSubAccountAttributesResponseType
     */
    @WebMethod(action = "http://webservices.bestbuy.com/ca/services/getSubAccountAttributes")
    @WebResult(name = "GetSubAccountAttributesResponse", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "getSubAccountAttributesResponse")
    public GetSubAccountAttributesResponseType getSubAccountAttributes(
        @WebParam(name = "GetSubAccountAttributesRequest", targetNamespace = "http://webservices.bestbuy.com/ca/services/entity/v2", partName = "getSubAccountAttributesRequest")
        GetSubAccountAttributesRequestType getSubAccountAttributesRequest,
        @WebParam(name = "Security", targetNamespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", header = true, partName = "Security")
        Security security);

}
