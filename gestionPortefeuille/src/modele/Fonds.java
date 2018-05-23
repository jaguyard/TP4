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
public class Fonds {
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
   
   public double getAmount(){
       return amount;
   }
   
   
}

/* public boolean
equals(Fonds other)*/