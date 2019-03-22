package com.ysl.design.pattern.factory.abstractFactory;

/**
 * ios 操作控制器
 */
public class IosOperationController implements OperationController {
    @Override
    public void control() {
        System.out.println("ios operation controller");
    }
}
