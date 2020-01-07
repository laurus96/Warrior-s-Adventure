
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
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ArmaEJB", targetNamespace = "http://EJB/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ArmaEJB {


    /**
     * 
     * @param arg0
     * @return
     *     returns ejb.Arma
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertWeapon", targetNamespace = "http://EJB/", className = "ejb.InsertWeapon")
    @ResponseWrapper(localName = "insertWeaponResponse", targetNamespace = "http://EJB/", className = "ejb.InsertWeaponResponse")
    @Action(input = "http://EJB/ArmaEJB/insertWeaponRequest", output = "http://EJB/ArmaEJB/insertWeaponResponse")
    public Arma insertWeapon(
        @WebParam(name = "arg0", targetNamespace = "")
        Arma arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteWeapon", targetNamespace = "http://EJB/", className = "ejb.DeleteWeapon")
    @ResponseWrapper(localName = "deleteWeaponResponse", targetNamespace = "http://EJB/", className = "ejb.DeleteWeaponResponse")
    @Action(input = "http://EJB/ArmaEJB/deleteWeaponRequest", output = "http://EJB/ArmaEJB/deleteWeaponResponse")
    public void deleteWeapon(
        @WebParam(name = "arg0", targetNamespace = "")
        Arma arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<ejb.Arma>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findWeapons", targetNamespace = "http://EJB/", className = "ejb.FindWeapons")
    @ResponseWrapper(localName = "findWeaponsResponse", targetNamespace = "http://EJB/", className = "ejb.FindWeaponsResponse")
    @Action(input = "http://EJB/ArmaEJB/findWeaponsRequest", output = "http://EJB/ArmaEJB/findWeaponsResponse")
    public List<Arma> findWeapons(
        @WebParam(name = "arg0", targetNamespace = "")
        Personaggio arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ejb.Arma
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateWeapon", targetNamespace = "http://EJB/", className = "ejb.UpdateWeapon")
    @ResponseWrapper(localName = "updateWeaponResponse", targetNamespace = "http://EJB/", className = "ejb.UpdateWeaponResponse")
    @Action(input = "http://EJB/ArmaEJB/updateWeaponRequest", output = "http://EJB/ArmaEJB/updateWeaponResponse")
    public Arma updateWeapon(
        @WebParam(name = "arg0", targetNamespace = "")
        Arma arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ejb.Arma
     */
    @WebMethod(operationName = "findWeapons_bylv")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findWeapons_bylv", targetNamespace = "http://EJB/", className = "ejb.FindWeaponsBylv")
    @ResponseWrapper(localName = "findWeapons_bylvResponse", targetNamespace = "http://EJB/", className = "ejb.FindWeaponsBylvResponse")
    @Action(input = "http://EJB/ArmaEJB/findWeapons_bylvRequest", output = "http://EJB/ArmaEJB/findWeapons_bylvResponse")
    public Arma findWeaponsBylv(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

}
