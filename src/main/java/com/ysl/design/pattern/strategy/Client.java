package com.ysl.design.pattern.strategy;

/**
 * Created by shawn_lin on 2019/2/21.
 */
public class Client {
    public static void main(String[] args) {

        //选择策略A作为实现
        Context context = new Context(new ConcreteStrategyA());

        context.doAnything();
    }
}
