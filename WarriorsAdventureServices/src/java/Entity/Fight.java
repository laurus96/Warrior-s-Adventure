/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Random;

/**
 *
 * @author laurus
 */
public class Fight {
    
    Personaggio a;
    Personaggio b;
    
    Random ram = new Random();
    
    boolean dif_a = false;
    boolean dif_b = false;

    public Fight(Personaggio a, Personaggio b) {
        this.a = a;
        this.b = b;
    }
    
    public String attacca(Personaggio attack){
        int crit = 1 + ram.nextInt(9);
        int danni = 2 * crit * (attack.getStrenght() / 50);

        if(attack.getId() == a.getId()){
            //Attacca A
            if(this.dif_b){
                danni = danni - ((b.getDefense() / 100) * 50);
                this.dif_b = false;
            }
            b.setVitality(b.getVitality() - danni);
            if(b.getVitality() <= 0){
                return a.getId() + "";
            }
            
            if(crit >= 8){
                return "<br/>" + b.getName() + " ha subito: " + danni + " danni, con un colpo critico, la sua vitalità è scesa a: " + b.getVitality() + "<br/>";
            }
            return "<br/>" + b.getName() + " ha subito: " + danni + " danni, la sua vitalità è scesa a: " + b.getVitality() + "<br/>";
            
            
        }else if(attack.getId() == b.getId()){
            //Attacca B
            if(this.dif_a){
                danni = danni - ((a.getDefense() / 100) * 50);
                this.dif_a = false;
            }
            a.setVitality(a.getVitality() - danni);
            if(a.getVitality() <= 0){
                return b.getId() + "";
            }
            if(crit >= 8){
                return "<br/>" + a.getName() + " ha subito: " + danni + " danni, con un colpo critico, la sua vitalità è scesa a: " + a.getVitality()+ "<br/>";
            }
            return "<br/>" + a.getName() + " ha subito: " + danni + " danni, la sua vitalità è scesa a: " + a.getVitality()+ "<br/>";
        }
        
        return "Scarano";
        
    }
    
    public void difesa(Personaggio defense){
        
        if(defense.getId() == a.getId()){
            this.dif_a = true;
        }
        
        else if(defense.getId() == b.getId()){
            this.dif_b = true;
        }
        
    }
    
    public String cura(Personaggio cura){
        int pv_cura = (cura.getVitality() / 100) * 10;
        
        if(cura.getId() == a.getId()){
            a.setVitality(a.getVitality() + pv_cura);
            return a.getName() + " ha recuperato: " + pv_cura + " punti vita";
        }
        
        else if(cura.getId() == b.getId()){
            b.setVitality(b.getVitality() + pv_cura);
            return b.getName() + " ha recuperato: " + pv_cura + " punti vita";
        }
        
        return "Scarano";
    }
    
    public String fuga(Personaggio fuga){
        if(fuga.getId() == a.getId()){
            return b.getId() + "";
        }
        
        else if(fuga.getId() == b.getId()){
            return a.getId() + "";
        }
        
        return "Scarano";
        
    }
    
}
