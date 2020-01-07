
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per boughtArmor complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="boughtArmor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://EJB/}personaggio" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://EJB/}armatura" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "boughtArmor", propOrder = {
    "arg0",
    "arg1"
})
public class BoughtArmor {

    protected Personaggio arg0;
    protected Armatura arg1;

    /**
     * Recupera il valore della proprietà arg0.
     * 
     * @return
     *     possible object is
     *     {@link Personaggio }
     *     
     */
    public Personaggio getArg0() {
        return arg0;
    }

    /**
     * Imposta il valore della proprietà arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Personaggio }
     *     
     */
    public void setArg0(Personaggio value) {
        this.arg0 = value;
    }

    /**
     * Recupera il valore della proprietà arg1.
     * 
     * @return
     *     possible object is
     *     {@link Armatura }
     *     
     */
    public Armatura getArg1() {
        return arg1;
    }

    /**
     * Imposta il valore della proprietà arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link Armatura }
     *     
     */
    public void setArg1(Armatura value) {
        this.arg1 = value;
    }

}
