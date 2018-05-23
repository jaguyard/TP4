/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.Fonds;
import modele.Instrument;
import modele.Portefeuille;

/* 1.8 Fonds implements Comparable
   2.1 Portefeuille implements Serializable
*/



/**
 *
 * @author Jean
 */
public class GestionPortefeuille {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double result;
        Scanner in = new Scanner(System.in);
        System.out.println("Entrer la clé du fond");
        String cle = in.nextLine();
        System.out.println("Entrer le montant du fond");
        double fond = in.nextDouble();
        String bnp = "BNP";
        String tot = "TOT";
        String cac = "CAC";
        Fonds un = new Fonds(100,bnp);
        Fonds deux = new Fonds(102.56,tot);
        ArrayList<Fonds> instruUn = new ArrayList();
        instruUn.add(un);
        instruUn.add(deux);
        Instrument fondUn = new Instrument(instruUn,cac);
        HashMap<String,Fonds> fondtest = new HashMap();
        HashMap<String,Instrument> instrumentest = new HashMap();
        fondtest.put("hello", un);
        fondtest.put("hello2", deux);
        instrumentest.put("hello3", fondUn);
        Portefeuille p = new Portefeuille(fondtest,instrumentest);
        try {
            p.rechercheFond(cle);
        } catch (FondsInexistantException ex) {
            try{
                   p.ajouterFond(cle, fond);
            } catch (FondsExistantException ex1) {
                System.out.println("hello");
            }
        }
        
        
    
}
}
