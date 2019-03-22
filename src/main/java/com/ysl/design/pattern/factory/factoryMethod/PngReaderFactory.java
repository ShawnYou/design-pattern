package com.ysl.design.pattern.factory.factoryMethod;

/**
 * png 图片加载器工厂
 */
public class PngReaderFactory implements ReaderFactory {
    @Override
    public Reader getReader() {
        return new PngReader();
    }
}
