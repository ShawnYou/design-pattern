package com.ysl.design.pattern.build;

/**
 * Created by shawn_lin on 2019/2/17.
 */
public class BenzCarModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("======start");
    }

    @Override
    protected void stop() {
        System.out.println("======stop");
    }

    @Override
    protected void alarm() {
        System.out.println("======alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("======engineBoom");
    }
}
