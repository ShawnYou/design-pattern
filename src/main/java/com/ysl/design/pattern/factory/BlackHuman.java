package com.ysl.design.pattern.factory;

/**
 * Created by shawn_lin on 2019/2/16.
 */
public abstract class BlackHuman implements Human {
    @Override
    public void say() {
        System.out.println("黑人说黑话");
    }

    @Override
    public void getColor() {
        System.out.println("I'm black man");
    }
}
