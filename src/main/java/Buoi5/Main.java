package Buoi5;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addLast(new Student("st1", "Student 1"));
        doublyLinkedList.addLast(new Student("st2", "Student 2"));
        doublyLinkedList.addLast(new Student("st3", "Student 3"));
        doublyLinkedList.addAfterId("st2", new Student("st4", "Student 4"));
        doublyLinkedList.printForward();
    }
}
