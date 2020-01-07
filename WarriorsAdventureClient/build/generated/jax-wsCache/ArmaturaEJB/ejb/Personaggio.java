
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per personaggio complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="personaggio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="armatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defense" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="exp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="guild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="livello" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strenght" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vitality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personaggio", propOrder = {
    "arma",
    "armatura",
    "classe",
    "defense",
    "exp",
    "gold",
    "guild",
    "livello",
    "name",
    "strenght",
    "vitality"
})
public class Personaggio {

    protected String arma;
    protected String armatura;
    protected String classe;
    protected int defense;
    protected int exp;
    protected int gold;
    protected String guild;
    protected int livello;
    protected String name;
    protected int strenght;
    protected int vitality;

    /**
     * Recupera il valore della proprietà arma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArma() {
        return arma;
    }

    /**
     * Imposta il valore della proprietà arma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArma(String value) {
        this.arma = value;
    }

    /**
     * Recupera il valore della proprietà armatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmatura() {
        return armatura;
    }

    /**
     * Imposta il valore della proprietà armatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmatura(String value) {
        this.armatura = value;
    }

    /**
     * Recupera il valore della proprietà classe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasse() {
        return classe;
    }

    /**
     * Imposta il valore della proprietà classe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasse(String value) {
        this.classe = value;
    }

    /**
     * Recupera il valore della proprietà defense.
     * 
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Imposta il valore della proprietà defense.
     * 
     */
    public void setDefense(int value) {
        this.defense = value;
    }

    /**
     * Recupera il valore della proprietà exp.
     * 
     */
    public int getExp() {
        return exp;
    }

    /**
     * Imposta il valore della proprietà exp.
     * 
     */
    public void setExp(int value) {
        this.exp = value;
    }

    /**
     * Recupera il valore della proprietà gold.
     * 
     */
    public int getGold() {
        return gold;
    }

    /**
     * Imposta il valore della proprietà gold.
     * 
     */
    public void setGold(int value) {
        this.gold = value;
    }

    /**
     * Recupera il valore della proprietà guild.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuild() {
        return guild;
    }

    /**
     * Imposta il valore della proprietà guild.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuild(String value) {
        this.guild = value;
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
     * Recupera il valore della proprietà strenght.
     * 
     */
    public int getStrenght() {
        return strenght;
    }

    /**
     * Imposta il valore della proprietà strenght.
     * 
     */
    public void setStrenght(int value) {
        this.strenght = value;
    }

    /**
     * Recupera il valore della proprietà vitality.
     * 
     */
    public int getVitality() {
        return vitality;
    }

    /**
     * Imposta il valore della proprietà vitality.
     * 
     */
    public void setVitality(int value) {
        this.vitality = value;
    }

}
