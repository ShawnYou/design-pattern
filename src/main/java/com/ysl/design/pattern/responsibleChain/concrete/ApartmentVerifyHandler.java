package com.ysl.design.pattern.responsibleChain.concrete;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public class ApartmentVerifyHandler extends VerifyHandler{
    @Override
    public void examine(Request request) {
        System.out.println("部门领导审批通过");

        nextVerify(request);
    }
}
