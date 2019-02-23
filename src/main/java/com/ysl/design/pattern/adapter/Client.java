package com.ysl.design.pattern.adapter;

/**
 * Created by shawn_lin on 2019/2/21.
 */
public class Client {
    public static void main(String[] args) {

        Target target = new Adapter();

        target.request();

    }
}
