package com.ysl.design.pattern.adapter;

/**
 * Created by shawn_lin on 2019/2/21.
 *  适配类
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.doSomething();
    }
}
