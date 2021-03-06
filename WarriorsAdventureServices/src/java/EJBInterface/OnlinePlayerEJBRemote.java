/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Giocatore;
import Entity.Personaggio;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author laurus
 */
@Remote
public interface OnlinePlayerEJBRemote {
    void addPlayer(Giocatore key, Personaggio value);
    void removePlayer(Giocatore key);
    Collection<Personaggio> returnHashMap();
    
}
