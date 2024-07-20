class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class QueueWithLinkedList {
    private Node front, rear;

    public QueueWithLinkedList() {
        this.front = this.rear = null;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (this.rear == null) {
            this.front = this.rear = newNode;
            System.out.println(value + " enqueued to queue");
            return;
        }

        this.rear.next = newNode;
        this.rear = newNode;
        System.out.println(value + " enqueued to queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // or throw an exception
        }

        int value = this.front.value;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }

        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // or throw an exception
        }
        return this.front.value;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        System.out.print("Queue elements: ");
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }

    public static void main(String[] args) {
        QueueWithLinkedList queue = new QueueWithLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        System.out.println("Dequeued value: " + queue.dequeue());
        System.out.println("Front value: " + queue.peek());

        queue.display();
    }
}
