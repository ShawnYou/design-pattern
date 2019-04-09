package com.ysl.design.pattern.command;

import java.util.Arrays;
import java.util.List;

/**
 * Created by shawn_lin on 2019/4/9.
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        ConcreteReceiverA receiverA = new ConcreteReceiverA();
        ConcreteReceiverB receiverB = new ConcreteReceiverB();
        List<Receiver> receivers = Arrays.asList(receiverA,receiverB);

        AddNewFunctionCommand addNewFunction = new AddNewFunctionCommand(receivers);

        invoker.setCommand(addNewFunction);

        invoker.action();
    }
}
