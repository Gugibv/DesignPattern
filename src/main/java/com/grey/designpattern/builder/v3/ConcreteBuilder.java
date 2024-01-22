package com.grey.designpattern.builder.v3;

public class ConcreteBuilder implements Builder {
    private Product m_prod;

    public ConcreteBuilder() {
        m_prod = new Product();
    }

    @Override
    public void buildPartA() {
        m_prod.setA("A Style");
    }

    @Override
    public void buildPartB() {
        m_prod.setB("B Style");
    }

    @Override
    public void buildPartC() {
        m_prod.setC("C Style");
    }

    public Product getResult() {
        return m_prod;
    }
}