package com.grey.designpattern.strategy.v4;

public class Context {
    private Strategy m_pStrategy;

    void algorithm() {
        m_pStrategy.algorithm();
    }

    void setStrategy(Strategy st) {
        m_pStrategy = st;
    }
}
