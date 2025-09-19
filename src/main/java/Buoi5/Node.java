package Buoi5;

public class Node {
    Student data;
    Node prev;
    Node next;

    public Node(Student data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
