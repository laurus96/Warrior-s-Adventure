/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import EJBInterface.OnlinePlayerEJBRemote;
import Entity.Giocatore;
import Entity.Personaggio;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.jws.WebService;

/**
 *
 * @author giuse
 */
@WebService
@Stateless
@Singleton
@LocalBean
public class OnlinePlayerEJB implements OnlinePlayerEJBRemote{
    private final Map<Giocatore,Personaggio> map = new HashMap<>();
    
    @Override
    public void login(Giocatore g,Personaggio p){
        map.put(g, p);
    }
    
    @Override
    public void logout(Giocatore g){
        map.remove(g);
    }
    
    @Override
    public Map onlineList(){
        return map;
    }
}
