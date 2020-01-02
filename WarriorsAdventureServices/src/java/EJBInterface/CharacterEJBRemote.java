/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Character;
/**
 *
 * @author giuse
 */
public interface CharacterEJBRemote {
    public void addGold(Character chr,int gold);
    public void subGold(Character chr,int gold);
    public void addExp(Character chr,int exp);
}
