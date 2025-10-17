package lab3;

import java.util.Scanner;

public class Lab3_Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bai 1 - Lab 3");
        boolean songuyento = true;
        System.out.print("Nhap vao 1 so: ");
        int so = sc.nextInt();
//        while (!sc.hasNextInt()) {
//            System.out.println("Nhap lai");
//            sc.nextInt();
//
//        }
        soNguyenTo(so, songuyento);
    }

    public static void soNguyenTo(int so, boolean songuyento) {
        if (so <= 1) {
            songuyento = false;
        } else {
            for (int i = 2; i <= Math.sqrt(so); i++) {
                if (so % i == 0) {
                    songuyento = false;
                    break;
                }
            }
        }
        if (songuyento) {
            System.out.printf("%d la so nguyen to", so);
        } else {
            System.out.printf("%d khong phai la so nguyen to", so);
        }
    }
}
