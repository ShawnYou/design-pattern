package com.ysl.design.pattern.proxy.staticProxy;

/**
 * Created by shawn_lin on 2019/4/5.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("start to request");
    }
}
