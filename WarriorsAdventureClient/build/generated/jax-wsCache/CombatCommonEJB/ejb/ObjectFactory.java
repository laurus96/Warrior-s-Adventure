
package ejb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ejb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Attack_QNAME = new QName("http://EJB/", "attack");
    private final static QName _AttackResponse_QNAME = new QName("http://EJB/", "attackResponse");
    private final static QName _InizializationCombat_QNAME = new QName("http://EJB/", "inizialization_combat");
    private final static QName _InizializationCombatResponse_QNAME = new QName("http://EJB/", "inizialization_combatResponse");
    private final static QName _Personaggio_QNAME = new QName("http://EJB/", "personaggio");
    private final static QName _RemoveCombat_QNAME = new QName("http://EJB/", "removeCombat");
    private final static QName _RemoveCombatResponse_QNAME = new QName("http://EJB/", "removeCombatResponse");
    private final static QName _ReturnFight_QNAME = new QName("http://EJB/", "returnFight");
    private final static QName _ReturnFightResponse_QNAME = new QName("http://EJB/", "returnFightResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Attack }
     * 
     */
    public Attack createAttack() {
        return new Attack();
    }

    /**
     * Create an instance of {@link AttackResponse }
     * 
     */
    public AttackResponse createAttackResponse() {
        return new AttackResponse();
    }

    /**
     * Create an instance of {@link InizializationCombat }
     * 
     */
    public InizializationCombat createInizializationCombat() {
        return new InizializationCombat();
    }

    /**
     * Create an instance of {@link InizializationCombatResponse }
     * 
     */
    public InizializationCombatResponse createInizializationCombatResponse() {
        return new InizializationCombatResponse();
    }

    /**
     * Create an instance of {@link Personaggio }
     * 
     */
    public Personaggio createPersonaggio() {
        return new Personaggio();
    }

    /**
     * Create an instance of {@link RemoveCombat }
     * 
     */
    public RemoveCombat createRemoveCombat() {
        return new RemoveCombat();
    }

    /**
     * Create an instance of {@link RemoveCombatResponse }
     * 
     */
    public RemoveCombatResponse createRemoveCombatResponse() {
        return new RemoveCombatResponse();
    }

    /**
     * Create an instance of {@link ReturnFight }
     * 
     */
    public ReturnFight createReturnFight() {
        return new ReturnFight();
    }

    /**
     * Create an instance of {@link ReturnFightResponse }
     * 
     */
    public ReturnFightResponse createReturnFightResponse() {
        return new ReturnFightResponse();
    }

    /**
     * Create an instance of {@link Fight }
     * 
     */
    public Fight createFight() {
        return new Fight();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attack }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Attack }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "attack")
    public JAXBElement<Attack> createAttack(Attack value) {
        return new JAXBElement<Attack>(_Attack_QNAME, Attack.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttackResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttackResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "attackResponse")
    public JAXBElement<AttackResponse> createAttackResponse(AttackResponse value) {
        return new JAXBElement<AttackResponse>(_AttackResponse_QNAME, AttackResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InizializationCombat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InizializationCombat }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "inizialization_combat")
    public JAXBElement<InizializationCombat> createInizializationCombat(InizializationCombat value) {
        return new JAXBElement<InizializationCombat>(_InizializationCombat_QNAME, InizializationCombat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InizializationCombatResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InizializationCombatResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "inizialization_combatResponse")
    public JAXBElement<InizializationCombatResponse> createInizializationCombatResponse(InizializationCombatResponse value) {
        return new JAXBElement<InizializationCombatResponse>(_InizializationCombatResponse_QNAME, InizializationCombatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Personaggio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Personaggio }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "personaggio")
    public JAXBElement<Personaggio> createPersonaggio(Personaggio value) {
        return new JAXBElement<Personaggio>(_Personaggio_QNAME, Personaggio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCombat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCombat }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "removeCombat")
    public JAXBElement<RemoveCombat> createRemoveCombat(RemoveCombat value) {
        return new JAXBElement<RemoveCombat>(_RemoveCombat_QNAME, RemoveCombat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCombatResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCombatResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "removeCombatResponse")
    public JAXBElement<RemoveCombatResponse> createRemoveCombatResponse(RemoveCombatResponse value) {
        return new JAXBElement<RemoveCombatResponse>(_RemoveCombatResponse_QNAME, RemoveCombatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnFight }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnFight }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "returnFight")
    public JAXBElement<ReturnFight> createReturnFight(ReturnFight value) {
        return new JAXBElement<ReturnFight>(_ReturnFight_QNAME, ReturnFight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnFightResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnFightResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "returnFightResponse")
    public JAXBElement<ReturnFightResponse> createReturnFightResponse(ReturnFightResponse value) {
        return new JAXBElement<ReturnFightResponse>(_ReturnFightResponse_QNAME, ReturnFightResponse.class, null, value);
    }

}
