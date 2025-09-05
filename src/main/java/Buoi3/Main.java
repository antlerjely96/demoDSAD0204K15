package Buoi3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        PhanSo[] arr = new PhanSo[n];
        int tuSo, mauSo;
        for (int i = 0; i < arr.length; i++){
            System.out.print("Tu so cua phan tu thu i: ");
            tuSo = scanner.nextInt();
            System.out.print("Mau so cua phan tu thu i: ");
            mauSo = scanner.nextInt();
            arr[i] = new PhanSo(tuSo, mauSo);
        }
        PhanSo.tongPhanSo(arr);
    }
}
