/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import EJB.AmministratoreEJB;
import EJB.GiocatoreEJB;
import EJB.PersonaggioEJB;
import Entity.Amministratore;
import Entity.Arma;
import Entity.Armatura;
import Entity.Giocatore;
import java.util.ArrayList;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.annotation.sql.DataSourceDefinition;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Singleton
@Startup
@DataSourceDefinition(
        className = "org.apache.derby.jdbc.EmbeddedDataSource",
        name = "java:global/jdbc/WarriorsDS",
        user = "app",
        password = "app",
        databaseName = "WarriorsDatabase",
        properties = {"connectionAttributes=; create=true"}
)

/**
 *
 * @author lorenzopaolococchinone
 */
public class DatabasePopulator {
    
    @Inject
    private EntityManager em;
    
    @Inject
    private GiocatoreEJB playerejb;
    
    @Inject
    private PersonaggioEJB characterejb;
    
    @Inject
    private AmministratoreEJB amminiejb;
    
    
    private Giocatore player1;
    private Giocatore player2;
    private Giocatore ban;
        
    private Amministratore am1;
    
    private ArrayList<Arma> al=new ArrayList<>();
    private ArrayList<Armatura> aml=new ArrayList<>();
    
    @PostConstruct
    public void populate(){
        
        al.add(new Arma("Spada", 1, 100));
        al.add(new Arma("Spada", 2, 200));
        al.add(new Arma("Spada", 3, 300));
        al.add(new Arma("Spada", 4, 400));
        al.add(new Arma("Spada", 5, 500));
        al.add(new Arma("Spada", 6, 600));
        al.add(new Arma("Spada", 7, 700));
        al.add(new Arma("Spada", 8, 800));
        al.add(new Arma("Spada", 9, 900));
        al.add(new Arma("Spada", 10, 1000));
        
        al.add(new Arma("Martello", 1, 100));
        al.add(new Arma("Martello", 2, 200));
        al.add(new Arma("Martello", 3, 300));
        al.add(new Arma("Martello", 4, 400));
        al.add(new Arma("Martello", 5, 500));
        al.add(new Arma("Martello", 6, 600));
        al.add(new Arma("Martello", 7, 700));
        al.add(new Arma("Martello", 8, 800));
        al.add(new Arma("Martello", 9, 900));
        al.add(new Arma("Martello", 10, 100));

        al.add(new Arma("Ascia", 1, 100));
        al.add(new Arma("Ascia", 2, 200));
        al.add(new Arma("Ascia", 3, 300));
        al.add(new Arma("Ascia", 4, 400));
        al.add(new Arma("Ascia", 5, 500));
        al.add(new Arma("Ascia", 6, 600));
        al.add(new Arma("Ascia", 7, 700));
        al.add(new Arma("Ascia", 8, 800));
        al.add(new Arma("Ascia", 9, 900));
        al.add(new Arma("Ascia", 10, 1000));
        
        for (Arma e: al){
            em.persist(e);
        }
        
                aml.add(new Armatura("Armatura del Guerriero", 1, 100));
        aml.add(new Armatura("Armatura del Guerriero", 2, 200));
        aml.add(new Armatura("Armatura del Guerriero", 3, 300));
        aml.add(new Armatura("Armatura del Guerriero", 4, 400));
        aml.add(new Armatura("Armatura del Guerriero", 5, 500));
       
        aml.add(new Armatura("Armatura del Paladino", 1, 100));
        aml.add(new Armatura("Armatura del Paladino", 2, 200));
        aml.add(new Armatura("Armatura del Paladino", 3, 300));
        aml.add(new Armatura("Armatura del Paladino", 4, 400));
        aml.add(new Armatura("Armatura del Paladino", 5, 500));

        aml.add(new Armatura("Armatura del Cavaliere", 1, 100));
        aml.add(new Armatura("Armatura del Cavaliere", 2, 200));
        aml.add(new Armatura("Armatura del Cavaliere", 3, 300));
        aml.add(new Armatura("Armatura del Cavaliere", 4, 400));
        aml.add(new Armatura("Armatura del Cavaliere", 5, 500));

        
        for (Armatura e: aml){
            em.persist(e);
        }
        
        player1 = new Giocatore("laurus96", "metin@Server1", "lorenzo.cocchinone@gmail.com");
        player2 = new Giocatore("tempesta59", "metin@Server1", "giuseppe090gmail.com");
        ban = new Giocatore("ciao", "metin@Server1", "ciao@gmail.com" );
        ban.setBan(true);
                
        playerejb.insertPlayer(player1);
        playerejb.insertPlayer(player2);
        playerejb.insertPlayer(ban);
        
        characterejb.createCharacter("Lithia", "Paladino", player1);
        
        am1 = new Amministratore("laurus", "metin@Server1");
        
        amminiejb.insertAmministratore(am1);
    }
    
    @PreDestroy
    public void destroy(){
        for (Arma e: al){
            em.remove(e);
        }
        for (Armatura e: aml){
            em.remove(e);
        }
        
        playerejb.removePlayer(player1);
        playerejb.removePlayer(player2);
        playerejb.removePlayer(ban);
        
        amminiejb.removeAmministratore(am1);

    }
}
