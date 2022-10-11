import java.util.*;

public class LinkedList1 {
    Node head;
    private int size;

    LinkedList1() {
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

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        size++;
    }

    public void printList() {
        Node currNode = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (currNode.next != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is already empty");
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
        size--;
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.addFirst("Hello");
        list.addFirst("hi");
        list.addLast("Kaise");
        list.addLast("ho");
        list.printList();
    }
}
