package com.ysl.design.pattern.factory.abstractFactory;

/**
 * ios 工厂
 */
public class IosFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new IosOperationController();
    }

    @Override
    public UIController createUIController() {
        return new IosUIController();
    }
}
