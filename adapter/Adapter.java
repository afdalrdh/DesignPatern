/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author afdalrdh
 */
public class Adapter extends Kotak{
    
    private Lingkaran circle;
    
    Adapter(Lingkaran circle) {
        this.circle = circle;
    }
    
    @Override
    public int getLuas() {
        int hasil;
        hasil = (int)circle.getLuas();
        return hasil;
    }
    
}
