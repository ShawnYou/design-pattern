package com.ysl.design.pattern.strategy.concrete;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public class DarkTheme implements Theme{
    @Override
    public void applyTheme() {
        System.out.println("设置暗黑风格主题");
    }
}
