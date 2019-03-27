package com.ysl.design.pattern.demite;

/**
 * Created by shawn_lin on 2019/3/25.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Wallet myWallet;

    public Customer(String firstName, String lastName, Wallet myWallet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.myWallet = myWallet;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void pay(float payment){
        myWallet.pay(payment);
    }
}
