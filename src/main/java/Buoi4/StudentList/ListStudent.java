package Buoi4.StudentList;

import java.util.Objects;

public class ListStudent {
    Node head;

    public ListStudent() {
        this.head = null;
    }

    //Tạo node mới cho list
    public void addNode(Student student){
        //Tạo node mới có data là student
        Node newNode = new Node(student);
        if(head == null){
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    //In danh sách
    public void displayList(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.println(currentNode.data.Id + " - " + currentNode.data.fullName);
            currentNode = currentNode.next;
        }
    }

    //In student theo id (tìm kiếm student theo id và in ra)
    public void displayById(String id){
        //Duyệt từ đầu list
        Node currentNode = head;
        while (currentNode != null){
            if(currentNode.data.Id.equals(id)){
                System.out.println(currentNode.data.Id + " - " + currentNode.data.fullName);
            }
            currentNode = currentNode.next;
        }
    }

    
}
