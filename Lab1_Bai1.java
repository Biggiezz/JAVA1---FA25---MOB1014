package lab1;

import java.util.Scanner;

public class Lab1_Bai1 {
    public static void main(String[] args) {
        Lab1_bai1();

    }

    public static void Lab1_bai1() {
        System.out.println("LAB 1 - Bai 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = sc.nextLine();
        System.out.print("Diem Tb: ");
        double diemTB = sc.nextDouble();
        System.out.printf("Ho va ten: %s co diemTB la: %.2f", hoTen,diemTB);
    }

}
