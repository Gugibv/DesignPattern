package com.grey.designpattern.mediator;

/**
 * Colleague 是同事类的抽象基类
 * 成员变量 m_pMediator，用于保存对中介者的引用
 */
abstract  class Colleague {
    protected Mediator m_pMediator;

    public void setMediator(Mediator mediator) {
        this.m_pMediator = mediator;
    }

    public abstract void sendmsg(int toWho, String str);
    public abstract void receivemsg(String str);
}
