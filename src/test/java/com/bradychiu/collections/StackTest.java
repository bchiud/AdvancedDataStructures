package com.bradychiu.collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StackTest {
    private static Stack<String> s;

    @Before
    public void setup() {
        s = new Stack<>();
        s.push("a");
        s.push("b");
        s.push("c");
    }

    @Test
    public void testSize() {
        assertEquals(3, s.size());
    }

    @Test
    public void testPop() {
        assertEquals("c", s.pop());
        assertEquals(2, s.size());
    }

    @Test(expected = NullPointerException.class)
    public void testEmptyStack() {
        int size = s.size();
        for(int i = 0; i < size; i++) s.pop();
        fail(s.pop());
    }
}
