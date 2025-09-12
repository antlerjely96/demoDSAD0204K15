package Buoi4.StudentList;

public class Main {
    public static void main(String[] args) {
        //Khởi tạo 1 danh sách sinh viên là 1 Single Linked List có data của 1 node là 1 dối tượng Student
        ListStudent listStudent = new ListStudent();
        //Thêm node
        listStudent.addNode(new Student("st1", "Student A"));
        listStudent.addNode(new Student("st2", "Student B"));
        listStudent.addNode(new Student("st3", "Student C"));
        //In ra list
        listStudent.displayList();
    }
}
