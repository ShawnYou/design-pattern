package com.ysl.design.pattern.decorate.concrete;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public class RoughHouse implements House{
    @Override
    public void decorate() {
        System.out.println("毛坯房要开始装修了");
    }
}
