package com.ysl.design.pattern.prototype;

/**
 * Created by shawn_lin on 2019/4/7.
 */
public class Client {
    public static void main(String[] args) {
        PrototypeClass prototypeClass = new PrototypeClass();
        PrototypeClass prototypeClone = prototypeClass.clone();

        System.out.println("克隆出来的对象是否是以前的对象");
        System.out.println(prototypeClass.equals(prototypeClone));

        System.out.println("克隆出来的对象类型是否是以前的对象类型");
        System.out.println(prototypeClass.getClass() == prototypeClone.getClass());
    }
}
