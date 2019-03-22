package com.ysl.design.pattern.factory.abstractFactory;

/**
 * 安卓工厂
 */
public class AndroidFactory implements SystemFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public UIController createUIController() {
        return new AndroidUIController();
    }
}
