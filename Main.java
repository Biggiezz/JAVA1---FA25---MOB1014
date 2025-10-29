/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thi_thu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLDV listdv = new QLDV();
        int choice;

        do {
            System.out.println("\n------Menu--------");
            System.out.println("1. Nhap thong tin doi tuong");
            System.out.println("2. Hien thi danh sach doi tuong");
            System.out.println("3. Tim kiem trong khoang can nang");
            System.out.println("4. Dong vat meo");
            System.out.println("5. Thoat");
            System.out.print("Moi nhap lua chon tu (1 - 5): ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 ->
                    listdv.nhapThongTin();
                case 2 ->
                    listdv.showAll();
                case 3 ->
                    listdv.timKiemCanNang();
                case 4 ->
                    listdv.dongVatMeo();
                case 5 -> {
                    System.out.println("Tam biet va hen gap lai");
                }
                default -> {
                    System.out.printf("\nLoi - Khong co chuc nang ban chon\nMoi chon lai chuc nang: ");
                }
            }
        } while (choice != 5);

    }
}
