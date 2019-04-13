package com.ysl.design.pattern.responsibleChain.concrete;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public class ResourceVerifyHandler extends VerifyHandler{
    @Override
    public void examine(Request request) {
        System.out.println("资源部领导审批通过");
        System.out.println("发放显示器");
    }
}
