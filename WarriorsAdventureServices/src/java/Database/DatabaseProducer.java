/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import javax.enterprise.inject.Produces;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;


/**
 *
 * @author lorenzopaolococchinone
 */
public class DatabaseProducer {
    
    @Produces
    @PersistenceContext(unitName = "WarriorsPU")
    private EntityManager em;    
}
