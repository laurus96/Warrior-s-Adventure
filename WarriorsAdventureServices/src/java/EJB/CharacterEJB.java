/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Character;

import EJBInterface.CharacterEJBRemote;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.jws.WebService;
/**
 *
 * @author giuse
 */

@WebService
@Stateless
@LocalBean
public class CharacterEJB implements CharacterEJBRemote{
    
    @Override
    public void addGold(Character chr, int gold) {
        chr.setGold(chr.getGold()+gold);
    }

    @Override
    public void addExp(Character chr,int exp) {
        chr.setExp(chr.getExp()+exp);
    }

    @Override
    public void subGold(Character chr, int gold) {
        if ((chr.getGold()-gold)<=0){
            chr.setGold(0);
        }
        chr.setGold(chr.getGold()-gold);
    }
}
