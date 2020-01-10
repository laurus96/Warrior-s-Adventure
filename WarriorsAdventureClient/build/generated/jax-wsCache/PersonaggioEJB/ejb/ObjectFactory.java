
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

    private final static QName _AddExp_QNAME = new QName("http://EJB/", "addExp");
    private final static QName _AddExpResponse_QNAME = new QName("http://EJB/", "addExpResponse");
    private final static QName _AddGold_QNAME = new QName("http://EJB/", "addGold");
    private final static QName _AddGoldResponse_QNAME = new QName("http://EJB/", "addGoldResponse");
    private final static QName _Arma_QNAME = new QName("http://EJB/", "arma");
    private final static QName _Armatura_QNAME = new QName("http://EJB/", "armatura");
    private final static QName _BoughtArmor_QNAME = new QName("http://EJB/", "boughtArmor");
    private final static QName _BoughtArmorResponse_QNAME = new QName("http://EJB/", "boughtArmorResponse");
    private final static QName _BoughtWeapon_QNAME = new QName("http://EJB/", "boughtWeapon");
    private final static QName _BoughtWeaponResponse_QNAME = new QName("http://EJB/", "boughtWeaponResponse");
    private final static QName _CreateCharacter_QNAME = new QName("http://EJB/", "createCharacter");
    private final static QName _CreateCharacterResponse_QNAME = new QName("http://EJB/", "createCharacterResponse");
    private final static QName _FindByID_QNAME = new QName("http://EJB/", "findByID");
    private final static QName _FindByIDResponse_QNAME = new QName("http://EJB/", "findByIDResponse");
    private final static QName _FindCharacter_QNAME = new QName("http://EJB/", "findCharacter");
    private final static QName _FindCharacterResponse_QNAME = new QName("http://EJB/", "findCharacterResponse");
    private final static QName _FineDuello_QNAME = new QName("http://EJB/", "fineDuello");
    private final static QName _FineDuelloResponse_QNAME = new QName("http://EJB/", "fineDuelloResponse");
    private final static QName _Giocatore_QNAME = new QName("http://EJB/", "giocatore");
    private final static QName _InsertPersonaggio_QNAME = new QName("http://EJB/", "insertPersonaggio");
    private final static QName _InsertPersonaggioResponse_QNAME = new QName("http://EJB/", "insertPersonaggioResponse");
    private final static QName _LevelUp_QNAME = new QName("http://EJB/", "levelUp");
    private final static QName _LevelUpResponse_QNAME = new QName("http://EJB/", "levelUpResponse");
    private final static QName _ListCharacter_QNAME = new QName("http://EJB/", "listCharacter");
    private final static QName _ListCharacterResponse_QNAME = new QName("http://EJB/", "listCharacterResponse");
    private final static QName _Personaggio_QNAME = new QName("http://EJB/", "personaggio");
    private final static QName _RemovePersonaggio_QNAME = new QName("http://EJB/", "removePersonaggio");
    private final static QName _RemovePersonaggioResponse_QNAME = new QName("http://EJB/", "removePersonaggioResponse");
    private final static QName _SubGold_QNAME = new QName("http://EJB/", "subGold");
    private final static QName _SubGoldResponse_QNAME = new QName("http://EJB/", "subGoldResponse");
    private final static QName _UpdatePersonaggio_QNAME = new QName("http://EJB/", "updatePersonaggio");
    private final static QName _UpdatePersonaggioResponse_QNAME = new QName("http://EJB/", "updatePersonaggioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddExp }
     * 
     */
    public AddExp createAddExp() {
        return new AddExp();
    }

    /**
     * Create an instance of {@link AddExpResponse }
     * 
     */
    public AddExpResponse createAddExpResponse() {
        return new AddExpResponse();
    }

    /**
     * Create an instance of {@link AddGold }
     * 
     */
    public AddGold createAddGold() {
        return new AddGold();
    }

    /**
     * Create an instance of {@link AddGoldResponse }
     * 
     */
    public AddGoldResponse createAddGoldResponse() {
        return new AddGoldResponse();
    }

    /**
     * Create an instance of {@link Arma }
     * 
     */
    public Arma createArma() {
        return new Arma();
    }

    /**
     * Create an instance of {@link Armatura }
     * 
     */
    public Armatura createArmatura() {
        return new Armatura();
    }

    /**
     * Create an instance of {@link BoughtArmor }
     * 
     */
    public BoughtArmor createBoughtArmor() {
        return new BoughtArmor();
    }

    /**
     * Create an instance of {@link BoughtArmorResponse }
     * 
     */
    public BoughtArmorResponse createBoughtArmorResponse() {
        return new BoughtArmorResponse();
    }

    /**
     * Create an instance of {@link BoughtWeapon }
     * 
     */
    public BoughtWeapon createBoughtWeapon() {
        return new BoughtWeapon();
    }

    /**
     * Create an instance of {@link BoughtWeaponResponse }
     * 
     */
    public BoughtWeaponResponse createBoughtWeaponResponse() {
        return new BoughtWeaponResponse();
    }

    /**
     * Create an instance of {@link CreateCharacter }
     * 
     */
    public CreateCharacter createCreateCharacter() {
        return new CreateCharacter();
    }

    /**
     * Create an instance of {@link CreateCharacterResponse }
     * 
     */
    public CreateCharacterResponse createCreateCharacterResponse() {
        return new CreateCharacterResponse();
    }

    /**
     * Create an instance of {@link FindByID }
     * 
     */
    public FindByID createFindByID() {
        return new FindByID();
    }

    /**
     * Create an instance of {@link FindByIDResponse }
     * 
     */
    public FindByIDResponse createFindByIDResponse() {
        return new FindByIDResponse();
    }

    /**
     * Create an instance of {@link FindCharacter }
     * 
     */
    public FindCharacter createFindCharacter() {
        return new FindCharacter();
    }

    /**
     * Create an instance of {@link FindCharacterResponse }
     * 
     */
    public FindCharacterResponse createFindCharacterResponse() {
        return new FindCharacterResponse();
    }

    /**
     * Create an instance of {@link FineDuello }
     * 
     */
    public FineDuello createFineDuello() {
        return new FineDuello();
    }

    /**
     * Create an instance of {@link FineDuelloResponse }
     * 
     */
    public FineDuelloResponse createFineDuelloResponse() {
        return new FineDuelloResponse();
    }

    /**
     * Create an instance of {@link Giocatore }
     * 
     */
    public Giocatore createGiocatore() {
        return new Giocatore();
    }

    /**
     * Create an instance of {@link InsertPersonaggio }
     * 
     */
    public InsertPersonaggio createInsertPersonaggio() {
        return new InsertPersonaggio();
    }

    /**
     * Create an instance of {@link InsertPersonaggioResponse }
     * 
     */
    public InsertPersonaggioResponse createInsertPersonaggioResponse() {
        return new InsertPersonaggioResponse();
    }

    /**
     * Create an instance of {@link LevelUp }
     * 
     */
    public LevelUp createLevelUp() {
        return new LevelUp();
    }

    /**
     * Create an instance of {@link LevelUpResponse }
     * 
     */
    public LevelUpResponse createLevelUpResponse() {
        return new LevelUpResponse();
    }

    /**
     * Create an instance of {@link ListCharacter }
     * 
     */
    public ListCharacter createListCharacter() {
        return new ListCharacter();
    }

    /**
     * Create an instance of {@link ListCharacterResponse }
     * 
     */
    public ListCharacterResponse createListCharacterResponse() {
        return new ListCharacterResponse();
    }

    /**
     * Create an instance of {@link Personaggio }
     * 
     */
    public Personaggio createPersonaggio() {
        return new Personaggio();
    }

    /**
     * Create an instance of {@link RemovePersonaggio }
     * 
     */
    public RemovePersonaggio createRemovePersonaggio() {
        return new RemovePersonaggio();
    }

    /**
     * Create an instance of {@link RemovePersonaggioResponse }
     * 
     */
    public RemovePersonaggioResponse createRemovePersonaggioResponse() {
        return new RemovePersonaggioResponse();
    }

    /**
     * Create an instance of {@link SubGold }
     * 
     */
    public SubGold createSubGold() {
        return new SubGold();
    }

    /**
     * Create an instance of {@link SubGoldResponse }
     * 
     */
    public SubGoldResponse createSubGoldResponse() {
        return new SubGoldResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonaggio }
     * 
     */
    public UpdatePersonaggio createUpdatePersonaggio() {
        return new UpdatePersonaggio();
    }

    /**
     * Create an instance of {@link UpdatePersonaggioResponse }
     * 
     */
    public UpdatePersonaggioResponse createUpdatePersonaggioResponse() {
        return new UpdatePersonaggioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddExp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddExp }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "addExp")
    public JAXBElement<AddExp> createAddExp(AddExp value) {
        return new JAXBElement<AddExp>(_AddExp_QNAME, AddExp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddExpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddExpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "addExpResponse")
    public JAXBElement<AddExpResponse> createAddExpResponse(AddExpResponse value) {
        return new JAXBElement<AddExpResponse>(_AddExpResponse_QNAME, AddExpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGold }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddGold }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "addGold")
    public JAXBElement<AddGold> createAddGold(AddGold value) {
        return new JAXBElement<AddGold>(_AddGold_QNAME, AddGold.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGoldResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddGoldResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "addGoldResponse")
    public JAXBElement<AddGoldResponse> createAddGoldResponse(AddGoldResponse value) {
        return new JAXBElement<AddGoldResponse>(_AddGoldResponse_QNAME, AddGoldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Arma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Arma }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "arma")
    public JAXBElement<Arma> createArma(Arma value) {
        return new JAXBElement<Arma>(_Arma_QNAME, Arma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Armatura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Armatura }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "armatura")
    public JAXBElement<Armatura> createArmatura(Armatura value) {
        return new JAXBElement<Armatura>(_Armatura_QNAME, Armatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoughtArmor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BoughtArmor }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "boughtArmor")
    public JAXBElement<BoughtArmor> createBoughtArmor(BoughtArmor value) {
        return new JAXBElement<BoughtArmor>(_BoughtArmor_QNAME, BoughtArmor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoughtArmorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BoughtArmorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "boughtArmorResponse")
    public JAXBElement<BoughtArmorResponse> createBoughtArmorResponse(BoughtArmorResponse value) {
        return new JAXBElement<BoughtArmorResponse>(_BoughtArmorResponse_QNAME, BoughtArmorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoughtWeapon }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BoughtWeapon }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "boughtWeapon")
    public JAXBElement<BoughtWeapon> createBoughtWeapon(BoughtWeapon value) {
        return new JAXBElement<BoughtWeapon>(_BoughtWeapon_QNAME, BoughtWeapon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoughtWeaponResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BoughtWeaponResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "boughtWeaponResponse")
    public JAXBElement<BoughtWeaponResponse> createBoughtWeaponResponse(BoughtWeaponResponse value) {
        return new JAXBElement<BoughtWeaponResponse>(_BoughtWeaponResponse_QNAME, BoughtWeaponResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCharacter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateCharacter }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "createCharacter")
    public JAXBElement<CreateCharacter> createCreateCharacter(CreateCharacter value) {
        return new JAXBElement<CreateCharacter>(_CreateCharacter_QNAME, CreateCharacter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCharacterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateCharacterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "createCharacterResponse")
    public JAXBElement<CreateCharacterResponse> createCreateCharacterResponse(CreateCharacterResponse value) {
        return new JAXBElement<CreateCharacterResponse>(_CreateCharacterResponse_QNAME, CreateCharacterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByID }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findByID")
    public JAXBElement<FindByID> createFindByID(FindByID value) {
        return new JAXBElement<FindByID>(_FindByID_QNAME, FindByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findByIDResponse")
    public JAXBElement<FindByIDResponse> createFindByIDResponse(FindByIDResponse value) {
        return new JAXBElement<FindByIDResponse>(_FindByIDResponse_QNAME, FindByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCharacter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindCharacter }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findCharacter")
    public JAXBElement<FindCharacter> createFindCharacter(FindCharacter value) {
        return new JAXBElement<FindCharacter>(_FindCharacter_QNAME, FindCharacter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCharacterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindCharacterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findCharacterResponse")
    public JAXBElement<FindCharacterResponse> createFindCharacterResponse(FindCharacterResponse value) {
        return new JAXBElement<FindCharacterResponse>(_FindCharacterResponse_QNAME, FindCharacterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FineDuello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FineDuello }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "fineDuello")
    public JAXBElement<FineDuello> createFineDuello(FineDuello value) {
        return new JAXBElement<FineDuello>(_FineDuello_QNAME, FineDuello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FineDuelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FineDuelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "fineDuelloResponse")
    public JAXBElement<FineDuelloResponse> createFineDuelloResponse(FineDuelloResponse value) {
        return new JAXBElement<FineDuelloResponse>(_FineDuelloResponse_QNAME, FineDuelloResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPersonaggio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertPersonaggio }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "insertPersonaggio")
    public JAXBElement<InsertPersonaggio> createInsertPersonaggio(InsertPersonaggio value) {
        return new JAXBElement<InsertPersonaggio>(_InsertPersonaggio_QNAME, InsertPersonaggio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPersonaggioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertPersonaggioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "insertPersonaggioResponse")
    public JAXBElement<InsertPersonaggioResponse> createInsertPersonaggioResponse(InsertPersonaggioResponse value) {
        return new JAXBElement<InsertPersonaggioResponse>(_InsertPersonaggioResponse_QNAME, InsertPersonaggioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LevelUp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LevelUp }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "levelUp")
    public JAXBElement<LevelUp> createLevelUp(LevelUp value) {
        return new JAXBElement<LevelUp>(_LevelUp_QNAME, LevelUp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LevelUpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LevelUpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "levelUpResponse")
    public JAXBElement<LevelUpResponse> createLevelUpResponse(LevelUpResponse value) {
        return new JAXBElement<LevelUpResponse>(_LevelUpResponse_QNAME, LevelUpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCharacter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListCharacter }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "listCharacter")
    public JAXBElement<ListCharacter> createListCharacter(ListCharacter value) {
        return new JAXBElement<ListCharacter>(_ListCharacter_QNAME, ListCharacter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCharacterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListCharacterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "listCharacterResponse")
    public JAXBElement<ListCharacterResponse> createListCharacterResponse(ListCharacterResponse value) {
        return new JAXBElement<ListCharacterResponse>(_ListCharacterResponse_QNAME, ListCharacterResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePersonaggio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemovePersonaggio }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "removePersonaggio")
    public JAXBElement<RemovePersonaggio> createRemovePersonaggio(RemovePersonaggio value) {
        return new JAXBElement<RemovePersonaggio>(_RemovePersonaggio_QNAME, RemovePersonaggio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePersonaggioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemovePersonaggioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "removePersonaggioResponse")
    public JAXBElement<RemovePersonaggioResponse> createRemovePersonaggioResponse(RemovePersonaggioResponse value) {
        return new JAXBElement<RemovePersonaggioResponse>(_RemovePersonaggioResponse_QNAME, RemovePersonaggioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubGold }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubGold }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "subGold")
    public JAXBElement<SubGold> createSubGold(SubGold value) {
        return new JAXBElement<SubGold>(_SubGold_QNAME, SubGold.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubGoldResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubGoldResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "subGoldResponse")
    public JAXBElement<SubGoldResponse> createSubGoldResponse(SubGoldResponse value) {
        return new JAXBElement<SubGoldResponse>(_SubGoldResponse_QNAME, SubGoldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonaggio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePersonaggio }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "updatePersonaggio")
    public JAXBElement<UpdatePersonaggio> createUpdatePersonaggio(UpdatePersonaggio value) {
        return new JAXBElement<UpdatePersonaggio>(_UpdatePersonaggio_QNAME, UpdatePersonaggio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonaggioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePersonaggioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "updatePersonaggioResponse")
    public JAXBElement<UpdatePersonaggioResponse> createUpdatePersonaggioResponse(UpdatePersonaggioResponse value) {
        return new JAXBElement<UpdatePersonaggioResponse>(_UpdatePersonaggioResponse_QNAME, UpdatePersonaggioResponse.class, null, value);
    }

}
