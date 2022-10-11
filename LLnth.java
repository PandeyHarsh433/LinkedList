import java.util.*;

public class LLnth {
    Node head;
    

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

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

    public Node findNthfromBack(int n) {
        int size=0;
        Node currNode = head;
        while(currNode.next!=null) {
            currNode = currNode.next;
            size++;
        }
        if(n==size) {
            return head.next;
        }
        int index = size-n;
        int i = 1;
        Node prevNode = head;
        while(i<index) {
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
        return head;

    }
    public static void main(String[] args) {
        LLnth list = new LLnth();
        list.addLast(1);
        list.addLast(2);
        list.addLast(4);
        list.addLast(6);
        list.addLast(7);

        System.out.println(list.findNthfromBack(3)); 

    }
}
