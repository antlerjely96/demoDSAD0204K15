package Buoi5;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList(){
        head = null;
        tail = null;
    }

    //Thêm 1 node vào đầu lits
    public void addFirst(Student student){
        Node newNode = new Node(student);
        if(head == null){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    //Thêm 1 node vào cuối list
    public void addLast(Student student){
        Node newNode = new Node(student);
        if(head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    //Thêm 1 node vào vị trí bất kỳ
    public void addAfterId(String id, Student student){
        if(head == null){
            System.out.println("Empty List");
        } else {
            Node currentNode = head;
            while(currentNode != null){
                if(currentNode.data.Id.equals(id)){
                    Node newNode = new Node(student);
                    if(currentNode == tail){
                        currentNode.next = newNode;
                        newNode.prev = currentNode;
                        tail = newNode;
                    } else {
                        Node nextNode = currentNode.next;
                        currentNode.next = newNode;
                        newNode.prev = currentNode;
                        newNode.next = nextNode;
                        nextNode.prev = newNode;
                    }
                }
                currentNode = currentNode.next;
            }
        }
    }
    //Xóa node đầu list
    public void removeFirst(){
        if(head == null){
            System.out.println("Empty List");
        } else if(head == tail){
            tail = head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    //Xóa node cuối list
    public void removeLast(){
        if(tail == null){
            System.out.println("Empty List");
        } else if(tail == head){
            tail = head = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
    //Xóa 1 node bất kỳ
    public void removeById(String id){
        if(head == null){
            System.out.println("Empty List");
        } else {
            Node currentNode = head;
            while (currentNode != null){
                if(currentNode.data.Id.equals(id)){
                    if(currentNode == head){
                        removeFirst();
                    } else if (currentNode == tail) {
                        removeLast();
                    } else {
                        Node prevNode = currentNode.prev;
                        Node nextNode = currentNode.next;
                        prevNode.next = nextNode;
                        nextNode.prev = prevNode;
                    }
                }
            }
        }
    }
    //Tìm kiếm 1 phần tử trong list
    public void searchById(String id){
        if(head == null){
            System.out.println("Empty List");
        } else {
            Node currentNode = head;
            while (currentNode != null){
                if(currentNode.data.Id.equals(id)){
                    System.out.println(currentNode.data.Id + " - " + currentNode.data.fullName);
                }
                currentNode = currentNode.next;
            }
        }
    }
    //In từ đầu list
    public void printForward(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.println(currentNode.data.Id + " - " + currentNode.data.fullName);
            currentNode = currentNode.next;
        }
    }
    //In từ cuối list
    public void printBackward(){
        Node currentNode = tail;
        while (currentNode != null){
            System.out.println(currentNode.data.Id + " - " + currentNode.data.fullName);
            currentNode = currentNode.prev;
        }
    }
    //Đếm số node
    public void countNode(){
        int count = 0;
        if(head == null){
            System.out.println("Empty List");
        } else {
            Node currentNode = head;
            while (currentNode != null){
                count++;
                currentNode = currentNode.next;
            }
        }
    }
}
