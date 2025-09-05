package Buoi2;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }

    public static void bai1(){
        //Khai bao n
        int n;
        //Nhap n
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            n = scanner.nextInt();
        } while (n <= 0);
        //Khai bao mang
        int[] arr = new int[n];
        //Nhap mang: duyet qua tung phan tu va gan gia tri
        for (int i = 0; i < arr.length; i++){
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        //Hien thi mang: duyet qua tung phan tu
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        //Tinh tong cac phan tu: duyet qua tung phan tu
        int tong = 0;
        for (int i = 0; i < arr.length; i++){
            tong += arr[i];
        }
        System.out.println("Tong cac phan tu trong mang: " + tong);
    }

    public static void bai2(){
        //Khai bao n
        int n;
        //Nhap n
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            n = scanner.nextInt();
        } while (n <= 0);
        //Khai bao mang
        int[] arr = new int[n];
        //Nhap mang: duyet qua tung phan tu va gan gia tri
        for (int i = 0; i < arr.length; i++){
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        //Hien thi mang: duyet qua tung phan tu
        System.out.println("Mang sau khi nhap!");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Binh phuong cac phan tu: duyet qua tung phan tu
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) Math.pow(arr[i], 2);
        }
        System.out.println("Mang sau khi binh phuong!");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void bai3(){
        //Khai bao n
        int n;
        //Nhap n
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            n = scanner.nextInt();
        } while (n <= 0);
        //Khai bao mang
        int[] arr = new int[n];
        //Nhap mang: duyet qua tung phan tu va gan gia tri
        for (int i = 0; i < arr.length; i++){
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        //Hien thi mang: duyet qua tung phan tu
        System.out.println("Mang sau khi nhap!");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Nhap x, dem so lan xuat hien cua x: duyet qua tung phan tu, tim kiem x trong mang
        System.out.print("Nhap so can tim: ");
        int x = scanner.nextInt();
        int dem = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                dem++;
            }
        }
        System.out.println("So lan xuat hien cua x: " + dem);
    }

    public static void bai4(){
        //Khai bao n
        int n;
        //Nhap n
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            n = scanner.nextInt();
        } while (n <= 0);
        //Khai bao mang
        int[] arr = new int[n];
        //Nhap mang: duyet qua tung phan tu va gan gia tri
        for (int i = 0; i < arr.length; i++){
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        //Hien thi mang: duyet qua tung phan tu
        System.out.println("Mang sau khi nhap!");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //tinh avg cac phan tu co index chan va gia tri cua phan tu le: duyet qua tung phan tu
        double trungBinhCongPhanTuIndexChanGiaTriLe = 0;
        int tongPhanTuIndexChanGiaTriLe = 0;
        int soPhanTuIndexChanGiaTriLe = 0;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0 && arr[i] % 2 != 0){
                tongPhanTuIndexChanGiaTriLe += arr[i];
                soPhanTuIndexChanGiaTriLe++;
            }
        }
        if(soPhanTuIndexChanGiaTriLe != 0){
            trungBinhCongPhanTuIndexChanGiaTriLe = (double) tongPhanTuIndexChanGiaTriLe / soPhanTuIndexChanGiaTriLe;
        }
        System.out.println("Trung binh cong cua cac phan tu co gia tri le o vi tri chan: " + trungBinhCongPhanTuIndexChanGiaTriLe);
        //Tim max: duyet qua tung phan tu
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Phan tu lon nhat trong mang: " + max);
        //Tim min: duyet qua tung phan tu
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Phan tu nho nhat trong mang: " + min);
        //Thay phan tu am = 0: duyet qua tung phan tu
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        //Xoa phan tu am trong mang: duyet qua tung phan tu
        int soPhanTuAm = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                soPhanTuAm++;
            }
        }
        int[] temp = new int[arr.length - soPhanTuAm];
        int tempIndex = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                temp[tempIndex] = arr[i];
                tempIndex++;
            }
        }
        arr = temp;
        //Sap xep mang tang dan: duyet qua tung phan tu
        int change;
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    change = arr[i];
                    arr[i] = arr[j]; 
                    arr[j] = change;
                }
            }
        }
    }
}
