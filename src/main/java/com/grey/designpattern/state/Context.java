package com.grey.designpattern.state;

/**
 * 上下文Context类持有一个当前状态对象，并提供了状态切换的方法 changeState() 和请求处理的方法 request()
 * 通过使用状态对象来处理请求，将具体的处理转移到状态对象中，从而实现了状态的切换和处理
 */
public class Context {
    private State mState;

    public Context() {
        // default is stateA
        mState = ConcreteStateA.getInstance();
    }

    public void changeState(State st) {
        mState = st;
    }

    public void request() {
        mState.handle(this);
    }
}
