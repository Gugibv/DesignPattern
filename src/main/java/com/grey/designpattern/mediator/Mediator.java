package com.grey.designpattern.mediator;


/**
 * Mediator 接口定义了中介者的操作方法：operation 和 registered
 */
public interface Mediator {
    void operation(int nWho, String str);
    void registered(int nWho, Colleague aColleague);

}
