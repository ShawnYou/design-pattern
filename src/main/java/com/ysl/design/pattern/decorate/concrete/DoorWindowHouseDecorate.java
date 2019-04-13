package com.ysl.design.pattern.decorate.concrete;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public class DoorWindowHouseDecorate extends HouseDecorate{
    public DoorWindowHouseDecorate(House house) {
        super(house);
    }

    @Override
    public void decorate() {
        house.decorate();
        System.out.println("房屋装修------门窗定制");
    }
}
