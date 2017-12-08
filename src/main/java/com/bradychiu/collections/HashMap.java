package com.bradychiu.collections;

public class HashMap<K, V> {
    //
    // private int capacity;
    // private LinkedList<Entry<K, V>>[] values; // an arraylist must be used b/c an array can't have generics
    //
    // public static void main(String[] args) {
    //     HashMap chm = new HashMap<Integer, String>();
    //     chm.put(4, "test1");
    // }
    //
    // class Entry<K, V> {
    //     K key;
    //     V value;
    //
    //     public Entry(K key, V value) {
    //         this.key = key;
    //         this.value = value;
    //     }
    // }
    //
    // public HashMap() {
    //     this(4);
    // }
    //
    // public HashMap(int capacity) {
    //     this.capacity = capacity;
    //     values = new LinkedList[capacity];
    // }
    //
    // public void put(K key, V value) {
    //     Entry<K, V> newEntry = new Entry(key, value);
    //     int hashKey = hash(key);
    //     if(values[hashKey] == null) { // no linkedlist in bucket yet
    //         LinkedList<Entry<K, V>> ll = new LinkedList<>();
    //         ll.add(newEntry);
    //     } else {
    //         LinkedList<Entry<K, V>> ll = values[hashKey];
    //         Entry<K, V> previous = null;
    //         Entry<K, V> current = ll.get(0);
    //         while(current != null) {
    //             ll = values[hashKey];
    //
    //             if(current.key.equals(key)) {
    //                 newEntry.next = current.next;
    //                 if(previous == null) { // first node
    //                     values[hashKey] = newEntry;
    //                 } else {
    //                     previous.next = newEntry;
    //                 }
    //                 return;
    //             }
    //             previous = current;
    //             current = current.next;
    //         }
    //         // key DNE yet
    //         previous.next = newEntry;
    //     }
    // }
    //
    // public V get(K key) {
    //     Entry<K, V> previous = null;
    //     Entry<K, V> current = values[hash(key)];
    //
    //     if(current == null) return null;
    //
    //     while(current != null) {
    //         if(current.key.equals(key)) {
    //             return current.value;
    //         } else {
    //             previous = current;
    //             current = current.next;
    //         }
    //     }
    //
    //     return current.value;
    // }
    //
    // public boolean remove(K key) {
    //     Entry<K, V> previous = null;
    //     Entry<K, V> current = values[hash(key)];
    //
    //     if(current == null) return false;
    //
    //     while(current != null) {
    //         if(current.key.equals(key)) {
    //             if(previous == null) {
    //                 values[hash(key)] = current.next;
    //                 return true;
    //             } else {
    //                 previous.next = current.next;
    //                 return true;
    //             }
    //         } else {
    //             previous = current;
    //             current = current.next;
    //         }
    //     }
    //     return false;
    // }
    //
    // public boolean remove(K key, V value) {
    //     Entry<K, V> previous = null;
    //     Entry<K, V> current = values[hash(key)];
    //
    //     if(current == null) return false;
    //
    //     while(current != null) {
    //         if(current.key.equals(key) && current.value.equals(value)) {
    //             if(previous == null) {
    //                 values[hash(key)] = current.next;
    //                 return true;
    //             } else {
    //                 previous.next = current.next;
    //                 return true;
    //             }
    //         } else {
    //             previous = current;
    //             current = current.next;
    //         }
    //     }
    //     return false;
    // }
    //
    // public int size() {
    //     int count = 0;
    //     for(Entry<K, V> current : values) {
    //         Entry<K, V> previous = null;
    //         while(current != null) {
    //             count++;
    //             previous = current;
    //             current = current.next;
    //         }
    //     }
    //     return count;
    // }
    //
    // public boolean containsKey(K key) {
    //     for(Entry<K, V> current : values) {
    //         Entry<K, V> previous = null;
    //         while(current != null) {
    //             if(current.key.equals(key)) {
    //                 return true;
    //             } else {
    //                 previous = current;
    //                 current = current.next;
    //             }
    //         }
    //     }
    //     return false;
    // }
    //
    // private boolean containsValue(V value) {
    //     for(Entry<K, V> current : values) {
    //         Entry<K, V> previous = null;
    //         while(current != null) {
    //             if(current.value.equals(value)) {
    //                 return true;
    //             } else {
    //                 previous = current;
    //                 current = current.next;
    //             }
    //         }
    //     }
    //     return false;
    // }
    //
    // private int hash(K key){
    //     return Math.abs(key.hashCode()) % capacity;
    // }
}
