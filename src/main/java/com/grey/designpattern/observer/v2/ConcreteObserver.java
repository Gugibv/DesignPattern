package com.grey.designpattern.observer.v2;


/**
 * 实现了 Observer 接口，表示具体的观察者对象。它包含观察者的名称和状态，并在被通知时更新自身状态
 */
public class ConcreteObserver  implements Observer {
    private String objName;
    private int observerState;

    public ConcreteObserver(String name) {
        objName = name;
    }

    @Override
    public void update(Subject subject) {
        observerState = subject.getState();
        System.out.println("update observer[" + objName + "] state:" + observerState);
    }
}
