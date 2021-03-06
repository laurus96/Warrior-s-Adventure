
package ejb;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NotifyPlayerEJB", targetNamespace = "http://EJB/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NotifyPlayerEJB {


    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addNotify", targetNamespace = "http://EJB/", className = "ejb.AddNotify")
    @ResponseWrapper(localName = "addNotifyResponse", targetNamespace = "http://EJB/", className = "ejb.AddNotifyResponse")
    @Action(input = "http://EJB/NotifyPlayerEJB/addNotifyRequest", output = "http://EJB/NotifyPlayerEJB/addNotifyResponse")
    public void addNotify(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Personaggio arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "inizialization", targetNamespace = "http://EJB/", className = "ejb.Inizialization")
    @ResponseWrapper(localName = "inizializationResponse", targetNamespace = "http://EJB/", className = "ejb.InizializationResponse")
    @Action(input = "http://EJB/NotifyPlayerEJB/inizializationRequest", output = "http://EJB/NotifyPlayerEJB/inizializationResponse")
    public void inizialization(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeNotify", targetNamespace = "http://EJB/", className = "ejb.RemoveNotify")
    @ResponseWrapper(localName = "removeNotifyResponse", targetNamespace = "http://EJB/", className = "ejb.RemoveNotifyResponse")
    @Action(input = "http://EJB/NotifyPlayerEJB/removeNotifyRequest", output = "http://EJB/NotifyPlayerEJB/removeNotifyResponse")
    public void removeNotify(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<ejb.Personaggio>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "returnMap", targetNamespace = "http://EJB/", className = "ejb.ReturnMap")
    @ResponseWrapper(localName = "returnMapResponse", targetNamespace = "http://EJB/", className = "ejb.ReturnMapResponse")
    @Action(input = "http://EJB/NotifyPlayerEJB/returnMapRequest", output = "http://EJB/NotifyPlayerEJB/returnMapResponse")
    public List<Personaggio> returnMap(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

}
