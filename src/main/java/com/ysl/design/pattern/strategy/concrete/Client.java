package com.ysl.design.pattern.strategy.concrete;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public class Client {
    public static void main(String[] args) {
        ThemeManager themeManager = new ThemeManager();
        //设置黑暗风格主题
        themeManager.setTheme(new DarkTheme());
        themeManager.applyTheme();
    }
}
