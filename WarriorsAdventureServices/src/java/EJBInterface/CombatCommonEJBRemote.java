/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Fight;
import Entity.Personaggio;

/**
 *
 * @author laurus
 */
public interface CombatCommonEJBRemote {

    void inizialization_combat(Personaggio a, Personaggio b);
    void removeCombat(Personaggio a, Personaggio b);
    Fight returnFight(Personaggio a);
    
    String attack(Personaggio a);

    
}
