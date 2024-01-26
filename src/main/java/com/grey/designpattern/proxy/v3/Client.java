package com.grey.designpattern.proxy.v3;

import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args){
        RealSubject realSubject = new RealSubject();

        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(realSubject.getClass());
        enhancer.setCallback(new CGLibDynProxyLawyer());


        RealSubject proxy = (RealSubject)enhancer.create();
        proxy.request();

    }
}
