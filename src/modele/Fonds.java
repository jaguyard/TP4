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
   
   public Fonds(){
       amount = 0;
   }
   
   public Fonds(double amount){
       this.amount = amount;
   }
   
   public double getAmount(){
       return amount;
   }
   
   
}

/* public boolean
equals(Fonds other)*/