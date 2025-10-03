package Buoi7.Stack.BuiltInStack;

import java.util.Stack;

public class IntegerStack {
    public static void main(String[] args) {
        //Tạo Stack
        Stack<Integer> stack = new Stack<>();

        //Thêm phần tử vào stack
        stack.push(100);
        stack.push(200);
        stack.push(500);
        stack.push(300);
        stack.push(400);

        //Hiển thị stack
        System.out.println(stack);

        //Thao tác peek
        System.out.println(stack.peek());

        //Thao tác pop
        int removeValue = stack.pop();
        System.out.println(removeValue);
        System.out.println(stack);

        //Thao tác isEmpty
        System.out.println(stack.isEmpty());

        //Tìm kiếm vị trí của phần tử trong stack
        int position = stack.search(500);
        System.out.println(position);

        //Tính kích thước của stack
        System.out.println(stack.size());
    }
}
