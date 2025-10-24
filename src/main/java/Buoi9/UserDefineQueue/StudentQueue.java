package Buoi9.UserDefineQueue;

public class StudentQueue {
    //Đầu hàng đợi
    private Node front;
    //Cuối hàng đợi
    private Node rear;
    //Kích thước hiện tại của hàng đợi
    private int size;
    //Kích thước tối đa của hàng đợi
    private int maxSize = 40;

    public StudentQueue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    //Thêm phần tử vào hàng đợi: enqueue
    public void enQueue(Student student){
        //Tạo node để thêm vào hàng đợi
        Node newNode = new Node(student);
        //Kiểm tra hàng đợi có trống hay không
        if(isFull()){
            System.out.println("Hàng đợi đã đầy");
        } else if(isEmpty()){
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    //Lấy và xóa phần tử khỏi hàng đợi: dequeue
    public Student deQueue(){
        if(isEmpty()){
            System.out.println("Không có phần tử trong hàng đợi");
            return null;
        } else {
            //Lấy data của node được xóa
            Student remove = front.data;
            //Xóa phần tử đầu tiên khỏi queue
            front = front.next;
            size--;
            //Kiểm tra xem nếu front null thì rear cũng phải null
            if(front == null){
                rear = null;
            }
            return remove;
        }
    }

    //Xem phần tử đầu hàng đợi, không xóa
    public Student peek(){
        //Kiểm tra queue rỗng hay không
        if(isEmpty()){
            System.out.println("Không có phần tử");
            return null;
        } else {
            System.out.println(front.data);
            return front.data;
        }
    }

    //Hiển thị queue
    public void displayQueue(){
        if(isEmpty()){
            System.out.println("Không có phần tử");
        } else {
            Node temp = front;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    //Đếm số phần tử trong hàng đợi
    public int count(){
        System.out.println(size);
        return size;
    }

    //Kiểm tra hàng đợi có trống hay không
    public boolean isEmpty(){
        if(front == null){
            return true;
        } else {
            return false;
        }
    }

    //Kiểm tra hàng đợi có bị đầy hay không
    public boolean isFull(){
        if(size == maxSize){
            return true;
        } else {
            return false;
        }
    }
}
