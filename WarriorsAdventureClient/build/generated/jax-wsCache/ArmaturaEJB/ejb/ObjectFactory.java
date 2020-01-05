
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

    private final static QName _FindArmor_QNAME = new QName("http://EJB/", "findArmor");
    private final static QName _UpdateArmor_QNAME = new QName("http://EJB/", "updateArmor");
    private final static QName _DeleteArmor_QNAME = new QName("http://EJB/", "deleteArmor");
    private final static QName _Personaggio_QNAME = new QName("http://EJB/", "personaggio");
    private final static QName _InsertArmor_QNAME = new QName("http://EJB/", "insertArmor");
    private final static QName _DeleteArmorResponse_QNAME = new QName("http://EJB/", "deleteArmorResponse");
    private final static QName _FindArmorResponse_QNAME = new QName("http://EJB/", "findArmorResponse");
    private final static QName _UpdateArmorResponse_QNAME = new QName("http://EJB/", "updateArmorResponse");
    private final static QName _Armatura_QNAME = new QName("http://EJB/", "armatura");
    private final static QName _InsertArmorResponse_QNAME = new QName("http://EJB/", "insertArmorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Armatura }
     * 
     */
    public Armatura createArmatura() {
        return new Armatura();
    }

    /**
     * Create an instance of {@link InsertArmorResponse }
     * 
     */
    public InsertArmorResponse createInsertArmorResponse() {
        return new InsertArmorResponse();
    }

    /**
     * Create an instance of {@link InsertArmor }
     * 
     */
    public InsertArmor createInsertArmor() {
        return new InsertArmor();
    }

    /**
     * Create an instance of {@link UpdateArmorResponse }
     * 
     */
    public UpdateArmorResponse createUpdateArmorResponse() {
        return new UpdateArmorResponse();
    }

    /**
     * Create an instance of {@link DeleteArmorResponse }
     * 
     */
    public DeleteArmorResponse createDeleteArmorResponse() {
        return new DeleteArmorResponse();
    }

    /**
     * Create an instance of {@link FindArmorResponse }
     * 
     */
    public FindArmorResponse createFindArmorResponse() {
        return new FindArmorResponse();
    }

    /**
     * Create an instance of {@link Personaggio }
     * 
     */
    public Personaggio createPersonaggio() {
        return new Personaggio();
    }

    /**
     * Create an instance of {@link UpdateArmor }
     * 
     */
    public UpdateArmor createUpdateArmor() {
        return new UpdateArmor();
    }

    /**
     * Create an instance of {@link FindArmor }
     * 
     */
    public FindArmor createFindArmor() {
        return new FindArmor();
    }

    /**
     * Create an instance of {@link DeleteArmor }
     * 
     */
    public DeleteArmor createDeleteArmor() {
        return new DeleteArmor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindArmor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findArmor")
    public JAXBElement<FindArmor> createFindArmor(FindArmor value) {
        return new JAXBElement<FindArmor>(_FindArmor_QNAME, FindArmor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArmor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "updateArmor")
    public JAXBElement<UpdateArmor> createUpdateArmor(UpdateArmor value) {
        return new JAXBElement<UpdateArmor>(_UpdateArmor_QNAME, UpdateArmor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteArmor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "deleteArmor")
    public JAXBElement<DeleteArmor> createDeleteArmor(DeleteArmor value) {
        return new JAXBElement<DeleteArmor>(_DeleteArmor_QNAME, DeleteArmor.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertArmor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "insertArmor")
    public JAXBElement<InsertArmor> createInsertArmor(InsertArmor value) {
        return new JAXBElement<InsertArmor>(_InsertArmor_QNAME, InsertArmor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteArmorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "deleteArmorResponse")
    public JAXBElement<DeleteArmorResponse> createDeleteArmorResponse(DeleteArmorResponse value) {
        return new JAXBElement<DeleteArmorResponse>(_DeleteArmorResponse_QNAME, DeleteArmorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindArmorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findArmorResponse")
    public JAXBElement<FindArmorResponse> createFindArmorResponse(FindArmorResponse value) {
        return new JAXBElement<FindArmorResponse>(_FindArmorResponse_QNAME, FindArmorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArmorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "updateArmorResponse")
    public JAXBElement<UpdateArmorResponse> createUpdateArmorResponse(UpdateArmorResponse value) {
        return new JAXBElement<UpdateArmorResponse>(_UpdateArmorResponse_QNAME, UpdateArmorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Armatura }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "armatura")
    public JAXBElement<Armatura> createArmatura(Armatura value) {
        return new JAXBElement<Armatura>(_Armatura_QNAME, Armatura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertArmorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "insertArmorResponse")
    public JAXBElement<InsertArmorResponse> createInsertArmorResponse(InsertArmorResponse value) {
        return new JAXBElement<InsertArmorResponse>(_InsertArmorResponse_QNAME, InsertArmorResponse.class, null, value);
    }

}
