
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
@WebService(name = "CombatCommonEJB", targetNamespace = "http://EJB/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CombatCommonEJB {


    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "inizializationCombat", targetNamespace = "http://EJB/", className = "ejb.InizializationCombat")
    @ResponseWrapper(localName = "inizializationCombatResponse", targetNamespace = "http://EJB/", className = "ejb.InizializationCombatResponse")
    @Action(input = "http://EJB/CombatCommonEJB/inizializationCombatRequest", output = "http://EJB/CombatCommonEJB/inizializationCombatResponse")
    public void inizializationCombat(
        @WebParam(name = "arg0", targetNamespace = "")
        Personaggio arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Personaggio arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "leave", targetNamespace = "http://EJB/", className = "ejb.Leave")
    @ResponseWrapper(localName = "leaveResponse", targetNamespace = "http://EJB/", className = "ejb.LeaveResponse")
    @Action(input = "http://EJB/CombatCommonEJB/leaveRequest", output = "http://EJB/CombatCommonEJB/leaveResponse")
    public List<String> leave(
        @WebParam(name = "arg0", targetNamespace = "")
        Personaggio arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ejb.Fight
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "returnFight", targetNamespace = "http://EJB/", className = "ejb.ReturnFight")
    @ResponseWrapper(localName = "returnFightResponse", targetNamespace = "http://EJB/", className = "ejb.ReturnFightResponse")
    @Action(input = "http://EJB/CombatCommonEJB/returnFightRequest", output = "http://EJB/CombatCommonEJB/returnFightResponse")
    public Fight returnFight(
        @WebParam(name = "arg0", targetNamespace = "")
        Personaggio arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "winner", targetNamespace = "http://EJB/", className = "ejb.Winner")
    @ResponseWrapper(localName = "winnerResponse", targetNamespace = "http://EJB/", className = "ejb.WinnerResponse")
    @Action(input = "http://EJB/CombatCommonEJB/winnerRequest", output = "http://EJB/CombatCommonEJB/winnerResponse")
    public Long winner(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "heals", targetNamespace = "http://EJB/", className = "ejb.Heals")
    @ResponseWrapper(localName = "healsResponse", targetNamespace = "http://EJB/", className = "ejb.HealsResponse")
    @Action(input = "http://EJB/CombatCommonEJB/healsRequest", output = "http://EJB/CombatCommonEJB/healsResponse")
    public List<String> heals(
        @WebParam(name = "arg0", targetNamespace = "")
        Personaggio arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeCombat", targetNamespace = "http://EJB/", className = "ejb.RemoveCombat")
    @ResponseWrapper(localName = "removeCombatResponse", targetNamespace = "http://EJB/", className = "ejb.RemoveCombatResponse")
    @Action(input = "http://EJB/CombatCommonEJB/removeCombatRequest", output = "http://EJB/CombatCommonEJB/removeCombatResponse")
    public void removeCombat(
        @WebParam(name = "arg0", targetNamespace = "")
        Personaggio arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Personaggio arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "attack", targetNamespace = "http://EJB/", className = "ejb.Attack")
    @ResponseWrapper(localName = "attackResponse", targetNamespace = "http://EJB/", className = "ejb.AttackResponse")
    @Action(input = "http://EJB/CombatCommonEJB/attackRequest", output = "http://EJB/CombatCommonEJB/attackResponse")
    public List<String> attack(
        @WebParam(name = "arg0", targetNamespace = "")
        Personaggio arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "defense", targetNamespace = "http://EJB/", className = "ejb.Defense")
    @ResponseWrapper(localName = "defenseResponse", targetNamespace = "http://EJB/", className = "ejb.DefenseResponse")
    @Action(input = "http://EJB/CombatCommonEJB/defenseRequest", output = "http://EJB/CombatCommonEJB/defenseResponse")
    public List<String> defense(
        @WebParam(name = "arg0", targetNamespace = "")
        Personaggio arg0);

}
