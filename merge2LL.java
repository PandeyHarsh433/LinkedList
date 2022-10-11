// List is already sorted 

public class merge2LL {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public void mergeSort( Node head1, Node head2) {
        Node currNode1 = head1;
        Node currNode2 = head2;
        
        while(currNode1.next!=null && currNode2.next!=null) {
            if(head1.data>head2.data) {
                Node newNode = new Node(head1.data);
                head1 = head1.next;
            }
        }

    }
    
}
