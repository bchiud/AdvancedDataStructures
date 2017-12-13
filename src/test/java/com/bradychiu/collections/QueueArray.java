package com.bradychiu.collections;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class QueueArray<T> {

    private int size = 0, first = 0, last = 0;
    private static final int DEFAULT_CAPACITY = 2;
    private T[] elements;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T peak() {
        // TODO: are there a standard set of exceptions we need to know?
        if(isEmpty()) throw new NoSuchElementException();

        return elements[first];
    }

    public void enqueue(T t) {
        if(size == elements.length) resize(elements.length * 2);
        elements[last++] = t;
        if(last == elements.length) last = 0;
        size++;
    }

    public T dequeue(T t) {
        if(isEmpty()) throw new NoSuchElementException();

        T returnT = elements[first];
        elements[first++] = null;
        size--;

        if(first == elements.length) first = 0;

        if(size > 0 && size == elements.length / 4) resize(elements.length / 2);

        return returnT;
    }

    private void resize(int newSize) {
        assert newSize >= size;

        T[] newElements = (T[]) new Object[newSize];
        for(int i = 0; i < size; i++) {
            newElements[i] = elements[(first + i) % elements.length];
        }
        elements = newElements;
        first = 0; last = size;
    }
}
