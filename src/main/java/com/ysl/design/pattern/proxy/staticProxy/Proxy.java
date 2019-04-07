package com.ysl.design.pattern.proxy.staticProxy;

/**
 * Created by shawn_lin on 2019/4/5.
 */
public class Proxy implements Subject{
    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        subject.request();
        this.after();
    }

    private void before(){
        System.out.println("前置处理。。。。");
    }

    private void after(){
        System.out.println("后置处理。。。。");
    }
}
