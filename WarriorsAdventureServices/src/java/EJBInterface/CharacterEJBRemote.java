/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Personaggio;
import Entity.Giocatore;
import java.util.List;
/**
 *
 * @author giuse
 */
public interface CharacterEJBRemote {
    void addGold(Personaggio chr,int gold);
    void subGold(Personaggio chr,int gold);
    void addExp(Personaggio chr,int exp);
    void createCharacter(String name, String classe, Giocatore p);
    List<Personaggio> listCharacter(Giocatore p);
}
