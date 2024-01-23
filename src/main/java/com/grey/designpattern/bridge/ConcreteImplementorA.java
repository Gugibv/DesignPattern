package com.grey.designpattern.bridge;

class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        // 具体实现逻辑
        System.out.println("ConcreteImplementorA operationImpl");
    }
}