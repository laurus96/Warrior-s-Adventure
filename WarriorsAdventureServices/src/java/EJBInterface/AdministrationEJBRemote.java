/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBInterface;

import Entity.Giocatore;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author laurus
 */
@Remote
public interface AdministrationEJBRemote {
    
    List<Giocatore> allGiocatori();
    String banGiocatore(Giocatore player);
    List<Giocatore> BannedGiocatori();
    
    
    
}