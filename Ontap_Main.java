package final_asm;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Ontap_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ontap_QLVC qlvc = new Ontap_QLVC();
        int choice = 0;
        do {
            System.out.println("------Menu--------");
            System.out.println("1. Nhap danh sach doi tuong\nKhi nhap co hoi tiep hay khong?");
            System.out.println("2. Xuat danh sach doi tuong");
            System.out.println("3. Xuat danh sach VC (thoi gian tac dung >= 6 thang)");
            System.out.println("4. Sap xep giam dan theo ThoiGianTacDung");
            System.out.println("5. Bo sung vacine Viet Nam");

            System.out.println("0. Thoat");

            try {
                choice = parseInt(sc.nextLine());

            } catch (Exception e) {
                System.out.println("Lua chon khong hop le. Vui long nhap so");
                choice = 1;
                continue;
            }
            switch (choice) {
                case 1 ->
                    qlvc.NhapDanhSach(sc);

                case 2 ->
                    qlvc.XuatDanhSach();
                case 3 ->
                    qlvc.XuatVCLonHon6Thang();
                case 4 ->
                    qlvc.SapXepGiamThoiGianTacDung();
                case 5 -> {
                    System.out.println("In thong tin vacine VN");
                    Ontap_Vacine_vn nvs = new Ontap_Vacine_vn("VN01", "Nano", 12f, "31/12/2025", "VietNam");
                    nvs.inThongTin();
                }
                case 0 ->
                    System.out.println("Tam biet va hen gap lai");

                default ->
                    System.out.println("Lua chon khong ton tai - Vui long nhap lai");
            }

        } while (choice != 0);
        sc.close();
    }
}
