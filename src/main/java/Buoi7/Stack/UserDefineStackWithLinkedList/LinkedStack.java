package Buoi7.Stack.UserDefineStackWithLinkedList;

import static sun.util.locale.LocaleUtils.isEmpty;

public class LinkedStack {
    private Node top;

    public LinkedStack(){
        this.top = null;
    }

    //Thao tác push (thêm phần tử vào stack)
    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    //Thao tác pop (lấy ra phần tử ở trên cùng của stack và trả về giá trị của top)
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack rỗng, không thể pop");
            return -1;
        } else {
            int value = top.data;
            top = top.next;
            System.out.println(value);
            return value;
        }
    }

    //Thao tác peek (Xem top nhưng không xóa)
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack rổng, không có gì để xem");
            return -1;
        } else {
            System.out.println(top.data);
            return top.data;
        }
    }

    //Kiểm tra stack có bị rỗng hay không
    public boolean isEmpty() {
        return top == null;
    }
}
