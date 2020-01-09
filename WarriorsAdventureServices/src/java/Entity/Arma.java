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
    @NamedQuery(name = Arma.FIND_WEAPON, query = "SELECT a FROM Arma a WHERE a.livello = :livello"),
    @NamedQuery(name = Arma.BOUGHT_WEAPON, query = "SELECT a FROM Arma a WHERE a.id = :id"),
    @NamedQuery(name = Arma.DELETE_WEAPON, query = "DELETE FROM Arma WHERE id = :id")
})
public class Arma implements Serializable {
    
    public static final long serialVersionUID=4L;
    
    public static final String FIND_WEAPON="Arma.Find_Weapon";
    public static final String DELETE_WEAPON = "Arma.Delete_Weapon";
    public static final String BOUGHT_WEAPON = "Arma.Bought_Weapon";

    
    @Id @GeneratedValue
    private long id;
    private String name;
    private int forza;
    private int livello;
    private int prezzo;

    public Arma() {
    }

    public Arma(String name, int livello, int prezzo) {
        this.name = name;
        this.livello = livello;
        this.prezzo = prezzo;
        
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Arma{" + "id=" + id + ", name=" + name + ", forza=" + forza + ", livello=" + livello + ", prezzo=" + prezzo + '}';
    }
    
    

}
