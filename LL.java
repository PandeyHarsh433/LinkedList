package com.company;
import java.util.*;

public class LL {
    Node head;
    private int size;
    LL() {
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

    //    Adding at first or head position

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    //    Adding at last

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

    //    Printing the list

    public void printList() {
        if (head == null) {
            System.out.println("list id empty");
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }
    // Delete First

    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    // Delete Last node

    public void deleteLast() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
        size--;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("Hello");
        list.addLast("Kya ho ");
        list.addLast("rha hai");
        list.addFirst("Bete");
        list.printList();
        System.out.println(list.size);
    }
}