/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import EJBInterface.OnlinePlayerEJBRemote;
import Entity.Giocatore;
import Entity.Personaggio;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author laurus
 */
@WebService
@Stateless
@LocalBean
public class OnlinePlayerEJB implements OnlinePlayerEJBRemote {
    
    private final Map<Giocatore, Personaggio> map = new HashMap<>();

    @Override
    public void addPlayer(Giocatore key, Personaggio value) {
        if(!map.containsValue(value)){
            System.out.println("Ciao");
            map.put(key, value);
        }
        
        
    }
    

    @Override
    public void removePlayer(Giocatore key) {
        map.remove(key);
    }

    @Override
    public Collection<Personaggio> returnHashMap() {
        return map.values();
    }
    
}
