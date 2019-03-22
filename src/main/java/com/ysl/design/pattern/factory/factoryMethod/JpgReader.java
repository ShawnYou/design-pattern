package com.ysl.design.pattern.factory.factoryMethod;

/**
 *
 * jpg 图片加载器
 */
public class JpgReader implements Reader{
    @Override
    public void read() {
        System.out.println("jpg picture reader");
    }
}
