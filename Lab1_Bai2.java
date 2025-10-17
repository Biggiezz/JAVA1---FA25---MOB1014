
package lab1;

import java.util.Scanner;


public class Lab1_Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bai 2 - LAB 1");

        System.out.print("Nhap vao chieu dai: ");
        int chieuDai = sc.nextInt();
        System.out.print("Nhap vao chieu rong: ");
        int chieuRong = sc.nextInt();

        System.out.println("Chu vi = " + chieuDai + chieuRong * 2);
        System.out.println("Dien tich = " + chieuDai * chieuRong);
        System.out.println("Canh nho nhat = " + Math.min(chieuDai, chieuRong));

    }

}
