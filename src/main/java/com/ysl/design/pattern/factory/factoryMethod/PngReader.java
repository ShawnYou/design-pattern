package com.ysl.design.pattern.factory.factoryMethod;

/**
 *
 * png 图片加载器
 */
public class PngReader implements Reader{
    @Override
    public void read() {
        System.out.println("png picture reader");
    }
}
