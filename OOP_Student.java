package OOP;

import java.util.Scanner;
import static lab2.Lab2_Bai5_buoi2_lop.xepLoai;

public class OOP_Student {

    //1. Field: Trường - thành phần tĩnh (data)
    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private double toan;
    private double ly;
    private double hoa;

    // 2a. Contructor(s) Hàm tạo - tạo ra các object (đối tượng - thực thể cụ thể)
    // constructor không tham số
    public OOP_Student() {
    }

    // constructor có 1 tham số
    public OOP_Student(Long id) {
        this.id = id;
    }

    // constructor đầy đủ tham số
    public OOP_Student(Long id, String myFullName, String myEmail, String myPhone,
            double diemToan, double diemLy, double diemHoa) {

        this.id = id;
        fullName = myFullName;
        email = myEmail;
        phone = myPhone;
        toan = diemToan;
        ly = diemLy;
        hoa = diemHoa;

    }
    // 2b. Methods: Hành vi, hành động (member funtions)
    //nhập

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập Id: ");
        this.id = sc.nextLong();
        sc.nextLine();

        System.out.print("Nhập Họ và tên: ");
        this.fullName = sc.nextLine();

        System.out.print("Nhập Email: ");
        this.email = sc.nextLine();

        System.out.print("Nhập Số Điện Thoại: ");
        this.phone = sc.nextLine();

        System.out.print("Nhập điểm Toán: ");
        this.toan = sc.nextDouble();
        System.out.print("Nhập điểm Lý: ");
        this.ly = sc.nextDouble();
        System.out.print("Nhập điểm Hóa: ");
        this.hoa = sc.nextDouble();

    }

    //xuất
public void output() {
    double diemTB = tinhDiemTb(toan, ly, hoa);
    System.out.printf(
        "Student: id = %s, name = %s, email = %s, phone = %s, toan = %.2f, ly = %.2f, hoa = %.2f\nDiemTB = %.2f\n",
        id, fullName, email, phone, toan, ly, hoa, diemTB
    );
    System.out.printf("Xep loai: %s%n", xep_loai(diemTB));
}

    public String xep_loai(double diemTB) {
        String xepLoai;
        if (10 >= diemTB && diemTB >= 9) {
            xepLoai = "Xuat Sac";
        } else if (9 > diemTB && diemTB >= 8) {
            xepLoai = "Gioi";
        } else if (8 > diemTB && diemTB >= 7) {
            xepLoai = "Kha";
        } else if (7 > diemTB && diemTB >= 5) {
            xepLoai = "Trung Binh";
        } else {
            xepLoai = "Yeu";
        }
        return xepLoai;
    }

    public static double tinhDiemTb(double mon1,
            double mon2,
            double mon3) {

        return ((mon1 + mon2 + mon3) / 3);

    }

    //2c. Getters, Setters - get và set các giá trị cho các trường
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

}
