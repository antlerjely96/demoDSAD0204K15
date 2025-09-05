package Buoi1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhap so phan tu: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap mang!");
        for (int i = 0; i < n; i++){
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mang ban dau");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }
        //Chen phan tu vao mang
        System.out.println();
        int[] temp = new int[n + 1];
        System.out.print("Nhap vi tri muon chen: ");
        int idx = scanner.nextInt();
        System.out.print("Nhap gia tri muon chen: ");
        int x = scanner.nextInt();
        for(int i = 0; i < idx; i++){
            temp[i] = arr[i];
        }
        temp[idx] = x;
        for (int i = idx + 1; i < n + 1; i++){
            temp[i] = arr[i - 1];
        }
        arr = temp;
        System.out.println("Mang sau khi chen");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //Xoa phan tu trong mang
        int[] temp1 = new int[arr.length - 1];
        System.out.print("Nhap vi tri can xoa: ");
        int k = scanner.nextInt();
        for(int i = 0; i < k; i++){
            temp1[i] = arr[i];
        }
        for(int i = k + 1; i < arr.length; i++){
            temp1[i - 1] = arr[i];
        }
        arr = temp1;
        System.out.println("Mang sau khi xoa phan tu");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}