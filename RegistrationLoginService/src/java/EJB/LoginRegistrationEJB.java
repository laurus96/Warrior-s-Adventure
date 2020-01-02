/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import EJBInterface.LoginRegistrationEJBRemote;
import Entity.Giocatore;
import java.util.regex.Pattern;

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
public class LoginRegistrationEJB implements LoginRegistrationEJBRemote {
    
    @Inject
    private EntityManager em;

    @Override
    public Giocatore login(String username, String password) {
        
        //Database Operation
        Giocatore giocatore = findGiocatore(username, password);
        
        if(giocatore == null){
            return null;
        }
        
        return giocatore;
    }

    @Override
    public String registration(String username, String password, String email) {
        
        
        if(Pattern.matches("[A-Za-z0-9]+", username) == false || username.length() < 5 || username.length() > 20){
            return "FE_UN";
        }
        
        if(Pattern.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$", password) == false || password.length() <= 8 || password.length() >= 16){
            return "FE_PW";
        }
        
        if(Pattern.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]{3,}+.[a-zA-Z]{2,}$", email) == false){
            return "FE_EM";

        }
        
        if(findRegistrationUser(username, email))
            return "DE_UN";
        
        //Database Operation
        //Save new player        
        em.persist(new Giocatore(username, password, email));
       
       return "PASS"; 
    }
    
    public boolean findRegistrationUser(String username, String email){
        TypedQuery<Giocatore> query = em.createNamedQuery(Giocatore.FIND_BYUSER, Giocatore.class)
                .setParameter("username", username)
                .setParameter("email", email);
        
        if(query.getResultList() == null)
            return true;
            
 
        return false;
        
    }
    

    public Giocatore findGiocatore(String username, String password){
        TypedQuery<Giocatore> query = em.createNamedQuery(Giocatore.FIND_BYUSERPW, Giocatore.class)
                .setParameter("username", username)
                .setParameter("password", password);
        try{
            return query.getSingleResult();
            
        }catch(NoResultException e){
            return null;
        }

    }
  
}
