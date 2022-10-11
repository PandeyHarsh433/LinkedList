import java.util.*;
public class deleteDuplicate {
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
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public void delDuplicate() {
        Node curr = head;
        if(head==null) {
            return;
        }
        while (curr.next != null) {
            if (curr.data == curr.next.data) {
                 curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        deleteDuplicate list = new deleteDuplicate();
        for(int i=0; i<5; i++){
            int a = obj.nextInt();
            list.addLast(a);
        }
        
        System.out.println();
        list.delDuplicate();
        list.printList();
        obj.close();

    }

}
