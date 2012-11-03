
package com.bestbuy.tsh.businessservices.proxy.tradeincheck;

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
@WebServiceClient(name = "TradeInCheckService.serviceagent", targetNamespace = "http://www.tsh.bestbuy.com/BusinessServices/Proxy/TradeInCheck", wsdlLocation = "file:/C:/EclipseVirtualImage/Juno/workspace/DailyRhythmPortal/drp-ws-client/src/main/resources/wsdl/TradabilityCheck/TradeInCheckService.wsdl")
public class TradeInCheckServiceServiceagent
    extends Service
{

    private final static URL TRADEINCHECKSERVICESERVICEAGENT_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.bestbuy.tsh.businessservices.proxy.tradeincheck.TradeInCheckServiceServiceagent.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.bestbuy.tsh.businessservices.proxy.tradeincheck.TradeInCheckServiceServiceagent.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/EclipseVirtualImage/Juno/workspace/DailyRhythmPortal/drp-ws-client/src/main/resources/wsdl/TradabilityCheck/TradeInCheckService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/EclipseVirtualImage/Juno/workspace/DailyRhythmPortal/drp-ws-client/src/main/resources/wsdl/TradabilityCheck/TradeInCheckService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        TRADEINCHECKSERVICESERVICEAGENT_WSDL_LOCATION = url;
    }

    public TradeInCheckServiceServiceagent(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TradeInCheckServiceServiceagent() {
        super(TRADEINCHECKSERVICESERVICEAGENT_WSDL_LOCATION, new QName("http://www.tsh.bestbuy.com/BusinessServices/Proxy/TradeInCheck", "TradeInCheckService.serviceagent"));
    }

    /**
     * 
     * @return
     *     returns TransactionCheckServicePortType
     */
    @WebEndpoint(name = "TransactionCheckServicePortTypeEndpoint1")
    public TransactionCheckServicePortType getTransactionCheckServicePortTypeEndpoint1() {
        return super.getPort(new QName("http://www.tsh.bestbuy.com/BusinessServices/Proxy/TradeInCheck", "TransactionCheckServicePortTypeEndpoint1"), TransactionCheckServicePortType.class);
    }

}