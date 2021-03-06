
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
@WebServiceClient(name = "CombatCommonEJBService", targetNamespace = "http://EJB/", wsdlLocation = "http://localhost:8080/CombatCommonEJBService/CombatCommonEJB?wsdl")
public class CombatCommonEJBService
    extends Service
{

    private final static URL COMBATCOMMONEJBSERVICE_WSDL_LOCATION;
    private final static WebServiceException COMBATCOMMONEJBSERVICE_EXCEPTION;
    private final static QName COMBATCOMMONEJBSERVICE_QNAME = new QName("http://EJB/", "CombatCommonEJBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CombatCommonEJBService/CombatCommonEJB?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMBATCOMMONEJBSERVICE_WSDL_LOCATION = url;
        COMBATCOMMONEJBSERVICE_EXCEPTION = e;
    }

    public CombatCommonEJBService() {
        super(__getWsdlLocation(), COMBATCOMMONEJBSERVICE_QNAME);
    }

    public CombatCommonEJBService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMBATCOMMONEJBSERVICE_QNAME, features);
    }

    public CombatCommonEJBService(URL wsdlLocation) {
        super(wsdlLocation, COMBATCOMMONEJBSERVICE_QNAME);
    }

    public CombatCommonEJBService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMBATCOMMONEJBSERVICE_QNAME, features);
    }

    public CombatCommonEJBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CombatCommonEJBService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CombatCommonEJB
     */
    @WebEndpoint(name = "CombatCommonEJBPort")
    public CombatCommonEJB getCombatCommonEJBPort() {
        return super.getPort(new QName("http://EJB/", "CombatCommonEJBPort"), CombatCommonEJB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CombatCommonEJB
     */
    @WebEndpoint(name = "CombatCommonEJBPort")
    public CombatCommonEJB getCombatCommonEJBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://EJB/", "CombatCommonEJBPort"), CombatCommonEJB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMBATCOMMONEJBSERVICE_EXCEPTION!= null) {
            throw COMBATCOMMONEJBSERVICE_EXCEPTION;
        }
        return COMBATCOMMONEJBSERVICE_WSDL_LOCATION;
    }

}
