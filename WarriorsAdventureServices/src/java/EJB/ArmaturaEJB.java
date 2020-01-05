/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import EJBInterface.ArmaturaEJBRemote;
import Entity.Armatura;
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
public class ArmaturaEJB implements ArmaturaEJBRemote {
    
    @Inject
    private EntityManager em;

    @Override
    public List<Armatura> findArmor(Personaggio p) {
        TypedQuery<Armatura> query = em.createNamedQuery(Armatura.FIND_ARMOR, Armatura.class)
                .setParameter("livello", p.getLevel());
        
        return query.getResultList();    }

    @Override
    public Armatura insertArmor(Armatura armor) {
        em.persist(armor);
        return armor;
    }

    @Override
    public Armatura updateArmor(Armatura armor) {
        em.merge(armor);
        return armor;
    }

    @Override
    public void deleteArmor(Armatura armor) {
        em.createNamedQuery(Armatura.DELETE_ARMOR)
                .setParameter("id", armor.getId())
                .executeUpdate();
    }
    
}
