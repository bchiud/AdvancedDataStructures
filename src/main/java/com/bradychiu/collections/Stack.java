package com.bradychiu.collections;

import java.util.Arrays;

public class Stack<T> {

    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    private T[] elements = (T[]) new Object[DEFAULT_CAPACITY];

    public void push(T t) {
        ensureCapacity();
        elements[size++] = t;
    }

    public T pop() {
        checkEmpty();

        T t = elements[--size];
        elements[size] = null;
        return t;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if(size == elements.length) elements = Arrays.copyOf(elements, size * 2);
    }

    private void checkEmpty() {
        if(size == 0) throw new NullPointerException("No objects in stack");
    }

}
