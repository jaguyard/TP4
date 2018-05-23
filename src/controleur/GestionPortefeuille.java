/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        Scanner in = new Scanner(System.in);
        System.out.println("Entrer la clé du fond");
        String cle = in.nextLine();
        System.out.println("Entrer le montant du fond");
        double fond = in.nextDouble();
        Portefeuille p = new Portefeuille();
        try {
            p.rechercheFond(cle);
        } catch (FondsInexistantException ex) {
            Logger.getLogger(GestionPortefeuille.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
}
}
