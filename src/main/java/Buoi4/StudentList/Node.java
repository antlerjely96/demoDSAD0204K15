package Buoi4.StudentList;

//Định nghĩa 1 node ở trong danh sách
public class Node {
    Student data;
    Node next;

    public Node(Student data){
        this.data = data;
        this.next = null;
    }
}
