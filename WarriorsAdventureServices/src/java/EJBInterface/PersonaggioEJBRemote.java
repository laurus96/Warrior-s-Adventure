/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Arma;
import Entity.Armatura;
import Entity.Personaggio;
import Entity.Giocatore;
import java.util.List;
/**
 *
 * @author giuse
 */
public interface PersonaggioEJBRemote {
    void addGold(Personaggio chr,int gold);
    void subGold(Personaggio chr,int gold);
    void addExp(Personaggio chr,int exp);
    String createCharacter(String name, String classe, Giocatore p);
    Personaggio findCharacter(String username, String name);
    Personaggio findByID(long id);

    Personaggio insertPersonaggio(Personaggio p);
    Personaggio updatePersonaggio(Personaggio p);
    void removePersonaggio(Personaggio p);
    List<Personaggio> listCharacter(Giocatore p);
    
    Personaggio levelUp(Personaggio p);
    
    Personaggio boughtWeapon(Personaggio p, Arma weapon);
    Personaggio boughtArmor(Personaggio p, Armatura armor);
    
    void fineDuello(Personaggio winner);
    
}
