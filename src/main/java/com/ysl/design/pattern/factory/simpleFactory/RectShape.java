package com.ysl.design.pattern.factory.simpleFactory;

/**
 * @author aarony
 * @Created 2019-03-22 15:36
 * @E-mail aarony@synnex.com
 */
public class RectShape implements Shape {
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
