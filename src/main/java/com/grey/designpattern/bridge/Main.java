package com.grey.designpattern.bridge;

public class Main {
    public static void main(String[] args) {

        Abstraction pa = new RefinedAbstraction(new ConcreteImplementorA());
        pa.operation();

        Abstraction pb = new RefinedAbstraction(new ConcreteImplementorB());
        pb.operation();
    }
}