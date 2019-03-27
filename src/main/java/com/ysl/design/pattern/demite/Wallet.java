package com.ysl.design.pattern.demite;

/**
 * Created by shawn_lin on 2019/3/25.
 */
public class Wallet {
    private float value;
    private float getTotalMoney() {
        return value;
    }
    public void setTotalMoney(float newValue) {
        value = newValue;
    }
    private void addMoney(float deposit) {
        value += deposit;
    }
    private void subtractMoney(float debit) {
        value -= debit;
    }

    public void pay(float payment){
        if(getTotalMoney()>payment){
            subtractMoney(payment);
        }else {

        }
    }
}
