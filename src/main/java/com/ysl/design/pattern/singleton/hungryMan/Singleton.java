package com.ysl.design.pattern.singleton.hungryMan;

/**
 *
 * 饿汉式 单例模式
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }
}
