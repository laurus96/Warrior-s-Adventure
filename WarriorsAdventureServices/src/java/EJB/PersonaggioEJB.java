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
        try{
            em.createNamedQuery(Personaggio.SAVE_BYID)
                    .setParameter("livello", p.getLivello())
                    .setParameter("vitality", p.getVitality()) 
                    .setParameter("defense", p.getDefense())
                    .setParameter("strenght", p.getStrenght()) 
                    .setParameter("gold", p.getGold())
                    .setParameter("exp", p.getExp())
                    .setParameter("arma", p.getArma())
                    .setParameter("armatura", p.getArmatura())
                    .setParameter("base_vit", p.getBase_vit())
                    .setParameter("base_def", p.getBase_def())
                    .setParameter("base_str", p.getBase_str())
                    .setParameter("armorLv", p.getArmorLv())
                    .setParameter("weaponLv", p.getWeaponLv()) 
                    .setParameter("armorStr", p.getArmorStr()) 
                    .setParameter("armorDef", p.getArmorDef()) 
                    .setParameter("armorVit", p.getArmorVit())
                    .setParameter("combat_key", p.getCombat_key())
                    .setParameter("id", p.getId()).executeUpdate();
            return p;
        }catch (IllegalArgumentException e){
            return null;
        }
        
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
        if(p.getArma().compareTo(weapon.getName()) == 0 && p.getWeaponLv() == weapon.getLivello()){
            return null;
        }
                
        p.setStrenght(p.getArmorStr() + p.getBase_str() + weapon.getForza());

        p.setWeaponStr(weapon.getForza());
        p.setWeaponLv(weapon.getLivello());
        p.setArma(weapon.getName());
        p.setGold(p.getGold() - weapon.getPrezzo());

        return p;
    }

    @Override
    public Personaggio boughtArmor(Personaggio p, Armatura armor) {
        if(armor.getPrezzo() > p.getGold()){
            return null;
        }
        if(p.getArmatura().compareTo(armor.getName()) == 0 && p.getArmorLv() == armor.getLivello()){
            return null;
        }
        
        p.setStrenght(p.getWeaponStr() + p.getBase_str() + armor.getForza());
        p.setDefense(p.getBase_def() + armor.getDifesa());
        p.setVitality(p.getBase_vit() + armor.getVitalità());
        
        
        p.setArmorLv(armor.getLivello());
        p.setArmorStr(armor.getForza());
        p.setArmorDef(armor.getDifesa());
        p.setArmorVit(armor.getVitalità());
        p.setArmatura(armor.getName());
        p.setGold(p.getGold() - armor.getPrezzo());

        return p;
    }

    @Override
    public Personaggio levelUp(Personaggio prsng) {
        prsng.setBase_vit(prsng.getBase_vit() + 1);
        prsng.setBase_def(prsng.getBase_def() + 1);
        prsng.setBase_str(prsng.getBase_str() + 1);
        
        prsng.setVitality(prsng.getVitality() + 1);
        prsng.setDefense(prsng.getDefense() + 1);
        prsng.setStrenght(prsng.getStrenght() + 1);
        
        prsng.setLivello(prsng.getLivello() + 1);
        
        return prsng;
        
    }

    @Override
    public Personaggio findByID(long id) {
        TypedQuery<Personaggio> query = em.createNamedQuery(Personaggio.FIND_BYID, Personaggio.class)
            .setParameter("id", id);
        
        return query.getSingleResult();
        
    }
  
}
