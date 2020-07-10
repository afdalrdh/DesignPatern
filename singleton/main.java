/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author afdalrdh
 */
public class main {
    public static void main(String args[]) 
    { 
        Singleton a = Singleton.Singleton(); 
        Singleton b = Singleton.Singleton(); 
  
        a.s = (a.s).toUpperCase(); 
  
        System.out.println("Uppercase dari a " + a.s); 
        System.out.println("Uppercase dari b " + b.s); 
        
        a.s = (a.s).toLowerCase(); 
  
        System.out.println("Lowercase dari a " + a.s); 
        System.out.println("Lowercase dari b " + b.s); 
    } 
}
