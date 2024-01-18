package com.grey.designpattern.strategy.v4;

public class ConcreteStrategyB  implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("use algorithm B");
    }
}