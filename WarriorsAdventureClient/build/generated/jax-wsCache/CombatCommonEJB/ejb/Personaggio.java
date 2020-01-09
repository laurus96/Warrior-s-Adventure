
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="armorDef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="armorLv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="armorStr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="armorVit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="base_def" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="base_str" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="base_vit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="classe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="combat_key" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="defense" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="exp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="guild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="livello" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remainexp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="strenght" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vitality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="weaponLv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="weaponStr" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "armorDef",
    "armorLv",
    "armorStr",
    "armorVit",
    "baseDef",
    "baseStr",
    "baseVit",
    "classe",
    "combatKey",
    "defense",
    "exp",
    "gold",
    "guild",
    "id",
    "livello",
    "name",
    "remainexp",
    "strenght",
    "vitality",
    "weaponLv",
    "weaponStr"
})
public class Personaggio {

    protected String arma;
    protected String armatura;
    protected int armorDef;
    protected int armorLv;
    protected int armorStr;
    protected int armorVit;
    @XmlElement(name = "base_def")
    protected int baseDef;
    @XmlElement(name = "base_str")
    protected int baseStr;
    @XmlElement(name = "base_vit")
    protected int baseVit;
    protected String classe;
    @XmlElement(name = "combat_key")
    protected long combatKey;
    protected int defense;
    protected int exp;
    protected int gold;
    protected String guild;
    protected long id;
    protected int livello;
    protected String name;
    protected int remainexp;
    protected int strenght;
    protected int vitality;
    protected int weaponLv;
    protected int weaponStr;

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
     * Recupera il valore della proprietà armorDef.
     * 
     */
    public int getArmorDef() {
        return armorDef;
    }

    /**
     * Imposta il valore della proprietà armorDef.
     * 
     */
    public void setArmorDef(int value) {
        this.armorDef = value;
    }

    /**
     * Recupera il valore della proprietà armorLv.
     * 
     */
    public int getArmorLv() {
        return armorLv;
    }

    /**
     * Imposta il valore della proprietà armorLv.
     * 
     */
    public void setArmorLv(int value) {
        this.armorLv = value;
    }

    /**
     * Recupera il valore della proprietà armorStr.
     * 
     */
    public int getArmorStr() {
        return armorStr;
    }

    /**
     * Imposta il valore della proprietà armorStr.
     * 
     */
    public void setArmorStr(int value) {
        this.armorStr = value;
    }

    /**
     * Recupera il valore della proprietà armorVit.
     * 
     */
    public int getArmorVit() {
        return armorVit;
    }

    /**
     * Imposta il valore della proprietà armorVit.
     * 
     */
    public void setArmorVit(int value) {
        this.armorVit = value;
    }

    /**
     * Recupera il valore della proprietà baseDef.
     * 
     */
    public int getBaseDef() {
        return baseDef;
    }

    /**
     * Imposta il valore della proprietà baseDef.
     * 
     */
    public void setBaseDef(int value) {
        this.baseDef = value;
    }

    /**
     * Recupera il valore della proprietà baseStr.
     * 
     */
    public int getBaseStr() {
        return baseStr;
    }

    /**
     * Imposta il valore della proprietà baseStr.
     * 
     */
    public void setBaseStr(int value) {
        this.baseStr = value;
    }

    /**
     * Recupera il valore della proprietà baseVit.
     * 
     */
    public int getBaseVit() {
        return baseVit;
    }

    /**
     * Imposta il valore della proprietà baseVit.
     * 
     */
    public void setBaseVit(int value) {
        this.baseVit = value;
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
     * Recupera il valore della proprietà combatKey.
     * 
     */
    public long getCombatKey() {
        return combatKey;
    }

    /**
     * Imposta il valore della proprietà combatKey.
     * 
     */
    public void setCombatKey(long value) {
        this.combatKey = value;
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
     * Recupera il valore della proprietà remainexp.
     * 
     */
    public int getRemainexp() {
        return remainexp;
    }

    /**
     * Imposta il valore della proprietà remainexp.
     * 
     */
    public void setRemainexp(int value) {
        this.remainexp = value;
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

    /**
     * Recupera il valore della proprietà weaponLv.
     * 
     */
    public int getWeaponLv() {
        return weaponLv;
    }

    /**
     * Imposta il valore della proprietà weaponLv.
     * 
     */
    public void setWeaponLv(int value) {
        this.weaponLv = value;
    }

    /**
     * Recupera il valore della proprietà weaponStr.
     * 
     */
    public int getWeaponStr() {
        return weaponStr;
    }

    /**
     * Imposta il valore della proprietà weaponStr.
     * 
     */
    public void setWeaponStr(int value) {
        this.weaponStr = value;
    }

}
