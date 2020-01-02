/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;


import EJBInterface.AdministrationEJBRemote;
import Entity.Giocatore;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.NoResultException;

/**
 *
 * @author lorenzopaolococchinone
 */
@WebService
@Stateless
@LocalBean
public class AdministrationEJB implements AdministrationEJBRemote {
    
    @Inject
    private EntityManager em;

    public List<Giocatore> allGiocatori() {
        TypedQuery<Giocatore> query = em.createNamedQuery(Giocatore.FIND_ALL, Giocatore.class);
        return query.getResultList();

    }

    public String banGiocatore(Giocatore player) {
        TypedQuery<Giocatore> query = em.createNamedQuery(Giocatore.FIND_BYUSER, Giocatore.class)
                .setParameter("username", player.getUsername());
        
        Giocatore ban = (Giocatore) query.getSingleResult();
        ban.setBan(true);
        
        return "Giocatore: " + ban.getUsername() + "Bannato";
        
    }
    
    
    
}
