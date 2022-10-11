public class checkCycle {
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

    public static void main(String[] args) {
        checkCycle list = new checkCycle();

    }

}
