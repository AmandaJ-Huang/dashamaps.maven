package com.github.zipcodewilmington;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapThree implements HashMapX {

    public MyLinkedList[] myList;

    private String HashFunctionThree(String input) {
        if (input.length() > 0) {
            return "" + input.toLowerCase().charAt(0) + input.toLowerCase().charAt(1);
        }
        return null;
    }

    public DashaMapThree() {
        char input = 'a';
        this.myList = new MyLinkedList[26];

        for(int i = 0; i < 26; i++) {
            myList[i] = new MyLinkedList();
            myList[i].add(Character.toString(input), null);
            input++;
        }
    }

    @Override
    public void set(String key, String value) {
        String hash = HashFunctionThree(key);
        int index = hash.charAt(0)-97;

        this.myList[index].add(key, Integer.parseInt(value));
    }

    @Override
    public String delete(String key) {
        String hash = HashFunctionThree(key);
        int index = hash.charAt(0)-97;

        if (this.myList[index].contains(key))  {
            return this.myList[index].remove(key);
        }
        return null;
    }

    @Override
    public String get(String key) {
        String hash = HashFunctionThree(key);
        int index = hash.charAt(0)-97;

        return this.myList[index].getV(key);
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public long size() {
        long counter = 0;

        for (int i = 0; i < 26; i++) {
            counter += this.myList[i].size();
        }

        return counter - 26;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}
