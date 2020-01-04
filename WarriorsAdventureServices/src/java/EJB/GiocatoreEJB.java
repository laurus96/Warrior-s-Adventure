/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Entity.Giocatore;
import java.util.regex.Pattern;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.NoResultException;
import EJBInterface.GiocatoreEJBRemote;

/**
 *
 * @author laurus
 */
@WebService
@Stateless
@LocalBean
public class GiocatoreEJB implements GiocatoreEJBRemote{
    @Inject
    private EntityManager em;
    
    @Override
    public Giocatore findPlayer(String username) {
        TypedQuery<Giocatore> query = em.createNamedQuery(
                Giocatore.FIND_BYUSERNAME, Giocatore.class)
                .setParameter("username", username);
        try{
            return query.getSingleResult();
            
        }catch(NoResultException e){
            return null;
        }    }
    
    @Override
    public Giocatore insertPlayer(Giocatore newPlayer) {
        em.persist(newPlayer);
        return newPlayer;
    }
    
    @Override
    public Giocatore updatePlayer(Giocatore player) {
        em.merge(player);
        return player;
    }

    @Override
    public void removePlayer(Giocatore player) {
        em.remove(em.merge(player));
    }

    @Override
    public Giocatore login(String username, String password) {
        
        //Database Operation
        TypedQuery<Giocatore> query = em.createNamedQuery(
                Giocatore.FIND_BYUSERPW, Giocatore.class)
                .setParameter("username", username)
                .setParameter("password", password);
        try{
            Giocatore player = query.getSingleResult();
           
            return player;
            
        }catch(NoResultException e){
            return null;
        }
   
    }

    @Override
    public String registration(String username, String password, String repassword, String email) {
        
        
        if(Pattern.matches("[A-Za-z0-9]+", username) == false || 
                username.length() < 5 || username.length() > 20){
            return "FE_UN";
        }
        
        if(Pattern.matches(
                "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$"
                , password) == false || password.length() <= 8 || 
                password.length() >= 16){
            return "FE_PW";
        }
        
        if(Pattern.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]{3,}+.[a-zA-Z]{2,}$",
                email) == false){
            return "FE_EM";
        }
        
        if(findUsername(username)){
            return "DE_UN";
        }

        
        if(findEmail(email)){
            return "DE_EM";
        }
        
        if(password.compareTo(repassword) != 0){
            return "PW_MS";
        }
        //Database Operation
        //Save new player 
        
        Giocatore player = insertPlayer(new Giocatore(username, password, email));
        
       
        return "PASS"; 
    }
    
    @Override
    public boolean findUsername(String username){
        TypedQuery<Giocatore> query = em.createNamedQuery(
                Giocatore.FIND_BYUSERNAME, Giocatore.class)
                .setParameter("username", username);

        return query.getResultList().size() > 0;
        
    }
    
    @Override
    public boolean findEmail(String email){
        TypedQuery<Giocatore> query = em.createNamedQuery(
                Giocatore.FIND_BYEMAIL, Giocatore.class)
                .setParameter("email", email);
        
        return query.getResultList().size() > 0;
    }

 
}
