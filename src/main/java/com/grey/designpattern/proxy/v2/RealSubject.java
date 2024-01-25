package com.grey.designpattern.proxy.v2;

public class RealSubject implements ProxySubject {
    @Override
    public void request() {
        System.out.println("RealSubject::request");
    }
}
