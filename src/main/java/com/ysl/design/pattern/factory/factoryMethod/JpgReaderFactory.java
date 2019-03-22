package com.ysl.design.pattern.factory.factoryMethod;

/**
 * jpg 图片加载器工厂
 */
public class JpgReaderFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return new JpgReader();
    }
}
