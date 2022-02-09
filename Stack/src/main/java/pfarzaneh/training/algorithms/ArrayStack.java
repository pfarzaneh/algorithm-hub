package pfarzaneh.training.algorithms;

public class ArrayStack {

    private static final int MAX_SIZE = 1000;
    private int top;
    private int stack[] = new int[MAX_SIZE]; // Maximum size of Stack

    ArrayStack() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int x) {
        if (top >= (MAX_SIZE - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            stack[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return stack[top--];
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return stack[top];
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + stack[i]);
        }
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        ArrayStack s = new ArrayStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
    }
}
