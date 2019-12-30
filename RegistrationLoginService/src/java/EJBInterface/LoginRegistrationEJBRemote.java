/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Giocatore;
import javax.ejb.Remote;

/**
 *
 * @author lorenzopaolococchinone
 */
@Remote
public interface LoginRegistrationEJBRemote {
    
    Giocatore login(String username, String password);
    String registration(String username, String password, String email);
    
}
