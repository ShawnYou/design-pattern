package com.ysl.design.pattern.responsibleChain.concrete;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public class TeamLeaderVerifyHandler extends VerifyHandler{

    @Override
    public void examine(Request request) {
        System.out.println(request.getRequest());

        System.out.println("直属领导审批通过");

        nextVerify(request);
    }
}
