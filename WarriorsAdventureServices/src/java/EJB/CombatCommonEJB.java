/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import EJBInterface.CombatCommonEJBRemote;
import Entity.Fight;
import Entity.Personaggio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

/**
 *
 * @author laurus
 */
@WebService
@Stateless
@LocalBean
public class CombatCommonEJB implements CombatCommonEJBRemote{
    
    private static Map<Long, Fight> combatMap = new HashMap<>();
    private Map<Long, ArrayList<String>> combatLog = new HashMap<>();
    
    @Inject
    private PersonaggioEJB ejb;
    
    
    
    @Override
    public void inizialization_combat(Personaggio a, Personaggio b) {
        
       long n_combat = combatMap.size() + 1;
       Fight combat = new Fight(a,b);
       
       combatMap.put(n_combat, combat);
       combatLog.put(n_combat, new ArrayList<String>());
       
       a.setCombat_key(n_combat);
       b.setCombat_key(n_combat);
       
       ejb.updatePersonaggio(a);
       ejb.updatePersonaggio(b);

    }

    @Override
    public void removeCombat(Personaggio a, Personaggio b) {
        a.setCombat_key(0);
        b.setCombat_key(0);
        
        ejb.updatePersonaggio(a);
        ejb.updatePersonaggio(b);

    }

    @Override
    public Fight returnFight(Personaggio a) {
        
        return combatMap.get(a.getCombat_key());
    }
    
    @Override
    public ArrayList<String> attack(Personaggio a){
        String result = combatMap.get(a.getCombat_key()).attacca(a);
        
        combatLog.get(a.getCombat_key()).add(result);
        
        return combatLog.get(a.getCombat_key());
        
    }
    
}
