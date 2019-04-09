package com.ysl.design.pattern.command;

import java.util.List;

/**
 * Created by shawn_lin on 2019/4/9.
 */
public class DeleteFunctionCommand extends Command {
    private List<Receiver> receivers;

    public DeleteFunctionCommand(List<Receiver> receivers){
        this.receivers = receivers;
    }

    @Override
    public void doSomething() {

    }
}
