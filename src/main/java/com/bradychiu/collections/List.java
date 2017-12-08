package com.bradychiu.collections;

import java.util.Arrays;
import java.util.StringJoiner;

public class List<T> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public List() {
        // TODO: why can't this be new T[DEFAULT_CAPACITY];
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(T t) {
        if(size == elements.length) {
            elements = Arrays.copyOf(elements, size + 1);
        }
        elements[size++] = t;
    }

    public T get(int index) {
        withinBounds(index);

        return (T) elements[index];
    }

    public T remove(int index) {
        withinBounds(index);

        T t = (T) elements[index];

        for(int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i+1];
        }

        // the above for loop is the same as:
        // System.arraycopy(elements, index + 1, elements, index, elements.length - 1 ) ;

        size--;

        return t;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringJoiner sj = new StringJoiner(",");

        for(int i = 0; i < size; i++) {
            sj.add(elements[i].toString());
        }

        StringBuilder sb = new StringBuilder()
                .append("[")
                .append(sj.toString())
                .append("]");

        return sb.toString();
    }

    private void withinBounds(int i) {
        if(i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
    }

}
