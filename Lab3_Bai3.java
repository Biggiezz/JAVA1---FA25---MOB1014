/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bai 3 - Lab 3");

        System.out.print("Nhap vao so luong mang: ");
        int n = sc.nextInt();

        int[] mang = new int[n];

        System.out.println("Nhap cac gia tri cho mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri thu" + (i + 1) + ": ");
            mang[i] = sc.nextInt();
        }
        Arrays.sort(mang);

        System.out.println("Mang sau khu sap xep: " + Arrays.toString(mang));

        int min = mang[0];
        for (int i = 0; i < n; i++) {
            if (mang[i] < min) {
                System.out.println("Min la: " + min);
            }
        }
        System.out.println("Gia tri nho nhat trong mang la: " + mang[0]);

        System.out.print("Cac gia tri trong mang chia het cho 3:");
        for (int i = 0 ;i < n; i++) {
            if (mang[i] % 3 == 0) {
                System.out.print(" "+ mang[i]);
            }
        }
    }
}
