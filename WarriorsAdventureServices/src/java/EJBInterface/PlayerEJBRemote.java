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
public interface PlayerEJBRemote {
    Giocatore findPlayer(String username, String password);
    Giocatore insertPlayer(Giocatore newPlayer);
    Giocatore updatePlayer(Giocatore player);
    void removePlayer(Giocatore player);

    Giocatore login(String username, String password);
    Giocatore registration(String username, String password, String email);
    boolean findRegisteredPlayer(String username, String email);
    
}
