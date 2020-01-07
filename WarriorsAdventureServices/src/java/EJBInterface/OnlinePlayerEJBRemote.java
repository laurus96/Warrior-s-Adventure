/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Giocatore;
import Entity.Personaggio;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author giuse
 */
@Remote
public interface OnlinePlayerEJBRemote {
    void login(Giocatore g,Personaggio p);
    void logout(Giocatore g);
    Map onlineList();
}
