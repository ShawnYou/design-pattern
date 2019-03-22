package com.ysl.design.pattern.factory.abstractFactory;

/**
 * 安卓操作控制器
 */
public class AndroidOperationController implements OperationController{
    @Override
    public void control() {
        System.out.println("android opration controller");
    }
}
