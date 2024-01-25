package com.grey.designpattern.proxy.v1;

// 它实现了Subject接口，并重写了request()方法来表示真实主题的操作
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject::request");
    }
}
