package final_asm;

import java.util.ArrayList;
import java.util.Scanner;

public class Ontap_QLVC {

    private ArrayList<Ontap_Vacine> listVC = new ArrayList<>();

    public void NhapDanhSach(Scanner sc) {
        System.out.println("Bat dau nhap danh sach");
        Ontap_Vacine vc = new Ontap_Vacine();

        do {
            System.out.print("Nhap ma vacine");
            vc.setMaVC(sc.nextLine());
            System.out.print("Nhap ten vacine");
            vc.setTenVC(sc.nextLine());
            while (true) {
                try {
                    System.out.print("Nhap thoi gian tac dung");
                    vc.setThoiGianTacDung(Float.parseFloat(sc.nextLine()));
                    break;

                } catch (Exception e) {
                    System.out.print("Thoi gian phai la 1 con so - Nhap lai");
                }
            }
            System.out.print("Ngay het han vacine");
            vc.setNgayHetHan(sc.nextLine());
            listVC.add(vc);
            System.out.print("Ban co muon nhap tiep khong (Y/N): ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        } while (true);

    }

    public void XuatDanhSach() {
        System.out.println("Danh sách vacine hien co");
        if (listVC.isEmpty()) {
            System.out.println("Danh sach trong");
            return;
        }
        for (Ontap_Vacine vc : listVC) {
            vc.inThongTin();
        }

    }

    public void XuatVCLonHon6Thang() {

        System.out.println("Xuat danh sach Vacine (Thoi gian tac dung >= 6 thang)");
        if (listVC.isEmpty()) {
            System.out.println("Danh sach rong");
            return;
        }

    }

    public void SapXepGiamThoiGianTacDung() {

        System.out.println("Sap xep giam dan theo Thoi Gian Tac Dung");
        if (listVC.isEmpty()) {
            System.out.println("Danh sach rong");
            return;
        }
    }
   
    public void showAllThongTin() {
        if (this.listVC.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        
        System.out.println("\n--- HIỂN THỊ TOÀN BỘ DANH SÁCH ---");
        for (Ontap_Vacine vc : listVC) {
            vc.inThongTin();
        }
    }
}
