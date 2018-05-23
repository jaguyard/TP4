/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author Jean
 */
public class Instrument {
  private ArrayList<Fonds> fonds; 
  
  public Instrument(){
      fonds = new ArrayList();
  }
  
  public Instrument(ArrayList<Fonds> fonds){
      this.fonds=fonds;
  }
  
  public void ajouterFonds(Fonds fond){
      fonds.add(fond);
  }
  
  public ArrayList getFonds(){
      return fonds;
  }
  
}
