package com.grey.designpattern.mediator;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB() {
    }

    @Override
    public void sendmsg(int toWho, String str) {
        System.out.println("send msg from colleague B, to: " + toWho);
        m_pMediator.operation(toWho, str);
    }

    @Override
    public void receivemsg(String str) {
        System.out.println("ConcreteColleagueB reveivemsg: " + str);
    }
}