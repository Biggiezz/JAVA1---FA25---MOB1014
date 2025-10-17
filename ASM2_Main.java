package ASM2_PH63816;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class ASM2_Main {

    public static void main(String[] args) {
        int choice = 0;
        ASM2_QLNV qlnv = new ASM2_QLNV();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\t\n-------- ASM 2 --------");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Sửa nhân viên");
            System.out.println("3. Xóa thông tin nhân viên");
            System.out.println("4. Tìm nhân viên theo id");
            System.out.println("5. Tìm nhân viên theo tên");
            System.out.println("6. Tìm nhân viên theo email");
            System.out.println("7. Tìm nhân viên theo sđt");
            System.out.println("8. Tìm nhân viên theo lương");
            System.out.println("9. Sắp xếp nhân viên theo lương tăng");
            System.out.println("10. Sắp xếp nhân viên theo lương giảm");
            System.out.println("0. Thoát");
            System.out.print("Vui lòng chọn chức năng từ [0 - 10]: ");
            try {
                choice = parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ");
                choice = 1;
            }
            switch (choice) {
                case 1 ->
                    qlnv.ThemNhanVien();
                case 2 ->
                    qlnv.SuaNhanVien();
                case 3 ->
                    qlnv.xoaNhanVien();
                case 4 ->
                    qlnv.TimNhanVienTheoId();
                case 5 ->
                    qlnv.TimNhanVienTheoTen();
                case 6 ->
                    qlnv.TimNhanVienTheoEmail();
                case 7 ->
                    qlnv.TimNhanVienTheoSdt();
                case 8 ->
                    qlnv.TimNhanVienTheoLuong();
                case 9 ->
                    qlnv.SapXepLuongTang();
                case 10 ->
                    qlnv.SapXepLuongGiam();
                case 0 ->
                    System.out.println("Tạm biệt và hẹn gặp lại");
                default ->
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 0);
      
    }

}
