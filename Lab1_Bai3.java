/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author nguyenmanhphuc
 */
public class Lab1_Bai3 {

    public static void main(String[] args) {
        System.out.println("Bai 3 - LAB 1");
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vai 1 canh cua khoi lap phuong: ");
        int canh = sc.nextInt();
        System.out.print("Thể tích của khối chữ nhật là: " + Math.pow(canh, 3));
        
    }

}
