package com.github.zipcodewilmington;


import java.util.Locale;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapOne implements HashMapX {

    MyLinkedList[] myList = new MyLinkedList[26];

    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return "" + input.toLowerCase().charAt(0);
        }
        return null;
    }

    public DashaMapOne() {
        char input = 'a';

        for(int i = 0; i < 26; i++) {
            myList[i].add(Character.toString(input), null);
            input++;
        }

    }


    @Override
    public void set(String key, String value) {

    }

    @Override
    public String delete(String key) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}
