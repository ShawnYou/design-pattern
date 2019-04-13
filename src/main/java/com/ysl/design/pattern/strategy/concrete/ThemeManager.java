package com.ysl.design.pattern.strategy.concrete;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public class ThemeManager {
    private Theme theme;

    public ThemeManager() {
        this.theme = new DefaultTheme();
    }

    public void setTheme(Theme theme){
        this.theme = theme;
    }

    public void applyTheme(){
        this.theme.applyTheme();
    }
}
