/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Character;
import Entity.Giocatore;
import java.util.List;
/**
 *
 * @author giuse
 */
public interface CharacterEJBRemote {
    void addGold(Character chr,int gold);
    void subGold(Character chr,int gold);
    void addExp(Character chr,int exp);
    void createCharacter(String name, String classe, Giocatore p);
    List<Character> listCharacter(Giocatore p);
}
