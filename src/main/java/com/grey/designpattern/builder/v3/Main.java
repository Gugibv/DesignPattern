package com.grey.designpattern.builder.v3;

public class Main {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director();
        director.setBuilder(builder);
        Product pd = director.construct();
        pd.show();
    }
}