package com.ysl.design.pattern.factory;

/**
 * Created by shawn_lin on 2019/2/16.
 */
public abstract class WhiteHuman implements Human{
    @Override
    public void say() {
        System.out.println();
    }

    @Override
    public void getColor() {
        System.out.println();
    }
}
