package com.ysl.design.pattern.demite;

/**
 * Created by shawn_lin on 2019/3/25.
 */
public class PaperBoy {
    private Customer customer;

    public PaperBoy(Customer customer){
        this.customer = customer;
    }

    public void charge(float payment){
        customer.pay(payment);
    }
}
