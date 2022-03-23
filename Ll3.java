package com.company;

public class Ll3 {
    Node head;
    private int size;
    Ll3() {
        size = 0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        size++;
    }

    // Search with number and show index

    public int showIndex(String data) {
        Node currNode = head;
        int i = 0;

        while(size > 0) {
            if(currNode.data.equals("3")) {
                break;
            }
            currNode = currNode.next;
            i++;
            size--;
        }
        return i;
    }
    public static void main(String[] args) {
        Ll3 list = new Ll3();
        list.addLast("1");
        list.addLast("5");
        list.addLast("7");
        list.addLast("3");
        list.addLast("8");
        list.addLast("2");
        list.addLast("3");
        System.out.println(list.showIndex("3"));
    }
}
