package com.bradychiu.collections;

public class Entry<K,V> {

    private K k;
    private V v;

    public Entry(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getKey() {
        return k;
    }

    public V getValue() {
        return v;
    }

    public V setValue(V v) {
        V oldV = this.v;
        this.v = v;
        return oldV;
    }
}
