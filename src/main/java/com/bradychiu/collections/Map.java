package com.bradychiu.collections;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Map<K,V> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Entry<K,V>[] elements = new Entry[DEFAULT_CAPACITY];

    public V get(K k) {
        for(int i = 0; i < size; i++) {
            if(elements[i].getKey().equals(k)) return elements[i].getValue();
        }

        throw new NullPointerException("Key not found: " + k);
    }

    public void put(K k, V v) {
        for(int i = 0; i < size; i++) {
            if(elements[i].getKey().equals(k)) {
                elements[i].setValue(v);
                return;
            }
        }

        ensureCapacity();
        elements[size++] = new Entry<>(k,v);
    }

    public void remove(K k) {
        for(int i = 0; i < size; i++) {
            if(elements[i].getKey().equals(k)) {
                for(int j = i; j < size - 1; j++) {
                    elements[j] = elements[j+1];
                }
                size--;
                return;
            }
        }
    }

    public boolean containsKey(K k) {
        for(int i = 0; i < size; i++) {
            if(elements[i].getKey().equals(k)) return true;
        }

        return false;
    }

    public boolean containsValue(V v) {
        for(int i = 0; i < size; i++) {
            if(elements[i].getValue().equals(v)) return true;
        }

        return false;
    }

    public int size() {
        return size;
    }

    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();

        for(int i = 0; i < size; i++) {
            keys.add(elements[i].getKey());
        }

        return keys;
    }

    public void clear() {
        elements = new Entry[DEFAULT_CAPACITY];
        size = 0;
    }

    private void ensureCapacity() {
        if(size == elements.length) elements = Arrays.copyOf(elements, size * 2);
    }
}
