/**
 * fshows.com
 * Copyright (C) 2013-2019 All Rights Reserved.
 */
package com.data.structure.array;

/**
 * 数组
 *
 * @author zhaoj
 * @version Array.java, v 0.1 2019-02-28 20:10
 */
public class Array {

    private int[] data;
    private int size;

    // 传参构造
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // 默认构造，初始容量=10
    public Array() {
        this(10);
    }

    // 获取数组的容量
    public int getCapacity() {
        return data.length;
    }

    // 获取数组中的元素个数
    public int getSize() {
        return size;
    }

    //返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 在所有元素前添加一个新元素
    public void addFirst(int e) {
        add(0, e);
    }

    // 向所有元素后添加一个新元素
    public void addLast(int e) {
        //if(size == data.length)
        // throw new IllegalArgumentException("Add failed. Array is full.");
        //data[size] = e;
        //size++;
        add(size, e);
    }

    // 在index索引的位置插入一个新元素e
    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("Add failed. Array is full.");
        }
        //确保数组连续存储 index > size
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        //data[size++] = e;
        data[index] = e;
        size++;
    }

    // 获取index索引位置的元素
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }

    // 修改index索引位置的元素为e
    public void set(int index, int e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        }
        data[index] = e;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        sb.append("[");
        for (int i = 0; i<size;i++){
             sb.append(data[i]);
             if (i != size-1){
                 sb.append(",");
             }
        }
        sb.append(']');
        return sb.toString();
    }
}
