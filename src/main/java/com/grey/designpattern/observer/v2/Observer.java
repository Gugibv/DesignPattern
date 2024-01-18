package com.grey.designpattern.observer.v2;

/**
 * 定义观察者对象的行为，即在主题对象状态改变时更新自身状态的方法
 */
public interface Observer {
    void update(Subject subject);
}