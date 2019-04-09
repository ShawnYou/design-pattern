package com.ysl.design.pattern.command;

/**
 * Created by shawn_lin on 2019/4/9.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void action(){
        this.command.doSomething();
    }
}
