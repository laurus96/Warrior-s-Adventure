/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import EJB.AmministratoreEJB;
import EJB.ArmaEJB;
import EJB.ArmaturaEJB;
import EJB.GiocatoreEJB;
import EJB.PersonaggioEJB;
import Entity.Amministratore;
import Entity.Arma;
import Entity.Armatura;
import Entity.Giocatore;
import Entity.Personaggio;
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
    
    @Inject 
    private ArmaturaEJB armorejb;
    
    @Inject
    private ArmaEJB weaponejb;
    
    
    private Giocatore player1;
    private Giocatore player2;
    private Giocatore player3;
    private Giocatore player4;
    private Giocatore player5;
    private Giocatore ban;
        
    private Amministratore am1;
    private Amministratore am2;
    

    
    @PostConstruct
    public void populate(){
        
        ArrayList<Arma> al=new ArrayList<>();
        ArrayList<Armatura> aml=new ArrayList<>();
        
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
            weaponejb.insertWeapon(e);
        }
                
        aml.add(new Armatura("Armatura da Guerra", 1, 100));
        aml.add(new Armatura("Armatura da Guerra", 2, 200));
        aml.add(new Armatura("Armatura da Guerra", 3, 300));
        aml.add(new Armatura("Armatura da Guerra", 4, 400));
        aml.add(new Armatura("Armatura da Guerra", 5, 500));
       
        aml.add(new Armatura("Veste Runica", 1, 100));
        aml.add(new Armatura("Veste Runica", 2, 200));
        aml.add(new Armatura("Veste Runica", 3, 300));
        aml.add(new Armatura("Veste Runica", 4, 400));
        aml.add(new Armatura("Veste Runica", 5, 500));

        aml.add(new Armatura("Armatura da Cavallo", 1, 100));
        aml.add(new Armatura("Armatura da Cavallo", 2, 200));
        aml.add(new Armatura("Armatura da Cavallo", 3, 300));
        aml.add(new Armatura("Armatura da Cavallo", 4, 400));
        aml.add(new Armatura("Armatura da Cavallo", 5, 500));

        
        for (Armatura e: aml){
            armorejb.insertArmor(e);
        }
                
        player1 = new Giocatore("laurus96", "metin@Server1", "lorenzo.cocchinone@gmail.com");
        player2 = new Giocatore("tempesta59", "metin@Server1", "giuseppe9909@gmail.com");
        player3 = new Giocatore("cipollino26", "metin@Server1", "cipolinno90@gmail.com");
        player4 = new Giocatore("pippo89", "metin@Server1", "pluto@gmail.com" );
        player5 = new Giocatore("banana", "metin@Server1", "banana@gmail.com");
        
        
        ban = new Giocatore("fagottino", "metin@Server1", "DeBanPlayer@gmail.com" );
        ban.setBan(true);
                
        playerejb.insertPlayer(player1);
        playerejb.insertPlayer(player2);
        playerejb.insertPlayer(player3);
        playerejb.insertPlayer(player4);
        playerejb.insertPlayer(player5);

        playerejb.insertPlayer(ban);
        
        
        characterejb.createCharacter("Lithia", "Paladino", player1);
        characterejb.createCharacter("Marion", "Guerriero", player2);
        
        Personaggio povero = new Personaggio("Cipolla", "Guerriero", player3.getUsername());
        povero.setGold(50);
        characterejb.insertPersonaggio(povero);
        
        Personaggio test = new Personaggio("Tersan", "Cavaliere", player4.getUsername());
        test.setLivello(7);
        test.setGold(12800);
        characterejb.insertPersonaggio(test);
        
        characterejb.createCharacter("Bananino", "Paladino", player5);
        characterejb.createCharacter("Banano", "Guerriero", player5);
        characterejb.createCharacter("Frutteto", "Guerriero", player5);


        
        am1 = new Amministratore("laurus", "metin@Server1");
        am2 = new Amministratore("tempesta58","metin@Server1");
        
        amminiejb.insertAmministratore(am1);
        amminiejb.insertAmministratore(am2);
    }
    
    @PreDestroy
    public void destroy(){
        
        playerejb.removePlayer(player1);
        playerejb.removePlayer(player2);
        playerejb.removePlayer(ban);
        
        amminiejb.removeAmministratore(am1);
        amminiejb.removeAmministratore(am2);


    }
}
