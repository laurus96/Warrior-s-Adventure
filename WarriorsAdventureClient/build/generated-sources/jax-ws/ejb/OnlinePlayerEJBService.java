
package ejb;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OnlinePlayerEJBService", targetNamespace = "http://EJB/", wsdlLocation = "http://localhost:8080/OnlinePlayerEJBService/OnlinePlayerEJB?wsdl")
public class OnlinePlayerEJBService
    extends Service
{

    private final static URL ONLINEPLAYEREJBSERVICE_WSDL_LOCATION;
    private final static WebServiceException ONLINEPLAYEREJBSERVICE_EXCEPTION;
    private final static QName ONLINEPLAYEREJBSERVICE_QNAME = new QName("http://EJB/", "OnlinePlayerEJBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/OnlinePlayerEJBService/OnlinePlayerEJB?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ONLINEPLAYEREJBSERVICE_WSDL_LOCATION = url;
        ONLINEPLAYEREJBSERVICE_EXCEPTION = e;
    }

    public OnlinePlayerEJBService() {
        super(__getWsdlLocation(), ONLINEPLAYEREJBSERVICE_QNAME);
    }

    public OnlinePlayerEJBService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ONLINEPLAYEREJBSERVICE_QNAME, features);
    }

    public OnlinePlayerEJBService(URL wsdlLocation) {
        super(wsdlLocation, ONLINEPLAYEREJBSERVICE_QNAME);
    }

    public OnlinePlayerEJBService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ONLINEPLAYEREJBSERVICE_QNAME, features);
    }

    public OnlinePlayerEJBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OnlinePlayerEJBService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OnlinePlayerEJB
     */
    @WebEndpoint(name = "OnlinePlayerEJBPort")
    public OnlinePlayerEJB getOnlinePlayerEJBPort() {
        return super.getPort(new QName("http://EJB/", "OnlinePlayerEJBPort"), OnlinePlayerEJB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OnlinePlayerEJB
     */
    @WebEndpoint(name = "OnlinePlayerEJBPort")
    public OnlinePlayerEJB getOnlinePlayerEJBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://EJB/", "OnlinePlayerEJBPort"), OnlinePlayerEJB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ONLINEPLAYEREJBSERVICE_EXCEPTION!= null) {
            throw ONLINEPLAYEREJBSERVICE_EXCEPTION;
        }
        return ONLINEPLAYEREJBSERVICE_WSDL_LOCATION;
    }

}
