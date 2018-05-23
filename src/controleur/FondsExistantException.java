/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

/**
 *
 * @author Jean
 */
public class FondsExistantException extends Exception{
    public FondsExistantException(){
    System.out.println("Le fond existe déjà");
  }  
}
