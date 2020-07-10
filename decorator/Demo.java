/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author afdalrdh
 */
public class Demo {
    public static void main(String[] args) {

        Smartphone afdal = new Samsung();

        Smartphone dualSIMSamsung = new DualSIM(new Samsung());

        Smartphone dualSIMXiaomi = new DualSIM(new Xiaomi());
        System.out.println("Tipe HP");
        afdal.draw();

        System.out.println("\nFitur Samsung");
        dualSIMSamsung.draw();

        System.out.println("\nFitur Xiaomi");
        dualSIMXiaomi.draw();
    }
}
