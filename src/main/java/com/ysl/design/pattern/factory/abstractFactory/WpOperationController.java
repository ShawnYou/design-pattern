package com.ysl.design.pattern.factory.abstractFactory;

/**
 * wp 操作控制器
 */
public class WpOperationController implements OperationController {
    @Override
    public void control() {
        System.out.println("wp operation controller");
    }
}
