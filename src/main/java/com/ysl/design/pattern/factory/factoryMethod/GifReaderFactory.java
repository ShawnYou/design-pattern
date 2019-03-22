package com.ysl.design.pattern.factory.factoryMethod;

/**
 * gif 图片加载器工厂
 */
public class GifReaderFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return new GifReader();
    }
}
