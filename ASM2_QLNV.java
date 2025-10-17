package ASM2_PH63816;

import java.util.*;

public class ASM2_QLNV {

    private ArrayList<ASM2_NhanVien> NewNhanVien = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void ThemNhanVien() {
        int luachon;
        do {
            ASM2_NhanVien nv = new ASM2_NhanVien();
            nv.nhapThongTin(sc);
            NewNhanVien.add(nv);
            System.out.println("=> Thêm nhân viên thành công!");

            while (true) {
                try {
                    System.out.println("Bạn có muốn nhập tiếp không? [1-Có / 2-Không]");
                    System.out.print("Lựa chọn: ");
                    luachon = sc.nextInt();
                    sc.nextLine();
                    if (luachon == 1 || luachon == 2) {
                        // nguoi dung nhap vao 1 hoac 2 thi out
                        break;
                    }
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập 1 hoặc 2.");
                } catch (Exception e) {
                    System.out.println("Lỗi! Vui lòng nhập số.");
                    sc.nextLine();
                }
            }
        } while (luachon == 1);
    }

    public void SuaNhanVien() {
        System.out.println("--- Sửa thông tin nhân viên ---");
        System.out.print("Nhập ID nhân viên cần sửa: ");
        String id = sc.nextLine();

        ASM2_NhanVien nvCanSua = TimNhanVien(id);

        if (nvCanSua == null) {
            System.out.println("Không tìm thấy nhân viên có ID: " + id);
        } else {
            System.out.println("Đã tìm thấy nhân viên. Thông tin hiện tại:");
            nvCanSua.xuatThongTin();
            System.out.println("---------------------------------");

            System.out.print("Nhập tên mới (bỏ trống để giữ nguyên): ");
            String tenMoi = sc.nextLine();
            if (!tenMoi.trim().isEmpty()) {
                nvCanSua.setName(tenMoi);
            }

            System.out.print("Nhập email mới (bỏ trống để giữ nguyên): ");
            String emailMoi = sc.nextLine();
            if (!emailMoi.trim().isEmpty()) {
                nvCanSua.setEmail(emailMoi);
            }

            System.out.println("=> Đã cập nhật thông tin thành công!");
            System.out.println("Thông tin sau khi sửa:");
            nvCanSua.xuatThongTin();
        }
    }

    public void xuatThongTin() {
        if (NewNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên rỗng.");
            return;
        }
        System.out.println("\n--- DANH SÁCH TẤT CẢ NHÂN VIÊN ---");
        System.out.printf("%-10s %-25s %-25s %-15s %-15s%n", "ID", "TÊN", "EMAIL", "SĐT", "LƯƠNG");
        for (ASM2_NhanVien nv : NewNhanVien) {
            nv.xuatThongTin();
        }
    }

    public ASM2_NhanVien TimNhanVien(String id) {
        for (ASM2_NhanVien nv : NewNhanVien) {
            if (nv.getId().equalsIgnoreCase(id)) {
                return nv;
            }
        }
        return null;
    }

    public ASM2_NhanVien TimNhanVienTheoTen(String name) {
        for (ASM2_NhanVien nv : NewNhanVien) {
            if (nv.getName().equalsIgnoreCase(name)) {
                return nv;
            }
        }
        return null;
    }

    public ASM2_NhanVien TimNhanVienTheoEmail(String email) {
        for (ASM2_NhanVien nv : NewNhanVien) {
            if (nv.getEmail().equalsIgnoreCase(email)) {
                return nv;
            }
        }
        return null;
    }

    public ASM2_NhanVien TimNhanVienTheoLuong(double luong) {
        for (ASM2_NhanVien nv : NewNhanVien) {
            if (nv.getLuong() == luong) {
                return nv;
            }
        }
        return null;
    }

    public ASM2_NhanVien TimNhanVienTheoSdt(String sdt) {
        for (ASM2_NhanVien nv : NewNhanVien) {
            if (nv.getSdt() == sdt) {
                return nv;
            }
        }
        return null;
    }

    public void xoaNhanVien() {
        System.out.println("--- Xóa nhân viên theo ID ---");
        System.out.print("Nhập ID nhân viên cần xóa: ");
        String id = sc.nextLine();
        ASM2_NhanVien nvCanXoa = TimNhanVien(id);

        if (nvCanXoa == null) {
            System.out.println("Không tìm thấy nhân viên có ID: " + id);
        } else {
            NewNhanVien.remove(nvCanXoa);
            System.out.println("=> Đã xóa nhân viên thành công!");
        }
    }

    public void TimNhanVienTheoId() {
        System.out.println(" Tìm nhân viên theo ID");
        System.out.print("Nhập ID nhân viên cần tìm: ");
        String id = sc.nextLine();
        ASM2_NhanVien nv = TimNhanVien(id);

        if (nv == null) {
            System.out.println("Không tìm thấy nhân viên có ID: " + id);
        } else {
            System.out.println("=> Đã tìm thấy nhân viên!");
            nv.xuatThongTin();
        }
    }

    public void TimNhanVienTheoTen() {
        System.out.println("Tìm nhân viên theo tên");
        System.out.println("Nhập tên nhân viên cần tìm: ");
        String name = sc.nextLine();
        ASM2_NhanVien nv = TimNhanVienTheoTen(name);
        if (nv == null) {
            System.out.println("Không tìm thấy nhân viên có tên: " + name);
        } else {
            System.out.println("=> Đã tìm thấy nhân viên!");
            nv.xuatThongTin();
        }
    }

    public void TimNhanVienTheoEmail() {
        System.out.println("Tìm nhân viên theo tên");
        System.out.println("Nhập tên nhân viên cần tìm: ");
        String email = sc.nextLine();
        ASM2_NhanVien nv = TimNhanVienTheoTen(email);
        if (nv == null) {
            System.out.println("Không tìm thấy nhân viên có tên: " + email);
        } else {
            System.out.println("=> Đã tìm thấy nhân viên!");
            nv.xuatThongTin();
        }
    }

    public void TimNhanVienTheoLuong() {
        System.out.println("Tìm nhân viên theo lương");
        System.out.println("Nhập lương nhân viên cần tìm: ");
        double luong = sc.nextDouble();
        ASM2_NhanVien nv = TimNhanVienTheoLuong(luong);
        if (nv == null) {
            System.out.println("Không tìm thấy nhân viên có lương: " + luong);
        } else {
            System.out.println("=> Đã tìm thấy nhân viên!");
            nv.xuatThongTin();
        }
    }

    public void TimNhanVienTheoSdt() {
        System.out.println("Tìm nhân viên theo sđt");
        System.out.println("Nhập sđt nhân viên cần tìm: ");
        String sdt = sc.nextLine();
        ASM2_NhanVien nv = TimNhanVienTheoSdt(sdt);
        if (nv == null) {
            System.out.println("Không tìm thấy nhân viên có lương: " + sdt);
        } else {
            System.out.println("=> Đã tìm thấy nhân viên!");
            nv.xuatThongTin();
        }
    }

    public void SapXepLuongTang() {
        NewNhanVien.sort(Comparator.comparing(ASM2_NhanVien::getLuong));
        System.out.println("=> Đã sắp xếp danh sách theo lương tăng dần.");
    }

    public void SapXepLuongGiam() {
        NewNhanVien.sort(Comparator.comparing(ASM2_NhanVien::getLuong).reversed());
        System.out.println("=> Sau khi sắp xếp danh sách theo lương giảm dần.");
    }

}
