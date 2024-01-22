package com.grey.designpattern.prototype.v2;

public class Prototype {
    public static void main (String[] args)
    {
        ColorRegistry.getColor("blue").addColor();
        ColorRegistry.getColor("black").addColor();



        // 注册新的实现类型
        ColorRegistry.registerColor("yellow", new Color() {
            @Override
            void addColor() {

            }

            @Override
            public Color clone() {
                return new Color() {
                    @Override
                    void addColor() {
                        System.out.println("Yellow color added");
                    }
                };
            }
        });

        ColorRegistry.getColor("yellow").addColor();
    }
}