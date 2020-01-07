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
    @NamedQuery(name = Armatura.FIND_ARMOR, query = "SELECT a FROM Armatura a WHERE a.livello = :livello"),
    @NamedQuery(name = Armatura.BOUGHT_ARMOR, query = "SELECT a FROM Armatura a WHERE a.id = :id"),
    @NamedQuery(name = Armatura.DELETE_ARMOR, query = "DELETE FROM Armatura WHERE id = :id")
})
public class Armatura implements Serializable{
    
    public static final long serialVersionUID=3L;
    
    public static final String FIND_ARMOR="Armatura.FIND_Armor";
    public static final String BOUGHT_ARMOR = "Armatuta.Bought_Armor";
    public static final String DELETE_ARMOR = "Armatura.Delete_Armor";
    
    @Id @GeneratedValue
    private long id;
    private String name;
    private int forza;
    private int vitalità;
    private int difesa;
    private int livello;
    private int prezzo;

    public Armatura() {
    }

    public Armatura(String nome, int livello, int prezzo) {
        this.name = nome;
        this.livello = livello;
        this.prezzo = prezzo;
        
        if (name.compareTo("Armatura da Guerra")==0){
            forza=10*livello;
            vitalità=0;
            difesa=0;
        }
        
        if (name.compareTo("Veste Runica")==0){
            forza=0;
            vitalità=10*livello;
            difesa=0;
        }
        
        if (name.compareTo("Armatura da Cavallo")==0){
            forza=0;
            vitalità=0;
            difesa=10*livello;
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

    public int getVitalità() {
        return vitalità;
    }

    public int getDifesa() {
        return difesa;
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

    public void setVitalità(int vitalità) {
        this.vitalità = vitalità;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
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
        return "Armatura{" + "id=" + id + ", name=" + name + ", forza=" + forza + ", vitalit\u00e0=" + vitalità + ", difesa=" + difesa + ", livello=" + livello + ", prezzo=" + prezzo + '}';
    }
    
    


}
