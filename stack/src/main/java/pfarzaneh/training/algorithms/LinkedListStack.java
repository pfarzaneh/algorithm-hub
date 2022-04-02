package pfarzaneh.training.algorithms;

// Java Code for Linked List Implementation

public class LinkedListStack {

    private StackNode top;

    // Driver code
    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println(stack.pop() + " popped from stack");

        System.out.println("Top element is " + stack.peek());

        StackNode node = stack.top;
        while (node.next != null) {
            node = node.next;
            System.out.println(node.data);
        }
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else
            return false;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        int popped = Integer.MIN_VALUE;
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            popped = top.data;
            top = top.next;
        }
        return popped;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else {
            return top.data;
        }
    }

    static class StackNode {
        private int data;
        private StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }
}
