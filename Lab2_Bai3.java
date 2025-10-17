package lab2;

import java.util.Scanner;

public class Lab2_Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tinh tien dien");
        double tienDien = 0;
        System.out.print("Nhap vao so dien su dung: ");
        tinhTienDien(sc);
    }

    public static void tinhTienDien(Scanner sc) {
        double tienDien;
        double soDien = sc.nextDouble();
        if (soDien < 50) {
            tienDien = soDien * 50;

            System.out.print("Tien dien phai tra la: " + tienDien);

        } else {
            tienDien = 50 * 1000 + (soDien - 50) * 1200;

            System.out.print("Tien dien phai tra la:"+ tienDien);
        }
    }
}
