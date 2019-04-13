package com.ysl.design.pattern.responsibleChain.concrete;

/**
 * Created by shawn_lin on 2019/4/13.
 */
public class Request {
    private String request;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Request(String request){
        this.request = request;
    }
}
