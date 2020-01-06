/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Arma;
import Entity.Personaggio;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author laurus
 */
@Remote
public interface ArmaEJBRemote {
    List<Arma> findWeapons(Personaggio p);
    Arma findWeapons_bylv(long id);
    
    Arma insertWeapon(Arma weapon);
    Arma updateWeapon(Arma weapon);
    void deleteWeapon(Arma weapon);
    
    
}
