package com.ysl.design.pattern.factory.abstractFactory;


public interface SystemFactory {
    OperationController createOperationController();
    UIController createUIController();
}
