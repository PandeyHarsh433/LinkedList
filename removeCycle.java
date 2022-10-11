public class removeCycle {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean hasCycle() {
        if (head == null) {
            return false;
        }
        Node hare = head;
        Node turtle = head;

        while (hare.next != null && hare != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                return true;
            }
        }
        return false;
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

    public Node cycleNode() {
        if (head == null) {
            System.out.println("It is empty");
        }
        Node hare = head;
        Node turtle = head;

        while (hare.next != null && hare != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                turtle = head;
                while (hare.next != turtle.next) {
                    hare = hare.next;
                    turtle = turtle.next;
                }
                Node cyclePoint = hare.next;
            }
            return cyclePoint;
        }
    }

    public void remCycle() {
        if (head == null) {
            System.out.println("It is empty");
        }
        Node hare = head;
        Node turtle = head;

        while (hare.next != null && hare != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                turtle = head;
                while(hare.next != turtle.next) {
                    hare = hare.next;
                    turtle = turtle.next;
                }
                hare.next = null;
            }
    }
}

    public static void main(String[] args) {
        removeCycle list = new removeCycle();
        
        
    }
}
