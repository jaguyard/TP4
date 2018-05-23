/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import controleur.FondsExistantException;
import controleur.FondsInexistantException;
import controleur.InstrumentInexistantException;
import java.util.*;

/**
 *
 * @author Jean
 */
public class Portefeuille {
     private Map<String, Fonds> fondMap;
     private Map<String, Instrument> instrumentMap;
     
     public Portefeuille(){
         fondMap = new HashMap<>();
         instrumentMap = new HashMap<>();
     }
     
     public Portefeuille(Map<String,Fonds> fondMap,Map<String,Instrument> instrumentMap){
         this.fondMap=fondMap;
         this.instrumentMap=instrumentMap;
     }
     
     public void rechercheFond(String fond) throws FondsInexistantException{
         
             throw new FondsInexistantException();
         }else if(fondMap.containsKey(fond) == true){
             return fondMap.get(fond).getAmount();
         }
         else return 0;
     }
     
     public ArrayList rechercheInstrument(String instrument) throws InstrumentInexistantException{
         if(instrumentMap.containsKey(instrument)){
             return instrumentMap.get(instrument).getFonds();
         }else{
             throw new InstrumentInexistantException();
         }
     }
     
     public void ajouterFond(String cle, double amount) throws FondsExistantException{
         if(fondMap.containsKey(cle)){
             throw new FondsExistantException();     
         }else{
             Fonds a = new Fonds(amount);
             fondMap.put(cle, a);
         }
     }
}
