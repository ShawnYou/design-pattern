package com.ysl.design.pattern.command;

import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * Created by shawn_lin on 2019/4/9.
 */
public class AddNewFunctionCommand extends Command {
    private List<Receiver> receivers;

    public AddNewFunctionCommand(List<Receiver> receivers){
        this.receivers = receivers;
    }

    @Override
    public void doSomething() {
        if(!ObjectUtils.isEmpty(receivers)){
            receivers.forEach(receiver -> {
                receiver.doSomething();
            });
        }
    }
}
