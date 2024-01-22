package com.grey.designpattern.builder.v3;

public interface Builder {
    void buildPartA();
    void buildPartB();
    void buildPartC();
    Product getResult();
}