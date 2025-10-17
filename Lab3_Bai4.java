package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_Bai4 {

    public static void main(String[] args) {
        lab3_bai4();

    }

    public static void lab3_bai4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bai 4 - LAB3");

        System.out.print("Nhap vao so luong sinh vien: ");
        int sinhVien = sc.nextInt();

        String[] ten = new String[sinhVien];
        double[] diem = new double[sinhVien];
        nhap_thong_tin(sinhVien, sc, ten, diem);
        xuat_thong_tin_sinh_vien(ten, diem);

        //in ra man hinh sinh vien sau khi sap xep
        sapxep(ten, diem);

        xeploai(sinhVien, ten, diem);
    }

    public static void nhap_thong_tin(int sinhVien, Scanner sc, String[] ten, double[] diem) {
        for (int i = 0; i < sinhVien; i++) {
            sc.nextLine();
            System.out.printf("Nhap vao ten sinh vien thu [%d]: ", i + 1);
            ten[i] = sc.nextLine();

            System.out.printf("Nhap vao diem sinh vien thu [%d]: ", i + 1);
            diem[i] = sc.nextDouble();

            while (diem[i] > 10 || diem[i] < 0) {
                System.out.println("Moi nhap lai diem: ");
                sc.nextDouble();
            }

        }
    }

    public static void xuat_thong_tin_sinh_vien(String[] ten, double[] diem) {
        System.out.print("Mang sinh vien vua nhap la\n");
        System.out.println("Mang sinh vien:  " + Arrays.toString(ten));
        System.out.println("Mang diem sinh vien: " + Arrays.toString(diem));

        System.out.println("Mang diem sau sap xep la");
    }

    public static void xeploai(int sinhVien, String[] ten, double[] diem) {
        for (int i = 0; i < sinhVien; i++) {
            System.out.println("Ho ten: " + ten[i]);
            System.out.println("Diem: " + diem[i]);
            if (diem[i] >= 9) {
                System.out.println("Hoc luc xuat sac");
            } else if (diem[i] < 9 && diem[i] >= 7.5) {
                System.out.println("Hoc luc gioi");
            } else if (diem[i] < 7.5 && diem[i] > 6.5) {
                System.out.println("Hoc luc kha");
            } else if (diem[i] < 6.5 && diem[i] > 5) {
                System.out.println("Hoc luc trung binh");
            } else {
                System.out.println("Hoc luc yeu");
            }
        }
    }

    public static void sapxep(String[] ten, double[] diem) {
        for (int i = 0; i < ten.length - 1; i++) {
            for (int j = i + 1; j < ten.length; j++) {

                if (diem[i] < diem[j]) {
                    //sap xep ten
                    String tempTen = ten[i];
                    ten[i] = ten[j];
                    ten[j] = tempTen;
                    //sap xep diem
                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;

                }
            }

        }
    }

}
