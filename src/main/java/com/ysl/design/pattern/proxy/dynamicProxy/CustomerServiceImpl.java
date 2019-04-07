package com.ysl.design.pattern.proxy.dynamicProxy;

/**
 * Created by shawn_lin on 2019/4/6.
 */
public class CustomerServiceImpl implements CustomerService{
    @Override
    public void buyCar() {
        System.out.println("决定买这个车了");
    }
}
