package lab2;

import java.util.Scanner;

public class Lab2_Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac 2");

        System.out.print("Nhap vao so a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap vao so b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap vao so c: ");
        double c = sc.nextDouble();
        bac1(a, b, c);

    }

    public static void bac1(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Day la phuong trinh bac 1 - Khong phai phuong trinh bac 2");
            double bac1 = -b / c;
            System.out.println("Nghiem x = " + bac1);   
        } else {
            System.out.println("Day la phuong trinh bac 2");
            System.out.println("Tinh delta");
            tinhDelta(b, a, c);
        }
    }

    public static void tinhDelta(double b, double a, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);
        System.out.println("Delta = " + delta);
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep x = " + x);
        } else {
            System.out.println("Phuong trinh co 2 nghiem phan biet");

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Nghiem x1 = " + x1);
            System.out.println("Nghiem x2 = " + x2);

        }
    }
}
