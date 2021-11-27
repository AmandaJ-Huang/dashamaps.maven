package com.github.zipcodewilmington;

/**
 * Created by leon on 1/10/18.
 */
public class MyLinkedList {

    private class Node {
        String k;
        Integer v;
        Node next;

        Node(String k, Integer v) {
            this.k = k;
            this.v = v;
            this.next = null;
        }

        void setNextNode(Node next) {
            this.next = next;
        }

        Node getNextNode() {
            return this.next;
        }

        String getK() {
            return this.k;
        }

        Integer getV() {
            return this.v;
        }

        void setData(String k) {
            this.k = k;
        }
    }

    private Node head;
    private Node tail;
    private Integer size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(String k, Integer v) {
        Node node = new Node(k, v);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }
        this.tail = node;
        this.size++;
    }

    public void remove(int index) {
        Node prevNode = this.head;
        Node currNode = this.head.getNextNode();

        if (index < 0 || index > this.size-1) {
            return;
        }
        if (index == 0) {
            this.head = this.head.getNextNode();
        }

        for (int i = 0; i < index-1; i++) {
            currNode = currNode.getNextNode();
            prevNode = prevNode.getNextNode();
        }
        prevNode.next = currNode.getNextNode();

        this.size--;
    }

    public Boolean contains(String String) {
        Node currNode = this.head;
        while(currNode != null) {
            if (currNode.getK().equals(String)) {
                return true;
            }
            currNode = currNode.getNextNode();
        }
        return false;
    }

    public Integer find(String String) {
        Node currNode = this.head;
        Integer counter = 0;

        while(currNode != null) {
            if (currNode.getK().equals(String)) {
                return counter;
            }
            currNode = currNode.getNextNode();
            counter++;
        }
        return -1;
    }

    public Integer size() {
        return this.size;
    }

    public String get(int index) {
        Node currNode = this.head;
        Integer counter = 0;

        if (index < 0 || index > size) {
            return null;
        }

        while(counter != index) {
            currNode = currNode.getNextNode();
            counter++;
        }
        return currNode.getK();
    }

    public MyLinkedList copy() {
        MyLinkedList newList = new MyLinkedList();
        Node currNode = this.head;

        while (currNode != null) {
            String k = currNode.getK();
            Integer v = currNode.getV();
            newList.add(k, v);
            currNode = currNode.getNextNode();
        }
        return newList;
    }

    public void sort() {
        Node currNode = this.head;
        Node nextNode;
            /*
            Comparable returns:
                -1  - object is < specified object
                0   - object is = specified object
                1   - object is > specified object
             */

        for(int i = 0; i < size; i++){
            while(currNode.getNextNode() != null){
                nextNode = currNode.getNextNode();
                if(currNode.getK().compareTo(nextNode.getK()) > 0){
                    String tmp = currNode.getK();
                    currNode.setData((nextNode.getK()));
                    nextNode.setData(tmp);
                }
                currNode = currNode.getNextNode();
            }
            currNode = this.head;
        }

    }

    public String toString() {
        Node currNode = this.head;
        String s = "";

        while (currNode != null) {
            s += currNode.k;
            currNode = currNode.getNextNode();
        }

        return s;
    }


}