package com.github.zipcodewilmington;

import org.junit.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapOneTest {

    @Test
    public void testSetKeyAndValue() {
        // Given
        DashaMapOne map = new DashaMapOne();

        // When
        map.set("apple", "1");
        map.set("banana", "25");
        map.set("bucket", "47");
        map.set("basketball", "32");

        System.out.println(map.myList[0].toString());
    }

    @Test
    public void testGet() {
        // Given
        DashaMapOne map = new DashaMapOne();

        // When
        map.set("apple", "1");
        map.set("banana", "25");

        System.out.println(map.get("banana"));
    }

    @Test
    public void testRemove() {
        // Given
        DashaMapOne map = new DashaMapOne();

        // When
        map.set("apple", "1");
        map.set("banana", "25");
        String actual = map.delete("apple");

        System.out.println(map.get("apple"));
    }

    @Test
    public void testSize() {
        // Given
        DashaMapOne map = new DashaMapOne();

        // When
        map.set("apple", "1");
        map.set("banana", "25");
        map.set("bucket", "47");
        map.set("basketball", "32");
        long mapSize = map.size();

        System.out.println(mapSize);
    }
}
