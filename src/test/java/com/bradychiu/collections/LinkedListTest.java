package com.bradychiu.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void testCat(){
        LinkedList<String> list = new LinkedList<>();
        list.add("cat");
        list.add("dog");

        assertEquals(list.get(0), "cat");
    }

    @Test
    public void testDog(){
        LinkedList<String> list = new LinkedList<>();
        list.add("cat");
        list.add("dog");

        assertEquals(list.get(1), "dog");
    }

}