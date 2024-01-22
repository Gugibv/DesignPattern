package com.grey.designpattern.builder.v3;

public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setA(String partA) {
        this.partA = partA;
    }

    public void setB(String partB) {
        this.partB = partB;
    }

    public void setC(String partC) {
        this.partC = partC;
    }

    public void show() {
        System.out.println("Product Parts:");
        System.out.println("Part A: " + partA);
        System.out.println("Part B: " + partB);
        System.out.println("Part C: " + partC);
    }
}
