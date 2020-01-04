/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;


import Entity.Giocatore;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.NoResultException;
import EJBInterface.AmministratoreEJBRemote;

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
        TypedQuery<Giocatore> query = em.createNamedQuery(Giocatore.FIND_ALL,
                Giocatore.class);
        return query.getResultList();

    }
    
    @Override
    public List<Giocatore> BannedPlayers() {
        List<Giocatore> all = allPlayers();
        List<Giocatore> banned = new ArrayList<>();
        
        for(Giocatore e : all){
            if(e.isBan())
                banned.add(e);
        }
        
        return banned;
    }
    
    @Override
    public String banPlayer(String username) {
        
        TypedQuery<Giocatore> query = em.createNamedQuery(
                Giocatore.FIND_BYUSERNAME, Giocatore.class)
                .setParameter("username", username);
        try{
            Giocatore ban = (Giocatore) query.getSingleResult();
            ban.setBan(true);
            
            this.playerEJB.updatePlayer(ban);
            
            return "Giocatore: " + ban.getUsername() + "Bannato";
   
        }catch(NoResultException e){
            return "Giocatore non trovato";
        }
    }
    
}
