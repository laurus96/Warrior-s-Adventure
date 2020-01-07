/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import EJBInterface.OnlinePlayerEJBRemote;
import Entity.Giocatore;
import Entity.Personaggio;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author laurus
 */
@WebService
@Stateless
@LocalBean
public class OnlinePlayerEJB implements OnlinePlayerEJBRemote {

    @Override
    public void addPlayer(Giocatore key, Personaggio value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
