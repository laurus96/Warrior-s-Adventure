/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Personaggio;

import Entity.Giocatore;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import EJBInterface.PersonaggioEJBRemote;
import Entity.Arma;
import Entity.Armatura;
/**
 *
 * @author giuse
 */

@WebService
@Stateless
@LocalBean
public class PersonaggioEJB implements PersonaggioEJBRemote{
    
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
    public String createCharacter(String name, String classe, Giocatore p) {
        Personaggio new_character = new Personaggio(name, classe, p.getUsername());
        if(listCharacter(p).size() > 2){
            return "DP_NA";
        }
        insertPersonaggio(new_character);
        return "PASS";
    }

    @Override
    public List<Personaggio> listCharacter(Giocatore p) {
        TypedQuery<Personaggio> query = em.createNamedQuery(Personaggio.FIND_BYUS, Personaggio.class)
                .setParameter("username", p.getUsername());
        return  query.getResultList();
    }

    @Override
    public Personaggio insertPersonaggio(Personaggio p) {
        em.persist(p);
        return p;
    }

    @Override
    public Personaggio updatePersonaggio(Personaggio p) {
        em.merge(p);
        return p;
    }

    @Override
    public void removePersonaggio(Personaggio p) {
        em.remove(em.merge(p));
    }

    @Override
    public Personaggio findCharacter(String username, String name) {
        TypedQuery<Personaggio> query = em.createNamedQuery(Personaggio.FIND_BYUSNA, Personaggio.class)
                .setParameter("username", username)
                .setParameter("name", name);
        
        return query.getSingleResult();
    }

    @Override
    public Personaggio boughtWeapon(Personaggio p, Arma weapon) {
        if(weapon.getPrezzo() > p.getGold()){
            return null;
        }
        p.boughtWeapon(weapon);
        return p;
    }

    @Override
    public Personaggio boughtArmor(Personaggio p, Armatura armor) {
        if(armor.getPrezzo() > p.getGold()){
            return null;
        }
        p.boughtArmor(armor);
        return p;
    }

}
