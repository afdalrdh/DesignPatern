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
public class Singleton {
    private static Singleton single_instance=null; 
  
    public String s; 
  
    private Singleton() 
    { 
        s = "Afdal Ramdan Daman Huri"; 
    } 
  
    public static Singleton Singleton() 
    { 
        if (single_instance == null) 
        { 
            single_instance = new Singleton(); 
        } 
        return single_instance; 
    } 
}
