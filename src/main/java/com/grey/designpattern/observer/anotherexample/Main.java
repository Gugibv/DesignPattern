package com.grey.designpattern.observer.anotherexample;

public class Main {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer objA = new ConcreteObserver("A");
        Observer objB = new ConcreteObserver("B");
        subject.attach(objA);
        subject.attach(objB);

        subject.setState(1);
        subject.notifyObservers();

        System.out.println("--------------------");

        subject.detach(objB);
        subject.setState(2);
        subject.notifyObservers();
    }
}