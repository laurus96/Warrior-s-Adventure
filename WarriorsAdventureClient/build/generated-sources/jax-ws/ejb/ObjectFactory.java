
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

    private final static QName _Giocatore_QNAME = new QName("http://EJB/", "giocatore");
    private final static QName _AllPlayers_QNAME = new QName("http://EJB/", "allPlayers");
    private final static QName _LogginAmministratore_QNAME = new QName("http://EJB/", "logginAmministratore");
    private final static QName _AllPlayersResponse_QNAME = new QName("http://EJB/", "allPlayersResponse");
    private final static QName _BanPlayer_QNAME = new QName("http://EJB/", "banPlayer");
    private final static QName _InsertAmministratore_QNAME = new QName("http://EJB/", "insertAmministratore");
    private final static QName _BanPlayerResponse_QNAME = new QName("http://EJB/", "banPlayerResponse");
    private final static QName _LogginAmministratoreResponse_QNAME = new QName("http://EJB/", "logginAmministratoreResponse");
    private final static QName _RemoveAmministratoreResponse_QNAME = new QName("http://EJB/", "removeAmministratoreResponse");
    private final static QName _UnbanPlayer_QNAME = new QName("http://EJB/", "unbanPlayer");
    private final static QName _BannedPlayers_QNAME = new QName("http://EJB/", "BannedPlayers");
    private final static QName _UnbanPlayerResponse_QNAME = new QName("http://EJB/", "unbanPlayerResponse");
    private final static QName _UpdateAmministratore_QNAME = new QName("http://EJB/", "updateAmministratore");
    private final static QName _InsertAmministratoreResponse_QNAME = new QName("http://EJB/", "insertAmministratoreResponse");
    private final static QName _UpdateAmministratoreResponse_QNAME = new QName("http://EJB/", "updateAmministratoreResponse");
    private final static QName _BannedPlayersResponse_QNAME = new QName("http://EJB/", "BannedPlayersResponse");
    private final static QName _RemoveAmministratore_QNAME = new QName("http://EJB/", "removeAmministratore");
    private final static QName _Amministratore_QNAME = new QName("http://EJB/", "amministratore");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllPlayersResponse }
     * 
     */
    public AllPlayersResponse createAllPlayersResponse() {
        return new AllPlayersResponse();
    }

    /**
     * Create an instance of {@link BanPlayer }
     * 
     */
    public BanPlayer createBanPlayer() {
        return new BanPlayer();
    }

    /**
     * Create an instance of {@link InsertAmministratore }
     * 
     */
    public InsertAmministratore createInsertAmministratore() {
        return new InsertAmministratore();
    }

    /**
     * Create an instance of {@link LogginAmministratoreResponse }
     * 
     */
    public LogginAmministratoreResponse createLogginAmministratoreResponse() {
        return new LogginAmministratoreResponse();
    }

    /**
     * Create an instance of {@link BanPlayerResponse }
     * 
     */
    public BanPlayerResponse createBanPlayerResponse() {
        return new BanPlayerResponse();
    }

    /**
     * Create an instance of {@link Giocatore }
     * 
     */
    public Giocatore createGiocatore() {
        return new Giocatore();
    }

    /**
     * Create an instance of {@link LogginAmministratore }
     * 
     */
    public LogginAmministratore createLogginAmministratore() {
        return new LogginAmministratore();
    }

    /**
     * Create an instance of {@link AllPlayers }
     * 
     */
    public AllPlayers createAllPlayers() {
        return new AllPlayers();
    }

    /**
     * Create an instance of {@link Amministratore }
     * 
     */
    public Amministratore createAmministratore() {
        return new Amministratore();
    }

    /**
     * Create an instance of {@link RemoveAmministratore }
     * 
     */
    public RemoveAmministratore createRemoveAmministratore() {
        return new RemoveAmministratore();
    }

    /**
     * Create an instance of {@link InsertAmministratoreResponse }
     * 
     */
    public InsertAmministratoreResponse createInsertAmministratoreResponse() {
        return new InsertAmministratoreResponse();
    }

    /**
     * Create an instance of {@link UpdateAmministratore }
     * 
     */
    public UpdateAmministratore createUpdateAmministratore() {
        return new UpdateAmministratore();
    }

    /**
     * Create an instance of {@link BannedPlayersResponse }
     * 
     */
    public BannedPlayersResponse createBannedPlayersResponse() {
        return new BannedPlayersResponse();
    }

    /**
     * Create an instance of {@link UpdateAmministratoreResponse }
     * 
     */
    public UpdateAmministratoreResponse createUpdateAmministratoreResponse() {
        return new UpdateAmministratoreResponse();
    }

    /**
     * Create an instance of {@link BannedPlayers }
     * 
     */
    public BannedPlayers createBannedPlayers() {
        return new BannedPlayers();
    }

    /**
     * Create an instance of {@link UnbanPlayerResponse }
     * 
     */
    public UnbanPlayerResponse createUnbanPlayerResponse() {
        return new UnbanPlayerResponse();
    }

    /**
     * Create an instance of {@link RemoveAmministratoreResponse }
     * 
     */
    public RemoveAmministratoreResponse createRemoveAmministratoreResponse() {
        return new RemoveAmministratoreResponse();
    }

    /**
     * Create an instance of {@link UnbanPlayer }
     * 
     */
    public UnbanPlayer createUnbanPlayer() {
        return new UnbanPlayer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Giocatore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "giocatore")
    public JAXBElement<Giocatore> createGiocatore(Giocatore value) {
        return new JAXBElement<Giocatore>(_Giocatore_QNAME, Giocatore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllPlayers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "allPlayers")
    public JAXBElement<AllPlayers> createAllPlayers(AllPlayers value) {
        return new JAXBElement<AllPlayers>(_AllPlayers_QNAME, AllPlayers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogginAmministratore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "logginAmministratore")
    public JAXBElement<LogginAmministratore> createLogginAmministratore(LogginAmministratore value) {
        return new JAXBElement<LogginAmministratore>(_LogginAmministratore_QNAME, LogginAmministratore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllPlayersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "allPlayersResponse")
    public JAXBElement<AllPlayersResponse> createAllPlayersResponse(AllPlayersResponse value) {
        return new JAXBElement<AllPlayersResponse>(_AllPlayersResponse_QNAME, AllPlayersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BanPlayer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "banPlayer")
    public JAXBElement<BanPlayer> createBanPlayer(BanPlayer value) {
        return new JAXBElement<BanPlayer>(_BanPlayer_QNAME, BanPlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAmministratore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "insertAmministratore")
    public JAXBElement<InsertAmministratore> createInsertAmministratore(InsertAmministratore value) {
        return new JAXBElement<InsertAmministratore>(_InsertAmministratore_QNAME, InsertAmministratore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BanPlayerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "banPlayerResponse")
    public JAXBElement<BanPlayerResponse> createBanPlayerResponse(BanPlayerResponse value) {
        return new JAXBElement<BanPlayerResponse>(_BanPlayerResponse_QNAME, BanPlayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogginAmministratoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "logginAmministratoreResponse")
    public JAXBElement<LogginAmministratoreResponse> createLogginAmministratoreResponse(LogginAmministratoreResponse value) {
        return new JAXBElement<LogginAmministratoreResponse>(_LogginAmministratoreResponse_QNAME, LogginAmministratoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAmministratoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "removeAmministratoreResponse")
    public JAXBElement<RemoveAmministratoreResponse> createRemoveAmministratoreResponse(RemoveAmministratoreResponse value) {
        return new JAXBElement<RemoveAmministratoreResponse>(_RemoveAmministratoreResponse_QNAME, RemoveAmministratoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnbanPlayer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "unbanPlayer")
    public JAXBElement<UnbanPlayer> createUnbanPlayer(UnbanPlayer value) {
        return new JAXBElement<UnbanPlayer>(_UnbanPlayer_QNAME, UnbanPlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BannedPlayers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "BannedPlayers")
    public JAXBElement<BannedPlayers> createBannedPlayers(BannedPlayers value) {
        return new JAXBElement<BannedPlayers>(_BannedPlayers_QNAME, BannedPlayers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnbanPlayerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "unbanPlayerResponse")
    public JAXBElement<UnbanPlayerResponse> createUnbanPlayerResponse(UnbanPlayerResponse value) {
        return new JAXBElement<UnbanPlayerResponse>(_UnbanPlayerResponse_QNAME, UnbanPlayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAmministratore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "updateAmministratore")
    public JAXBElement<UpdateAmministratore> createUpdateAmministratore(UpdateAmministratore value) {
        return new JAXBElement<UpdateAmministratore>(_UpdateAmministratore_QNAME, UpdateAmministratore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAmministratoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "insertAmministratoreResponse")
    public JAXBElement<InsertAmministratoreResponse> createInsertAmministratoreResponse(InsertAmministratoreResponse value) {
        return new JAXBElement<InsertAmministratoreResponse>(_InsertAmministratoreResponse_QNAME, InsertAmministratoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAmministratoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "updateAmministratoreResponse")
    public JAXBElement<UpdateAmministratoreResponse> createUpdateAmministratoreResponse(UpdateAmministratoreResponse value) {
        return new JAXBElement<UpdateAmministratoreResponse>(_UpdateAmministratoreResponse_QNAME, UpdateAmministratoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BannedPlayersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "BannedPlayersResponse")
    public JAXBElement<BannedPlayersResponse> createBannedPlayersResponse(BannedPlayersResponse value) {
        return new JAXBElement<BannedPlayersResponse>(_BannedPlayersResponse_QNAME, BannedPlayersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAmministratore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "removeAmministratore")
    public JAXBElement<RemoveAmministratore> createRemoveAmministratore(RemoveAmministratore value) {
        return new JAXBElement<RemoveAmministratore>(_RemoveAmministratore_QNAME, RemoveAmministratore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Amministratore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "amministratore")
    public JAXBElement<Amministratore> createAmministratore(Amministratore value) {
        return new JAXBElement<Amministratore>(_Amministratore_QNAME, Amministratore.class, null, value);
    }

}
