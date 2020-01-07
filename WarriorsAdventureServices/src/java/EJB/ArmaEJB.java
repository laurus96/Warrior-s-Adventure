/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import EJBInterface.ArmaEJBRemote;
import Entity.Arma;
import Entity.Personaggio;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author laurus
 */
@WebService
@Stateless
@LocalBean
public class ArmaEJB implements ArmaEJBRemote {
    
    @Inject
    private EntityManager em;

    @Override
    public List<Arma> findWeapons(Personaggio p) {
        TypedQuery<Arma> query = em.createNamedQuery(Arma.FIND_WEAPON, Arma.class)
                .setParameter("livello", p.getLivello());
        
        return query.getResultList();
    }
    
    @Override
    public Arma findWeapons_bylv(long id) {
        TypedQuery<Arma> query = em.createNamedQuery(Arma.BOUGHT_WEAPON, Arma.class)
                .setParameter("id", id);
        
        return query.getSingleResult();
    }

    @Override
    public Arma insertWeapon(Arma weapon) {
        em.persist(weapon);
        return weapon;
    }

    @Override
    public Arma updateWeapon(Arma weapon) {
        em.merge(weapon);
        return weapon;
    }

    @Override
    public void deleteWeapon(Arma weapon) {
        em.createNamedQuery(Arma.DELETE_WEAPON)
                .setParameter("id", weapon.getId())
                .executeUpdate();;
        
    }
    
}
