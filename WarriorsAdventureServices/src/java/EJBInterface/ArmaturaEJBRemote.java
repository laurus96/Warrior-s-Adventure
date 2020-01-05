/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Armatura;
import Entity.Personaggio;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author laurus
 */
@Remote
public interface ArmaturaEJBRemote {
    
    List<Armatura> findArmor(Personaggio p);
    
    Armatura insertArmor(Armatura armor);
    Armatura updateArmor(Armatura armor);
    void deleteArmor(Armatura armor);
    
    
}
