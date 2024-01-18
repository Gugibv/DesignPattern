package com.grey.designpattern.observer.v2;

/**
 * 定义主题对象的行为，包括注册、移除和通知观察者的方法，以及获取状态和设置状态的方法。
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
    int getState();
    void setState(int state);
}