
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

    private final static QName _AddNotify_QNAME = new QName("http://EJB/", "addNotify");
    private final static QName _AddNotifyResponse_QNAME = new QName("http://EJB/", "addNotifyResponse");
    private final static QName _Inizialization_QNAME = new QName("http://EJB/", "inizialization");
    private final static QName _InizializationResponse_QNAME = new QName("http://EJB/", "inizializationResponse");
    private final static QName _Personaggio_QNAME = new QName("http://EJB/", "personaggio");
    private final static QName _RemoveNotify_QNAME = new QName("http://EJB/", "removeNotify");
    private final static QName _RemoveNotifyResponse_QNAME = new QName("http://EJB/", "removeNotifyResponse");
    private final static QName _ReturnMap_QNAME = new QName("http://EJB/", "returnMap");
    private final static QName _ReturnMapResponse_QNAME = new QName("http://EJB/", "returnMapResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddNotify }
     * 
     */
    public AddNotify createAddNotify() {
        return new AddNotify();
    }

    /**
     * Create an instance of {@link AddNotifyResponse }
     * 
     */
    public AddNotifyResponse createAddNotifyResponse() {
        return new AddNotifyResponse();
    }

    /**
     * Create an instance of {@link Inizialization }
     * 
     */
    public Inizialization createInizialization() {
        return new Inizialization();
    }

    /**
     * Create an instance of {@link InizializationResponse }
     * 
     */
    public InizializationResponse createInizializationResponse() {
        return new InizializationResponse();
    }

    /**
     * Create an instance of {@link Personaggio }
     * 
     */
    public Personaggio createPersonaggio() {
        return new Personaggio();
    }

    /**
     * Create an instance of {@link RemoveNotify }
     * 
     */
    public RemoveNotify createRemoveNotify() {
        return new RemoveNotify();
    }

    /**
     * Create an instance of {@link RemoveNotifyResponse }
     * 
     */
    public RemoveNotifyResponse createRemoveNotifyResponse() {
        return new RemoveNotifyResponse();
    }

    /**
     * Create an instance of {@link ReturnMap }
     * 
     */
    public ReturnMap createReturnMap() {
        return new ReturnMap();
    }

    /**
     * Create an instance of {@link ReturnMapResponse }
     * 
     */
    public ReturnMapResponse createReturnMapResponse() {
        return new ReturnMapResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNotify }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddNotify }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "addNotify")
    public JAXBElement<AddNotify> createAddNotify(AddNotify value) {
        return new JAXBElement<AddNotify>(_AddNotify_QNAME, AddNotify.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNotifyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddNotifyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "addNotifyResponse")
    public JAXBElement<AddNotifyResponse> createAddNotifyResponse(AddNotifyResponse value) {
        return new JAXBElement<AddNotifyResponse>(_AddNotifyResponse_QNAME, AddNotifyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inizialization }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Inizialization }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "inizialization")
    public JAXBElement<Inizialization> createInizialization(Inizialization value) {
        return new JAXBElement<Inizialization>(_Inizialization_QNAME, Inizialization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InizializationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InizializationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "inizializationResponse")
    public JAXBElement<InizializationResponse> createInizializationResponse(InizializationResponse value) {
        return new JAXBElement<InizializationResponse>(_InizializationResponse_QNAME, InizializationResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveNotify }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveNotify }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "removeNotify")
    public JAXBElement<RemoveNotify> createRemoveNotify(RemoveNotify value) {
        return new JAXBElement<RemoveNotify>(_RemoveNotify_QNAME, RemoveNotify.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveNotifyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveNotifyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "removeNotifyResponse")
    public JAXBElement<RemoveNotifyResponse> createRemoveNotifyResponse(RemoveNotifyResponse value) {
        return new JAXBElement<RemoveNotifyResponse>(_RemoveNotifyResponse_QNAME, RemoveNotifyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnMap }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnMap }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "returnMap")
    public JAXBElement<ReturnMap> createReturnMap(ReturnMap value) {
        return new JAXBElement<ReturnMap>(_ReturnMap_QNAME, ReturnMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnMapResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReturnMapResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "returnMapResponse")
    public JAXBElement<ReturnMapResponse> createReturnMapResponse(ReturnMapResponse value) {
        return new JAXBElement<ReturnMapResponse>(_ReturnMapResponse_QNAME, ReturnMapResponse.class, null, value);
    }

}
