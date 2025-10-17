package lab2;

import java.util.Scanner;

public class Lab2_Bai1 {
    public static void main(String[] args) {
        lab2_bai1();
        
    }

    public static void lab2_bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac 1");
        
        System.out.print("Nhap vao so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao so b: ");
        int b = sc.nextInt();
        bac1(a, b);
    }
 
    public static void bac1(int a, int b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh tren vo so nghiem");
                
            }else{
                System.out.println("Phuong trinh tren vo nghiem");
            }
            
        }else{
            double x = -b / a;
            System.out.println("Nghiem x = "+ x);
        }
    }
}



 


