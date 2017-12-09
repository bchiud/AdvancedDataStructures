package com.bradychiu.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExternalResource;

public class ListTest {

    private static List<String> i;

    @Before
    public void setup() {
        i = new List<>();
        i.add("a");
        i.add("b");
        i.add("c");
        i.add("d");
    }

    @Test
    public void testSize() {
        assertEquals(4, i.size());
    }

    @Test
    public void testRemove() {
        assertEquals(4, i.size());
        i.remove(i.size() - 1);
        assertEquals(3, i.size());
    }
    @Test
    public void testToString() {
        assertEquals("[a,b,c,d]", i.toString());
    }

    @Test
    public void testGet() {
        assertEquals("c", i.get(2));
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void testNullPointer() {
        fail(i.get(5));
    }
}
