/**
 * fshows.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.data.structure.array;

/**
 * @author zhaoj
 * @version MainTest.java, v 0.1 2020-01-14 17:08
 */
public class MainTest {
    public static void main(String[] args) {
        Array  arrays = new Array();
        arrays.addFirst(4);
        arrays.addLast(1);
        arrays.add(0,5);
        arrays.set(2,3);
        System.out.println(arrays.getSize());
        System.out.println(arrays.getCapacity());
        System.out.println(arrays.toString());
    }
}
