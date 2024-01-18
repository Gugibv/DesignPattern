package com.grey.designpattern.state;

public class ConcreteStateB implements State {
    private static State mState = null;

    private ConcreteStateB() {}

    public static State getInstance() {
        if (mState == null) {
            mState = new ConcreteStateB();
        }
        return mState;
    }

    public void handle(Context c) {
        System.out.println("Doing something in State B.");
        System.out.println("Done, then change the state to A.");
        c.changeState(ConcreteStateA.getInstance());
    }
}
