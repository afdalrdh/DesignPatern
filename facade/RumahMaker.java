/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author afdalrdh
 */
public class RumahMaker {
   private Rumah rumah1;
   private Rumah rumah2;
   private Rumah rumah3;

   public RumahMaker() {
      rumah1 = new jenisRumah1();
      rumah2 = new jenisRumah2();
      rumah3 = new jenisRumah3();
   }

   public void drawRumah1(){
      rumah1.draw();
   }
   public void drawRumah2(){
      rumah2.draw();
   }
   public void drawRumah3(){
      rumah3.draw();
   }
}
