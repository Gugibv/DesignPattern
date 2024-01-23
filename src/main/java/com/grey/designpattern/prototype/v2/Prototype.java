package com.grey.designpattern.prototype.v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

        // 源码应用举例 1
        Integer[] array = {1, 2, 3};
        List<Integer> list = Arrays.asList(array);

        list.set(0, 4);
        System.out.println(Arrays.toString(array)); // [4, 2, 3]

        // 源码应用举例 2
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");

        List<String> readOnlyList = Collections.list(Collections.enumeration(arrayList));

        System.out.println(readOnlyList);

        List<Integer> list2 = Collections.nCopies(5, 10);
        System.out.println(list2); // prints: [10, 10, 10, 10, 10]
    }
}