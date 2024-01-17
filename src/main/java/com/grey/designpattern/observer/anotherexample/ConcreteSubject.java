package com.grey.designpattern.observer.anotherexample;
import java.util.ArrayList;
import java.util.List;

/**
 * 实现了 Subject 接口，表示具体的主题对象。它维护一个观察者列表，并在状态发生改变时通知观察者
 */
class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
    }
}