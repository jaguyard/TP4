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
public class InstrumentInexistantException extends Exception {
    public InstrumentInexistantException(){
    System.out.println("L'instrument est inexistant");
  }  
}
