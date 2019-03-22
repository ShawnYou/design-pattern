package com.ysl.design.pattern.factory.abstractFactory;

/**
 * ios 界面控制器
 */
public class IosUIController implements UIController {
    @Override
    public void display() {
        System.out.println("ios ui controller");
    }
}
