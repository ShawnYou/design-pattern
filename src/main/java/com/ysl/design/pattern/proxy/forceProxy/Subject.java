package com.ysl.design.pattern.proxy.forceProxy;

/**
 * Created by shawn_lin on 2019/4/6.
 */
public interface Subject {
    void request();

    Subject getProxy();
}
