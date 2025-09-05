package Buoi4;

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
}
