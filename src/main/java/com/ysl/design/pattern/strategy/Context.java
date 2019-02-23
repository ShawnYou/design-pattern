package com.ysl.design.pattern.strategy;

/**
 * Created by shawn_lin on 2019/2/21.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything(){
        strategy.doSomething();
    }
}
