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
public class main {
    public static void main(String Args[]) {
        PersegiPanjang kotak1 = new PersegiPanjang(20,25);
        Lingkaran lingkaran1 = new Lingkaran(10);
        Adapter lingkaranInKotak = new Adapter(lingkaran1);
        System.out.println("1. Luas Persegi Panjang = " + kotak1.getLuas());
        System.out.println("2. Luas Lingkaran = " + lingkaran1.getLuas());
        Compare hasilBanding = new Compare(kotak1.getLuas(), lingkaranInKotak.getLuas());
    }
}
