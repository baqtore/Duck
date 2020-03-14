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
public abstract class Manka {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    
    public Manka() {
    }
    public abstract void display();
    public void performQuack() {
        quackBehavior.quack();
    }
        public void performFly() {
        flyBehavior.fly();
    }
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
