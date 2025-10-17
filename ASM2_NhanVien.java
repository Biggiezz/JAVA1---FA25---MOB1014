package ASM2_PH63816;

import java.util.*;

public class ASM2_NhanVien {

    /*
    id, ten, email, sdt, luong  
   
    Nhiệm vụ (thêm , xóa)
    
    Tìm kiếm theo id, ten, sdt
    
    Sắp xếp theo lương tăng dần, giảm dần
    
     */
    private String id;
    private String name;
    private String email;
    private String sdt;
    private int luong;

    public ASM2_NhanVien() {
    }

    public ASM2_NhanVien(String id, String name, String email, String sdt, int luong) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.sdt = sdt;
        this.luong = luong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void xuatThongTin() {
        System.out.printf("Mã nhân viên: %s | Tên nhân viên: %s | Email: %s | SĐT: %s | Lương: %d", id, name, email, sdt, luong);
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("Nhập vào mã : ");
        id = sc.nextLine();

        System.out.println("Nhập vào tên : ");
        name = sc.nextLine();

        System.out.println("Nhập vào email : ");
        email = sc.nextLine();

        System.out.println("Nhập vào : ");
        sdt = sc.nextLine();

        while (true) {
            try {
                System.out.println("Nhập vào : ");
                luong = sc.nextInt();
                sc.nextLine();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi! Vui lòng nhập lương là một con số");
                sc.nextLine();
            }
        }
    }
    
}
