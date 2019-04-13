package com.ysl.design.pattern.decorate.concrete;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public abstract class HouseDecorate implements House{
    protected House house;

    public HouseDecorate(House house) {
        this.house = house;
    }
}
