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
import javax.persistence.Column;
import javax.persistence.NamedQueries;
import javax.validation.constraints.Size;

/**
 *
 * @author lorenzopaolococchinone
 */
@Entity
@NamedQueries({
    
    @NamedQuery(name = Giocatore.FIND_BYUSER, query = "SELECT b FROM Giocatore b WHERE b.username = ?1 && b.password = ?2")

})
public class Giocatore implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    public static final String FIND_BYUSER = "Giocatore.findByUser";

    
    @Id @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String email;

    public Giocatore() {
    }

    public Giocatore(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
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

    @Override
    public String toString() {
        return "Giocatore{" + "id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + '}';
    }
    
}
