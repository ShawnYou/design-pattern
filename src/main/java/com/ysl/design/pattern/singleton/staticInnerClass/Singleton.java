package com.ysl.design.pattern.singleton.staticInnerClass;

/**
 *
 *  静态内部类 实现单例模式
 */
public class Singleton {

    private static class SingletonHolder{

        private static final Singleton instance = new Singleton();

    }

    private Singleton(){}

    public static final Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
