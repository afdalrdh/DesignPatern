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
public class Compare {
    public Compare(int bangunDatar1, int bangunDatar2) {
        if(bangunDatar1 == bangunDatar2) {
            System.out.println("Luas kedua bangun datar sama.");
        }
        if(bangunDatar1 > bangunDatar2) {
            System.out.println("Luas bangun datar 1 lebih besar daripada 2");
        }
        if(bangunDatar2 > bangunDatar1) {
            System.out.println("Luas bangun datar 2 lebih besar daripada 1");
        }
    }
}
