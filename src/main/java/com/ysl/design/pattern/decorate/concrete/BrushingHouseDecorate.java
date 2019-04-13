package com.ysl.design.pattern.decorate.concrete;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public class BrushingHouseDecorate extends HouseDecorate{
    public BrushingHouseDecorate(House house) {
        super(house);
    }

    @Override
    public void decorate() {
        house.decorate();
        System.out.println("房屋装修------刷漆");
    }
}
