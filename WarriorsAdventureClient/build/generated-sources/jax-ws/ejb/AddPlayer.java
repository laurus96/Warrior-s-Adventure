
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per addPlayer complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="addPlayer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://EJB/}giocatore" minOccurs="0"/&gt;
 *         &lt;element name="arg1" type="{http://EJB/}personaggio" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPlayer", propOrder = {
    "arg0",
    "arg1"
})
public class AddPlayer {

    protected Giocatore arg0;
    protected Personaggio arg1;

    /**
     * Recupera il valore della proprietà arg0.
     * 
     * @return
     *     possible object is
     *     {@link Giocatore }
     *     
     */
    public Giocatore getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della proprietà arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Giocatore }
     *     
     */
    public void setArg0(Giocatore value) {
        this.arg0 = value;
    }

    /**
     * Recupera il valore della proprietà arg1.
     * 
     * @return
     *     possible object is
     *     {@link Personaggio }
     *     
     */
    public Personaggio getArg1() {
        return arg1;
    }

    /**
     * Imposta il valore della proprietà arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link Personaggio }
     *     
     */
    public void setArg1(Personaggio value) {
        this.arg1 = value;
    }

}
