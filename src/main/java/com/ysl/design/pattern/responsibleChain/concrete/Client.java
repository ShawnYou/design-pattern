package com.ysl.design.pattern.responsibleChain.concrete;


/**
 * Created by shawn_lin on 2019/4/13.
 */
public class Client {
    public static void main(String[] args) {
        TeamLeaderVerifyHandler teamLeaderVerifyHandler = new TeamLeaderVerifyHandler();
        ApartmentVerifyHandler apartmentVerifyHandler = new ApartmentVerifyHandler();
        ResourceVerifyHandler resourceVerifyHandler = new ResourceVerifyHandler();

        teamLeaderVerifyHandler.setNextVerify(apartmentVerifyHandler);
        apartmentVerifyHandler.setNextVerify(resourceVerifyHandler);

        Request request = new Request("申请一条显示器");
        teamLeaderVerifyHandler.examine(request);
    }
}
