package pfarzaneh.training.algorithms;

class CircularLinkedList {

    Node head, head1, head2;

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.head = new Node(12);
        list.head.next = new Node(56);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(33);
        list.head.next.next.next.next.next = new Node(45);
        list.head.next.next.next.next.next.next = list.head;

        System.out.println("Original Circular Linked list ");
        list.printList(list.head);

        list.splitList();

        System.out.println("First Circular List ");
        list.printList(list.head1);

        System.out.println("Second Circular List ");
        list.printList(list.head2);

    }

    /**
     * Function to split a list (starting with head) into two lists.
     * head1 and head2 are references to head nodes of the two resultant linked lists.
     */
    public void splitList() {

        if (head == null) {
            return;
        }

        Node tortoise = head;
        Node hare = head;


        while (hare.next != head && hare.next.next != head) {
            hare = hare.next.next;
            tortoise = tortoise.next;
        }

        /* If there are even elements in list then move hare */
        if (hare.next.next == head) {
            hare = hare.next;
        }

        /* Set the head pointer of first half */
        head1 = head;

        /* Set the head pointer of second half */
        if (head.next != head) {
            head2 = tortoise.next;
        }
        /* Make second half circular */
        hare.next = head2;

        /* Make first half circular */
        tortoise.next = head1;
    }

    void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
            System.out.println();
        }
    }

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

}
