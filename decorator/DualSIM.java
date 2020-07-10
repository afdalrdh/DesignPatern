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
public class DualSIM extends SmartphoneDecorator{

    public DualSIM(Smartphone decoratedSmartphone) {
        super(decoratedSmartphone);
    }
    
    @Override
    public void draw() {
       decoratedSmartphone.draw();	       
       setRedBorder(decoratedSmartphone);
    }

    private void setRedBorder(Smartphone decoratedSmartphone){
       System.out.println("Tipe SIM: Dual SIM");
    }
   
}
