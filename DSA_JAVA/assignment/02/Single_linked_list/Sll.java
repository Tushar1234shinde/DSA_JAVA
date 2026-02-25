// Sinlgylinkedlist

public class Sll {

    private Node head;

    // 1️ Create Node (Insert at beginning)
    public void createNode(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    // 2️ Print List
    public void printList() {
        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    // 3️ Append (Insert at end)
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(newNode);
    }

    // 4️ Add Value (Insert after specific value)
    public void addValue(int target, int data) {
        Node temp = head;

        while (temp != null && temp.getData() != target) {
            temp = temp.getNext();
        }

        if (temp == null) {
            System.out.println("Target value not found");
            return;
        }

        Node newNode = new Node(data);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
    }

    // 5️ Delete by value
    public void deleteByValue(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.getData() == value) {
            head = head.getNext();
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null && temp.getData() != value) {
            prev = temp;
            temp = temp.getNext();
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        prev.setNext(temp.getNext());
    }

    // 6️ Delete by node (position)
    public void deleteByNode(int position) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 1) {
            head = head.getNext();
            return;
        }

        Node temp = head;
        Node prev = null;
        int count = 1;

        while (temp != null && count != position) {
            prev = temp;
            temp = temp.getNext();
            count++;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        prev.setNext(temp.getNext());
    }
}