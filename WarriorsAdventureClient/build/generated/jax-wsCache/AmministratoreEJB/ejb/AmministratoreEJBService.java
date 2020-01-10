
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
@WebServiceClient(name = "AmministratoreEJBService", targetNamespace = "http://EJB/", wsdlLocation = "http://localhost:8080/AmministratoreEJBService/AmministratoreEJB?wsdl")
public class AmministratoreEJBService
    extends Service
{

    private final static URL AMMINISTRATOREEJBSERVICE_WSDL_LOCATION;
    private final static WebServiceException AMMINISTRATOREEJBSERVICE_EXCEPTION;
    private final static QName AMMINISTRATOREEJBSERVICE_QNAME = new QName("http://EJB/", "AmministratoreEJBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/AmministratoreEJBService/AmministratoreEJB?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AMMINISTRATOREEJBSERVICE_WSDL_LOCATION = url;
        AMMINISTRATOREEJBSERVICE_EXCEPTION = e;
    }

    public AmministratoreEJBService() {
        super(__getWsdlLocation(), AMMINISTRATOREEJBSERVICE_QNAME);
    }

    public AmministratoreEJBService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AMMINISTRATOREEJBSERVICE_QNAME, features);
    }

    public AmministratoreEJBService(URL wsdlLocation) {
        super(wsdlLocation, AMMINISTRATOREEJBSERVICE_QNAME);
    }

    public AmministratoreEJBService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AMMINISTRATOREEJBSERVICE_QNAME, features);
    }

    public AmministratoreEJBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AmministratoreEJBService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AmministratoreEJB
     */
    @WebEndpoint(name = "AmministratoreEJBPort")
    public AmministratoreEJB getAmministratoreEJBPort() {
        return super.getPort(new QName("http://EJB/", "AmministratoreEJBPort"), AmministratoreEJB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AmministratoreEJB
     */
    @WebEndpoint(name = "AmministratoreEJBPort")
    public AmministratoreEJB getAmministratoreEJBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://EJB/", "AmministratoreEJBPort"), AmministratoreEJB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AMMINISTRATOREEJBSERVICE_EXCEPTION!= null) {
            throw AMMINISTRATOREEJBSERVICE_EXCEPTION;
        }
        return AMMINISTRATOREEJBSERVICE_WSDL_LOCATION;
    }

}