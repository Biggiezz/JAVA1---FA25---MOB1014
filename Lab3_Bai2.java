/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Scanner;

public class Lab3_Bai2 {

    public static void main(String[] args) {
        System.out.println("Xuat 9 bang cuu chuong");

        bangCuuChuong();
    }

    public static void bangCuuChuong() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d", i, j, i * j);
                System.out.println();
            }
        }
    }
}
