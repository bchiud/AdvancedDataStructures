package com.bradychiu.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MapTest {

    private static Map<Integer,String> mockMap;

    @Before
    public void init() {
        mockMap = new Map<>();
        mockMap.put((Integer) 5, "5");
        mockMap.put((Integer) 2, "2");
        mockMap.put((Integer) 4, "4");
        mockMap.put((Integer) 1, "1");
        mockMap.put((Integer) 7, "7");
    }

    @Test
    public void testGet() {
        assertEquals("2", mockMap.get(2));
    }

    @Test
    public void testPutNewKey() {
        mockMap.put(8, "8");
        assertEquals("8", mockMap.get(8));
    }

    @Test
    public void testPutExistingKey() {
        mockMap.put(5, "3");
        assertEquals("3", mockMap.get(5));
    }

    @Test
    public void testPutGetNullValue() {
        mockMap.put((Integer) 0, null);
        assertEquals(null, mockMap.get(0));
    }

    @Test(expected=NullPointerException.class)
    public void testRemove() {
        mockMap.remove(2);
        fail(mockMap.get(2));
    }

    @Test
    public void testRemoveResize() {
        int originalSize = mockMap.size();
        mockMap.remove(5);
        assertEquals(originalSize - 1, mockMap.size());
    }

    @Test
    public void containsKey() {
        assertEquals(true, mockMap.containsKey(2));
    }

    @Test
    public void containsValue() {
        assertEquals(true, mockMap.containsValue("2"));
    }

    @Test
    public void keySet() {
        Set<Integer> correctSet = new HashSet<Integer>(Arrays.asList(5,2,4,1,7));
        assertEquals(correctSet, mockMap.keySet());
    }

    @Test
    public void clearSize() {
        mockMap.clear();
        assertEquals(0, mockMap.size());
    }

    @Test
    public void clearKeys() {
        mockMap.clear();
        Set<Integer> emptySet = new HashSet<>();
        assertEquals(emptySet, mockMap.keySet());
    }
}
