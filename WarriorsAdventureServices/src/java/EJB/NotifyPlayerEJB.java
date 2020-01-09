/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import EJBInterface.NotifyPlayerEJBRemote;
import Entity.Personaggio;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
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
public class NotifyPlayerEJB implements NotifyPlayerEJBRemote{
    
    private final Map<Long, LinkedList<Personaggio> > notifyMap = new HashMap<>();
    
    
    @Override
    public void inizialization(Long id) {
        LinkedList<Personaggio> enemy = new LinkedList<>();
        
        if(!notifyMap.containsKey(id)){
            notifyMap.put(id, enemy);
        }

        
    }

    @Override
    public void addNotify(Long id, Personaggio enemy) {
            notifyMap.get(id).add(enemy);
    }

    @Override
    public void removeNotify(Long id) {
        notifyMap.get(id).clear();

    }

    @Override
    public Collection<Personaggio> returnMap(Long id) {
        return notifyMap.get(id);
        
    }
  
}
