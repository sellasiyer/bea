
package com.bestbuy.tsh.facilities.location.retrievelocationsservice.v2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "RetrieveLocationsService.serviceagent", targetNamespace = "http://tsh.bestbuy.com/facilities/location/retrievelocationsservice/v2", wsdlLocation = "file:/C:/EclipseVirtualImage/Juno/workspace/DailyRhythmPortal/drp-ws-client/src/main/resources/wsdl/TSH_Location/RetrieveLocationServiceSoap.wsdl")
public class RetrieveLocationsServiceServiceagent
    extends Service
{

    private final static URL RETRIEVELOCATIONSSERVICESERVICEAGENT_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.bestbuy.tsh.facilities.location.retrievelocationsservice.v2.RetrieveLocationsServiceServiceagent.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.bestbuy.tsh.facilities.location.retrievelocationsservice.v2.RetrieveLocationsServiceServiceagent.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/EclipseVirtualImage/Juno/workspace/DailyRhythmPortal/drp-ws-client/src/main/resources/wsdl/TSH_Location/RetrieveLocationServiceSoap.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/EclipseVirtualImage/Juno/workspace/DailyRhythmPortal/drp-ws-client/src/main/resources/wsdl/TSH_Location/RetrieveLocationServiceSoap.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        RETRIEVELOCATIONSSERVICESERVICEAGENT_WSDL_LOCATION = url;
    }

    public RetrieveLocationsServiceServiceagent(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RetrieveLocationsServiceServiceagent() {
        super(RETRIEVELOCATIONSSERVICESERVICEAGENT_WSDL_LOCATION, new QName("http://tsh.bestbuy.com/facilities/location/retrievelocationsservice/v2", "RetrieveLocationsService.serviceagent"));
    }

    /**
     * 
     * @return
     *     returns RetrieveLocationsPortType
     */
    @WebEndpoint(name = "RetrieveLocationsPortType")
    public RetrieveLocationsPortType getRetrieveLocationsPortType() {
        return super.getPort(new QName("http://tsh.bestbuy.com/facilities/location/retrievelocationsservice/v2", "RetrieveLocationsPortType"), RetrieveLocationsPortType.class);
    }

}
