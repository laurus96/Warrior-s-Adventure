/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Entity.Arma;
import Entity.Armatura;
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
    
    private ArrayList<Arma> al=new ArrayList<>();
    private ArrayList<Armatura> aml=new ArrayList<>();
    
    @PostConstruct
    public void populate(){
        al.add(new Arma("Spada",1));
        al.add(new Arma("Spada",2));
        al.add(new Arma("Spada",3));
        al.add(new Arma("Spada",4));
        al.add(new Arma("Spada",5));
        al.add(new Arma("Spada",6));
        al.add(new Arma("Spada",7));
        al.add(new Arma("Spada",8));
        al.add(new Arma("Spada",9));
        al.add(new Arma("Spada",10));
        
        al.add(new Arma("Martello",1));
        al.add(new Arma("Martello",2));
        al.add(new Arma("Martello",3));
        al.add(new Arma("Martello",4));
        al.add(new Arma("Martello",5));
        al.add(new Arma("Martello",6));
        al.add(new Arma("Martello",7));
        al.add(new Arma("Martello",8));
        al.add(new Arma("Martello",9));
        al.add(new Arma("Martello",10));

        al.add(new Arma("Ascia",1));
        al.add(new Arma("Ascia",2));
        al.add(new Arma("Ascia",3));
        al.add(new Arma("Ascia",4));
        al.add(new Arma("Ascia",5));
        al.add(new Arma("Ascia",6));
        al.add(new Arma("Ascia",7));
        al.add(new Arma("Ascia",8));
        al.add(new Arma("Ascia",9));
        al.add(new Arma("Ascia",10));
        
        for (Arma e: al){
            em.persist(e);
        }
        
        aml.add(new Armatura("Armatura del Guerriero",1));
        aml.add(new Armatura("Armatura del Guerriero",2));
        aml.add(new Armatura("Armatura del Guerriero",3));
        aml.add(new Armatura("Armatura del Guerriero",4));
        aml.add(new Armatura("Armatura del Guerriero",5));
        
        aml.add(new Armatura("Armatura del Paladino",1));
        aml.add(new Armatura("Armatura del Paladino",2));
        aml.add(new Armatura("Armatura del Paladino",3));
        aml.add(new Armatura("Armatura del Paladino",4));
        aml.add(new Armatura("Armatura del Paladino",5));
        
        aml.add(new Armatura("Armatura del Cavaliere",1));
        aml.add(new Armatura("Armatura del Cavaliere",2));
        aml.add(new Armatura("Armatura del Cavaliere",3));
        aml.add(new Armatura("Armatura del Cavaliere",4));
        aml.add(new Armatura("Armatura del Cavaliere",5));
        
        for (Armatura e: aml){
            em.persist(e);
        }
    }
    
    @PreDestroy
    public void destroy(){
        for (Arma e: al){
            em.remove(e);
        }
        for (Armatura e: aml){
            em.remove(e);
        }
    }
}
