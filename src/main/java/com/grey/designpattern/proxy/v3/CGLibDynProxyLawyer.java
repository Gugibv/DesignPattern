package com.grey.designpattern.proxy.v3;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibDynProxyLawyer implements MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Proxy::preRequest");

        Object result = methodProxy.invokeSuper(o, objects);

        System.out.println("Proxy::afterRequest");

        return result;
    }
}
