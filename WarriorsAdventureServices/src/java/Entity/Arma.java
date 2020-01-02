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

/**
 *
 * @author giuse
 */
@XmlRootElement
@Entity
@NamedQueries({
    @NamedQuery(name = Arma.FIND_WEAPON, query = "SELECT a FROM Arma a WHERE a.name= :name AND a.livello= :livello"),
})
public class Arma implements Serializable {
    
    public static final long serialVersionUID=1L;
    
    public static final String FIND_WEAPON="Arma.Find_Weapon";
    
    @Id @GeneratedValue
    private long id;
    private String name;
    private int forza;
    private int livello;

    public Arma() {
    }

    public Arma(String name, int livello) {
        this.name = name;
        this.livello = livello;
        
        if(name.compareTo("Spada")==0){
            forza=2*livello;
        }
        
        if(name.compareTo("Martello")==0){
            forza=4*livello;
        }
        
        if(name.compareTo("Ascia")==0){
            forza=6*livello;
        }
    }

    public String getName() {
        return name;
    }

    public int getForza() {
        return forza;
    }

    public int getLivello() {
        return livello;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }

    public void setLivello(int livello) {
        this.livello = livello;
    }

    @Override
    public String toString() {
        return "Arma{" + "name=" + name + ", forza=" + forza + ", livello=" + livello + '}';
    } 
}
