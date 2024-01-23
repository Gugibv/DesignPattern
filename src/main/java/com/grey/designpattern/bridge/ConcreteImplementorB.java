package com.grey.designpattern.bridge;

class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        // 具体实现逻辑
        System.out.println("ConcreteImplementorB operationImpl");
    }
}