
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updateAmministratore complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="updateAmministratore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://EJB/}amministratore" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateAmministratore", propOrder = {
    "arg0"
})
public class UpdateAmministratore {

    protected Amministratore arg0;

    /**
     * Recupera il valore della proprietà arg0.
     * 
     * @return
     *     possible object is
     *     {@link Amministratore }
     *     
     */
    public Amministratore getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della proprietà arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Amministratore }
     *     
     */
    public void setArg0(Amministratore value) {
        this.arg0 = value;
    }

}
