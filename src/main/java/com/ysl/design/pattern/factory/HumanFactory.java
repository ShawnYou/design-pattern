package com.ysl.design.pattern.factory;

/**
 * Created by shawn_lin on 2019/2/16.
 */
public interface HumanFactory {

    Human createBlackHuman();

    Human createWhiteHuman();

    Human createYellowHuman();
}
