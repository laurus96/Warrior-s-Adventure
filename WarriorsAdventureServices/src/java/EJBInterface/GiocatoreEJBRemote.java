/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Giocatore;
import javax.ejb.Remote;

/**
 *
 * @author laurus
 */
@Remote
public interface GiocatoreEJBRemote {
    Giocatore findPlayer(String username);
    Giocatore insertPlayer(Giocatore newPlayer);
    Giocatore updatePlayer(Giocatore player);
    void removePlayer(Giocatore player);

    Giocatore login(String username, String password);
    String registration(String username, String password, String repassword, String email);
    boolean findUsername(String username);
    boolean findEmail(String email);

    
}
