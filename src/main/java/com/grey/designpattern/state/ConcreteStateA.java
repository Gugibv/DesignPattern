package com.grey.designpattern.state;

/**
 * 具体的状态类 实现了 State 接口，并提供了各自的 handle() 方法的实现
 * 每个具体的状态类表示了对象的不同状态，并定义了在该状态下要执行的操作
 */
public class ConcreteStateA implements State {
    private static State mState = null;

    private ConcreteStateA() {}

    public static State getInstance() {
        if (mState == null) {
            mState = new ConcreteStateA();
        }
        return mState;
    }

    public void handle(Context c) {
        System.out.println("Doing something in State A.");
        System.out.println("Done,then change the state to B.");
        c.changeState(ConcreteStateB.getInstance());
    }
}