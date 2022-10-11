public class palindromeLL {
    Node head;
    

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
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

    public Node findmid(Node head) {
        Node hare = head;
        Node turtle = head;

        while(hare.next!=null && hare.next.next!=null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
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


    public boolean isPalindrome() {
        if(head==null|| head.next==null) {
            return true;
        }

        Node mid = findmid(head);
        Node secHalf = reverseRecursive(mid.next);

        Node firstHalf = head;
        while(secHalf.next!=null) {
            if(firstHalf.data == secHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secHalf = secHalf.next;
        }
        return true;
        
    }
    public static void main(String[] args) {

        palindromeLL list = new palindromeLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(4);
        list.addLast(6);
        list.addLast(7);

        System.out.println( list.isPalindrome()); 
    }
    
}
