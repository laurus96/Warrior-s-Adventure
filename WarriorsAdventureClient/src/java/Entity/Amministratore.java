/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author laurus
 */


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
    @NamedQuery(name = Amministratore.FIND_BYAM, query = "SELECT b FROM Amministratore b WHERE b.username = :username AND b.password = :password")
})
public class Amministratore implements Serializable {
    
    
    private static final long serialVersionUID = 5L;
    
    public static final String FIND_BYAM = "Amministratore.Find_Am";
        
    @Id @GeneratedValue
    private Long id;
    private String username;
    private String password;

    public Amministratore() {
    }

    public Amministratore(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Administration{" + "id=" + id + ", username=" + username + ", password=" + password + '}';
    }

}
