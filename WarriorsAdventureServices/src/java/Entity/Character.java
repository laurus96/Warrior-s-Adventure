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
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@NamedQueries({

})
public class Character implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id @GeneratedValue
    private long id;
    
    private String name;
    private String classe;
    private int level;
    private int vitality;
    private int defense;
    private int strenght;
    private int gold;
    private String guild;
    private int exp;
    
    private String username;

    public Character() {
    }

    public Character(String name, String classe,String username) {
        this.name = name;
        this.classe = classe;
        level=1;
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
        gold=0;
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

    public int getLevel() {
        return level;
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

    public void setLevel(int level) {
        this.level = level;
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

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", classe=" + classe + 
                ", level=" + level + ", vitality=" + vitality + ", defense=" + 
                defense + ", strenght=" + strenght + ", gold=" + gold + 
                ", guild=" + guild + ", exp=" + exp + '}';
    }
}
