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
public class PersegiPanjang {
    private int sisi1;
    private int sisi2;
    
    public PersegiPanjang() {}
    
    public PersegiPanjang(int sisi1, int sisi2) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }
    
    public int getSisi1() {
        return sisi1;
    }
    
    public int getSisi2() {
        return sisi2;
    }
    
    public int getLuas() {
        int hasil;
        hasil = sisi1*sisi2;
        return hasil;
    }
}