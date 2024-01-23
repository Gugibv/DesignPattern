package com.grey.designpattern.bridge;

class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    void operation() {
        // 一些额外的操作
        System.out.println("RefinedAbstraction operation");
        implementor.operationImpl();
    }
}