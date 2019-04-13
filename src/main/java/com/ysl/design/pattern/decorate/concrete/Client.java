package com.ysl.design.pattern.decorate.concrete;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public class Client {
    public static void main(String[] args) {
        House house = new RoughHouse();

        house = new BrushingHouseDecorate(house);
        house = new TrunkingHouseDecorate(house);
        house = new CustomizedFurnitureHouseDecorate(house);
        house = new DoorWindowHouseDecorate(house);

        house.decorate();

    }
}
