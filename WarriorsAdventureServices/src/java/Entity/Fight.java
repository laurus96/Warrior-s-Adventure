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
        int crit = 1 + ram.nextInt(14);
        int danni = crit * (attack.getStrenght() / 50);
        
        if(attack.getId() == a.getId()){
            //Attacca A
            if(this.dif_b){
                danni = danni - ((b.getDefense() / 10) * 2);
                this.dif_b = false;
            }
            b.setVitality(b.getVitality() - danni);
        
            if(crit >= 12){
                return "</br> <b> " + b.getName() + "</b> ha subito: <b>" + danni + "</b> danni, con un colpo critico, la sua vitalità è scesa a: <b>" + b.getVitality() + "</b>";
                
            }
            return "</br> <b> " + b.getName() + "</b> ha subito: <b>" + danni + "</b> danni, la sua vitalità è scesa a: <b>" + b.getVitality() + "</b>";
            
            
        }else if(attack.getId() == b.getId()){
            //Attacca B
            if(this.dif_a){
                danni = danni - ((a.getDefense() / 10) * 2);
                this.dif_a = false;
            }
            a.setVitality(a.getVitality() - danni);

            if(crit >= 12){
                return "</br> <b> " + a.getName() + "</b> ha subito: <b>" + danni + "</b> danni, con un colpo critico, la sua vitalità è scesa a: <b>" + a.getVitality() + "</b>";
            }
            return "</br> <b> " + a.getName() + "</b> ha subito: <b>" + danni + "</b> danni, la sua vitalità è scesa a: <b>" + a.getVitality() + "</b>";
        }
        
        return "Scarano";
        
    }
    
    public String difesa(Personaggio defense){
        
        if(defense.getId() == a.getId()){
            this.dif_a = true;
            return "</br> <b> " + a.getName() + "</b> si prepara a difendersi per il prossimo attacco";
        }
        
        else if(defense.getId() == b.getId()){
            this.dif_b = true;
            return "</br> <b> " + b.getName() + "</b> si prepara a difendersi per il prossimo attacco";
        }
        
        return "Scarano";
    }
    
    public String cura(Personaggio cura){
        int pv_cura = (cura.getVitality() / 50) * 10;
        
        if(cura.getId() == a.getId()){
            a.setVitality(a.getVitality() + pv_cura);
            return "</br> <b> " + a.getName() + "</b> ha recuperato:  <b>" + pv_cura + "</b> punti vita";
        }
        
        else if(cura.getId() == b.getId()){
            b.setVitality(b.getVitality() + pv_cura);
            return "</br> <b> " + b.getName() + "</b> ha recuperato: <b> " + pv_cura + "</b> punti vita";
        }
        
        return "Scarano";
    }
    
    public String fuga(Personaggio fuga){
        if(fuga.getId() == a.getId()){
            a.setVitality(0);
            return "</br> <b> " + a.getName() + "</b> abbandona lo scontro";
        }
        
        else if(fuga.getId() == b.getId()){
            b.setVitality(0);
            return "</br> <b> " + b.getName() + "</b> abbandona lo scontro";
        }
        
        return "Scarano";
        
    }
    
    public Long verifyWinner(){
        if(a.getVitality() <= 0){
            return b.getId();
        }else if (b.getVitality() <=0){
            return a.getId();
        }
        
        return -1L;
    }
    
}
