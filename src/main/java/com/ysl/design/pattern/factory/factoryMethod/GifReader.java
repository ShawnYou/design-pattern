package com.ysl.design.pattern.factory.factoryMethod;

/**
 *
 * gif 图片加载器
 */
public class GifReader implements Reader{
    @Override
    public void read() {
        System.out.println("gif picture reader");
    }
}
