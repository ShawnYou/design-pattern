package com.ysl.design.pattern.factory.abstractFactory;

/**
 * client
 */
public class Client {
    public static void main(String[] args) {
        AndroidFactory androidFactory = new AndroidFactory();
        OperationController androidOperation = androidFactory.createOperationController();
        androidOperation.control();

        UIController androidUI = androidFactory.createUIController();
        androidUI.display();

        IosFactory iosFactory = new IosFactory();
        OperationController iosOperation = iosFactory.createOperationController();
        iosOperation.control();

        UIController iosUI = iosFactory.createUIController();
        iosUI.display();

        WpFactory wpFactory = new WpFactory();
        OperationController wpOperation = wpFactory.createOperationController();
        wpOperation.control();

        UIController wpUI = wpFactory.createUIController();
        wpUI.display();
    }
}
