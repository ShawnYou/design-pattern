package com.ysl.design.pattern.proxy.forceProxy;

/**
 * Created by shawn_lin on 2019/4/6.
 */
public class RealSubject implements Subject{
    private Subject proxy = null;
    @Override
    public void request() {
        if(this.isProxy()){
            System.out.println("start to request");
        }else {
            System.out.println("请使用指定的代理进行访问");
        }

    }

    @Override
    public Subject getProxy() {
        this.proxy = new SubjectProxy(this);
        return this.proxy;
    }

    private boolean isProxy(){
        if(this.proxy == null){
            return false;
        }else {
            return true;
        }
    }
}
