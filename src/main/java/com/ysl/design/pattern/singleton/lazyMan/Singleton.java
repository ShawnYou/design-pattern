package com.ysl.design.pattern.singleton.lazyMan;

/**
 *
 * 懒汉式 单例模式
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if( instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
