package lab2;

import java.util.Scanner;

public class Lab2_Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n+--------------Menu--------------+");
            System.out.println("1. Giai phuong trinh bac 1");
            System.out.println("2. Giai phuong trinh bac 2");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Ket thuc");
            System.out.println("+--------------------------------+");
            System.out.print("Moi chon (1 - 4): ");

            choice = sc.nextInt();
            switch (choice) {
                case 1: {

                    System.out.println("Day la bai 1");
                    System.out.println("Giai phuong trinh bac 1");

                    System.out.print("Nhap vao so a: ");
                    int a = sc.nextInt();
                    System.out.print("Nhap vao so b: ");
                    int b = sc.nextInt();
                   
                    bac1(a, b);
                    break;
                }
                case 2: {
                    System.out.println("Day la bai 2");
                    System.out.println("Giai phuong trinh bac 2");

                    System.out.print("Nhap vao so a: ");
                    double a = sc.nextDouble();
                    System.out.print("Nhap vao so b: ");
                    double b = sc.nextDouble();
                    System.out.print("Nhap vao so c: ");
                    double c = sc.nextDouble();
                   
                    bac1(a, b, c);
                    delta(b, a, c);
                   break;
                }
                case 3: {
                    System.out.println("Day la bai 3");
                    System.out.println("Tinh tien dien");
                    double tienDien = 0;
                    System.out.print("Nhap vao so dien su dung: ");
                    double soDien = sc.nextDouble();
                   
                    tienDien(soDien);
                    break;
                }
                case 4: {
                    System.out.println("Tam biet va hen gap lai!");
                    break;
                }
                default:
                    System.out.println("Khong co chuc nang ban chon - Moi nhap lai");
           }
        } while (choice != 4);
    }

    public static void bac1(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Day la phuong trinh bac 1 - Khong phai phuong trinh bac 2");
            double b1 = -b / c;
            System.out.print("Nghiem x = " + b1);
        } else {
            System.out.println("Day la phuong trinh bac 2");
            System.out.println("Tinh delta");
            delta(b, a, c);
        }
    }

    public static void tienDien(double soDien) {
        double tienDien;
        if (soDien < 50) {
            tienDien = soDien * 50;
            
            System.out.printf("Tien dien phai tra la: %.2f" , tienDien);
            
        } else {
            tienDien = 50 * 1000 + (soDien - 50) * 1200;
            
            System.out.printf("Tien dien phai tra la: %.3f" , tienDien);
        }
    }

    public static void delta(double b, double a, double c) {
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
            
            System.out.printf("Nghiem x1 = %.2f  ",  x1);
            System.out.printf("Nghiem x2 = %.2f", x2);
            
        }
    }

    public static void bac1(int a, int b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh tren vo so nghiem");
                
            } else {
                System.out.println("Phuong trinh tren vo nghiem");
            }
            
        } else {
            double x = -b / a;
            System.out.println("Nghiem x = " + x);
        }
    }
}
