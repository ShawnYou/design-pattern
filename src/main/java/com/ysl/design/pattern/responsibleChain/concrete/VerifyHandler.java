package com.ysl.design.pattern.responsibleChain.concrete;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public abstract class VerifyHandler {
    private VerifyHandler nextVerify;

    public void setNextVerify(VerifyHandler nextVerify){
        this.nextVerify = nextVerify;
    }

    public abstract void examine(Request request);

    public final void nextVerify(Request request){
        if(nextVerify != null){
            this.nextVerify.examine(request);
        }
    }
}
