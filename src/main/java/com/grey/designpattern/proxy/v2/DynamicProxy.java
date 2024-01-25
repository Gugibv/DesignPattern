package com.grey.designpattern.proxy.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    private final Subject target;//被代理的对象

    public DynamicProxy(RealSubject realSubject) {
        this.target = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxy::preRequest");

        Object result=method.invoke(target,args);

        System.out.println("Proxy::afterRequest");

        return result;
    }
}
