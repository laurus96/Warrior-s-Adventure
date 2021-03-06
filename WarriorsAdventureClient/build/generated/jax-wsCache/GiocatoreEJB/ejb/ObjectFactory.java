
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

    private final static QName _FindEmail_QNAME = new QName("http://EJB/", "findEmail");
    private final static QName _FindEmailResponse_QNAME = new QName("http://EJB/", "findEmailResponse");
    private final static QName _FindPlayer_QNAME = new QName("http://EJB/", "findPlayer");
    private final static QName _FindPlayerResponse_QNAME = new QName("http://EJB/", "findPlayerResponse");
    private final static QName _FindUsername_QNAME = new QName("http://EJB/", "findUsername");
    private final static QName _FindUsernameResponse_QNAME = new QName("http://EJB/", "findUsernameResponse");
    private final static QName _Giocatore_QNAME = new QName("http://EJB/", "giocatore");
    private final static QName _InsertPlayer_QNAME = new QName("http://EJB/", "insertPlayer");
    private final static QName _InsertPlayerResponse_QNAME = new QName("http://EJB/", "insertPlayerResponse");
    private final static QName _Login_QNAME = new QName("http://EJB/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://EJB/", "loginResponse");
    private final static QName _Registration_QNAME = new QName("http://EJB/", "registration");
    private final static QName _RegistrationResponse_QNAME = new QName("http://EJB/", "registrationResponse");
    private final static QName _RemovePlayer_QNAME = new QName("http://EJB/", "removePlayer");
    private final static QName _RemovePlayerResponse_QNAME = new QName("http://EJB/", "removePlayerResponse");
    private final static QName _UpdatePlayer_QNAME = new QName("http://EJB/", "updatePlayer");
    private final static QName _UpdatePlayerResponse_QNAME = new QName("http://EJB/", "updatePlayerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindEmail }
     * 
     */
    public FindEmail createFindEmail() {
        return new FindEmail();
    }

    /**
     * Create an instance of {@link FindEmailResponse }
     * 
     */
    public FindEmailResponse createFindEmailResponse() {
        return new FindEmailResponse();
    }

    /**
     * Create an instance of {@link FindPlayer }
     * 
     */
    public FindPlayer createFindPlayer() {
        return new FindPlayer();
    }

    /**
     * Create an instance of {@link FindPlayerResponse }
     * 
     */
    public FindPlayerResponse createFindPlayerResponse() {
        return new FindPlayerResponse();
    }

    /**
     * Create an instance of {@link FindUsername }
     * 
     */
    public FindUsername createFindUsername() {
        return new FindUsername();
    }

    /**
     * Create an instance of {@link FindUsernameResponse }
     * 
     */
    public FindUsernameResponse createFindUsernameResponse() {
        return new FindUsernameResponse();
    }

    /**
     * Create an instance of {@link Giocatore }
     * 
     */
    public Giocatore createGiocatore() {
        return new Giocatore();
    }

    /**
     * Create an instance of {@link InsertPlayer }
     * 
     */
    public InsertPlayer createInsertPlayer() {
        return new InsertPlayer();
    }

    /**
     * Create an instance of {@link InsertPlayerResponse }
     * 
     */
    public InsertPlayerResponse createInsertPlayerResponse() {
        return new InsertPlayerResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Registration }
     * 
     */
    public Registration createRegistration() {
        return new Registration();
    }

    /**
     * Create an instance of {@link RegistrationResponse }
     * 
     */
    public RegistrationResponse createRegistrationResponse() {
        return new RegistrationResponse();
    }

    /**
     * Create an instance of {@link RemovePlayer }
     * 
     */
    public RemovePlayer createRemovePlayer() {
        return new RemovePlayer();
    }

    /**
     * Create an instance of {@link RemovePlayerResponse }
     * 
     */
    public RemovePlayerResponse createRemovePlayerResponse() {
        return new RemovePlayerResponse();
    }

    /**
     * Create an instance of {@link UpdatePlayer }
     * 
     */
    public UpdatePlayer createUpdatePlayer() {
        return new UpdatePlayer();
    }

    /**
     * Create an instance of {@link UpdatePlayerResponse }
     * 
     */
    public UpdatePlayerResponse createUpdatePlayerResponse() {
        return new UpdatePlayerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindEmail }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findEmail")
    public JAXBElement<FindEmail> createFindEmail(FindEmail value) {
        return new JAXBElement<FindEmail>(_FindEmail_QNAME, FindEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindEmailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findEmailResponse")
    public JAXBElement<FindEmailResponse> createFindEmailResponse(FindEmailResponse value) {
        return new JAXBElement<FindEmailResponse>(_FindEmailResponse_QNAME, FindEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPlayer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindPlayer }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findPlayer")
    public JAXBElement<FindPlayer> createFindPlayer(FindPlayer value) {
        return new JAXBElement<FindPlayer>(_FindPlayer_QNAME, FindPlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPlayerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindPlayerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findPlayerResponse")
    public JAXBElement<FindPlayerResponse> createFindPlayerResponse(FindPlayerResponse value) {
        return new JAXBElement<FindPlayerResponse>(_FindPlayerResponse_QNAME, FindPlayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUsername }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindUsername }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findUsername")
    public JAXBElement<FindUsername> createFindUsername(FindUsername value) {
        return new JAXBElement<FindUsername>(_FindUsername_QNAME, FindUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUsernameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindUsernameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findUsernameResponse")
    public JAXBElement<FindUsernameResponse> createFindUsernameResponse(FindUsernameResponse value) {
        return new JAXBElement<FindUsernameResponse>(_FindUsernameResponse_QNAME, FindUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Giocatore }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Giocatore }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "giocatore")
    public JAXBElement<Giocatore> createGiocatore(Giocatore value) {
        return new JAXBElement<Giocatore>(_Giocatore_QNAME, Giocatore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPlayer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertPlayer }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "insertPlayer")
    public JAXBElement<InsertPlayer> createInsertPlayer(InsertPlayer value) {
        return new JAXBElement<InsertPlayer>(_InsertPlayer_QNAME, InsertPlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPlayerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertPlayerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "insertPlayerResponse")
    public JAXBElement<InsertPlayerResponse> createInsertPlayerResponse(InsertPlayerResponse value) {
        return new JAXBElement<InsertPlayerResponse>(_InsertPlayerResponse_QNAME, InsertPlayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Registration }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "registration")
    public JAXBElement<Registration> createRegistration(Registration value) {
        return new JAXBElement<Registration>(_Registration_QNAME, Registration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "registrationResponse")
    public JAXBElement<RegistrationResponse> createRegistrationResponse(RegistrationResponse value) {
        return new JAXBElement<RegistrationResponse>(_RegistrationResponse_QNAME, RegistrationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePlayer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemovePlayer }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "removePlayer")
    public JAXBElement<RemovePlayer> createRemovePlayer(RemovePlayer value) {
        return new JAXBElement<RemovePlayer>(_RemovePlayer_QNAME, RemovePlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePlayerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemovePlayerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "removePlayerResponse")
    public JAXBElement<RemovePlayerResponse> createRemovePlayerResponse(RemovePlayerResponse value) {
        return new JAXBElement<RemovePlayerResponse>(_RemovePlayerResponse_QNAME, RemovePlayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePlayer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePlayer }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "updatePlayer")
    public JAXBElement<UpdatePlayer> createUpdatePlayer(UpdatePlayer value) {
        return new JAXBElement<UpdatePlayer>(_UpdatePlayer_QNAME, UpdatePlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePlayerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePlayerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "updatePlayerResponse")
    public JAXBElement<UpdatePlayerResponse> createUpdatePlayerResponse(UpdatePlayerResponse value) {
        return new JAXBElement<UpdatePlayerResponse>(_UpdatePlayerResponse_QNAME, UpdatePlayerResponse.class, null, value);
    }

}
