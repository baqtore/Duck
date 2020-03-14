/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 *
 * @author Aktore
 */
public class mankaquak extends Manka{
     public mankaquak() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    public void display() {
        System.out.println("I'm a real mankaquak");
    }

}


