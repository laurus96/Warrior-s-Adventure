/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Personaggio;

import EJBInterface.CharacterEJBRemote;
import Entity.Giocatore;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
/**
 *
 * @author giuse
 */

@WebService
@Stateless
@LocalBean
public class CharacterEJB implements CharacterEJBRemote{
    
    @Inject
    private EntityManager em;
    
    @Override
    public void addGold(Personaggio chr, int gold) {
        chr.setGold(chr.getGold()+gold);
    }

    @Override
    public void addExp(Personaggio chr,int exp) {
        chr.setExp(chr.getExp()+exp);
    }

    @Override
    public void subGold(Personaggio chr, int gold) {
        if ((chr.getGold()-gold)<=0){
            chr.setGold(0);
        }
        chr.setGold(chr.getGold()-gold);
    }

    @Override
    public void createCharacter(String name, String classe, Giocatore p) {
        em.persist(new Personaggio(name, classe, p.getUsername()));
    }

    @Override
    public List<Personaggio> listCharacter(Giocatore p) {
        TypedQuery<Personaggio> query = em.createNamedQuery(Personaggio.FIND_BYUS, Personaggio.class)
                .setParameter("username", p.getUsername());
        return  query.getResultList();
    }
}
