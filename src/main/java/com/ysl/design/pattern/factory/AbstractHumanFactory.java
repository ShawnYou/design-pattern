package com.ysl.design.pattern.factory;

/**
 * Created by shawn_lin on 2019/2/16.
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman();
}
