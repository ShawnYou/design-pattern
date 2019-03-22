package com.ysl.design.pattern.singleton.lazyMan;

/**
 *
 *  懒汉式 单例模式（加锁）
 */
public class SafeSingleton {

    private static SafeSingleton instance = null;

    private SafeSingleton(){}

    public static synchronized SafeSingleton getInstance(){
        if(instance == null){
            instance = new SafeSingleton();
        }

        return instance;
    }
}
