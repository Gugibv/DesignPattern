package com.grey.designpattern.mediator;

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA() {
    }

    @Override
    public void sendmsg(int toWho, String str) {
        System.out.println("send msg from colleague A, to: " + toWho);
        m_pMediator.operation(toWho, str);
    }

    @Override
    public void receivemsg(String str) {
        System.out.println("ConcreteColleagueA reveivemsg: " + str);
    }
}

