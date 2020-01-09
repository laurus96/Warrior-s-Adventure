
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

    private final static QName _AddPlayer_QNAME = new QName("http://EJB/", "addPlayer");
    private final static QName _AddPlayerResponse_QNAME = new QName("http://EJB/", "addPlayerResponse");
    private final static QName _Giocatore_QNAME = new QName("http://EJB/", "giocatore");
    private final static QName _Personaggio_QNAME = new QName("http://EJB/", "personaggio");
    private final static QName _RemovePlayer_QNAME = new QName("http://EJB/", "removePlayer");
    private final static QName _RemovePlayerResponse_QNAME = new QName("http://EJB/", "removePlayerResponse");
    private final static QName _ReturnHashMap_QNAME = new QName("http://EJB/", "returnHashMap");
    private final static QName _ReturnHashMapResponse_QNAME = new QName("http://EJB/", "returnHashMapResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPlayer }
     * 
     */
    public AddPlayer createAddPlayer() {
        return new AddPlayer();
    }

    /**
     * Create an instance of {@link AddPlayerResponse }
     * 
     */
    public AddPlayerResponse createAddPlayerResponse() {
        return new AddPlayerResponse();
    }

    /**
     * Create an instance of {@link Giocatore }
     * 
     */
    public Giocatore createGiocatore() {
        return new Giocatore();
    }

    /**
     * Create an instance of {@link Personaggio }
     * 
     */
    public Personaggio createPersonaggio() {
        return new Personaggio();
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
     * Create an instance of {@link ReturnHashMap }
     * 
     */
    public ReturnHashMap createReturnHashMap() {
        return new ReturnHashMap();
    }

    /**
     * Create an instance of {@link ReturnHashMapResponse }
     * 
     */
    public ReturnHashMapResponse createReturnHashMapResponse() {
        return new ReturnHashMapResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPlayer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPlayer }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "addPlayer")
    public JAXBElement<AddPlayer> createAddPlayer(AddPlayer value) {
        return new JAXBElement<AddPlayer>(_AddPlayer_QNAME, AddPlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPlayerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPlayerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "addPlayerResponse")
    public JAXBElement<AddPlayerResponse> createAddPlayerResponse(AddPlayerResponse value) {
        return new JAXBElement<AddPlayerResponse>(_AddPlayerResponse_QNAME, AddPlayerResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnHashMap }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnHashMap }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "returnHashMap")
    public JAXBElement<ReturnHashMap> createReturnHashMap(ReturnHashMap value) {
        return new JAXBElement<ReturnHashMap>(_ReturnHashMap_QNAME, ReturnHashMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnHashMapResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnHashMapResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "returnHashMapResponse")
    public JAXBElement<ReturnHashMapResponse> createReturnHashMapResponse(ReturnHashMapResponse value) {
        return new JAXBElement<ReturnHashMapResponse>(_ReturnHashMapResponse_QNAME, ReturnHashMapResponse.class, null, value);
    }

}
