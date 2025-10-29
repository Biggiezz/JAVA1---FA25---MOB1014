package Thi_thu;

import java.util.*;

public class QLDV {

    private final Scanner sc = new Scanner(System.in);
    private final ArrayList<DongVat> qldv = new ArrayList<>();

    public void nhapThongTin() {
        String tieptuc;
        do {
            System.out.println("Bat dau nhap vao danh sach doi tuong");
            System.out.println("Nhap vao ma dong vat: ");
            String maDV = sc.nextLine();
            System.out.println("Nhap vao ten dong vat: ");
            String tenDV = sc.nextLine();
            System.out.println("Nhap vao can nang dong vat: ");
            int canNang = kiemTraCanNang();
            System.out.println("Nhap vao noi song dong vat: ");
            String noiSong = sc.nextLine();

            DongVat dv = new DongVat(maDV, tenDV, canNang, noiSong);
            qldv.add(dv);
            System.out.println("Đã thêm thông tin động vật");
            System.out.println("Ban co muon nhap tiep hay khong? (Y/N): ");
            tieptuc = sc.nextLine();
        } while (tieptuc.equalsIgnoreCase("y"));
    }

    public void showAll() {
        if (qldv.isEmpty()) {
            System.out.println("Danh sach dong vat rong");
            return;

        }
        System.out.println("Danh sach dong vat co trong danh sach");
        for (DongVat dv : qldv) {
            dv.inThongTin();
            System.out.println("----------------------");

        }
    }

    public int kiemTraCanNang() {
        int kiemtra = 0;
        do {
            try {
                System.out.println("Nhap vao can nang (phai > 0): ");
                kiemtra = Integer.parseInt(sc.nextLine().trim());
                if (kiemtra <= 0) {
                    System.out.println("Vui long nhap lai (phai > 0): ");

                }
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang (phai la so). Vui long nhap lai: ");
                kiemtra = 0;
            }
        } while (kiemtra <= 0);
        return kiemtra;
    }

    
    public void timKiemCanNang() {
        if (qldv.isEmpty()) {
            System.out.println("Danh sach dong vat rong");
            return;
        }
        System.out.println("Moi nhap vao can nang can tim: ");
        int canNangTim = sc.nextInt();
        boolean kiemtra = false;
        for (DongVat dv : qldv) {
            if (dv.getCanNang() >= canNangTim) {
                dv.inThongTin();
                kiemtra = true;
                System.out.printf("Đã tìm thấy động vật có cân nặng trong khoảng: %d", canNangTim);
            }
        }
        if (!kiemtra) {
            System.out.printf("Khong tim thay dong vat co can nang trong khoang: %d", canNangTim);
        }
    }

    public void dongVatMeo() {
        String tieptuc;
        do {
            System.out.println("Bat dau nhap vao danh sach doi tuong");
            System.out.println("Nhap vao ma dong vat: ");
            String maDV = sc.nextLine();
            System.out.println("Nhap vao ten dong vat: ");
            String tenDV = sc.nextLine();
            System.out.println("Nhap vao can nang dong vat: ");
            int canNang = kiemTraCanNang();
            System.out.println("Nhap vao noi song dong vat: ");
            String noiSong = sc.nextLine();
            System.out.println("Nhap vao tieng keu cua dong vat: ");
            String tiengKeu = sc.nextLine();

            Meo newMeo = new Meo(tiengKeu, maDV, tenDV, canNang, noiSong);

            qldv.add(newMeo);

            System.out.println("Đã thêm thông tin động vật");
            System.out.println("Ban co muon nhap tiep hay khong? (Y/N): ");
            tieptuc = sc.nextLine();
        } while (tieptuc.equalsIgnoreCase("y"));
    }
}
