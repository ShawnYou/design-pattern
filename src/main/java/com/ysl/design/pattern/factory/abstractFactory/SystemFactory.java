package com.ysl.design.pattern.factory.abstractFactory;

/**
 * @author aarony
 * @Created 2019-03-22 17:46
 * @E-mail aarony@synnex.com
 */
public interface SystemFactory {
    public OperationController createOperationController();
    public UIController createUIController();
}
