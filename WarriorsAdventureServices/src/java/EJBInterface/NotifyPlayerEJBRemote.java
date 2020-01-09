/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Personaggio;
import java.util.Collection;
import javax.ejb.Remote;

/**
 *
 * @author laurus
 */
@Remote
public interface NotifyPlayerEJBRemote {
    
    void inizialization(Long id);
    
    void addNotify(Long id, Personaggio enemy);
    void removeNotify(Long id);
    Collection<Personaggio> returnMap(Long id);
    
}
