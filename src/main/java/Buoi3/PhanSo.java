package Buoi3;

import java.util.Scanner;

public class PhanSo {
    public int tuSo;
    public int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo() {
    }

    public int nhap(Scanner scanner){
        int n = scanner.nextInt();
        return n;
    }

    public static void tongPhanSo(PhanSo[] arr){
        if(arr.length > 0){
            PhanSo tong = new PhanSo(arr[0].tuSo, arr[0].mauSo);
            for (int i = 1; i < arr.length; i++){
                tong.tuSo = tong.tuSo * arr[i].mauSo + arr[i].tuSo * tong.mauSo;
                tong.mauSo = tong.mauSo * arr[i].mauSo;
            }
            System.out.println("Tong cac phan so trong mang: " + tong.tuSo + "/" + tong.mauSo);
        } else {
            System.out.println("Mang rong");
        }
    }
}
