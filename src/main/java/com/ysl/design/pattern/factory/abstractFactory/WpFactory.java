package com.ysl.design.pattern.factory.abstractFactory;

/**
 * wp 工厂
 */
public class WpFactory implements SystemFactory{
    @Override
    public OperationController createOperationController() {
        return new WpOperationController();
    }

    @Override
    public UIController createUIController() {
        return new WpUIController();
    }
}
