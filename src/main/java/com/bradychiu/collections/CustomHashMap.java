package com.bradychiu.collections;

import com.sun.istack.internal.Nullable;

import java.util.*;

public class CustomHashMap {

    private int hashKey = 4;
    private LinkedList[] values;

    public CustomHashMap(@Nullable int hashKey) {
        if(hashKey != 4) this.hashKey = hashKey;
        values = new LinkedList[4];
        Map m = new HashMap();
        m.put(1, 2);
        Set<Entry<String,String>> s =  m.entrySet();
        for (Entry<?,?> e : s) {
            ((String)e.key).substring(0,1);
            // e.value;
        }
    }

    public class Entry<K, V> {
        K key;
        V value;
        Entry next;

        public Entry(K key, V value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }


    public void put(int newKey, String newValue) {
        int hashValue = hash(newKey);
    }

    public String get(int retrieveKey) {
        return "asdf";
    }

    public boolean remove(int deleteKey) {
        return true;
    }

    public void display() {

    }

    private int hash(int currentKey){
        return currentKey % hashKey;
    }
}
