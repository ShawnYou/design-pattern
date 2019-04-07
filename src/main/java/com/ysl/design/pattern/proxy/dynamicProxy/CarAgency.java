package com.ysl.design.pattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by shawn_lin on 2019/4/6.
 */
public class CarAgency implements InvocationHandler{
    //被代理对象的引用
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("办理车辆质量检查报告");
        method.invoke(target,args);
        System.out.println("办理车辆二手车过户");
        return null;
    }
}
