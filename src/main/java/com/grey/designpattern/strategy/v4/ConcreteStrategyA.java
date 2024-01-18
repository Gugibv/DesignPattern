package com.grey.designpattern.strategy.v4;

public class ConcreteStrategyA  implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("use algorithm A");
    }
}
