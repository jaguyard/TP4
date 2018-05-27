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
import java.util.logging.Level;
import java.util.logging.Logger;

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
     
     public HashMap getInstrumentMap(){
         return instrumentMap;
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
         if(instrumentMap.containsKey(instrument) == true){
             instru = instrumentMap.get(instrument).getFonds();
         }else{
             throw new InstrumentInexistantException();
         }
         return instru;
     }
     
     public void ajouterFond(String cle, double amount) throws FondsExistantException{
         if(fondMap.containsKey(cle) == true){
             throw new FondsExistantException();     
         }else{
             Fonds a = new Fonds(amount,cle);
             fondMap.put(cle, a);
             System.out.println("Le fond est ajouté");
         }
     }
    public void ajouterInstrument(String cle, Fonds fond){
        ArrayList<Fonds> instruAdd = new ArrayList();
        instruAdd.add(fond);
        Instrument a = new Instrument(instruAdd,cle);
        instrumentMap.put(cle, a);
        System.out.println("L'instrument est ajouté");
     }
    
    public void supprimerFond(String cle){
         try {
             rechercheFond(cle);
             fondMap.remove(cle);
             System.out.println("Le fond est supprimé");
         } catch (FondsInexistantException ex) {
             System.out.println("Le fond ne peut être supprimé");
         }
    }
    
    public void supprimerInstrument(String cle){
         try {
             rechercheInstrument(cle);
             instrumentMap.remove(cle);
         } catch (InstrumentInexistantException ex) {
             System.out.println("L'instrument ne peut être supprimé");
         }
    }
}
