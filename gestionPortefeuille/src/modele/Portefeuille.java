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
     private HashMap<String, Fonds> fondMap;
     private HashMap<String, Instrument> instrumentMap;
     
     public Portefeuille(){
         fondMap = new HashMap();
         instrumentMap = new HashMap();
     }
     
     public Portefeuille(HashMap<String,Fonds> fondMap,HashMap<String,Instrument> instrumentMap){
         this.fondMap=fondMap;
         this.instrumentMap=instrumentMap;
     }
     
     public double rechercheFond(String fond) throws FondsInexistantException{
         double amount=0;
         if(fondMap.containsKey(fond) == true){
             amount = fondMap.get(fond).getAmount();
             
         }else{
             throw new FondsInexistantException();
         }
         return amount;
         
     }
     
     public ArrayList rechercheInstrument(String instrument) throws InstrumentInexistantException{
         ArrayList instru = new ArrayList();
         if(instrumentMap.containsKey(instrument)){
             instru = instrumentMap.get(instrument).getFonds();
         }else{
             throw new InstrumentInexistantException();
         }
         return instru;
     }
     
     public void ajouterFond(String cle, double amount) throws FondsExistantException{
         if(fondMap.containsKey(cle)){
             throw new FondsExistantException();     
         }else{
             Fonds a = new Fonds(amount,cle);
             fondMap.put(cle, a);
         }
     }
}
