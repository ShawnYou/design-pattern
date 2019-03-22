package com.ysl.design.pattern.factory.abstractFactory;

/**
 * 安卓界面控制器
 */
public class AndroidUIController implements UIController{
    @Override
    public void display() {
        System.out.println("android ui controller");
    }
}
