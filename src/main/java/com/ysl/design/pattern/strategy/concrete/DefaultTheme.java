package com.ysl.design.pattern.strategy.concrete;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public class DefaultTheme implements Theme{
    @Override
    public void applyTheme() {
        System.out.println("设置默认主题");
    }
}
