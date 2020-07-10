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
public class SmartphoneDecorator implements Smartphone {

    protected Smartphone decoratedSmartphone;

    public SmartphoneDecorator(Smartphone decoratedSmartphone){
        this.decoratedSmartphone = decoratedSmartphone;
    }

    @Override
    public void draw() {
        decoratedSmartphone.draw();
    }
    
}
