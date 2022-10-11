import java.util.*;

public class ReverseLL {
    Node head;
    int data;

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

    public void ReverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;

    }

    public void printList() {
        if (head == null) {
            System.out.println("list id empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            list.addLast(a);
        }

        list.printList();
        sc.close();
    }
}
