package com.ysl.design.pattern.command;

/**
 * Created by shawn_lin on 2019/4/9.
 */
public class ConcreteReceiverA extends Receiver {
    @Override
    public void doSomething() {
        System.out.println("do something for A");
    }
}
