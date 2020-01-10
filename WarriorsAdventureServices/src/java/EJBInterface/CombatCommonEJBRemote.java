/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Fight;
import Entity.Personaggio;
import java.util.List;

/**
 *
 * @author laurus
 */
public interface CombatCommonEJBRemote {

    void inizializationCombat(Personaggio a, Personaggio b);
    void removeCombat(Personaggio a, Personaggio b);
    Fight returnFight(Personaggio a);
    
    List<String> attack(Personaggio a);
    List<String> defense(Personaggio a);
    List<String> heals(Personaggio a);
    List<String> leave(Personaggio a);
    
    Long winner(Long combatKey);

    
}
