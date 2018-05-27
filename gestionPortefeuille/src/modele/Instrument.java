/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Jean
 */
public class Instrument {
  private ArrayList<Fonds> fonds;
  private String cle;
  
  public Instrument(){
      fonds = new ArrayList();
      cle = null;
  }
  
  public Instrument(ArrayList<Fonds> fonds,String cle){
      this.fonds=fonds;
      this.cle = cle;
  }
  
  public void ajouterFonds(Fonds fond){
      fonds.add(fond);
  }
  
  public ArrayList getFonds(){
      return fonds;
  }
  
  public void tri(){
      Collections.sort(fonds);     
      for(int i=0; i<fonds.size();i++){
          System.out.println("Fond: " + fonds.get(i).getCle() +" Montant: "+ fonds.get(i).getAmount());
      }
  }
  
}
