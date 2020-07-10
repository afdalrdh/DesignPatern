/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author afdalrdh
 */
public class main {
    public static void main(String[] args) {
        bajuBaru Baju = new bajuBaru(true);
           
        Customer customer1 = new Customer(Baju, "Afdal");
        Baju.addObserver(customer1);

        Customer customer2 = new Customer(Baju, "Henry");
        Baju.addObserver(customer2);
        
        Baju.setInStock(true);
    }
}
