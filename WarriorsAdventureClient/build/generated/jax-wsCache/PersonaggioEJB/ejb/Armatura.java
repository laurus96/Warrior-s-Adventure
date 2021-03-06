
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per armatura complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="armatura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="difesa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="forza" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="livello" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prezzo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="vitalità" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "armatura", propOrder = {
    "difesa",
    "forza",
    "id",
    "livello",
    "name",
    "prezzo",
    "vitalit\u00e0"
})
public class Armatura {

    protected int difesa;
    protected int forza;
    protected long id;
    protected int livello;
    protected String name;
    protected int prezzo;
    protected int vitalità;

    /**
     * Recupera il valore della proprietà difesa.
     * 
     */
    public int getDifesa() {
        return difesa;
    }

    /**
     * Imposta il valore della proprietà difesa.
     * 
     */
    public void setDifesa(int value) {
        this.difesa = value;
    }

    /**
     * Recupera il valore della proprietà forza.
     * 
     */
    public int getForza() {
        return forza;
    }

    /**
     * Imposta il valore della proprietà forza.
     * 
     */
    public void setForza(int value) {
        this.forza = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà livello.
     * 
     */
    public int getLivello() {
        return livello;
    }

    /**
     * Imposta il valore della proprietà livello.
     * 
     */
    public void setLivello(int value) {
        this.livello = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà prezzo.
     * 
     */
    public int getPrezzo() {
        return prezzo;
    }

    /**
     * Imposta il valore della proprietà prezzo.
     * 
     */
    public void setPrezzo(int value) {
        this.prezzo = value;
    }

    /**
     * Recupera il valore della proprietà vitalità.
     * 
     */
    public int getVitalità() {
        return vitalità;
    }

    /**
     * Imposta il valore della proprietà vitalità.
     * 
     */
    public void setVitalità(int value) {
        this.vitalità = value;
    }

}
