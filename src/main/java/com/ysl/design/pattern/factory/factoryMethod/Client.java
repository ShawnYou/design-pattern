package com.ysl.design.pattern.factory.factoryMethod;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        GifReaderFactory gifReaderFactory = new GifReaderFactory();
        Reader gifReader = gifReaderFactory.getReader();
        gifReader.read();

        PngReaderFactory pngReaderFactory = new PngReaderFactory();
        Reader pngReader = pngReaderFactory.getReader();
        pngReader.read();

        JpgReaderFactory jpgReaderFactory = new JpgReaderFactory();
        Reader jpgReader = jpgReaderFactory.getReader();
        jpgReader.read();

    }
}
