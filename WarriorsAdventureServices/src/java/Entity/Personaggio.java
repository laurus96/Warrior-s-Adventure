/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@NamedQueries({
    @NamedQuery(name = Personaggio.FIND_BYUS, query = "SELECT b FROM Personaggio b WHERE b.username = :username"),
    @NamedQuery(name = Personaggio.FIND_BYID, query = "SELECT b FROM Personaggio b WHERE b.id = :id"),
    @NamedQuery(name = Personaggio.FIND_BYUSNA, query = "SELECT b FROM Personaggio b WHERE b.username = :username AND b.name = :name"),
    @NamedQuery(name = Personaggio.SAVE_BYID, query = "UPDATE Personaggio p \n" +
                                                        "SET p.livello = :livello, \n" +
                                                        "    p.vitality = :vitality, \n" +
                                                        "    p.defense = :defense,\n" +
                                                        "    p.strenght = :strenght,\n" +
                                                        "    p.gold = :gold,\n" +
                                                        "    p.exp = :exp,\n" +
                                                        "    p.arma = :arma,\n" +
                                                        "    p.armatura = :armatura,\n" +
                                                        "    p.base_vit = :base_vit,\n" +
                                                        "    p.base_def = :base_def,\n" +
                                                        "    p.base_str = :base_str,\n" +
                                                        "    p.armorLv = :armorLv,\n" +
                                                        "    p.weaponLv = :weaponLv,\n" +
                                                        "    p.armorStr = :armorStr,\n" +
                                                        "    p.armorDef = :armorDef,\n" +
                                                        "    p.armorVit = :armorVit,\n" +
                                                        "    p.combat_key = :combat_key\n" +
                                                        "WHERE p.id = :id")
})
public class Personaggio implements Serializable {
    
    private static final long serialVersionUID = 2L;
    
    public static final String FIND_BYUS = "Personaggio.findByUsername";
    public static final String FIND_BYID = "Personaggio.fidnByID";
    public static final String FIND_BYUSNA = "Personaggio.findByUsernameName";
    public static final String SAVE_BYID = "Personaggio.Save_by_id";

    
    @Id @GeneratedValue
    private long id;
    
    private String name;

    private String classe;
    private int livello;
    private int vitality;
    private int defense;
    private int strenght;
    private int gold;
    private int exp;
    private int remainexp;
    
    private String username;
    
    private String arma;
    
    private String armatura;
    
    private int base_vit;
    private int base_def;
    private int base_str;
    
    private int armorStr;
    private int armorVit;
    private int armorDef;
    private int weaponStr;
    
    private int armorLv;
    private int weaponLv;
    
    private long combat_key;

    public Personaggio() {
    }

    public Personaggio(String name, String classe, String username) {
        
        this.arma = "Mani nude";
        this.armatura = "Straccio di seta";
       
        this.name = name;
        this.classe = classe;
        livello=1;
        if (classe.compareTo("Guerriero")==0){
            base_vit = 75;
            base_def = 50;
            base_str = 100;
            
            vitality = base_vit;
            defense = base_def;
            strenght = base_str;
        }
        
        if (classe.compareTo("Paladino")==0){
            base_vit = 100;
            base_def = 50;
            base_str = 75;
            
            vitality = base_vit;
            defense = base_def;
            strenght = base_str;
        }
        
        if (classe.compareTo("Cavaliere")==0){
            
            base_vit = 50;
            base_def = 100;
            base_str = 75;
            
            vitality = base_vit;
            defense = base_def;
            strenght = base_str;
        }
        gold=10000;
        exp=0;
        remainexp=1000-exp;
        
        this.username=username;
        this.combat_key = 0;
    }
    

    public int getRemainexp() {
        return 1000-exp;
    }
    
    public String getName() {
        return name;
    }

    public String getClasse() {
        return classe;
    }

    public int getLivello() {
        return livello;
    }

    public int getVitality() {
        return vitality;
    }

    public int getDefense() {
        return defense;
    }

    public int getStrenght() {
        return strenght;
    }

    public int getGold() {
        return gold;
    }


    public int getExp() {
        return exp;
    }

    public void setRemainexp(int remainexp) {
        this.remainexp=remainexp;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setLivello(int level) {
        this.livello = level;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }


    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getArmatura() {
        return armatura;
    }

    public void setArmatura(String armatura) {
        this.armatura = armatura;
    }

    public int getBase_vit() {
        return base_vit;
    }

    public void setBase_vit(int base_vit) {
        this.base_vit = base_vit;
    }

    public int getBase_def() {
        return base_def;
    }

    public void setBase_def(int base_def) {
        this.base_def = base_def;
    }

    public int getBase_str() {
        return base_str;
    }

    public void setBase_str(int base_str) {
        this.base_str = base_str;
    }

    public int getArmorStr() {
        return armorStr;
    }

    public void setArmorStr(int armorStr) {
        this.armorStr = armorStr;
    }

    public int getWeaponStr() {
        return weaponStr;
    }

    public void setWeaponStr(int weaponStr) {
        this.weaponStr = weaponStr;
    }

    public int getArmorLv() {
        return armorLv;
    }

    public void setArmorLv(int armorLv) {
        this.armorLv = armorLv;
    }

    public int getWeaponLv() {
        return weaponLv;
    }

    public void setWeaponLv(int weaponLv) {
        this.weaponLv = weaponLv;
    }

    public int getArmorVit() {
        return armorVit;
    }

    public void setArmorVit(int armorVit) {
        this.armorVit = armorVit;
    }

    public int getArmorDef() {
        return armorDef;
    }

    public void setArmorDef(int armorDef) {
        this.armorDef = armorDef;
    }
    
     public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getCombat_key() {
        return combat_key;
    }

    public void setCombat_key(long combat_key) {
        this.combat_key = combat_key;
    }
    
}
