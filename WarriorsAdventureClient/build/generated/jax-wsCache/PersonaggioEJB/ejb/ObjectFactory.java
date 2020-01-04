
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
    private final static QName _SubGoldResponse_QNAME = new QName("http://EJB/", "subGoldResponse");
    private final static QName _AddExp_QNAME = new QName("http://EJB/", "addExp");
    private final static QName _AddGoldResponse_QNAME = new QName("http://EJB/", "addGoldResponse");
    private final static QName _CreateCharacterResponse_QNAME = new QName("http://EJB/", "createCharacterResponse");
    private final static QName _RemovePersonaggio_QNAME = new QName("http://EJB/", "removePersonaggio");
    private final static QName _CreateCharacter_QNAME = new QName("http://EJB/", "createCharacter");
    private final static QName _Personaggio_QNAME = new QName("http://EJB/", "personaggio");
    private final static QName _AddGold_QNAME = new QName("http://EJB/", "addGold");
    private final static QName _InsertPersonaggioResponse_QNAME = new QName("http://EJB/", "insertPersonaggioResponse");
    private final static QName _ListCharacterResponse_QNAME = new QName("http://EJB/", "listCharacterResponse");
    private final static QName _UpdatePersonaggio_QNAME = new QName("http://EJB/", "updatePersonaggio");
    private final static QName _InsertPersonaggio_QNAME = new QName("http://EJB/", "insertPersonaggio");
    private final static QName _ListCharacter_QNAME = new QName("http://EJB/", "listCharacter");
    private final static QName _SubGold_QNAME = new QName("http://EJB/", "subGold");
    private final static QName _UpdatePersonaggioResponse_QNAME = new QName("http://EJB/", "updatePersonaggioResponse");
    private final static QName _RemovePersonaggioResponse_QNAME = new QName("http://EJB/", "removePersonaggioResponse");
    private final static QName _AddExpResponse_QNAME = new QName("http://EJB/", "addExpResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdatePersonaggio }
     * 
     */
    public UpdatePersonaggio createUpdatePersonaggio() {
        return new UpdatePersonaggio();
    }

    /**
     * Create an instance of {@link AddGold }
     * 
     */
    public AddGold createAddGold() {
        return new AddGold();
    }

    /**
     * Create an instance of {@link InsertPersonaggioResponse }
     * 
     */
    public InsertPersonaggioResponse createInsertPersonaggioResponse() {
        return new InsertPersonaggioResponse();
    }

    /**
     * Create an instance of {@link ListCharacterResponse }
     * 
     */
    public ListCharacterResponse createListCharacterResponse() {
        return new ListCharacterResponse();
    }

    /**
     * Create an instance of {@link AddExp }
     * 
     */
    public AddExp createAddExp() {
        return new AddExp();
    }

    /**
     * Create an instance of {@link AddGoldResponse }
     * 
     */
    public AddGoldResponse createAddGoldResponse() {
        return new AddGoldResponse();
    }

    /**
     * Create an instance of {@link CreateCharacter }
     * 
     */
    public CreateCharacter createCreateCharacter() {
        return new CreateCharacter();
    }

    /**
     * Create an instance of {@link Personaggio }
     * 
     */
    public Personaggio createPersonaggio() {
        return new Personaggio();
    }

    /**
     * Create an instance of {@link CreateCharacterResponse }
     * 
     */
    public CreateCharacterResponse createCreateCharacterResponse() {
        return new CreateCharacterResponse();
    }

    /**
     * Create an instance of {@link RemovePersonaggio }
     * 
     */
    public RemovePersonaggio createRemovePersonaggio() {
        return new RemovePersonaggio();
    }

    /**
     * Create an instance of {@link SubGoldResponse }
     * 
     */
    public SubGoldResponse createSubGoldResponse() {
        return new SubGoldResponse();
    }

    /**
     * Create an instance of {@link Giocatore }
     * 
     */
    public Giocatore createGiocatore() {
        return new Giocatore();
    }

    /**
     * Create an instance of {@link AddExpResponse }
     * 
     */
    public AddExpResponse createAddExpResponse() {
        return new AddExpResponse();
    }

    /**
     * Create an instance of {@link RemovePersonaggioResponse }
     * 
     */
    public RemovePersonaggioResponse createRemovePersonaggioResponse() {
        return new RemovePersonaggioResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonaggioResponse }
     * 
     */
    public UpdatePersonaggioResponse createUpdatePersonaggioResponse() {
        return new UpdatePersonaggioResponse();
    }

    /**
     * Create an instance of {@link SubGold }
     * 
     */
    public SubGold createSubGold() {
        return new SubGold();
    }

    /**
     * Create an instance of {@link InsertPersonaggio }
     * 
     */
    public InsertPersonaggio createInsertPersonaggio() {
        return new InsertPersonaggio();
    }

    /**
     * Create an instance of {@link ListCharacter }
     * 
     */
    public ListCharacter createListCharacter() {
        return new ListCharacter();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SubGoldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "subGoldResponse")
    public JAXBElement<SubGoldResponse> createSubGoldResponse(SubGoldResponse value) {
        return new JAXBElement<SubGoldResponse>(_SubGoldResponse_QNAME, SubGoldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddExp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "addExp")
    public JAXBElement<AddExp> createAddExp(AddExp value) {
        return new JAXBElement<AddExp>(_AddExp_QNAME, AddExp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGoldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "addGoldResponse")
    public JAXBElement<AddGoldResponse> createAddGoldResponse(AddGoldResponse value) {
        return new JAXBElement<AddGoldResponse>(_AddGoldResponse_QNAME, AddGoldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCharacterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "createCharacterResponse")
    public JAXBElement<CreateCharacterResponse> createCreateCharacterResponse(CreateCharacterResponse value) {
        return new JAXBElement<CreateCharacterResponse>(_CreateCharacterResponse_QNAME, CreateCharacterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePersonaggio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "removePersonaggio")
    public JAXBElement<RemovePersonaggio> createRemovePersonaggio(RemovePersonaggio value) {
        return new JAXBElement<RemovePersonaggio>(_RemovePersonaggio_QNAME, RemovePersonaggio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCharacter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "createCharacter")
    public JAXBElement<CreateCharacter> createCreateCharacter(CreateCharacter value) {
        return new JAXBElement<CreateCharacter>(_CreateCharacter_QNAME, CreateCharacter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Personaggio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "personaggio")
    public JAXBElement<Personaggio> createPersonaggio(Personaggio value) {
        return new JAXBElement<Personaggio>(_Personaggio_QNAME, Personaggio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGold }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "addGold")
    public JAXBElement<AddGold> createAddGold(AddGold value) {
        return new JAXBElement<AddGold>(_AddGold_QNAME, AddGold.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPersonaggioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "insertPersonaggioResponse")
    public JAXBElement<InsertPersonaggioResponse> createInsertPersonaggioResponse(InsertPersonaggioResponse value) {
        return new JAXBElement<InsertPersonaggioResponse>(_InsertPersonaggioResponse_QNAME, InsertPersonaggioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCharacterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "listCharacterResponse")
    public JAXBElement<ListCharacterResponse> createListCharacterResponse(ListCharacterResponse value) {
        return new JAXBElement<ListCharacterResponse>(_ListCharacterResponse_QNAME, ListCharacterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonaggio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "updatePersonaggio")
    public JAXBElement<UpdatePersonaggio> createUpdatePersonaggio(UpdatePersonaggio value) {
        return new JAXBElement<UpdatePersonaggio>(_UpdatePersonaggio_QNAME, UpdatePersonaggio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPersonaggio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "insertPersonaggio")
    public JAXBElement<InsertPersonaggio> createInsertPersonaggio(InsertPersonaggio value) {
        return new JAXBElement<InsertPersonaggio>(_InsertPersonaggio_QNAME, InsertPersonaggio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCharacter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "listCharacter")
    public JAXBElement<ListCharacter> createListCharacter(ListCharacter value) {
        return new JAXBElement<ListCharacter>(_ListCharacter_QNAME, ListCharacter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubGold }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "subGold")
    public JAXBElement<SubGold> createSubGold(SubGold value) {
        return new JAXBElement<SubGold>(_SubGold_QNAME, SubGold.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonaggioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "updatePersonaggioResponse")
    public JAXBElement<UpdatePersonaggioResponse> createUpdatePersonaggioResponse(UpdatePersonaggioResponse value) {
        return new JAXBElement<UpdatePersonaggioResponse>(_UpdatePersonaggioResponse_QNAME, UpdatePersonaggioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePersonaggioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "removePersonaggioResponse")
    public JAXBElement<RemovePersonaggioResponse> createRemovePersonaggioResponse(RemovePersonaggioResponse value) {
        return new JAXBElement<RemovePersonaggioResponse>(_RemovePersonaggioResponse_QNAME, RemovePersonaggioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddExpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "addExpResponse")
    public JAXBElement<AddExpResponse> createAddExpResponse(AddExpResponse value) {
        return new JAXBElement<AddExpResponse>(_AddExpResponse_QNAME, AddExpResponse.class, null, value);
    }

}
