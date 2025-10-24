package Buoi9.BuiltInQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StudentQueue {
    public static void main(String[] args) {
        //Tạo Queue Student sử dụng LinkedList
        Queue<Student> studentQueue = new LinkedList<>();
        //Enqueue
        studentQueue.offer(new Student("1", "A", 6.5));
        studentQueue.offer(new Student("2", "B", 6.5));
        //Dequeue
        studentQueue.poll();
        //Peek
        studentQueue.peek();
        //isEmpty
        studentQueue.isEmpty();
        //Size
        studentQueue.size();
        //Display
        for (Student student: studentQueue){
            System.out.println(student);
        }

    }
}
