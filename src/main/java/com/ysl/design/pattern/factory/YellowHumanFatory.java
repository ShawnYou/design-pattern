package com.ysl.design.pattern.factory;

/**
 * Created by shawn_lin on 2019/2/16.
 */
public class YellowHumanFatory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}