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
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lorenzopaolococchinone
 */
@XmlRootElement
@Entity
@NamedQueries({
    @NamedQuery(name = Giocatore.FIND_ALL, query = "SELECT b FROM Giocatore b"),
    @NamedQuery(name = Giocatore.FIND_BYUSERPW, query = "SELECT b FROM Giocatore b WHERE b.username = :username AND b.password = :password"),
    @NamedQuery(name = Giocatore.FIND_BYUSER, query = "SELECT b FROM Giocatore b WHERE b.username = :username OR b.email = :email")

})
public class Giocatore implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    public static final String FIND_ALL = "Giocatore.FindAllGiocatore";
    public static final String FIND_BYUSERPW = "Giocatore.findByUserpw";
    public static final String FIND_BYUSER = "Giocatore.findByUser";

    
    @Id @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String email;
    private boolean ban;

    public Giocatore() {
    }

    public Giocatore(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.ban = false;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isBan() {
        return ban;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }

    @Override
    public String toString() {
        return "Giocatore{" + "username=" + username + ", password=" + password + ", email=" + email + ", ban=" + ban + '}';
    }
    

    
    

    
}
