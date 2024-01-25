package com.grey.designpattern.proxy.v1;

// 它也实现了Subject接口，代理类的构造函数中创建了一个RealSubject对象
// 在代理类中，定义了两个私有方法preRequest()和afterRequest(),执行一些额外的操作
public class StaticProxy implements Subject {
    private final RealSubject realSubject;

    public StaticProxy() {
        realSubject = new RealSubject();
    }

    private void afterRequest() {
        System.out.println("Proxy::afterRequest");
    }

    private void preRequest() {
        System.out.println("Proxy::preRequest");
    }

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        afterRequest();
    }
}
