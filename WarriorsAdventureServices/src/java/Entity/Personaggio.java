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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@NamedQueries({
    @NamedQuery(name = Personaggio.FIND_BYUS, query = "SELECT b FROM Personaggio b WHERE b.username = :username"),
    @NamedQuery(name = Personaggio.FIND_BYUSNA, query = "SELECT b FROM Personaggio b WHERE b.username = :username AND b.name = :name")
})
public class Personaggio implements Serializable {
    
    private static final long serialVersionUID = 2L;
    
    public static final String FIND_BYUS = "Personaggio.findByUsername";
    public static final String FIND_BYUSNA = "Personaggio.findByUsernameName";

    
    @Id @GeneratedValue
    private long id;
    
    private String name;
    private String classe;
    private int livello;
    private int vitality;
    private int defense;
    private int strenght;
    private int gold;
    private String guild;
    private int exp;
    
    private String username;
    
    private String arma;
    
    private String armatura;
    
    public Personaggio() {
    }

    public Personaggio(String name, String classe, String username) {
        
        this.arma = "Mani nude";
        this.armatura = "Straccio di seta";
       
        this.name = name;
        this.classe = classe;
        livello=1;
        if (classe.compareTo("Guerriero")==0){
            vitality=75;
            defense=50;
            strenght=100;
        }
        
        if (classe.compareTo("Paladino")==0){
            vitality=100;
            defense=50;
            strenght=75;
        }
        
        if (classe.compareTo("Cavaliere")==0){
            vitality=50;
            defense=100;
            strenght=75;
        }
        gold=450;
        guild=null;
        exp=0;
        
        this.username=username;
    }

    public void levelUp(){
        vitality++;
        defense++;
        strenght++;
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

    public String getGuild() {
        return guild;
    }

    public int getExp() {
        return exp;
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

    public void setGuild(String guild) {
        this.guild = guild;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    
    public Personaggio boughtWeapon(Arma w){
        
        if(w.getName().compareTo("Spada")==0){
            this.strenght += w.getForza();
        }
        
        if(w.getName().compareTo("Martello")==0){
            this.strenght += w.getForza();
        }
        
        if(w.getName().compareTo("Ascia")==0){
            this.strenght += w.getForza();
        }
        
        this.arma = w.getName();
        this.gold -= w.getPrezzo();
        return this;
    }
    
    public Personaggio boughtArmor(Armatura a){

        if (a.getName().compareTo("Armatura del Guerriero")==0){
            this.strenght += a.getForza();
        }
        
        if (a.getName().compareTo("Armatura del Paladino")==0){
            this.vitality += a.getVitalità();
        }
        
        if (a.getName().compareTo("Armatura del Cavaliere")==0){
            this.defense += a.getDifesa();
        }
        
        this.armatura = a.getName();
        this.gold -= a.getPrezzo();

        return this;
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

    

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", classe=" + classe + 
                ", level=" + livello + ", vitality=" + vitality + ", defense=" + 
                defense + ", strenght=" + strenght + ", gold=" + gold + 
                ", guild=" + guild + ", exp=" + exp + '}';
    }
}
