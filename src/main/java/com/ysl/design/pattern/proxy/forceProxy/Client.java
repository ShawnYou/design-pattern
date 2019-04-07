package com.ysl.design.pattern.proxy.forceProxy;

/**
 * Created by shawn_lin on 2019/4/6.
 */
public class Client {
    public static void main(String[] args) {
        RealSubject subject = new RealSubject();
        Subject proxy = subject.getProxy();
        proxy.request();
    }
}
