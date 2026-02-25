// Stack using Linked List
public class StackLL {

    private Node top;

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);

        newNode.setNext(top);
        top = newNode;

        System.out.println(data + " pushed into stack");
    }

    // Pop operation
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(top.getData() + " popped from stack");
        top = top.getNext();
    }

    // Peek operation
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element is: " + top.getData());
    }

    // Check if empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        System.out.println("Stack elements:");
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}