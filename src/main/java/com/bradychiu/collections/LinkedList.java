package com.bradychiu.collections;

@SuppressWarnings("WeakerAccess")
public class LinkedList<T> {

    private Node<T> root;

    @SuppressWarnings({"WeakerAccess", "UnusedReturnValue"})
    public T add(T value) {
        if (root != null) {
            root.add(value);
        } else {
            root = new Node<>(value);
        }
        return value;
    }

    @SuppressWarnings("WeakerAccess")
    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index == 0 && root == null) {
            throw new IndexOutOfBoundsException("D:");
        }
        return root.get(index);
    }

    private static class Node<V> {

        V value;
        Node<V> next;

        Node(V value) {
            this.value = value;
        }

        void add(V value) {
            if (next != null) {
                next.add(value);
            } else {
                next = new Node<>(value);
            }
        }

        V get(int index) {
            if (index > 0) {
                if (next == null) {
                    throw new IndexOutOfBoundsException("D:");
                }
                return next.get(index - 1);
            } else {
              return value;
            }
        }
    }
}
