package com.bradychiu.collections;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class EntryTest {

    private static Entry<Integer, String> e;

    @BeforeClass
    public static void setup() {
        e = new Entry(1,"asdf");
    }

    @Test
    public void testKey() {
        assertEquals((Integer) 1, e.getKey());
    }

    @Test
    public void testValue() {
        assertEquals("asdf", e.getValue());
    }

    @Test
    public void testSetValue() {
        e.setValue("qwer");
        assertEquals("qwer", e.getValue());
    }
}
