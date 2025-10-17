/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Scanner;

public class Lab1_Bai4 {

    public static void main(String[] args) {
        System.out.println("Bai 4 - LAB 1");
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao so b: ");
        int b = sc.nextInt();
        System.out.print("Nhap vao so c: ");
        int c = sc.nextInt();

        double delta = Math.pow(b, 2) - (4 * a * c);
        System.out.printf("Delta = %.2f ", delta);
        if(delta < 0){
            System.out.println("Delta phải > 0");
        }else{
         double can = Math.sqrt(delta);
        System.out.printf("Can delta = %.2f", can);

        }
       
    }
}
