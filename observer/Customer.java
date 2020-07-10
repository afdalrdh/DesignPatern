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
public class Customer implements Observer {
    
    private Observable observable;
    private String username;

    public Customer(Observable observable, String username){
        this.observable = observable;
        this.username = username;
    }

    @Override
    public void update() {
        System.out.println("Baju baru telah tersedia");
        buyDress();
    }


    private void buyDress(){
        System.out.println(username +" mendapat baju baru");
    }
    
}
