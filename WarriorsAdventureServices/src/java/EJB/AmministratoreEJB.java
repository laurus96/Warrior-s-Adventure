/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;


import Entity.Giocatore;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.NoResultException;
import EJBInterface.AmministratoreEJBRemote;
import Entity.Amministratore;

/**
 *
 * @author lorenzopaolococchinone
 */
@WebService
@Stateless
@LocalBean
public class AmministratoreEJB implements AmministratoreEJBRemote {
    
    @Inject
    private EntityManager em;
    
    @Inject 
    private GiocatoreEJB playerEJB;

    @Override
    public List<Giocatore> allPlayers() {
        TypedQuery<Giocatore> query = em.createNamedQuery(Giocatore.FIND_ALL_BAN,
                Giocatore.class).setParameter("ban", false);
        
        return query.getResultList();

    }
    
    @Override
    public List<Giocatore> BannedPlayers() {
        TypedQuery<Giocatore> query = em.createNamedQuery(Giocatore.FIND_ALL_BAN,
                Giocatore.class).setParameter("ban", true);
        
        return query.getResultList();
    }
    
    @Override
    public String banPlayer(String username) {
        
        TypedQuery<Giocatore> query = em.createNamedQuery(
                Giocatore.FIND_BYUSERNAME, Giocatore.class)
                .setParameter("username", username);
        try{
            Giocatore ban = (Giocatore) query.getSingleResult();
            ban.setBan(true);
            
            playerEJB.updatePlayer(ban);
            
            return "BAN_OK";
   
        }catch(NoResultException e){
            return "ER_BAN";
        }
    }

    @Override
    public Amministratore logginAmministratore(String username, String password) {
                TypedQuery<Amministratore> query = em.createNamedQuery(
                Amministratore.FIND_BYAM, Amministratore.class)
                .setParameter("username", username)
                .setParameter("password", password);
        try{
            return query.getSingleResult();
            
        }catch(NoResultException e){
            return null;
        }  
        
    }

    @Override
    public Amministratore insertAmministratore(Amministratore am) {
        em.persist(am);
        return am;
    }

    @Override
    public Amministratore updateAmministratore(Amministratore am) {
        em.merge(am);
        return am;
    }

    @Override
    public void removeAmministratore(Amministratore am) {
        em.remove(em.merge(am));
    }

    @Override
    public String unbanPlayer(String username) {
        TypedQuery<Giocatore> query = em.createNamedQuery(
                Giocatore.FIND_BYUSERNAME, Giocatore.class)
                .setParameter("username", username);
        try{
            Giocatore unban = (Giocatore) query.getSingleResult();
            unban.setBan(false);
            
            playerEJB.updatePlayer(unban);
            
            return "BAN_OK";
   
        }catch(NoResultException e){
            return "ER_BAN";
        }    }
    
}
