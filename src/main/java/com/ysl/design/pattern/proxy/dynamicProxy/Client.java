package com.ysl.design.pattern.proxy.dynamicProxy;

/**
 * Created by shawn_lin on 2019/4/6.
 */
public class Client {
    public static void main(String[] args) {
        CarAgency agency = new CarAgency();
        CustomerService customerService = (CustomerService)agency.getInstance(new CustomerServiceImpl());
        customerService.buyCar();
    }
}
