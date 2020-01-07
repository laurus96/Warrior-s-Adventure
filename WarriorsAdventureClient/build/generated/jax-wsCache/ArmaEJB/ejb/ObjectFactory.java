
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

    private final static QName _DeleteWeapon_QNAME = new QName("http://EJB/", "deleteWeapon");
    private final static QName _InsertWeapon_QNAME = new QName("http://EJB/", "insertWeapon");
    private final static QName _FindWeaponsBylv_QNAME = new QName("http://EJB/", "findWeapons_bylv");
    private final static QName _Arma_QNAME = new QName("http://EJB/", "arma");
    private final static QName _FindWeaponsResponse_QNAME = new QName("http://EJB/", "findWeaponsResponse");
    private final static QName _UpdateWeapon_QNAME = new QName("http://EJB/", "updateWeapon");
    private final static QName _Personaggio_QNAME = new QName("http://EJB/", "personaggio");
    private final static QName _FindWeaponsBylvResponse_QNAME = new QName("http://EJB/", "findWeapons_bylvResponse");
    private final static QName _DeleteWeaponResponse_QNAME = new QName("http://EJB/", "deleteWeaponResponse");
    private final static QName _FindWeapons_QNAME = new QName("http://EJB/", "findWeapons");
    private final static QName _InsertWeaponResponse_QNAME = new QName("http://EJB/", "insertWeaponResponse");
    private final static QName _UpdateWeaponResponse_QNAME = new QName("http://EJB/", "updateWeaponResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindWeapons }
     * 
     */
    public FindWeapons createFindWeapons() {
        return new FindWeapons();
    }

    /**
     * Create an instance of {@link DeleteWeaponResponse }
     * 
     */
    public DeleteWeaponResponse createDeleteWeaponResponse() {
        return new DeleteWeaponResponse();
    }

    /**
     * Create an instance of {@link UpdateWeaponResponse }
     * 
     */
    public UpdateWeaponResponse createUpdateWeaponResponse() {
        return new UpdateWeaponResponse();
    }

    /**
     * Create an instance of {@link InsertWeaponResponse }
     * 
     */
    public InsertWeaponResponse createInsertWeaponResponse() {
        return new InsertWeaponResponse();
    }

    /**
     * Create an instance of {@link FindWeaponsBylvResponse }
     * 
     */
    public FindWeaponsBylvResponse createFindWeaponsBylvResponse() {
        return new FindWeaponsBylvResponse();
    }

    /**
     * Create an instance of {@link Arma }
     * 
     */
    public Arma createArma() {
        return new Arma();
    }

    /**
     * Create an instance of {@link FindWeaponsResponse }
     * 
     */
    public FindWeaponsResponse createFindWeaponsResponse() {
        return new FindWeaponsResponse();
    }

    /**
     * Create an instance of {@link UpdateWeapon }
     * 
     */
    public UpdateWeapon createUpdateWeapon() {
        return new UpdateWeapon();
    }

    /**
     * Create an instance of {@link Personaggio }
     * 
     */
    public Personaggio createPersonaggio() {
        return new Personaggio();
    }

    /**
     * Create an instance of {@link DeleteWeapon }
     * 
     */
    public DeleteWeapon createDeleteWeapon() {
        return new DeleteWeapon();
    }

    /**
     * Create an instance of {@link FindWeaponsBylv }
     * 
     */
    public FindWeaponsBylv createFindWeaponsBylv() {
        return new FindWeaponsBylv();
    }

    /**
     * Create an instance of {@link InsertWeapon }
     * 
     */
    public InsertWeapon createInsertWeapon() {
        return new InsertWeapon();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteWeapon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "deleteWeapon")
    public JAXBElement<DeleteWeapon> createDeleteWeapon(DeleteWeapon value) {
        return new JAXBElement<DeleteWeapon>(_DeleteWeapon_QNAME, DeleteWeapon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertWeapon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "insertWeapon")
    public JAXBElement<InsertWeapon> createInsertWeapon(InsertWeapon value) {
        return new JAXBElement<InsertWeapon>(_InsertWeapon_QNAME, InsertWeapon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindWeaponsBylv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findWeapons_bylv")
    public JAXBElement<FindWeaponsBylv> createFindWeaponsBylv(FindWeaponsBylv value) {
        return new JAXBElement<FindWeaponsBylv>(_FindWeaponsBylv_QNAME, FindWeaponsBylv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Arma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "arma")
    public JAXBElement<Arma> createArma(Arma value) {
        return new JAXBElement<Arma>(_Arma_QNAME, Arma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindWeaponsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findWeaponsResponse")
    public JAXBElement<FindWeaponsResponse> createFindWeaponsResponse(FindWeaponsResponse value) {
        return new JAXBElement<FindWeaponsResponse>(_FindWeaponsResponse_QNAME, FindWeaponsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWeapon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "updateWeapon")
    public JAXBElement<UpdateWeapon> createUpdateWeapon(UpdateWeapon value) {
        return new JAXBElement<UpdateWeapon>(_UpdateWeapon_QNAME, UpdateWeapon.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindWeaponsBylvResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findWeapons_bylvResponse")
    public JAXBElement<FindWeaponsBylvResponse> createFindWeaponsBylvResponse(FindWeaponsBylvResponse value) {
        return new JAXBElement<FindWeaponsBylvResponse>(_FindWeaponsBylvResponse_QNAME, FindWeaponsBylvResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteWeaponResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "deleteWeaponResponse")
    public JAXBElement<DeleteWeaponResponse> createDeleteWeaponResponse(DeleteWeaponResponse value) {
        return new JAXBElement<DeleteWeaponResponse>(_DeleteWeaponResponse_QNAME, DeleteWeaponResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindWeapons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "findWeapons")
    public JAXBElement<FindWeapons> createFindWeapons(FindWeapons value) {
        return new JAXBElement<FindWeapons>(_FindWeapons_QNAME, FindWeapons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertWeaponResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "insertWeaponResponse")
    public JAXBElement<InsertWeaponResponse> createInsertWeaponResponse(InsertWeaponResponse value) {
        return new JAXBElement<InsertWeaponResponse>(_InsertWeaponResponse_QNAME, InsertWeaponResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWeaponResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://EJB/", name = "updateWeaponResponse")
    public JAXBElement<UpdateWeaponResponse> createUpdateWeaponResponse(UpdateWeaponResponse value) {
        return new JAXBElement<UpdateWeaponResponse>(_UpdateWeaponResponse_QNAME, UpdateWeaponResponse.class, null, value);
    }

}
