package com.ysl.design.pattern.factory.simpleFactory;

/**
 * @author aarony
 * @Created 2019-03-22 15:37
 * @E-mail aarony@synnex.com
 */
public class ShapeFactory {
    public static Shape getShape(String type){
        Shape shape = null;
        if("circle".equalsIgnoreCase(type)){
            shape = new CircleShape();
        }else if("rectangle".equalsIgnoreCase(type)){
            shape = new RectShape();
        }
        return shape;
    }

    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.draw();
    }
}
