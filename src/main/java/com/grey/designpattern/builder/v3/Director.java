package com.grey.designpattern.builder.v3;

public class Director {
    private Builder pbuilder;

    public Product construct() {
        pbuilder.buildPartA();
        pbuilder.buildPartB();
        pbuilder.buildPartC();

        return pbuilder.getResult();
    }

    public void setBuilder(Builder builder) {
        pbuilder = builder;
    }
}