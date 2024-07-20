class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class StackWithLinkedList {
    private Node top;

    public StackWithLinkedList() {
        this.top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        int poppedValue = top.value;
        top = top.next;
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }

    public static void main(String[] args) {
        StackWithLinkedList stack = new StackWithLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped value: " + stack.pop());
        System.out.println("Top value: " + stack.peek());

        stack.display();
    }
}
