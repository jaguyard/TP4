/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Jean
 */
public class Fonds implements Comparable<Fonds>{
   private double amount; 
   private String cle;
   
   public Fonds(){
       amount = 0;
       cle = null;
   }
   
   public Fonds(double amount, String cle){
       this.amount = amount;
       this.cle = cle;
   }
   
   public String getCle(){
       return cle;
   }
   
   public double getAmount(){
       return amount;
   }

    public boolean equals(Fonds fond){
        if (amount == fond.getAmount()){
            
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public int compareTo(Fonds fond){
        double valeur1= fond.getAmount();
        
        if (valeur1 > amount)
        
            return 1;
        
        else if(valeur1 == amount)
            
            return 0;
        else 
            return -1;
    }
   
   
}

/* public boolean
equals(Fonds other)*/