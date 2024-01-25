package com.grey.designpattern.proxy.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {

        RealSubject realSubject = new RealSubject();
        InvocationHandler handler = new DynamicProxy(realSubject);

        ProxySubject proxy = (ProxySubject) Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                handler);

        proxy.request();

    }
}
