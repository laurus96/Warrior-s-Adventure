/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Amministratore;
import Entity.Giocatore;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author laurus
 */
@Remote
public interface AmministratoreEJBRemote {
    
    Amministratore logginAmministratore(String username, String password);
    Amministratore insertAmministratore(Amministratore am);
    Amministratore updateAmministratore(Amministratore am);
    void removeAmministratore(Amministratore am);
    List<Giocatore> allPlayers();
    List<Giocatore> BannedPlayers();
    String banPlayer(String username);
    String unbanPlayer(String username);
    //Moderatore promoteModerator(Moderatore mod);
 
}
