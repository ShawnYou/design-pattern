package com.ysl.design.pattern.proxy.forceProxy;

/**
 * Created by shawn_lin on 2019/4/6.
 */
public class SubjectProxy implements Subject{
    private Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.subject.request();
    }

    @Override
    public Subject getProxy() {
        return this;
    }
}
