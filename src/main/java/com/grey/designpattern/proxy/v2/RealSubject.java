package com.grey.designpattern.proxy.v2;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject::request");
    }
}
