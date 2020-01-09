
package ejb;

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
@WebService(name = "GiocatoreEJB", targetNamespace = "http://EJB/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GiocatoreEJB {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registration", targetNamespace = "http://EJB/", className = "ejb.Registration")
    @ResponseWrapper(localName = "registrationResponse", targetNamespace = "http://EJB/", className = "ejb.RegistrationResponse")
    @Action(input = "http://EJB/GiocatoreEJB/registrationRequest", output = "http://EJB/GiocatoreEJB/registrationResponse")
    public String registration(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns ejb.Giocatore
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://EJB/", className = "ejb.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://EJB/", className = "ejb.LoginResponse")
    @Action(input = "http://EJB/GiocatoreEJB/loginRequest", output = "http://EJB/GiocatoreEJB/loginResponse")
    public Giocatore login(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removePlayer", targetNamespace = "http://EJB/", className = "ejb.RemovePlayer")
    @ResponseWrapper(localName = "removePlayerResponse", targetNamespace = "http://EJB/", className = "ejb.RemovePlayerResponse")
    @Action(input = "http://EJB/GiocatoreEJB/removePlayerRequest", output = "http://EJB/GiocatoreEJB/removePlayerResponse")
    public void removePlayer(
        @WebParam(name = "arg0", targetNamespace = "")
        Giocatore arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findEmail", targetNamespace = "http://EJB/", className = "ejb.FindEmail")
    @ResponseWrapper(localName = "findEmailResponse", targetNamespace = "http://EJB/", className = "ejb.FindEmailResponse")
    @Action(input = "http://EJB/GiocatoreEJB/findEmailRequest", output = "http://EJB/GiocatoreEJB/findEmailResponse")
    public boolean findEmail(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ejb.Giocatore
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePlayer", targetNamespace = "http://EJB/", className = "ejb.UpdatePlayer")
    @ResponseWrapper(localName = "updatePlayerResponse", targetNamespace = "http://EJB/", className = "ejb.UpdatePlayerResponse")
    @Action(input = "http://EJB/GiocatoreEJB/updatePlayerRequest", output = "http://EJB/GiocatoreEJB/updatePlayerResponse")
    public Giocatore updatePlayer(
        @WebParam(name = "arg0", targetNamespace = "")
        Giocatore arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findUsername", targetNamespace = "http://EJB/", className = "ejb.FindUsername")
    @ResponseWrapper(localName = "findUsernameResponse", targetNamespace = "http://EJB/", className = "ejb.FindUsernameResponse")
    @Action(input = "http://EJB/GiocatoreEJB/findUsernameRequest", output = "http://EJB/GiocatoreEJB/findUsernameResponse")
    public boolean findUsername(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ejb.Giocatore
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findPlayer", targetNamespace = "http://EJB/", className = "ejb.FindPlayer")
    @ResponseWrapper(localName = "findPlayerResponse", targetNamespace = "http://EJB/", className = "ejb.FindPlayerResponse")
    @Action(input = "http://EJB/GiocatoreEJB/findPlayerRequest", output = "http://EJB/GiocatoreEJB/findPlayerResponse")
    public Giocatore findPlayer(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ejb.Giocatore
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertPlayer", targetNamespace = "http://EJB/", className = "ejb.InsertPlayer")
    @ResponseWrapper(localName = "insertPlayerResponse", targetNamespace = "http://EJB/", className = "ejb.InsertPlayerResponse")
    @Action(input = "http://EJB/GiocatoreEJB/insertPlayerRequest", output = "http://EJB/GiocatoreEJB/insertPlayerResponse")
    public Giocatore insertPlayer(
        @WebParam(name = "arg0", targetNamespace = "")
        Giocatore arg0);

}
